package io.github.karol2846.modularizator.report;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.karol2846.modularizator.changeset.Changeset;
import io.github.karol2846.modularizator.changeset.FileInfo;
import io.github.karol2846.modularizator.changeset.HistoryStats;
import io.github.karol2846.modularizator.clustering.LeidenClusterer;
import io.github.karol2846.modularizator.coupling.CoChangeEdge;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class ReportWriterTest {

    static final String EDITOR = "app/src/main/java/org/x/gui/Editor.java";
    static final String PANEL = "app/src/main/java/org/x/gui/Panel.java";
    static final String IMPORTER = "app/src/main/java/org/x/logic/Importer.java";
    static final String ENTRY = "core/src/main/java/org/x/model/Entry.java";
    static final String FIELD = "core/src/main/java/org/x/model/Field.java";
    static final String AUTHOR = "core/src/main/java/org/x/model/Author.java";
    static final String MAIN = "src/main/java/Main.java";

    // Hash "1111…", date 2021-03-14; hash "2222…", date 2021-03-15; ...
    private static Changeset changeset(int day, String subject) {
        return new Changeset(String.valueOf(day).repeat(40), 1615680000L + (day - 1) * 86400L, subject,
                new TreeSet<>());
    }

    private static CoChangeEdge edge(String a, String b, int revsA, int revsB, int shared, List<Changeset> evidence) {
        return new CoChangeEdge(FileInfo.of(a), FileInfo.of(b), revsA, revsB, shared,
                (double) shared / Math.min(revsA, revsB), evidence);
    }

    static ReportWriter.Input input() {
        Changeset c1 = changeset(1, "Initial editor");
        Changeset c2 = changeset(2, "Fix import of entries");
        Changeset c3 = changeset(3, "Add field to entry editor");
        Changeset c4 = changeset(4, "Rename author field");
        Changeset c5 = changeset(5, "Wire `Main` | startup");
        // Strongest first, as CouplingCalculator returns them.
        List<CoChangeEdge> edges = List.of(
                edge(EDITOR, ENTRY, 3, 4, 3, List.of(c5, c3, c1)),
                edge(AUTHOR, FIELD, 3, 3, 3, List.of(c4, c3, c2)),
                edge(EDITOR, IMPORTER, 3, 3, 3, List.of(c3, c2, c1)),
                edge(IMPORTER, ENTRY, 3, 4, 3, List.of(c3, c2, c1)),
                edge(EDITOR, PANEL, 3, 5, 3, List.of(c5, c3, c1)),
                edge(FIELD, MAIN, 3, 6, 3, List.of(c5, c4, c3)),
                edge(ENTRY, FIELD, 4, 3, 3, List.of(c4, c3, c2)));
        LeidenClusterer.Result coarse = new LeidenClusterer.Result(0.5, Map.of(
                EDITOR, 0, PANEL, 0, IMPORTER, 0, ENTRY, 0, FIELD, 0, AUTHOR, 0, MAIN, 0), 1, 0.123);
        LeidenClusterer.Result fine = new LeidenClusterer.Result(1.0, Map.of(
                EDITOR, 0, PANEL, 0, IMPORTER, 0, ENTRY, 0, FIELD, 1, AUTHOR, 1, MAIN, 2), 3, 0.456);
        return new ReportWriter.Input("demo", "0123456789abcdef0123456789abcdef01234567", 3, 0.3, 50, 42,
                new HistoryStats(120, 40, 70, 10, 5, 1615680000L, 1616025600L, 9),
                List.of("warning: exhaustive rename detection was skipped due to too many files."),
                edges, 7, List.of(coarse, fine));
    }

    @Test
    void rendersGoldenReport() throws IOException {
        String expected;
        try (InputStream golden = getClass().getResourceAsStream("/report/golden-report.md")) {
            expected = new String(golden.readAllBytes(), StandardCharsets.UTF_8);
        }

        assertThat(ReportWriter.render(input())).isEqualTo(expected);
    }

    @Test
    void showsFirstClustersInFullAndTheRestCondensed() {
        List<CoChangeEdge> edges = new ArrayList<>();
        Map<String, Integer> clusters = new HashMap<>();
        Changeset evidence = changeset(1, "Change pair");
        for (int i = 0; i < 17; i++) {
            String a = String.format("src/main/java/p%02d/A.java", i);
            String b = String.format("src/main/java/p%02d/B.java", i);
            edges.add(edge(a, b, 3, 3, 3, List.of(evidence)));
            clusters.put(a, i);
            clusters.put(b, i);
        }
        ReportWriter.Input input = new ReportWriter.Input("many", "abc", 3, 0.3, 50, 42,
                new HistoryStats(3, 3, 0, 0, 0, 1615680000L, 1615680000L, 34), List.of(), edges, 34,
                List.of(new LeidenClusterer.Result(1.0, clusters, 17, 0.9)));

        String report = ReportWriter.render(input);

        assertThat(report.lines().filter(line -> line.startsWith("### Cluster "))).hasSize(15);
        assertThat(report).contains("### Other clusters");
        assertThat(report.lines().filter(line -> line.matches("\\| 1[56] \\| 2 \\| 1 \\| 1 \\| .*"))).hasSize(2);
        assertThat(report).contains("| 16 | 2 | 1 | 1 | `A.java` – `B.java` | 3 | 1.00 | `1111111` |");
    }
}
