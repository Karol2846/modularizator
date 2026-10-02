package io.github.karol2846.modularizator.clustering;

import static io.github.karol2846.modularizator.clustering.CoChangeGraphTest.edge;
import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.clustering.LeidenClusterer.Result;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.junit.jupiter.api.Test;

class LeidenClustererTest {

    private static String file(String name) {
        return "m/src/main/java/p/" + name + ".java";
    }

    private static List<CoChangeEdge> clique(String... names) {
        List<CoChangeEdge> edges = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                edges.add(edge(file(names[i]), file(names[j]), 1.0));
            }
        }
        return edges;
    }

    @Test
    void twoCliquesJoinedByWeakEdgeGiveTwoClusters() {
        List<CoChangeEdge> edges = new ArrayList<>();
        edges.addAll(clique("A1", "A2", "A3", "A4"));
        edges.addAll(clique("B1", "B2", "B3", "B4"));
        edges.add(edge(file("A4"), file("B1"), 0.3));

        Result result = LeidenClusterer.cluster(CoChangeGraph.of(edges), 1.0, 42);

        Map<String, Integer> clusters = result.clusters();
        assertThat(result.clusterCount()).isEqualTo(2);
        assertThat(clusters).hasSize(8);
        assertThat(List.of("A2", "A3", "A4")).allSatisfy(n -> assertThat(clusters.get(file(n))).isEqualTo(clusters.get(file("A1"))));
        assertThat(List.of("B2", "B3", "B4")).allSatisfy(n -> assertThat(clusters.get(file(n))).isEqualTo(clusters.get(file("B1"))));
        assertThat(clusters.get(file("A1"))).isNotEqualTo(clusters.get(file("B1")));
        assertThat(result.quality()).isPositive();
    }

    @Test
    void sameSeedGivesIdenticalResult() {
        CoChangeGraph graph = CoChangeGraph.of(randomEdges());

        Result first = LeidenClusterer.cluster(graph, 1.0, 42);
        Result second = LeidenClusterer.cluster(graph, 1.0, 42);

        assertThat(first.clusterCount()).isGreaterThan(1);
        assertThat(second).isEqualTo(first);
    }

    @Test
    void higherResolutionGivesMoreClusters() {
        CoChangeGraph graph = CoChangeGraph.of(randomEdges());

        assertThat(LeidenClusterer.cluster(graph, 2.0, 42).clusterCount())
                .isGreaterThan(LeidenClusterer.cluster(graph, 0.5, 42).clusterCount());
    }

    @Test
    void emptyGraphGivesNoClusters() {
        Result result = LeidenClusterer.cluster(CoChangeGraph.of(List.of()), 1.0, 42);

        assertThat(result.clusters()).isEmpty();
        assertThat(result.clusterCount()).isZero();
    }

    /** A sparse graph big enough for the random choices in Leiden to matter. */
    private static List<CoChangeEdge> randomEdges() {
        Random random = new Random(7);
        List<CoChangeEdge> edges = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            for (int j = i + 1; j < 60; j++) {
                boolean sameGroup = i / 10 == j / 10;
                if (random.nextDouble() < (sameGroup ? 0.5 : 0.03)) {
                    edges.add(edge(file(String.format("F%02d", i)), file(String.format("F%02d", j)),
                            0.3 + 0.7 * random.nextDouble()));
                }
            }
        }
        return edges;
    }
}
