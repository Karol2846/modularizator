package io.github.karol2846.modularizator.coupling;

import io.github.karol2846.modularizator.changeset.Changeset;
import io.github.karol2846.modularizator.changeset.FileInfo;
import java.util.Comparator;
import java.util.List;

/**
 * A pair of files that passed the coupling thresholds.
 *
 * @param evidence changesets in which both files changed, newest first
 */
public record CoChangeEdge(
        FileInfo fileA,
        FileInfo fileB,
        int revsA,
        int revsB,
        int shared,
        double weight,
        List<Changeset> evidence) {

    /** Weight descending, then shared descending, then paths. */
    public static final Comparator<CoChangeEdge> STRONGEST_FIRST = Comparator
            .comparingDouble(CoChangeEdge::weight).reversed()
            .thenComparing(Comparator.comparingInt(CoChangeEdge::shared).reversed())
            .thenComparing(edge -> edge.fileA().path())
            .thenComparing(edge -> edge.fileB().path());

    public CoChangeEdge {
        evidence = List.copyOf(evidence);
    }

    public boolean crossPackage() {
        return !fileA.javaPackage().equals(fileB.javaPackage());
    }

    public boolean crossModule() {
        return !fileA.buildModule().equals(fileB.buildModule());
    }
}
