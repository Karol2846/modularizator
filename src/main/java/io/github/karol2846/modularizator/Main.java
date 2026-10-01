package io.github.karol2846.modularizator;

import io.github.karol2846.modularizator.changeset.ChangesetBuilder;
import io.github.karol2846.modularizator.changeset.HistoryStats;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import io.github.karol2846.modularizator.coupling.CouplingCalculator;
import io.github.karol2846.modularizator.coupling.CouplingCalculator.Coupling;
import io.github.karol2846.modularizator.git.GitRepository;
import io.github.karol2846.modularizator.git.GitRepository.GitLog;
import io.github.karol2846.modularizator.report.PairsTsvWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Set;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(AnalysisConfig.USAGE);
            return;
        }
        AnalysisConfig config;
        try {
            config = AnalysisConfig.parse(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println(AnalysisConfig.USAGE);
            System.exit(2);
            return;
        }
        run(config);
    }

    private static void run(AnalysisConfig config) {
        long start = System.nanoTime();
        GitRepository repository = new GitRepository(config.repo());
        Set<String> headFiles = repository.headFiles();
        GitLog log = repository.log();

        ChangesetBuilder.Result history = ChangesetBuilder.build(log.commits(), headFiles, config.maxChangeset());
        Coupling coupling = CouplingCalculator.calculate(
                history.changesets(), config.minShared(), config.minWeight());

        try {
            Files.createDirectories(config.out());
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot create " + config.out(), e);
        }
        PairsTsvWriter.write(config.out().resolve("pairs.tsv"), coupling.edges());

        printSummary(config, log, history.stats(), coupling, (System.nanoTime() - start) / 1_000_000);
    }

    private static void printSummary(
            AnalysisConfig config, GitLog log, HistoryStats stats, Coupling coupling, long elapsedMillis) {
        line("Repository", config.repo(), "The git repository that was analyzed.");
        line("Commits read", stats.commitsRead(), "Non-merge commits reachable from HEAD.");
        line("Changesets kept", stats.changesetsKept(),
                "Commits that touched production Java files and were used to compute coupling.");
        line("Skipped as empty", stats.skippedEmpty(),
                "Commits that touched no production Java file still present at HEAD.");
        line("Skipped as mega-commits", stats.skippedMegaCommits() + " (> " + config.maxChangeset() + " files)",
                "Bulk commits (moves, formatting, bumps) ignored because they would create false coupling.");
        line("Renames resolved", stats.renamesResolved(),
                "Old paths whose history was attributed to a file that exists at HEAD.");
        line("Kept changesets range", date(stats.oldestKeptEpochSeconds())
                        + " .. " + date(stats.newestKeptEpochSeconds()),
                "Author dates of the oldest and newest commit used in the analysis.");
        line("Unique files", stats.uniqueFiles(), "Production Java files that appear in at least one kept changeset.");
        line("Edges", coupling.edges().size(),
                "File pairs that changed together often enough to pass both thresholds"
                        + " (shared >= " + config.minShared() + ", weight >= " + config.minWeight() + ").");
        line("  crossPackage", coupling.edges().stream().filter(CoChangeEdge::crossPackage).count(),
                "Of those, pairs whose files live in different Java packages.");
        line("  crossModule", coupling.edges().stream().filter(CoChangeEdge::crossModule).count(),
                "Of those, pairs whose files live in different build modules.");
        line("Rename warnings", log.renameWarnings().size(),
                "Times git gave up on rename detection, so some moved files may have lost history.");
        log.renameWarnings().forEach(warning -> System.out.println("    " + warning));
        line("Elapsed", elapsedMillis + " ms", "Wall-clock time of the whole run.");
    }

    private static void line(String label, Object value, String explanation) {
        System.out.printf("%-25s %-25s %s%n", label + ":", value, explanation);
    }

    private static String date(long epochSeconds) {
        return Instant.ofEpochSecond(epochSeconds).atZone(ZoneOffset.UTC).toLocalDate().toString();
    }
}
