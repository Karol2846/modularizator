package io.github.karol2846.modularizator.report;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class PairsTsvWriterTest {

    @Test
    void writesHeaderAndEdgesInGivenOrder(@TempDir Path dir) throws IOException {
        List<CoChangeEdge> edges = List.of(
                new CoChangeEdge(FileInfo.of("m1/src/main/java/p/A.java"), FileInfo.of("m2/src/main/java/q/B.java"),
                        3, 5, 3, 1.0, List.of()),
                new CoChangeEdge(FileInfo.of("src/main/java/p/A.java"), FileInfo.of("src/main/java/p/C.java"),
                        9, 6, 4, 4.0 / 6, List.of()));
        Path file = dir.resolve("pairs.tsv");

        PairsTsvWriter.write(file, edges);

        assertThat(Files.readString(file)).isEqualTo("""
                fileA\tfileB\trevsA\trevsB\tshared\tweight\tcrossPackage\tcrossModule
                m1/src/main/java/p/A.java\tm2/src/main/java/q/B.java\t3\t5\t3\t1.00\ttrue\ttrue
                src/main/java/p/A.java\tsrc/main/java/p/C.java\t9\t6\t4\t0.67\tfalse\tfalse
                """);
    }
}
