package io.github.karol2846.modularizator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;

class AnalysisConfigTest {

    @Test
    void usesDefaultsWhenOnlyRequiredOptionsAreGiven() {
        AnalysisConfig config = AnalysisConfig.parse(new String[] {"--repo", "../targets/x", "--out", "results/x"});

        assertThat(config).isEqualTo(new AnalysisConfig(
                Path.of("../targets/x"), Path.of("results/x"), List.of(0.5, 1.0, 2.0), 42, 3, 0.3, 50));
    }

    @Test
    void parsesAllOptions() {
        AnalysisConfig config = AnalysisConfig.parse(new String[] {
            "--repo", "r", "--out", "o",
            "--resolutions", "0.25, 3",
            "--seed", "7",
            "--min-shared", "5",
            "--min-weight", "0.5",
            "--max-changeset", "20"
        });

        assertThat(config).isEqualTo(new AnalysisConfig(
                Path.of("r"), Path.of("o"), List.of(0.25, 3.0), 7, 5, 0.5, 20));
    }

    @Test
    void rejectsMissingRequiredOption() {
        assertThatThrownBy(() -> AnalysisConfig.parse(new String[] {"--repo", "r"}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("--out");
    }

    @Test
    void rejectsUnknownOptionAndMissingValue() {
        assertThatThrownBy(() -> AnalysisConfig.parse(new String[] {"--repo", "r", "--out", "o", "--foo", "1"}))
                .hasMessageContaining("Unknown option --foo");
        assertThatThrownBy(() -> AnalysisConfig.parse(new String[] {"--repo"}))
                .hasMessageContaining("Missing value for --repo");
    }

    @Test
    void rejectsInvalidNumber() {
        assertThatThrownBy(() -> AnalysisConfig.parse(new String[] {"--repo", "r", "--out", "o", "--seed", "abc"}))
                .hasMessageContaining("Invalid value for --seed: abc");
    }
}
