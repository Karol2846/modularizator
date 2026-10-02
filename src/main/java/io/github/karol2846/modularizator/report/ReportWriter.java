package io.github.karol2846.modularizator.report;

import io.github.karol2846.modularizator.changeset.Changeset;
import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.changeset.HistoryStats;
import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Renders {@code report.md}. The output depends only on the input (no timestamps), so two runs on the same
 * repository give identical files.
 */
public final class ReportWriter {

    static final int TOP_CROSS_PACKAGE_PAIRS = 20;
    static final int CLUSTERS_IN_FULL = 15;
    static final int EDGES_PER_CLUSTER = 5;
    static final int EVIDENCE_COMMITS = 10;
    static final int EVIDENCE_COMMITS_CONDENSED = 3;

    /**
     * Everything the report shows.
     *
     * @param edges all edges, strongest first
     * @param graphNodes number of files with at least one edge
     */
    public record Input(
            String repoName,
            String headHash,
            int minShared,
            double minWeight,
            int maxChangeset,
            long seed,
            HistoryStats stats,
            List<String> renameWarnings,
            List<CoChangeEdge> edges,
            int graphNodes,
            List<LeidenClusterer.Result> clusterings) {

        public Input {
            renameWarnings = List.copyOf(renameWarnings);
            edges = List.copyOf(edges);
            clusterings = List.copyOf(clusterings);
        }
    }

    private final StringBuilder out = new StringBuilder();

    private ReportWriter() {
    }

