package io.github.karol2846.modularizator.git;

import io.github.karol2846.modularizator.git.FileChange.Status;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses the output of
 * {@code git log --no-merges -M --name-status --format=format:%x1e%H%x1f%at%x1f%s}.
 * Commits are returned in the order they appear in the log (newest first).
 */
public final class GitLogParser {

    static final char COMMIT_SEPARATOR = '\u001e';
    static final String FIELD_SEPARATOR = "\u001f";

    private GitLogParser() {
    }

    public static List<RawCommit> parse(String log) {
        return parse(new StringReader(log));
    }

    public static List<RawCommit> parse(Reader log) {
        List<RawCommit> commits = new ArrayList<>();
        BufferedReader reader = new BufferedReader(log);
        String hash = null;
        long epochSeconds = 0;
        String subject = null;
        List<FileChange> changes = new ArrayList<>();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty() && line.charAt(0) == COMMIT_SEPARATOR) {
                    if (hash != null) {
                        commits.add(new RawCommit(hash, epochSeconds, subject, changes));
                    }
                    String[] fields = line.substring(1).split(FIELD_SEPARATOR, 3);
                    if (fields.length != 3) {
                        throw new IllegalArgumentException("Malformed commit header: " + line);
                    }
                    hash = fields[0];
                    epochSeconds = Long.parseLong(fields[1]);
                    subject = fields[2];
                    changes = new ArrayList<>();
                } else if (!line.isEmpty()) {
                    if (hash == null) {
                        throw new IllegalArgumentException("File line before any commit header: " + line);
                    }
                    changes.add(parseChange(line));
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        if (hash != null) {
            commits.add(new RawCommit(hash, epochSeconds, subject, changes));
        }
        return commits;
    }

    static FileChange parseChange(String line) {
        String[] parts = line.split("\t", -1);
        String status = parts[0];
        if (status.matches("R\\d*") && parts.length == 3) {
            return FileChange.renamed(parts[1], parts[2]);
        }
        Status simpleStatus = switch (status) {
            case "A" -> Status.ADDED;
            case "M" -> Status.MODIFIED;
            case "D" -> Status.DELETED;
            case "T" -> Status.TYPE_CHANGED;
            default -> null;
        };
        if (simpleStatus == null || parts.length != 2) {
            throw new IllegalArgumentException("Unsupported file status line: " + line);
        }
        return FileChange.of(simpleStatus, parts[1]);
    }
}
