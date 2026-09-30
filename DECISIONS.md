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

## Krok 1: odczyt historii
- Ścieżki, które git cytuje mimo `core.quotepath=false` (znaki sterujące, `"`, `\`), nie są odkodowywane: w plikach `.java` praktycznie nie występują, a `ls-tree` i `log` cytują je tak samo, więc mapowanie pozostaje spójne.
- Ostrzeżenie o rename detection rozpoznajemy po linii stderr zawierającej `rename detection was skipped` (obejmuje wariant „inexact” i „exhaustive”); git nie mówi, którego commita dotyczy, więc raportujemy tylko liczbę i treść.
- Statusy spoza `A/M/D/T/R###` (np. `C`, `U`, `X`) rzucają wyjątkiem z treścią linii, zgodnie z planem.

## Krok 2: rename'y, filtry, changesety
- Znane uproszczenie z planu: jeśli ścieżka była kiedyś używana przez inny, później usunięty plik, jego historia zostanie przypisana obecnemu plikowi pod tą ścieżką; akceptujemy w v0.
- Wszystkie zmiany w commicie rozwiązujemy mapą sprzed tego commita, a jego rename'y aplikujemy dopiero potem: rename dotyczy tylko starszych commitów (np. `R a→b` + `A a` w jednym commicie nie myli plików).
- „Rozpoznane rename'y” to liczba starych ścieżek zmapowanych na plik z HEAD, który przechodzi filtr (`.java` w `src/main/java/`): liczymy tylko to, co wpływa na analizę.
- Zakres dat w statystykach to najstarszy i najnowszy **zachowany** changeset (po `%at`, czyli dacie autora); 0, gdy nic nie zachowano.
