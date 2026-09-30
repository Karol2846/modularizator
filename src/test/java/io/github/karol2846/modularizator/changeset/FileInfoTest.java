package io.github.karol2846.modularizator.changeset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class FileInfoTest {

    @Test
    void derivesModuleAndPackage() {
        assertThat(FileInfo.of("a/b/src/main/java/org/x/Foo.java"))
                .isEqualTo(new FileInfo("a/b/src/main/java/org/x/Foo.java", "a/b", "org.x"));
    }

    @Test
    void usesRootModuleAndDefaultPackage() {
        assertThat(FileInfo.of("src/main/java/Foo.java"))
                .isEqualTo(new FileInfo("src/main/java/Foo.java", "(root)", "(default)"));
        assertThat(FileInfo.of("src/main/java/org/jabref/gui/Foo.java"))
                .isEqualTo(new FileInfo("src/main/java/org/jabref/gui/Foo.java", "(root)", "org.jabref.gui"));
        assertThat(FileInfo.of("mod/src/main/java/Foo.java"))
                .isEqualTo(new FileInfo("mod/src/main/java/Foo.java", "mod", "(default)"));
    }

    @Test
    void doesNotTreatSimilarDirectoryNamesAsSourceRoot() {
        assertThat(FileInfo.isAnalysed("mysrc/main/java/Foo.java")).isFalse();
        assertThat(FileInfo.isAnalysed("x/mysrc/main/java/Foo.java")).isFalse();
        assertThatThrownBy(() -> FileInfo.of("mysrc/main/java/Foo.java"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void analysesOnlyMainJavaSources() {
        assertThat(FileInfo.isAnalysed("src/main/java/org/x/Foo.java")).isTrue();
        assertThat(FileInfo.isAnalysed("mod/src/main/java/org/x/Foo.java")).isTrue();
        assertThat(FileInfo.isAnalysed("mod/src/test/java/org/x/FooTest.java")).isFalse();
        assertThat(FileInfo.isAnalysed("mod/src/main/resources/x.properties")).isFalse();
        assertThat(FileInfo.isAnalysed("mod/src/main/java/org/x/package.html")).isFalse();
        assertThat(FileInfo.isAnalysed("build.gradle")).isFalse();
    }
}
