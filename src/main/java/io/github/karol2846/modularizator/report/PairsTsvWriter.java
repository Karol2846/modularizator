package io.github.karol2846.modularizator.report;

import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

/** Writes {@code pairs.tsv}: one line per edge, in the order given. */
public final class PairsTsvWriter {

    static final String HEADER = "fileA\tfileB\trevsA\trevsB\tshared\tweight\tcrossPackage\tcrossModule";

    private PairsTsvWriter() {
    }

    public static void write(Path file, List<CoChangeEdge> edges) {
        try (Writer writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write(HEADER);
            writer.write('\n');
            for (CoChangeEdge edge : edges) {
                writer.write(String.join("\t",
                        edge.fileA().path(),
                        edge.fileB().path(),
                        Integer.toString(edge.revsA()),
                        Integer.toString(edge.revsB()),
                        Integer.toString(edge.shared()),
                        String.format(Locale.ROOT, "%.2f", edge.weight()),
                        Boolean.toString(edge.crossPackage()),
                        Boolean.toString(edge.crossModule())));
                writer.write('\n');
            }
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot write " + file, e);
        }
    }
}
