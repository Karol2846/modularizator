package io.github.karol2846.modularizator.report;

import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * One cluster as shown in the report.
 *
 * @param files paths, sorted
 * @param packages Java packages with file counts, most files first, then by name
 * @param modules build modules with file counts, most files first, then by name
 * @param edges edges with both files in this cluster, strongest first
 */
record ClusterSummary(int id, List<FileInfo> files, List<Count> packages, List<Count> modules, List<CoChangeEdge> edges) {

    record Count(String name, int count) {
    }

    /** Number of packages descending, then number of files descending, then id. */
    static final Comparator<ClusterSummary> REPORT_ORDER = Comparator
            .comparingInt((ClusterSummary cluster) -> cluster.packages().size()).reversed()
            .thenComparing(Comparator.comparingInt((ClusterSummary cluster) -> cluster.files().size()).reversed())
            .thenComparingInt(ClusterSummary::id);

    /** All clusters of a clustering, in {@link #REPORT_ORDER}. */
    static List<ClusterSummary> of(LeidenClusterer.Result result, List<CoChangeEdge> strongestFirst) {
        Map<Integer, List<FileInfo>> filesByCluster = new TreeMap<>();
        result.clusters().forEach((file, cluster) ->
                filesByCluster.computeIfAbsent(cluster, id -> new ArrayList<>()).add(FileInfo.of(file)));
        Map<Integer, List<CoChangeEdge>> edgesByCluster = new TreeMap<>();
        for (CoChangeEdge edge : strongestFirst) {
            Integer clusterA = result.clusters().get(edge.fileA().path());
            if (clusterA != null && clusterA.equals(result.clusters().get(edge.fileB().path()))) {
                edgesByCluster.computeIfAbsent(clusterA, id -> new ArrayList<>()).add(edge);
            }
        }

        List<ClusterSummary> clusters = new ArrayList<>();
        filesByCluster.forEach((id, files) -> {
            files.sort(Comparator.comparing(FileInfo::path));
            clusters.add(new ClusterSummary(id, List.copyOf(files),
                    counts(files, FileInfo::javaPackage),
                    counts(files, FileInfo::buildModule),
                    edgesByCluster.getOrDefault(id, List.of())));
        });
        clusters.sort(REPORT_ORDER);
        return clusters;
    }

    ClusterSummary {
        files = List.copyOf(files);
        packages = List.copyOf(packages);
        modules = List.copyOf(modules);
        edges = List.copyOf(edges);
    }

    /**
     * How a file is named in edge tables: just the file name (e.g. {@code Foo.java}), since the cluster's full
     * paths are listed above, or the full path when another file in the cluster has the same name.
     */
    String label(FileInfo file) {
        String name = fileName(file);
        long sameName = files.stream().filter(other -> fileName(other).equals(name)).count();
        return sameName > 1 ? file.path() : name;
    }

    private static String fileName(FileInfo file) {
        return file.path().substring(file.path().lastIndexOf('/') + 1);
    }

    /** The module with most files; ties go to the lexicographically first one. */
    String dominantModule() {
        return modules.getFirst().name();
    }

    private static List<Count> counts(List<FileInfo> files, Function<FileInfo, String> key) {
        return files.stream()
                .collect(Collectors.groupingBy(key, TreeMap::new, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new Count(entry.getKey(), entry.getValue().intValue()))
                .sorted(Comparator.comparingInt(Count::count).reversed().thenComparing(Count::name))
                .toList();
    }
}
