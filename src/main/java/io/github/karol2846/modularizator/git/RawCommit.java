package io.github.karol2846.modularizator.git;

import java.util.List;

public record RawCommit(String hash, long epochSeconds, String subject, List<FileChange> changes) {

    public RawCommit {
        changes = List.copyOf(changes);
    }
}
