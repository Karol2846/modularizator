package io.github.karol2846.modularizator.coupling;

/** Unordered pair of files, normalised so that {@code a < b} lexicographically. */
record FilePair(String a, String b) {

    FilePair {
        if (a.compareTo(b) >= 0) {
            throw new IllegalArgumentException("Expected a < b, got: " + a + ", " + b);
        }
    }

    static FilePair of(String x, String y) {
        return x.compareTo(y) < 0 ? new FilePair(x, y) : new FilePair(y, x);
    }
}
