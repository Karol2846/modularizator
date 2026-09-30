package io.github.karol2846.modularizator;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public record AnalysisConfig(
        Path repo,
        Path out,
        List<Double> resolutions,
        long seed,
        int minShared,
        double minWeight,
        int maxChangeset) {

    public static final List<Double> DEFAULT_RESOLUTIONS = List.of(0.5, 1.0, 2.0);
    public static final long DEFAULT_SEED = 42;
    public static final int DEFAULT_MIN_SHARED = 3;
    public static final double DEFAULT_MIN_WEIGHT = 0.3;
    public static final int DEFAULT_MAX_CHANGESET = 50;

    public static final String USAGE = """
            Usage: --repo <path> --out <dir> [options]

              --repo <path>            git repository to analyse (required)
              --out <dir>              output directory (required)
              --resolutions <list>     comma-separated Leiden resolutions (default: 0.5,1.0,2.0)
              --seed <long>            random seed (default: 42)
              --min-shared <int>       minimal number of shared changesets for an edge (default: 3)
              --min-weight <double>    minimal coupling weight for an edge (default: 0.3)
              --max-changeset <int>    changesets with more files are skipped (default: 50)
            """;

    public AnalysisConfig {
        resolutions = List.copyOf(resolutions);
    }

    /**
     * Parses command line arguments. Throws {@link IllegalArgumentException} with a human-readable
     * message when arguments are invalid.
     */
    public static AnalysisConfig parse(String[] args) {
        Path repo = null;
        Path out = null;
        List<Double> resolutions = DEFAULT_RESOLUTIONS;
        long seed = DEFAULT_SEED;
        int minShared = DEFAULT_MIN_SHARED;
        double minWeight = DEFAULT_MIN_WEIGHT;
        int maxChangeset = DEFAULT_MAX_CHANGESET;

        for (int i = 0; i < args.length; i += 2) {
            String name = args[i];
            if (i + 1 >= args.length) {
                throw new IllegalArgumentException("Missing value for " + name);
            }
            String value = args[i + 1];
            try {
                switch (name) {
                    case "--repo" -> repo = Path.of(value);
                    case "--out" -> out = Path.of(value);
                    case "--resolutions" -> resolutions = Arrays.stream(value.split(","))
                            .map(String::trim)
                            .map(Double::parseDouble)
                            .toList();
                    case "--seed" -> seed = Long.parseLong(value);
                    case "--min-shared" -> minShared = Integer.parseInt(value);
                    case "--min-weight" -> minWeight = Double.parseDouble(value);
                    case "--max-changeset" -> maxChangeset = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Unknown option " + name);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid value for " + name + ": " + value);
            }
        }

        if (repo == null) {
            throw new IllegalArgumentException("Missing required option --repo");
        }
        if (out == null) {
            throw new IllegalArgumentException("Missing required option --out");
        }
        return new AnalysisConfig(repo, out, resolutions, seed, minShared, minWeight, maxChangeset);
    }
}
