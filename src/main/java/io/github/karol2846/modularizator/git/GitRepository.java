package io.github.karol2846.modularizator.git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Reads history of a local git repository by running the {@code git} executable.
 */
public final class GitRepository {

    private final Path directory;

    public GitRepository(Path directory) {
        this.directory = directory;
    }

    /** Result of {@code git log}: commits newest first, plus rename detection warnings from stderr. */
    public record GitLog(List<RawCommit> commits, List<String> renameWarnings) {
    }

    public String headHash() {
        return run(List.of("rev-parse", "HEAD"), reader -> reader.lines().findFirst().orElseThrow()).stdout();
    }

    public Set<String> headFiles() {
        return run(List.of("ls-tree", "-r", "--name-only", "HEAD"),
                reader -> reader.lines().collect(Collectors.toUnmodifiableSet()))
                .stdout();
    }

    public GitLog log() {
        ProcessOutput<List<RawCommit>> output = run(
                List.of("-c", "diff.renameLimit=20000",
                        "log", "--no-merges", "-M", "--name-status",
                        "--format=format:%x1e%H%x1f%at%x1f%s", "HEAD"),
                GitLogParser::parse);
        List<String> renameWarnings = output.stderr().lines()
                .filter(line -> line.contains("rename detection was skipped"))
                .toList();
        return new GitLog(output.stdout(), renameWarnings);
    }

    private record ProcessOutput<T>(T stdout, String stderr) {
    }

    private <T> ProcessOutput<T> run(List<String> gitArgs, Function<BufferedReader, T> stdoutReader) {
        List<String> command = new ArrayList<>(List.of("git", "-C", directory.toString(), "-c", "core.quotepath=false"));
        command.addAll(gitArgs);
        try {
            Process process = new ProcessBuilder(command).start();
            process.getOutputStream().close();
            CompletableFuture<String> stderr = CompletableFuture.supplyAsync(() -> readFully(process.getErrorStream()));
            T stdout;
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                stdout = stdoutReader.apply(reader);
            }
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new IllegalStateException(
                        "Command failed with exit code " + exitCode + ": " + command + "\n" + stderr.join());
            }
            return new ProcessOutput<>(stdout, stderr.join());
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot run " + command, e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while running " + command, e);
        }
    }

    private static String readFully(InputStream stream) {
        try (stream) {
            return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
