package io.github.karol2846.modularizator.changeset;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/** Files (HEAD paths, after filters) changed together in one commit. */
public record Changeset(String hash, long epochSeconds, String subject, SortedSet<String> files) {

    public Changeset {
        files = Collections.unmodifiableSortedSet(new TreeSet<>(files));
    }
}
