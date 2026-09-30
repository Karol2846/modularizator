package io.github.karol2846.modularizator.changeset;

/**
 * Build module and Java package derived from a file path, e.g.
 * {@code a/b/src/main/java/org/x/Foo.java} → module {@code a/b}, package {@code org.x}.
 */
public record FileInfo(String path, String buildModule, String javaPackage) {

    public static final String ROOT_MODULE = "(root)";
    public static final String DEFAULT_PACKAGE = "(default)";

    private static final String SOURCE_ROOT = "src/main/java/";

    /** Whether the file takes part in the analysis: a {@code .java} file under {@code src/main/java/}. */
    public static boolean isAnalysed(String path) {
        return path.endsWith(".java") && sourceRootIndex(path) >= 0;
    }

    public static FileInfo of(String path) {
        int sourceRoot = sourceRootIndex(path);
        if (sourceRoot < 0) {
            throw new IllegalArgumentException("Path is not under " + SOURCE_ROOT + ": " + path);
        }
        String buildModule = sourceRoot == 0 ? ROOT_MODULE : path.substring(0, sourceRoot - 1);
        String relative = path.substring(sourceRoot + SOURCE_ROOT.length());
        int lastSlash = relative.lastIndexOf('/');
        String javaPackage = lastSlash < 0 ? DEFAULT_PACKAGE : relative.substring(0, lastSlash).replace('/', '.');
        return new FileInfo(path, buildModule, javaPackage);
    }

    private static int sourceRootIndex(String path) {
        if (path.startsWith(SOURCE_ROOT)) {
            return 0;
        }
        int index = path.indexOf("/" + SOURCE_ROOT);
        return index < 0 ? -1 : index + 1;
    }
}
