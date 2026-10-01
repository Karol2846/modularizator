package io.github.karol2846.modularizator.git;

/**
 * One line of {@code git log --name-status}. For non-renames {@code oldPath} equals {@code newPath}.
 */
public record FileChange(Status status, String oldPath, String newPath) {

    public enum Status {
        ADDED,
        MODIFIED,
        DELETED,
        TYPE_CHANGED,
        RENAMED
    }

    public static FileChange of(Status status, String path) {
        return new FileChange(status, path, path);
    }

    public static FileChange renamed(String oldPath, String newPath) {
        return new FileChange(Status.RENAMED, oldPath, newPath);
    }
}
