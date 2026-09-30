package io.github.karol2846.modularizator.coupling;

import io.github.karol2846.modularizator.changeset.Changeset;
import io.github.karol2846.modularizator.changeset.FileInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Computes co-change coupling: {@code weight(A,B) = shared(A,B) / min(revs(A), revs(B))}.
 */
public final class CouplingCalculator {

    /**
     * @param revisions number of changesets per file
     * @param edges pairs passing both thresholds, sorted with {@link CoChangeEdge#STRONGEST_FIRST}
     */
    public record Coupling(Map<String, Integer> revisions, List<CoChangeEdge> edges) {

        public Coupling {
            revisions = Map.copyOf(revisions);
            edges = List.copyOf(edges);
        }
    }

    private CouplingCalculator() {
    }

    public static Coupling calculate(List<Changeset> changesets, int minShared, double minWeight) {
        Map<String, Integer> revisions = new HashMap<>();
        Map<FilePair, Integer> sharedCounts = new HashMap<>();
        for (Changeset changeset : changesets) {
            List<String> files = List.copyOf(changeset.files());
            for (int i = 0; i < files.size(); i++) {
                revisions.merge(files.get(i), 1, Integer::sum);
                for (int j = i + 1; j < files.size(); j++) {
                    sharedCounts.merge(new FilePair(files.get(i), files.get(j)), 1, Integer::sum);
                }
            }
        }

        Map<FilePair, List<Changeset>> evidence = new HashMap<>();
        sharedCounts.forEach((pair, shared) -> {
            if (shared >= minShared && weight(pair, shared, revisions) >= minWeight) {
                evidence.put(pair, new ArrayList<>());
            }
        });

        // Second pass collects evidence only for pairs that became edges.
        for (Changeset changeset : changesets) {
            List<String> files = List.copyOf(changeset.files());
            for (int i = 0; i < files.size(); i++) {
                for (int j = i + 1; j < files.size(); j++) {
                    List<Changeset> pairEvidence = evidence.get(new FilePair(files.get(i), files.get(j)));
                    if (pairEvidence != null) {
                        pairEvidence.add(changeset);
                    }
                }
            }
        }

        List<CoChangeEdge> edges = new ArrayList<>();
        evidence.forEach((pair, pairEvidence) -> edges.add(new CoChangeEdge(
                FileInfo.of(pair.a()),
                FileInfo.of(pair.b()),
                revisions.get(pair.a()),
                revisions.get(pair.b()),
                pairEvidence.size(),
                weight(pair, pairEvidence.size(), revisions),
                pairEvidence)));
        edges.sort(CoChangeEdge.STRONGEST_FIRST);
        return new Coupling(revisions, edges);
    }

    private static double weight(FilePair pair, int shared, Map<String, Integer> revisions) {
        return (double) shared / Math.min(revisions.get(pair.a()), revisions.get(pair.b()));
    }
}
