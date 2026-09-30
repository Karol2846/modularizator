package io.github.karol2846.modularizator.changeset;

import io.github.karol2846.modularizator.git.FileChange;
import io.github.karol2846.modularizator.git.RawCommit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Maps historical paths to HEAD paths (following renames) and filters commits into changesets.
 */
public final class ChangesetBuilder {

    public record Result(List<Changeset> changesets, HistoryStats stats) {

        public Result {
            changesets = List.copyOf(changesets);
        }
    }

    private ChangesetBuilder() {
    }

    /**
     * @param commits commits ordered from newest to oldest, as printed by {@code git log}
     * @param headFiles all paths existing on HEAD
     * @param maxChangeset changesets with more files (after filtering) are skipped as mega-commits
     */
    public static Result build(List<RawCommit> commits, Set<String> headFiles, int maxChangeset) {
        Map<String, String> toHeadPath = new HashMap<>();
        headFiles.forEach(path -> toHeadPath.put(path, path));

        List<Changeset> kept = new ArrayList<>();
        Set<String> uniqueFiles = new HashSet<>();
        int skippedEmpty = 0;
        int skippedMega = 0;
        int renamesResolved = 0;
        long oldest = Long.MAX_VALUE;
        long newest = Long.MIN_VALUE;

        for (RawCommit commit : commits) {
            SortedSet<String> files = new TreeSet<>();
            Map<String, String> renamedToHead = new HashMap<>();
            // All lookups use the mapping from before this commit; its renames only affect older commits.
            for (FileChange change : commit.changes()) {
                String headPath = toHeadPath.get(change.newPath());
                if (headPath == null) {
                    continue;
                }
                if (change.status() == FileChange.Status.RENAMED) {
                    renamedToHead.put(change.oldPath(), headPath);
                }
                if (FileInfo.isAnalysed(headPath)) {
                    files.add(headPath);
                }
            }
            // Updated for every commit, including mega-commits: mass moves are exactly those.
            toHeadPath.putAll(renamedToHead);
            renamesResolved += (int) renamedToHead.values().stream().filter(FileInfo::isAnalysed).count();

            if (files.isEmpty()) {
                skippedEmpty++;
            } else if (files.size() > maxChangeset) {
                skippedMega++;
            } else {
                kept.add(new Changeset(commit.hash(), commit.epochSeconds(), commit.subject(), files));
                uniqueFiles.addAll(files);
                oldest = Math.min(oldest, commit.epochSeconds());
                newest = Math.max(newest, commit.epochSeconds());
            }
        }

        HistoryStats stats = new HistoryStats(
                commits.size(),
                kept.size(),
                skippedEmpty,
                skippedMega,
                renamesResolved,
                kept.isEmpty() ? 0 : oldest,
                kept.isEmpty() ? 0 : newest,
                uniqueFiles.size());
        return new Result(kept, stats);
    }
}