    public static void write(Path file, Input input) {
        try {
            Files.writeString(file, render(input), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot write " + file, e);
        }
    }

    static String render(Input input) {
        ReportWriter writer = new ReportWriter();
        writer.header(input);
        writer.statistics(input);
        writer.crossPackagePairs(input.edges());
        for (LeidenClusterer.Result result : input.clusterings()) {
            writer.resolution(result, input.edges());
        }
        return writer.out.toString();
    }

    private void header(Input input) {
        HistoryStats stats = input.stats();
        String range = stats.changesetsKept() == 0
                ? "none"
                : date(stats.oldestKeptEpochSeconds()) + " – " + date(stats.newestKeptEpochSeconds());
        line("# Co-change report: " + input.repoName());
        line();
        line("HEAD: " + code(input.headHash()) + " · changesets: " + range
                + " · generated with parameters: minShared=" + input.minShared()
                + ", minWeight=" + decimal(input.minWeight())
                + ", maxChangeset=" + input.maxChangeset()
                + ", seed=" + input.seed());
        line();
    }

    private void statistics(Input input) {
        HistoryStats stats = input.stats();
        List<CoChangeEdge> edges = input.edges();
        line("## Statistics");
        line();
        line("| metric | value | what it means |");
        line("|---|---|---|");
        row("Commits read", stats.commitsRead(), "Non-merge commits reachable from HEAD.");
        row("Changesets kept", stats.changesetsKept(),
                "Commits that touched production Java files and were used to compute coupling.");
        row("Skipped as empty", stats.skippedEmpty(),
                "Commits that touched no production Java file still present at HEAD.");
        row("Skipped as mega-commits", stats.skippedMegaCommits(),
                "Commits touching more than " + input.maxChangeset()
                        + " production Java files (moves, formatting, bumps), ignored because they would create"
                        + " false coupling.");
        row("Renames resolved", stats.renamesResolved(),
                "Old paths whose history was attributed to a file that exists at HEAD.");
        row("Rename detection warnings", input.renameWarnings().size(),
                "Times git gave up on rename detection, so some moved files may have lost history.");
        row("Unique files", stats.uniqueFiles(),
                "Production Java files that appear in at least one kept changeset.");
        row("Edges", edges.size(),
                "File pairs that changed together often enough to pass both thresholds (shared ≥ "
                        + input.minShared() + ", weight ≥ " + decimal(input.minWeight()) + ").");
        row("Cross-package edges", edges.stream().filter(CoChangeEdge::crossPackage).count(),
                "Edges whose two files live in different Java packages.");
        row("Cross-module edges", edges.stream().filter(CoChangeEdge::crossModule).count(),
                "Edges whose two files live in different build modules.");
        row("Graph nodes", input.graphNodes(), "Files with at least one edge; only these are clustered.");
        row("Files without edges", stats.uniqueFiles() - input.graphNodes(),
                "Files that changed, but never often enough together with any other file; left out of the graph.");
        line();
        if (!input.renameWarnings().isEmpty()) {
            line("Rename detection warnings from git:");
            line();
            input.renameWarnings().forEach(warning -> line("- " + code(warning)));
            line();
        }
    }

    private void crossPackagePairs(List<CoChangeEdge> edges) {
        line("## Top " + TOP_CROSS_PACKAGE_PAIRS + " cross-package pairs");
        line();
        line("_Strongest edges between files in different packages, before clustering. shared = number of kept"
                + " commits that changed both files; weight = shared divided by the number of commits of the less"
                + " frequently changed file (1.00 = it never changed without the other)._");
        line();
        List<CoChangeEdge> crossPackage = edges.stream()
                .filter(CoChangeEdge::crossPackage)
                .limit(TOP_CROSS_PACKAGE_PAIRS)
                .toList();
        if (crossPackage.isEmpty()) {
            line("_No cross-package edges._");
            line();
            return;
        }
        line("| fileA | fileB | shared | weight |");
        line("|---|---|---|---|");
        for (CoChangeEdge edge : crossPackage) {
            line("| " + code(edge.fileA().path()) + " | " + code(edge.fileB().path()) + " | " + edge.shared()
                    + " | " + decimal(edge.weight()) + " |");
        }
        line();
    }

    private void resolution(LeidenClusterer.Result result, List<CoChangeEdge> edges) {
        List<ClusterSummary> all = ClusterSummary.of(result, edges);
        List<ClusterSummary> multiFile = all.stream().filter(cluster -> cluster.files().size() >= 2).toList();
        long singleFile = all.size() - multiFile.size();
        int largest = all.stream().mapToInt(cluster -> cluster.files().size()).max().orElse(0);

        line("## Resolution = " + result.resolution());
        line();
        line("Clusters (≥2 files): " + multiFile.size() + " · largest: " + largest + " files"
                + " · nodes in single-file clusters: " + singleFile);
        line();
        line("_Clusters are groups of files that Leiden put together because they are densely connected by"
                + " co-change; single-file clusters are graph nodes that were not grouped with any other file._");
        line();
        line("Modularity: " + decimal(result.quality()));
        line();
        line("_How much denser the links inside clusters are than expected by chance at this resolution"
                + " (higher = sharper split); values for different resolutions are not directly comparable._");
        line();
        line("Build module agreement: " + moduleAgreement(multiFile)
                + " of files in clusters with ≥2 files are in a cluster whose dominant module is their own module");
        line();
        line("_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses"
                + " module boundaries._");
        line();
        if (multiFile.isEmpty()) {
            line("_No clusters with 2 or more files at this resolution._");
            line();
            return;
        }
        line("_Clusters are ordered by number of packages, then number of files. The first " + CLUSTERS_IN_FULL
                + " are shown in full, the rest in a condensed table._");
        line();
        multiFile.stream().limit(CLUSTERS_IN_FULL).forEach(this::clusterInFull);
        if (multiFile.size() > CLUSTERS_IN_FULL) {
            condensedClusters(multiFile.subList(CLUSTERS_IN_FULL, multiFile.size()));
        }
    }

    private void clusterInFull(ClusterSummary cluster) {
        line("### Cluster " + cluster.id() + " — " + plural(cluster.files().size(), "file") + ", "
                + plural(cluster.packages().size(), "package") + ", " + plural(cluster.modules().size(), "module"));
        line();
        line("Packages: " + counts(cluster.packages()));
        line();
        line("Modules: " + counts(cluster.modules()));
        line();
        line("Files:");
        line();
        cluster.files().forEach(file -> line("- " + code(file.path())));
        line();
        if (cluster.edges().isEmpty()) {
            return;
        }
        line("Strongest edges inside the cluster (top " + EDGES_PER_CLUSTER + "):");
        line();
        line("| fileA | fileB | shared | weight |");
        line("|---|---|---|---|");
        cluster.edges().stream().limit(EDGES_PER_CLUSTER).forEach(edge ->
                line("| " + code(className(edge.fileA())) + " | " + code(className(edge.fileB())) + " | "
                        + edge.shared() + " | " + decimal(edge.weight()) + " |"));
        line();
        CoChangeEdge strongest = cluster.edges().getFirst();
        line("Evidence for the strongest edge (" + code(className(strongest.fileA())) + " – "
                + code(className(strongest.fileB())) + ", up to " + EVIDENCE_COMMITS + " commits, newest first):");
        line();
        strongest.evidence().stream().limit(EVIDENCE_COMMITS).forEach(changeset ->
                line("- " + code(shortHash(changeset)) + " " + date(changeset.epochSeconds()) + " — "
                        + changeset.subject()));
        line();
    }

    private void condensedClusters(List<ClusterSummary> clusters) {
        line("### Other clusters");
        line();
        line("| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest "
                + EVIDENCE_COMMITS_CONDENSED + " commits) |");
        line("|---|---|---|---|---|---|---|---|");
        for (ClusterSummary cluster : clusters) {
            String sizes = "| " + cluster.id() + " | " + cluster.files().size() + " | " + cluster.packages().size()
                    + " | " + cluster.modules().size();
            if (cluster.edges().isEmpty()) {
                line(sizes + " | – | – | – | – |");
                continue;
            }
            CoChangeEdge strongest = cluster.edges().getFirst();
            line(sizes
                    + " | " + code(className(strongest.fileA())) + " – " + code(className(strongest.fileB()))
                    + " | " + strongest.shared() + " | " + decimal(strongest.weight())
                    + " | " + strongest.evidence().stream().limit(EVIDENCE_COMMITS_CONDENSED)
                            .map(changeset -> code(shortHash(changeset)))
                            .collect(Collectors.joining(", "))
                    + " |");
        }
        line();
    }

    private static String moduleAgreement(List<ClusterSummary> multiFile) {
        int files = 0;
        int agreeing = 0;
        for (ClusterSummary cluster : multiFile) {
            files += cluster.files().size();
            String dominant = cluster.dominantModule();
            agreeing += (int) cluster.files().stream().filter(file -> file.buildModule().equals(dominant)).count();
        }
        return files == 0 ? "n/a" : decimal(100.0 * agreeing / files) + "%";
    }

    private static String counts(List<ClusterSummary.Count> counts) {
        return counts.stream()
                .map(count -> count.name() + " (" + count.count() + ")")
                .collect(Collectors.joining(", "));
    }

    private static String plural(int count, String noun) {
        return count + " " + noun + (count == 1 ? "" : "s");
    }

    private void row(String metric, Object value, String meaning) {
        line("| " + metric + " | " + value + " | " + meaning + " |");
    }

    private void line(String text) {
        out.append(text).append('\n');
    }

    private void line() {
        out.append('\n');
    }

    private static String code(String text) {
        return "`" + text + "`";
    }

    private static String className(FileInfo file) {
        return file.path().substring(file.path().lastIndexOf('/') + 1);
    }

    private static String shortHash(Changeset changeset) {
        return changeset.hash().substring(0, Math.min(7, changeset.hash().length()));
    }

    private static String decimal(double value) {
        return String.format(Locale.ROOT, "%.2f", value);
    }

    private static String date(long epochSeconds) {
        return Instant.ofEpochSecond(epochSeconds).atZone(ZoneOffset.UTC).toLocalDate().toString();
    }
}
