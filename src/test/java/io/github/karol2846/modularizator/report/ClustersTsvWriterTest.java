package io.github.karol2846.modularizator.report;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ClustersTsvWriterTest {

    @Test
    void writesNodesSortedByClusterThenFile(@TempDir Path dir) throws IOException {
        LeidenClusterer.Result result = new LeidenClusterer.Result(1.0, Map.of(
                "m/src/main/java/p/B.java", 0,
                "src/main/java/Main.java", 1,
                "m/src/main/java/q/A.java", 0,
                "m/src/main/java/p/C.java", 1), 2, 0.5);
        Path file = dir.resolve(ClustersTsvWriter.fileName(result.resolution()));

        ClustersTsvWriter.write(file, result);

        assertThat(file.getFileName().toString()).isEqualTo("clusters-r1.0.tsv");
        assertThat(Files.readString(file)).isEqualTo("""
                file\tcluster\tmodule\tpackage
                m/src/main/java/p/B.java\t0\tm\tp
                m/src/main/java/q/A.java\t0\tm\tq
                m/src/main/java/p/C.java\t1\tm\tp
                src/main/java/Main.java\t1\t(root)\t(default)
                """);
    }
}
