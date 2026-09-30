package io.github.karol2846.modularizator.coupling;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import io.github.karol2846.modularizator.changeset.Changeset;
import io.github.karol2846.modularizator.coupling.CouplingCalculator.Coupling;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class CouplingCalculatorTest {

    private static final String A = "m1/src/main/java/p/A.java";
    private static final String B = "m1/src/main/java/p/B.java";
    private static final String C = "m1/src/main/java/q/C.java";
    private static final String D = "m2/src/main/java/p/D.java";

    private static Changeset changeset(String hash, String... files) {
        return new Changeset(hash, 0, "subject " + hash, new TreeSet<>(List.of(files)));
    }

    // revs: A=4, B=4, C=2, D=2; shared: AB=3, AC=2, BD=2, AD=1, BC=1, CD=0
    private static final List<Changeset> CHANGESETS = List.of(
            changeset("c1", A, B, C),
            changeset("c2", A, B),
            changeset("c3", A, B, D),
            changeset("c4", A, C),
            changeset("c5", B, D));

    @Test
    void computesRevisionsSharedAndWeightsForHandCountedExample() {
        Coupling coupling = CouplingCalculator.calculate(CHANGESETS, 2, 0.3);

        assertThat(coupling.revisions()).isEqualTo(Map.of(A, 4, B, 4, C, 2, D, 2));
        assertThat(coupling.edges())
                .extracting(e -> e.fileA().path(), e -> e.fileB().path(),
                        CoChangeEdge::revsA, CoChangeEdge::revsB, CoChangeEdge::shared, CoChangeEdge::weight,
                        CoChangeEdge::crossPackage, CoChangeEdge::crossModule)
                .containsExactly(
                        tuple(A, C, 4, 2, 2, 1.0, true, false),
                        tuple(B, D, 4, 2, 2, 1.0, false, true),
                        tuple(A, B, 4, 4, 3, 0.75, false, false));
    }

    @Test
    void collectsEvidenceNewestFirst() {
        Coupling coupling = CouplingCalculator.calculate(CHANGESETS, 2, 0.3);

        CoChangeEdge ab = coupling.edges().get(2);
        assertThat(ab.evidence()).extracting(Changeset::hash).containsExactly("c1", "c2", "c3");
        assertThat(coupling.edges().get(0).evidence()).extracting(Changeset::hash).containsExactly("c1", "c4");
    }

    @Test
    void dropsPairsBelowThresholds() {
        assertThat(CouplingCalculator.calculate(CHANGESETS, 3, 0.3).edges())
                .extracting(e -> e.fileA().path(), e -> e.fileB().path())
                .containsExactly(tuple(A, B));
        assertThat(CouplingCalculator.calculate(CHANGESETS, 2, 0.8).edges())
                .extracting(e -> e.fileA().path(), e -> e.fileB().path())
                .containsExactly(tuple(A, C), tuple(B, D));
    }

    @Test
    void pairIsSymmetric() {
        assertThat(FilePair.of(B, A)).isEqualTo(FilePair.of(A, B)).isEqualTo(new FilePair(A, B));
    }

    @Test
    void fileWithThreeRevisionsAllSharedHasWeightOne() {
        List<Changeset> changesets = List.of(
                changeset("c1", A, B),
                changeset("c2", A, B),
                changeset("c3", A, B),
                changeset("c4", B),
                changeset("c5", B));

        CoChangeEdge edge = CouplingCalculator.calculate(changesets, 3, 0.3).edges().getFirst();

        assertThat(edge.revsA()).isEqualTo(3);
        assertThat(edge.revsB()).isEqualTo(5);
        assertThat(edge.shared()).isEqualTo(3);
        assertThat(edge.weight()).isEqualTo(1.0);
    }

    @Test
    void weightExactlyAtThresholdIsKept() {
        // shared = 3, min(revs) = 10 -> weight 0.3
        List<Changeset> changesets = new ArrayList<>(List.of(
                changeset("s1", A, B), changeset("s2", A, B), changeset("s3", A, B)));
        for (int i = 0; i < 7; i++) {
            changesets.add(changeset("a" + i, A));
            changesets.add(changeset("b" + i, B));
        }

        assertThat(CouplingCalculator.calculate(changesets, 3, 0.3).edges())
                .singleElement()
                .extracting(CoChangeEdge::weight)
                .isEqualTo(0.3);
    }
}
