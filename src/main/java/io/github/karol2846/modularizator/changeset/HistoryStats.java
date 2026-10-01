package io.github.karol2846.modularizator.changeset;

/**
 * Statistics of turning raw commits into changesets. Epoch bounds are 0 when no changeset was kept.
 */
public record HistoryStats(
        int commitsRead,
        int changesetsKept,
        int skippedEmpty,
        int skippedMegaCommits,
        int renamesResolved,
        long oldestKeptEpochSeconds,
        long newestKeptEpochSeconds,
        int uniqueFiles) {
}
