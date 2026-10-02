package io.github.karol2846.modularizator.clustering;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.util.List;
import org.junit.jupiter.api.Test;

class CoChangeGraphTest {

    static CoChangeEdge edge(String a, String b, double weight) {
        return new CoChangeEdge(FileInfo.of(a), FileInfo.of(b), 3, 3, 3, weight, List.of());
    }

    @Test
    void indexesNodesLexicographicallyAndSortsEdgesByIndex() {
        String a = "src/main/java/p/A.java";
        String b = "src/main/java/p/B.java";
        String c = "src/main/java/q/C.java";
        String d = "src/main/java/q/D.java";

        // Given in "strongest first" order, not in index order.
        CoChangeGraph graph = CoChangeGraph.of(List.of(edge(c, d, 1.0), edge(b, c, 0.9), edge(a, d, 0.5), edge(a, b, 0.4)));

        assertThat(graph.nodes()).containsExactly(a, b, c, d);
        assertThat(graph.edges()).containsExactly(
                new CoChangeGraph.Edge(0, 1, 0.4),
                new CoChangeGraph.Edge(0, 3, 0.5),
                new CoChangeGraph.Edge(1, 2, 0.9),
                new CoChangeGraph.Edge(2, 3, 1.0));
    }

    @Test
    void emptyEdgeListGivesEmptyGraph() {
        CoChangeGraph graph = CoChangeGraph.of(List.of());

        assertThat(graph.nodes()).isEmpty();
        assertThat(graph.edges()).isEmpty();
    }
}
