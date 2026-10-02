package io.github.karol2846.modularizator.clustering;

import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * Co-change graph with deterministic indexing: nodes are the files with at least one edge, sorted
 * lexicographically (a node's index is its position), and edges are sorted by {@code (a, b)}.
 */
public record CoChangeGraph(List<String> nodes, List<Edge> edges) {

    /** Undirected edge between node indices {@code a < b}, weighted by coupling. */
    public record Edge(int a, int b, double weight) {
    }

    public CoChangeGraph {
        nodes = List.copyOf(nodes);
        edges = List.copyOf(edges);
    }

    public static CoChangeGraph of(List<CoChangeEdge> coChangeEdges) {
        TreeSet<String> files = new TreeSet<>();
        for (CoChangeEdge edge : coChangeEdges) {
            files.add(edge.fileA().path());
            files.add(edge.fileB().path());
        }
        List<String> nodes = List.copyOf(files);
        Map<String, Integer> index = new HashMap<>();
        for (int i = 0; i < nodes.size(); i++) {
            index.put(nodes.get(i), i);
        }

        List<Edge> edges = new ArrayList<>();
        for (CoChangeEdge edge : coChangeEdges) {
            // fileA < fileB lexicographically, so indexA < indexB.
            edges.add(new Edge(index.get(edge.fileA().path()), index.get(edge.fileB().path()), edge.weight()));
        }
        edges.sort(Comparator.comparingInt(Edge::a).thenComparingInt(Edge::b));
        return new CoChangeGraph(nodes, edges);
    }
}
