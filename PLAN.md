# Code Archaeology: plan implementacji tracer bulleta

> Najpierw przeczytaj `CONTEXT.md`. Ten plik mówi, **co** zrobić i **w jakiej kolejności**, a `CONTEXT.md` mówi **dlaczego** i czego **nie** robić.

## Zasady pracy

- Pracuj krokami w podanej kolejności. Po każdym kroku: testy przechodzą, commit z opisem kroku.
- Są dwa **punkty zatrzymania** (oznaczone 🛑). W tych miejscach przerwij pracę, pokaż Karolowi wynik i poczekaj na decyzję.
- Gdy zderzasz się z decyzją, której nie ma w `CONTEXT.md`, wybierz najprostszą opcję, zapisz ją w `DECISIONS.md` (jedna linijka: decyzja + powód) i pracuj dalej. Zatrzymaj się tylko wtedy, gdy decyzja zmienia wynik analizy (wagi, filtry, progi).
- Żadnych zależności poza tymi wymienionymi w `CONTEXT.md`.

## Docelowy przepływ

```
git log ──► GitLogParser ──► RenameResolver + filtry ──► CouplingCalculator ──► Leiden ──► ReportWriter
 (proces)    (surowe commity)   (changesety na ścieżkach HEAD)   (revs, shared, wagi)   (klastry)   (md + tsv)
```

Proponowany układ pakietów (sugestia, nie dogmat): `git`, `changeset`, `coupling`, `clustering`, `report`, plus `Main` w pakiecie głównym.

---

## Krok 0: szkielet projektu

- Gradle, Java 21 (toolchain), plugin `application`, jeden moduł.
- Zależności: `nl.cwts:networkanalysis:1.3.0`, testowo JUnit 5 i AssertJ.
- `Main` z ręcznym parsowaniem argumentów:

```
./gradlew run --args="--repo ../targets/jabref --out results/jabref"
opcjonalne: --resolutions 0.5,1.0,2.0  --seed 42  --min-shared 3  --min-weight 0.3  --max-changeset 50
```

- Parametry trzymaj w jednym rekordzie `AnalysisConfig` z wartościami domyślnymi z `CONTEXT.md`.

**Gotowe, gdy:** `./gradlew build` przechodzi, a `run` bez argumentów wypisuje usage.

---

## Krok 1: odczyt historii gita

**1a. Pliki na HEAD:**
`git -C <repo> -c core.quotepath=false ls-tree -r --name-only HEAD` → `Set<String>`.

**1b. Log:**
```
git -C <repo> -c core.quotepath=false -c diff.renameLimit=20000 \
    log --no-merges -M --name-status \
    --format=format:%x1e%H%x1f%at%x1f%s HEAD
```
- `%x1e` oddziela commity, a `%x1f` pola w nagłówku (hash, timestamp, subject).
- Linie plików mają postać `<status>\t<ścieżka>` albo, dla rename'ów, `R<score>\t<stara>\t<nowa>`. Statusy do obsłużenia: `A`, `M`, `D`, `T`, `R###`. Nieznany status zgłoś wyjątkiem z treścią linii, żeby nie gubić danych po cichu.
- **Czytaj stdout strumieniowo** (JabRef ma dziesiątki tysięcy commitów). Stderr zbieraj osobno, żeby proces się nie zablokował.
- Jeśli stderr zawiera ostrzeżenie o pominiętej inexact rename detection, zapisz to w statystykach i pokaż w raporcie.
- Log jest w kolejności od najnowszego do najstarszego. Zachowaj tę kolejność, bo krok 2 na niej polega.

**Model:** `RawCommit(String hash, long epochSeconds, String subject, List<FileChange> changes)`, `FileChange(Status status, String oldPath, String newPath)`.

