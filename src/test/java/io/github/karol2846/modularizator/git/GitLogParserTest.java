package io.github.karol2846.modularizator.git;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.karol2846.modularizator.git.FileChange.Status;
import java.util.List;
import org.junit.jupiter.api.Test;

class GitLogParserTest {

    private static String header(String hash, long epochSeconds, String subject) {
        return "\u001e" + hash + "\u001f" + epochSeconds + "\u001f" + subject + "\n";
    }

    @Test
    void parsesRegularCommit() {
        String log = header("aaa", 1700000000, "Add feature")
                + "A\tsrc/main/java/org/x/Foo.java\n"
                + "M\tsrc/main/java/org/x/Bar.java\n"
                + "D\tREADME.md\n"
                + "T\tlink\n";

        List<RawCommit> commits = GitLogParser.parse(log);

        assertThat(commits).containsExactly(new RawCommit("aaa", 1700000000, "Add feature", List.of(
                FileChange.of(Status.ADDED, "src/main/java/org/x/Foo.java"),
                FileChange.of(Status.MODIFIED, "src/main/java/org/x/Bar.java"),
                FileChange.of(Status.DELETED, "README.md"),
                FileChange.of(Status.TYPE_CHANGED, "link"))));
    }

    @Test
    void parsesRename() {
        String log = header("bbb", 1, "Move") + "R087\told/Foo.java\tnew/Foo.java\n";

        assertThat(GitLogParser.parse(log).getFirst().changes())
                .containsExactly(FileChange.renamed("old/Foo.java", "new/Foo.java"));
    }

    @Test
    void parsesCommitsWithoutFilesAndKeepsLogOrder() {
        String log = header("ccc", 3, "third") + "M\ta.txt\n\n"
                + header("bbb", 2, "empty")
                + header("aaa", 1, "first") + "A\ta.txt";

        List<RawCommit> commits = GitLogParser.parse(log);

        assertThat(commits).extracting(RawCommit::hash).containsExactly("ccc", "bbb", "aaa");
        assertThat(commits.get(1).changes()).isEmpty();
        assertThat(commits.get(2).changes()).containsExactly(FileChange.of(Status.ADDED, "a.txt"));
    }

    @Test
    void keepsTabsAndUtf8InSubject() {
        String log = header("ddd", 5, "Fix\tzażółć gęślą jaźń ✓") + "M\tpaczka/Żółw.java\n";

        RawCommit commit = GitLogParser.parse(log).getFirst();

        assertThat(commit.subject()).isEqualTo("Fix\tzażółć gęślą jaźń ✓");
        assertThat(commit.changes()).containsExactly(FileChange.of(Status.MODIFIED, "paczka/Żółw.java"));
    }

    @Test
    void parsesEmptyLog() {
        assertThat(GitLogParser.parse("")).isEmpty();
    }

    @Test
    void failsOnUnknownStatus() {
        String log = header("eee", 1, "Copy") + "C100\ta.txt\tb.txt\n";

        assertThatThrownBy(() -> GitLogParser.parse(log))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("C100\ta.txt\tb.txt");
    }
}
