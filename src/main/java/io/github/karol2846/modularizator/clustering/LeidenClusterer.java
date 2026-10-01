package io.github.karol2846.modularizator.clustering;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import nl.cwts.networkanalysis.Clustering;
import nl.cwts.networkanalysis.LeidenAlgorithm;
import nl.cwts.networkanalysis.Network;
import nl.cwts.util.LargeDoubleArray;
import nl.cwts.util.LargeIntArray;

/**
 * Leiden with modularity as the quality function, set up the same way as
 * {@code nl.cwts.networkanalysis.run.RunNetworkClustering -q Modularity}: node weights equal to total
 * edge weights, resolution rescaled by the total edge weight, singleton start, one random start.
 * The rest of the code does not see the library's types.
 */
public final class LeidenClusterer {

    static final int N_ITERATIONS = 50;

    /**
     * @param clusters file → cluster id; ids are ordered by cluster size, 0 is the largest
     * @param quality modularity of the clustering at the given resolution
     */
    public record Result(double resolution, Map<String, Integer> clusters, int clusterCount, double quality) {

        public Result {
            clusters = Collections.unmodifiableMap(new TreeMap<>(clusters));
        }
    }

    private LeidenClusterer() {
    }

    public static Result cluster(CoChangeGraph graph, double resolution, long seed) {
        List<String> nodes = graph.nodes();
        if (nodes.isEmpty()) {
            return new Result(resolution, Map.of(), 0, 0);
        }

        List<CoChangeGraph.Edge> edges = graph.edges();
        int[] from = new int[edges.size()];
        int[] to = new int[edges.size()];
        double[] weights = new double[edges.size()];
        for (int i = 0; i < edges.size(); i++) {
            from[i] = edges.get(i).a();
            to[i] = edges.get(i).b();
            weights[i] = edges.get(i).weight();
        }
        // sortedEdges = false: each edge is given once and the library adds the reverse direction.
        Network network = new Network(nodes.size(), true,
                new LargeIntArray[] {new LargeIntArray(from), new LargeIntArray(to)},
                new LargeDoubleArray(weights), false, true);

        double modularityResolution =
                resolution / (2 * network.getTotalEdgeWeight() + network.getTotalEdgeWeightSelfLinks());
        LeidenAlgorithm algorithm = new LeidenAlgorithm(
                modularityResolution, N_ITERATIONS, LeidenAlgorithm.DEFAULT_RANDOMNESS, new Random(seed));
        Clustering clustering = new Clustering(network.getNNodes());
        algorithm.improveClustering(network, clustering);
        double quality = algorithm.calcQuality(network, clustering);
        clustering.orderClustersByNNodes();

        Map<String, Integer> clusters = new TreeMap<>();
        for (int i = 0; i < nodes.size(); i++) {
            clusters.put(nodes.get(i), clustering.getCluster(i));
        }
        return new Result(resolution, clusters, clustering.getNClusters(), quality);
    }
}