**Testy:**
- Parser testowany na **stałym stringu** (bez uruchamiania gita): zwykły commit, commit z rename'em, commit bez plików (np. pusty), subject z tabulatorem i znakami UTF-8.
- Jeden test integracyjny: w katalogu tymczasowym `git init`, kilka commitów, `git mv`, potem odczyt i asercje. (Skonfiguruj `user.name`/`user.email` lokalnie w repo testowym.)

---

## Krok 2: rename'y, filtry, changesety

**Rozwiązywanie ścieżek.** Idziemy od najnowszego commita do najstarszego i trzymamy mapę `ścieżka historyczna → ścieżka na HEAD`:
- Start: każda ścieżka z HEAD mapuje się na siebie.
- Dla każdego commita, dla każdej zmiany:
  - `R old new`: jeśli `new` jest w mapie, to przypisz `map[old] = map[new]`. Plik w tym commicie liczy się jako `map[new]`.
  - Pozostałe statusy: plik liczy się jako `map[path]`, jeśli ścieżka jest w mapie. W przeciwnym razie plik nie istnieje na HEAD i go pomijamy.
- **Mapę aktualizujemy dla każdego commita, także tego, który za chwilę odrzucimy jako mega-commit.** Masowe przenosiny to właśnie mega-commity.
- Znane uproszczenie: jeśli ścieżka była kiedyś używana przez inny, usunięty plik, może zostać źle przypisana. Akceptujemy to w v0. Zapisz w `DECISIONS.md`.

**Filtry (w tej kolejności):**
1. Filtr ścieżek na **ścieżce z HEAD**: kończy się na `.java` i zawiera segment `src/main/java/`.
2. Deduplikacja: zbiór, a nie lista.
3. Changeset pusty → pomiń (licz w statystykach).
4. Changeset > `maxChangeset` → pomiń jako mega-commit (licz w statystykach).

**Model:** `Changeset(String hash, long epochSeconds, String subject, SortedSet<String> files)`.
**Statystyki** (rekord, trafią do raportu): commity przeczytane, changesety zachowane, pominięte jako puste, pominięte jako mega-commity, liczba rozpoznanych rename'ów, zakres dat zachowanych changesetów, liczba unikalnych plików.

**Metadane pliku** (funkcja czysta, osobno testowana): `FileInfo(path, buildModule, javaPackage)`:
- `a/b/src/main/java/org/x/Foo.java` → moduł `a/b`, pakiet `org.x`
- `src/main/java/Foo.java` → moduł `(root)`, pakiet `(default)`

**Testy:** łańcuch rename'ów A→B→C (historia A trafia do C), rename w mega-commicie (mapa zaktualizowana, changeset odrzucony), plik usunięty przed HEAD (pominięty), filtr testów i plików nie-Java, `FileInfo` dla przypadków brzegowych.

---

## Krok 3: coupling

- `revs(file)`: liczba zachowanych changesetów z plikiem.
- `shared(a,b)`: dla każdego changesetu wszystkie pary (a < b leksykograficznie). Przy ≤ 50 plikach to maksymalnie 1225 par na commit, co jest tanie.
- Krawędź powstaje, gdy `shared ≥ minShared` **i** `weight ≥ minWeight`, gdzie `weight = shared / min(revs(a), revs(b))`.
- **Dowody:** dla par, które zostały krawędziami, zbierz listę changesetów (hash, data, subject), w których wystąpiły razem. Najprościej zrobić to drugim przejściem po changesetach, tylko dla par-krawędzi, bez trzymania list dla wszystkich par.
- Dla każdej krawędzi wylicz `crossPackage` (różne pakiety) i `crossModule` (różne moduły builda).

**Wyjście (plik, żeby dało się go obejrzeć przed klastrowaniem):** `pairs.tsv` z nagłówkiem:
`fileA  fileB  revsA  revsB  shared  weight  crossPackage  crossModule`, posortowany po `weight` malejąco, potem `shared` malejąco, potem po ścieżkach.

**Testy:** ręcznie policzony mały przykład (3–4 changesety), pary poniżej progów odrzucone, symetria (a,b) = (b,a), plik z revs=3 i shared=3 daje wagę 1.0.

