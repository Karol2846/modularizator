package io.github.karol2846.modularizator.git;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.git.FileChange.Status;
import io.github.karol2846.modularizator.git.GitRepository.GitLog;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class GitRepositoryTest {

    @Test
    void readsHeadFilesAndHistoryWithRenames(@TempDir Path dir) {
        new TestGitRepo(dir)
                .write("src/main/java/org/x/Foo.java", "class Foo {}\n")
                .write("README.md", "readme\n")
                .commit("Initial")
                .write("src/main/java/org/x/Foo.java", "class Foo { int a; }\n")
                .commit("Tweak naïve café")
                .move("src/main/java/org/x/Foo.java", "src/main/java/org/y/Foo.java")
                .commit("Move Foo")
                .git("rm", "-q", "README.md")
                .commit("Remove readme");

        GitRepository repository = new GitRepository(dir);
        GitLog log = repository.log();

        assertThat(repository.headHash()).isEqualTo(log.commits().getFirst().hash());
        assertThat(repository.headFiles()).containsExactly("src/main/java/org/y/Foo.java");
        assertThat(log.renameWarnings()).isEmpty();
        assertThat(log.commits()).extracting(RawCommit::subject)
                .containsExactly("Remove readme", "Move Foo", "Tweak naïve café", "Initial");
        assertThat(log.commits()).allSatisfy(commit -> {
            assertThat(commit.hash()).hasSize(40);
            assertThat(commit.epochSeconds()).isPositive();
        });
        assertThat(log.commits().get(0).changes()).containsExactly(FileChange.of(Status.DELETED, "README.md"));
        assertThat(log.commits().get(1).changes())
                .containsExactly(FileChange.renamed("src/main/java/org/x/Foo.java", "src/main/java/org/y/Foo.java"));
        assertThat(log.commits().get(2).changes())
                .containsExactly(FileChange.of(Status.MODIFIED, "src/main/java/org/x/Foo.java"));
        assertThat(log.commits().get(3).changes()).containsExactlyInAnyOrder(
                FileChange.of(Status.ADDED, "src/main/java/org/x/Foo.java"),
                FileChange.of(Status.ADDED, "README.md"));
    }
}
