package io.github.karol2846.modularizator;

import io.github.karol2846.modularizator.changeset.ChangesetBuilder;
import io.github.karol2846.modularizator.changeset.HistoryStats;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import io.github.karol2846.modularizator.coupling.CouplingCalculator;
import io.github.karol2846.modularizator.coupling.CouplingCalculator.Coupling;
import io.github.karol2846.modularizator.git.GitRepository;
import io.github.karol2846.modularizator.git.GitRepository.GitLog;
import io.github.karol2846.modularizator.report.PairsTsvWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Set;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(AnalysisConfig.USAGE);
            return;
        }
        AnalysisConfig config;
        try {
            config = AnalysisConfig.parse(args);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println(AnalysisConfig.USAGE);
            System.exit(2);
            return;
        }
        run(config);
    }

    private static void run(AnalysisConfig config) {
        long start = System.nanoTime();
        GitRepository repository = new GitRepository(config.repo());
        Set<String> headFiles = repository.headFiles();
        GitLog log = repository.log();

        ChangesetBuilder.Result history = ChangesetBuilder.build(log.commits(), headFiles, config.maxChangeset());
        Coupling coupling = CouplingCalculator.calculate(
                history.changesets(), config.minShared(), config.minWeight());

        try {
            Files.createDirectories(config.out());
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot create " + config.out(), e);
        }
        PairsTsvWriter.write(config.out().resolve("pairs.tsv"), coupling.edges());

        printSummary(config, log, history.stats(), coupling, (System.nanoTime() - start) / 1_000_000);
    }

    private static void printSummary(
            AnalysisConfig config, GitLog log, HistoryStats stats, Coupling coupling, long elapsedMillis) {
        System.out.println("Repository:              " + config.repo());
        System.out.println("Commits read:            " + stats.commitsRead());
        System.out.println("Changesets kept:         " + stats.changesetsKept());
        System.out.println("Skipped as empty:        " + stats.skippedEmpty());
        System.out.println("Skipped as mega-commits: " + stats.skippedMegaCommits()
                + " (> " + config.maxChangeset() + " files)");
        System.out.println("Renames resolved:        " + stats.renamesResolved());
        System.out.println("Kept changesets range:   " + date(stats.oldestKeptEpochSeconds())
                + " .. " + date(stats.newestKeptEpochSeconds()));
        System.out.println("Unique files:            " + stats.uniqueFiles());
        System.out.println("Edges:                   " + coupling.edges().size()
                + " (crossPackage: " + coupling.edges().stream().filter(CoChangeEdge::crossPackage).count()
                + ", crossModule: " + coupling.edges().stream().filter(CoChangeEdge::crossModule).count() + ")");
        System.out.println("Rename warnings:         " + log.renameWarnings().size());
        log.renameWarnings().forEach(warning -> System.out.println("  " + warning));
        System.out.println("Elapsed:                 " + elapsedMillis + " ms");
    }

    private static String date(long epochSeconds) {
        return Instant.ofEpochSecond(epochSeconds).atZone(ZoneOffset.UTC).toLocalDate().toString();
    }
}