### 🛑 Punkt zatrzymania 1

Sklonuj JUnit (`../targets/junit-framework`), uruchom kroki 1–3 i pokaż Karolowi:
- statystyki z kroku 2,
- top 20 par z `pairs.tsv` oraz top 20 par z `crossPackage = true`,
- **ręczną weryfikację 2 par:** porównaj `shared` z wynikiem `git log --format=%H -- <plikA>` ∩ `git log --format=%H -- <plikB>` (różnice przez rename'y są oczekiwane, ale opisz je).

Nie idź dalej bez akceptacji. To tani moment, żeby wyłapać błąd w liczbach, zanim przykryje go algorytm.

---

## Krok 4: graf i Leiden

- Węzły: pliki, które mają przynajmniej jedną krawędź, **posortowane leksykograficznie**. Indeks węzła to pozycja na tej liście. Pliki bez krawędzi nie trafiają do grafu, ale ich liczba idzie do statystyk.
- Krawędzie: każda para raz, posortowane po (indexA, indexB).
- Budowę sieci i uruchomienie algorytmu wzoruj na `nl.cwts.networkanalysis.run.RunNetworkClustering` i `FileIO.readEdgeList` z repo biblioteki (github.com/CWTSLeiden/networkanalysis). Kluczowe elementy stamtąd:
  - sieć budowana z `setNodeWeightsToTotalEdgeWeights = true` (to wersja pod modularność, **bez** `createNetworkWithoutNodeWeights()`, bo to ścieżka CPM),
  - resolution przekazywane do algorytmu dla modularności: `resolution / (2 * network.getTotalEdgeWeight() + network.getTotalEdgeWeightSelfLinks())`,
  - `new LeidenAlgorithm(resolution2, nIterations, randomness, new Random(seed))`, potem `improveClustering(network, clustering)` na klastrowaniu startowym „każdy węzeł osobno”,
  - na koniec `orderClustersByNNodes()`.
  - Dokładne sygnatury (np. czy krawędzie to `int[][]`, czy `LargeIntArray[]`) sprawdź w javadocu biblioteki, nie zgaduj.
- Parametry: `nIterations = 50`, `randomness` = domyślna wartość biblioteki, 1 random start, seed z configu (domyślnie 42).
- Uruchom osobno dla każdej wartości z `--resolutions`.
- Owiń to w jedną klasę (np. `LeidenClusterer`), która przyjmuje listę węzłów i krawędzi, a zwraca `Map<String, Integer>` (plik → id klastra) oraz wartość jakości. Reszta kodu nie zna typów biblioteki.

**Testy:**
- Dwie kliki po 4 węzły połączone jedną słabą krawędzią → 2 klastry, każda klika w jednym.
- Determinizm: dwa uruchomienia z tym samym seedem dają identyczny wynik.

---

## Krok 5: raport

Katalog wyjściowy `--out` zawiera:
- `report.md`: jeden plik, sekcja na każde resolution,
- `pairs.tsv` (z kroku 3),
- `clusters-r<resolution>.tsv`: `file  cluster  module  package`, posortowane po klastrze, potem po pliku.

**Struktura `report.md`:**

```markdown
# Co-change report: <nazwa repo>

HEAD: <hash> · changesety: <od> – <do> · wygenerowano parametrami: minShared=3, minWeight=0.3, maxChangeset=50, seed=42

## Statystyki
(tabela ze statystykami z kroków 2–4, w tym ostrzeżenia o rename detection)

## Top 20 par przecinających pakiety
(tabela: plikA, plikB, shared, weight — bez klastrowania, surowy sygnał)

## Resolution = 1.0
Klastry (≥2 pliki): N · największy: K plików · węzły w klastrach 1-plikowych: M
Zgodność z modułami builda: X% plików leży w klastrze, którego dominującym modułem jest ich własny moduł

### Klaster 7 — 6 plików, 4 pakiety, 2 moduły
Pakiety: org.jabref.gui.entryeditor (3), org.jabref.logic.importer (1), …
Pliki:
- `jabgui/src/main/java/org/jabref/gui/entryeditor/Foo.java`
- …
Najsilniejsze krawędzie wewnątrz klastra (top 5):
| plikA | plikB | shared | weight |
Dowody dla najsilniejszej krawędzi (do 10 commitów):
- `a1b2c3d` 2021-03-14 — Fix citation key generation in entry editor
- …
```

**Kolejność klastrów w sekcji:** liczba pakietów malejąco, potem liczba plików malejąco, potem id. Pokazuj w całości **top 15 klastrów** z ≥2 plikami, a pozostałe w skróconej tabeli (id, pliki, pakiety, moduły).

**Wymogi:**
- Ścieżki w Markdownie wstawiaj w backtickach. W liście plików klastra podawaj pełne ścieżki, a w tabelach krawędzi skracaj do samej nazwy klasy (np. `EntryEditor.java`), bo pełne ścieżki są już wyżej.
- Liczby zmiennoprzecinkowe formatuj z 2 miejscami i `Locale.ROOT`.
- Żadnych znaczników czasu generowania w pliku, bo raport ma być deterministyczny.

**Testy:** test raportu na małym, ręcznie zbudowanym wejściu (golden file w `src/test/resources`).

---

## Krok 6: uruchomienie na prawdziwych repo

1. `git clone https://github.com/junit-team/junit-framework ../targets/junit-framework` i uruchom z `--out results/junit`.
2. `git clone https://github.com/JabRef/jabref ../targets/jabref` i uruchom z `--out results/jabref`.
3. **Test determinizmu:** uruchom JabRef drugi raz do innego katalogu, a `diff -r` ma nic nie pokazać.
4. Zapisz czas wykonania i szczytowe zużycie pamięci (wystarczy `/usr/bin/time -v` albo log z `Main`). Jeśli JabRef nie mieści się w domyślnym heapie, podnieś `-Xmx` w `applicationDefaultJvmArgs` i zapisz to w `DECISIONS.md`. **Nie optymalizuj algorytmu.**
5. Wyniki (`results/`) commitujemy do repo, bo są częścią portfolio.

### 🛑 Punkt zatrzymania 2

Pokaż Karolowi:
- dla JUnit: zgodność z modułami builda dla każdego resolution i 3 klastry z największą liczbą modułów,
- dla JabRef: 5 pierwszych klastrów z sekcji resolution=1.0 (pełne wpisy z dowodami),
- czasy wykonania i ewentualne ostrzeżenia z rename detection.

**Bez interpretacji** tego, co klastry mówią o architekturze projektów (patrz `CONTEXT.md`, „Podział ról”).

---

## Krok 7: README projektu

Krótko, bo resztę dopisze Karol:
- jedno zdanie, co robi narzędzie,
- jak zbudować i uruchomić (komenda z kroku 0),
- opis algorytmu w 5 punktach (odczyt historii → rename'y i filtry → coupling → Leiden → raport) ze wzorem na wagę i wartościami progów,
- lista świadomych uproszczeń z `CONTEXT.md` i `DECISIONS.md`,
- pusta sekcja `## Findings` z komentarzem `<!-- Karol -->`.

---

## Definition of Done tracer bulleta

- [ ] `./gradlew build` przechodzi, a testy pokrywają parser, rename'y, filtry, coupling, Leiden i raport.
- [ ] Istnieją `results/junit/` i `results/jabref/` z `report.md`, `pairs.tsv` i `clusters-r*.tsv`.
- [ ] Dwa uruchomienia na tym samym repo dają identyczne pliki.
- [ ] Każdy klaster w raporcie ma dowody (commity) dla najsilniejszej krawędzi.
- [ ] `DECISIONS.md` zawiera wszystkie decyzje podjęte poza `CONTEXT.md`.
- [ ] Nic z listy „Poza zakresem” nie zostało zaimplementowane.
