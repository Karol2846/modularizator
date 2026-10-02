package io.github.karol2846.modularizator;

import io.github.karol2846.modularizator.changeset.ChangesetBuilder;
import io.github.karol2846.modularizator.clustering.CoChangeGraph;
import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import io.github.karol2846.modularizator.coupling.CouplingCalculator;
import io.github.karol2846.modularizator.coupling.CouplingCalculator.Coupling;
import io.github.karol2846.modularizator.git.GitRepository;
import io.github.karol2846.modularizator.git.GitRepository.GitLog;
import io.github.karol2846.modularizator.report.ClustersTsvWriter;
import io.github.karol2846.modularizator.report.PairsTsvWriter;
import io.github.karol2846.modularizator.report.ReportWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
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
        String headHash = repository.headHash();
        Set<String> headFiles = repository.headFiles();
        GitLog log = repository.log();

        ChangesetBuilder.Result history = ChangesetBuilder.build(log.commits(), headFiles, config.maxChangeset());
        Coupling coupling = CouplingCalculator.calculate(
                history.changesets(), config.minShared(), config.minWeight());

        CoChangeGraph graph = CoChangeGraph.of(coupling.edges());
        List<LeidenClusterer.Result> clusterings = new ArrayList<>();
        for (double resolution : config.resolutions()) {
            clusterings.add(LeidenClusterer.cluster(graph, resolution, config.seed()));
        }

        try {
            Files.createDirectories(config.out());
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot create " + config.out(), e);
        }
        PairsTsvWriter.write(config.out().resolve("pairs.tsv"), coupling.edges());
        for (LeidenClusterer.Result result : clusterings) {
            ClustersTsvWriter.write(config.out().resolve(ClustersTsvWriter.fileName(result.resolution())), result);
        }
        ReportWriter.write(config.out().resolve("report.md"), new ReportWriter.Input(
                repoName(config.repo()),
                headHash,
                config.minShared(),
                config.minWeight(),
                config.maxChangeset(),
                config.seed(),
                history.stats(),
                log.renameWarnings(),
                coupling.edges(),
                graph.nodes().size(),
                clusterings));

        System.out.println("Report written to " + config.out().resolve("report.md"));
        System.out.println("Elapsed: " + (System.nanoTime() - start) / 1_000_000 + " ms");
    }

    private static String repoName(Path repo) {
        Path name = repo.toAbsolutePath().normalize().getFileName();
        return name == null ? repo.toString() : name.toString();
    }
}
