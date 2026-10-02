package io.github.karol2846.modularizator.report;

import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/** Writes {@code clusters-r<resolution>.tsv}: one line per graph node, sorted by cluster, then by file. */
public final class ClustersTsvWriter {

    static final String HEADER = "file\tcluster\tmodule\tpackage";

    private ClustersTsvWriter() {
    }

    public static String fileName(double resolution) {
        return "clusters-r" + resolution + ".tsv";
    }

    public static void write(Path file, LeidenClusterer.Result result) {
        List<Map.Entry<String, Integer>> rows = result.clusters().entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .toList();
        try (Writer writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write(HEADER);
            writer.write('\n');
            for (Map.Entry<String, Integer> row : rows) {
                FileInfo info = FileInfo.of(row.getKey());
                writer.write(String.join("\t",
                        info.path(), Integer.toString(row.getValue()), info.buildModule(), info.javaPackage()));
                writer.write('\n');
            }
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot write " + file, e);
        }
    }
}
