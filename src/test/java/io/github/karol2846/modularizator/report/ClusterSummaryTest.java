package io.github.karol2846.modularizator.report;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ClusterSummaryTest {

    @Test
    void ordersByPackagesThenFilesThenId() {
        LeidenClusterer.Result result = new LeidenClusterer.Result(1.0, Map.of(
                "m/src/main/java/p/A.java", 0, "m/src/main/java/p/B.java", 0, "m/src/main/java/p/C.java", 0,
                "m/src/main/java/p/D.java", 1, "m/src/main/java/q/E.java", 1,
                "m/src/main/java/p/F.java", 2, "m/src/main/java/r/G.java", 2,
                "m/src/main/java/p/H.java", 3), 4, 0.5);

        assertThat(ClusterSummary.of(result, List.of())).extracting(ClusterSummary::id).containsExactly(1, 2, 0, 3);
    }

    @Test
    void dominantModuleTieGoesToFirstName() {
        LeidenClusterer.Result result = new LeidenClusterer.Result(1.0, Map.of(
                "b/src/main/java/p/A.java", 0, "a/src/main/java/p/B.java", 0), 1, 0.5);

        ClusterSummary cluster = ClusterSummary.of(result, List.of()).getFirst();

        assertThat(cluster.modules()).extracting(ClusterSummary.Count::name).containsExactly("a", "b");
        assertThat(cluster.dominantModule()).isEqualTo("a");
    }

    @Test
    void labelIsFileNameUnlessAmbiguousInCluster() {
        LeidenClusterer.Result result = new LeidenClusterer.Result(1.0, Map.of(
                "a/src/main/java/module-info.java", 0, "b/src/main/java/module-info.java", 0,
                "a/src/main/java/p/Foo.java", 0), 1, 0.5);

        ClusterSummary cluster = ClusterSummary.of(result, List.of()).getFirst();

        assertThat(cluster.files()).extracting(cluster::label).containsExactly(
                "a/src/main/java/module-info.java", "Foo.java", "b/src/main/java/module-info.java");
    }
}
