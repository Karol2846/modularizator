package io.github.karol2846.modularizator.git;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/** Builds throwaway git repositories for integration tests. */
public final class TestGitRepo {

    private final Path directory;

    public TestGitRepo(Path directory) {
        this.directory = directory;
        git("init", "-q");
        git("config", "user.name", "Test");
        git("config", "user.email", "test@example.com");
        git("config", "commit.gpgsign", "false");
    }

    public Path directory() {
        return directory;
    }

    public TestGitRepo write(String path, String content) {
        try {
            Path file = directory.resolve(path);
            Files.createDirectories(file.getParent());
            Files.writeString(file, content);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return this;
    }

    public TestGitRepo move(String from, String to) {
        try {
            Files.createDirectories(directory.resolve(to).getParent());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return git("mv", from, to);
    }

    public TestGitRepo commit(String message) {
        // Message goes through a file: process arguments are not UTF-8 safe under a POSIX locale.
        write(".git/TEST_COMMIT_MSG", message);
        git("add", "-A");
        return git("commit", "-q", "--allow-empty", "-F", ".git/TEST_COMMIT_MSG");
    }

    public TestGitRepo git(String... args) {
        List<String> command = new ArrayList<>(List.of("git", "-C", directory.toString()));
        command.addAll(List.of(args));
        try {
            Process process = new ProcessBuilder(command).redirectErrorStream(true).start();
            String output = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            if (process.waitFor() != 0) {
                throw new IllegalStateException(command + " failed: " + output);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
        return this;
    }
}
