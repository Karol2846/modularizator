# Decyzje podjęte poza `CONTEXT.md`

Jedna linijka: decyzja + powód.

## Krok 0: szkielet
- Java 25 zamiast 21 (zaktualizowane też w `CONTEXT.md`): wyraźna prośba Karola.
- Gradle 9.8.0 (wrapper), Kotlin DSL: Java 25 wymaga Gradle ≥ 9.1; Kotlin DSL daje podpowiedzi w IDE.
- Plugin `foojay-resolver-convention` w `settings.gradle.kts`: toolchain sam pobierze JDK 25, jeśli nie ma go lokalnie; to plugin builda, nie zależność runtime.
- Bez Springa ani innego frameworka (mimo zgody Karola): `CONTEXT.md` wyklucza frameworki, a CLI z jednym przebiegiem ich nie potrzebuje.
- JUnit 5 (5.14.x), nie 6: tak mówi `CONTEXT.md`.
- Pakiet bazowy `io.github.karol2846.modularizator`: konwencja dla projektów na GitHubie.
- `run` bez argumentów wypisuje usage i kończy się kodem 0; błędne argumenty: komunikat, usage i kod 2.
