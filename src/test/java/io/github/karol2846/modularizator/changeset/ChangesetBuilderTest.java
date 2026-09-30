package io.github.karol2846.modularizator.changeset;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.git.FileChange;
import io.github.karol2846.modularizator.git.FileChange.Status;
import io.github.karol2846.modularizator.git.RawCommit;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ChangesetBuilderTest {

    private static final String A = "src/main/java/a/Foo.java";
    private static final String B = "src/main/java/b/Foo.java";
    private static final String C = "src/main/java/c/Foo.java";
    private static final String OTHER = "src/main/java/x/Other.java";

    private static RawCommit commit(String hash, long epochSeconds, FileChange... changes) {
        return new RawCommit(hash, epochSeconds, "subject " + hash, List.of(changes));
    }

    private static FileChange modified(String path) {
        return FileChange.of(Status.MODIFIED, path);
    }

    @Test
    void followsRenameChainToHeadPath() {
        List<RawCommit> newestFirst = List.of(
                commit("c5", 5, modified(C), modified(OTHER)),
                commit("c4", 4, FileChange.renamed(B, C)),
                commit("c3", 3, modified(B), modified(OTHER)),
                commit("c2", 2, FileChange.renamed(A, B)),
                commit("c1", 1, FileChange.of(Status.ADDED, A), FileChange.of(Status.ADDED, OTHER)));

        ChangesetBuilder.Result result = ChangesetBuilder.build(newestFirst, Set.of(C, OTHER), 50);

        assertThat(result.changesets()).containsExactly(
                new Changeset("c5", 5, "subject c5", sorted(C, OTHER)),
                new Changeset("c4", 4, "subject c4", sorted(C)),
                new Changeset("c3", 3, "subject c3", sorted(C, OTHER)),
                new Changeset("c2", 2, "subject c2", sorted(C)),
                new Changeset("c1", 1, "subject c1", sorted(C, OTHER)));
        assertThat(result.stats().renamesResolved()).isEqualTo(2);
    }

    @Test
    void appliesRenamesFromMegaCommitButSkipsItsChangeset() {
        List<String> movedFiles = IntStream.range(0, 3).mapToObj(i -> "src/main/java/p/F" + i + ".java").toList();
        List<String> headFiles = movedFiles.stream().map(path -> path.replace("/p/", "/q/")).toList();
        List<RawCommit> newestFirst = List.of(
                commit("move", 2, movedFiles.stream()
                        .map(path -> FileChange.renamed(path, path.replace("/p/", "/q/")))
                        .toArray(FileChange[]::new)),
                commit("old", 1, modified(movedFiles.get(0)), modified(movedFiles.get(1))));

        ChangesetBuilder.Result result = ChangesetBuilder.build(newestFirst, Set.copyOf(headFiles), 2);

        assertThat(result.changesets()).containsExactly(
                new Changeset("old", 1, "subject old", sorted(headFiles.get(0), headFiles.get(1))));
        assertThat(result.stats().skippedMegaCommits()).isEqualTo(1);
        assertThat(result.stats().renamesResolved()).isEqualTo(3);
    }

    @Test
    void skipsFilesThatDoNotExistOnHead() {
        List<RawCommit> newestFirst = List.of(
                commit("c3", 3, FileChange.of(Status.DELETED, A), modified(OTHER)),
                commit("c2", 2, modified(A), modified(OTHER)),
                commit("c1", 1, FileChange.renamed("src/main/java/gone/Old.java", A)));

        ChangesetBuilder.Result result = ChangesetBuilder.build(newestFirst, Set.of(OTHER), 50);

        assertThat(result.changesets()).extracting(Changeset::files)
                .containsExactly(sorted(OTHER), sorted(OTHER));
        assertThat(result.stats().skippedEmpty()).isEqualTo(1);
        assertThat(result.stats().renamesResolved()).isZero();
    }

    @Test
    void keepsOnlyMainJavaSourcesAndDeduplicates() {
        String test = "src/test/java/a/FooTest.java";
        String resource = "src/main/resources/a.properties";
        String build = "build.gradle";
        List<RawCommit> newestFirst = List.of(
                commit("c2", 2, modified(test), modified(resource), modified(build)),
                commit("c1", 1, FileChange.renamed(B, A), modified(test)),
                // Both historical paths map to the same HEAD file (known path-reuse simplification).
                commit("c0", 0, modified(B), modified(A)));

        ChangesetBuilder.Result result = ChangesetBuilder.build(newestFirst, Set.of(A, test, resource, build), 50);

        assertThat(result.changesets()).containsExactly(
                new Changeset("c1", 1, "subject c1", sorted(A)),
                new Changeset("c0", 0, "subject c0", sorted(A)));
        assertThat(result.stats().skippedEmpty()).isEqualTo(1);
    }

    @Test
    void collectsStatistics() {
        List<RawCommit> newestFirst = List.of(
                commit("c4", 400, modified(A), modified(B), modified(C)),
                commit("c3", 300, modified(A), modified(B)),
                commit("c2", 200, modified("README.md")),
                commit("c1", 100, modified(A)));

        HistoryStats stats = ChangesetBuilder.build(newestFirst, Set.of(A, B, C, "README.md"), 2).stats();

        assertThat(stats).isEqualTo(new HistoryStats(4, 2, 1, 1, 0, 100, 300, 2));
    }

    @Test
    void reportsZeroDatesWhenNothingIsKept() {
        HistoryStats stats = ChangesetBuilder.build(List.of(commit("c1", 1)), Set.of(), 50).stats();

        assertThat(stats).isEqualTo(new HistoryStats(1, 0, 1, 0, 0, 0, 0, 0));
    }

    private static SortedSet<String> sorted(String... files) {
        return new TreeSet<>(List.of(files));
    }
}
