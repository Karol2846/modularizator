# Code Archaeology: kontekst projektu

> Ten plik opisuje, **po co** powstaje narzędzie i **jakie decyzje już zapadły**. Kroki implementacji są w `PLAN.md`.
> Przeczytaj go przed rozpoczęciem pracy. Jeśli coś w planie wydaje się sprzeczne z tym plikiem, zatrzymaj się i zapytaj.

## Czym jest projekt

Narzędzie CLI w Javie, które analizuje historię gita i znajduje pliki **zmieniające się razem** (temporal coupling / co-change). Z tych danych buduje ważony graf, uruchamia algorytm Leiden (community detection) i generuje raport z klastrami plików, czyli kandydatami na „naturalne moduły”.

Najważniejsza część raportu to klastry **przecinające wiele pakietów**. Jeśli pliki z 4 różnych pakietów stale zmieniają się razem, to sygnał, że granice w kodzie nie pokrywają się z tym, jak kod faktycznie ewoluuje.

Narzędzie **stawia hipotezy z dowodami, nie wydaje wyroków**. Nie mówi „wynieś ten moduł”. Mówi: „te pliki zmieniają się razem, leżą w różnych pakietach, a oto commity, które to pokazują”. Ocenę robi człowiek.

## Charakter projektu

- Projekt hobbystyczny do portfolio, rozwijany przez jedną osobę (Karol).
- Analizujemy **publiczne repozytoria open-source**, żeby wyniki dało się pokazać w README.
- Obecna faza to **tracer bullet**: cienki przebieg przez cały pipeline, w każdej warstwie najprostsze działające rozwiązanie. Celem jest sprawdzenie, czy wynik w ogóle jest interesujący, a nie zbudowanie dopracowanego narzędzia.
- Kodu tracer bulleta **nie wyrzucamy**, bo kolejne iteracje będą go rozwijać. Ma być czysty i testowalny, ale bez przedwczesnych abstrakcji (bez interfejsów „na zapas”, bez frameworków).

## Kryterium sukcesu tracer bulleta

Sukces oznacza, że w raporcie dla „ciekawego” repo jest **przynajmniej jeden klaster przecinający kilka pakietów**, który Karol po przejrzeniu wskazanych commitów uzna za realny i warty opisania w README.

Dlatego raport musi zawierać **dowody**: konkretne pary plików, liczby wspólnych commitów oraz hashe i tytuły tych commitów. Bez tego klastra nie da się zweryfikować.

Porażka to klastry, które są lustrem pakietów albo czystym szumem. To też wartościowa informacja, bo wtedy Karol decyduje, czy problem leży w ważeniu grafu, czy w samym repo.

## Repozytoria docelowe

| Rola | Repo | Czego się spodziewamy |
|---|---|---|
| Grupa kontrolna | JUnit: `https://github.com/junit-team/junit-framework` (dawniej `junit5`, GitHub przekierowuje) | Dobra modularność (platform / jupiter / vintage). Klastry powinny w dużej mierze pokrywać się z modułami builda. Jeśli tak nie jest, najpierw podejrzewamy błąd w narzędziu. |
| Ciekawe repo | JabRef: `https://github.com/JabRef/jabref` | Dojrzała aplikacja z długą historią i opisaną architekturą warstwową (gui → logic → model). Tu szukamy znalezisk. |
| Zapas | Mockito: `https://github.com/mockito/mockito` | Na wypadek, gdyby JabRef okazał się nieczytelny. |

Repozytoria docelowe klonujemy **z pełną historią** (bez `--depth`) i **poza** katalogiem projektu, np. do `../targets/`.

## Decyzje, które już zapadły (nie zmieniaj ich bez pytania)

| Obszar | Decyzja | Uzasadnienie |
|---|---|---|
| Język / build | Java 25, Gradle (Groovy lub Kotlin DSL), jeden moduł | Stack, który Karol zna, a biblioteka Leiden jest w Javie. (Zmienione z Java 21 na prośbę Karola.) |
| Zależności runtime | **Tylko** `nl.cwts:networkanalysis:1.3.0` | Referencyjna implementacja Leidena od autorów algorytmu. Bez Springa, picocli i JGit. |
| Zależności testowe | JUnit 5 + AssertJ | Prosto i standardowo. |
| Źródło historii | Proces `git` uruchamiany przez `ProcessBuilder`, wynik parsowany tekstowo | Najprościej. JGit może kiedyś później. |
| Granulacja | **Per plik**, nie per klasa | Analiza per klasa wymaga parsowania kodu. To później. |
| Zakres plików | Tylko pliki `.java` leżące pod `src/main/java/` (sprawdzane na ścieżce z HEAD) | Jedna reguła odsiewa naraz testy, configi, dokumentację i buildy. |
| Mega-commity | Changesety z > 50 plikami (po filtrze ścieżek) są pomijane przy liczeniu couplingu | Masowe rename'y i bumpy zależności dają fałszywy coupling. |
| Rename'y | Śledzone przez `git log -M --name-status`. Historię starej ścieżki przypisujemy obecnej (z HEAD). Rename'y z mega-commitów **też** aktualizują mapę ścieżek. | Duże repo prawie na pewno przenosiło pliki masowo, a bez tego tracimy większość historii. |
| Pliki usunięte | Analizujemy tylko pliki istniejące na HEAD | Nie ma sensu proponować modułów z nieistniejących plików. |
| Merge'e | `--no-merges` | Commit merge'owy dubluje zmiany z gałęzi. |
| Waga krawędzi | `shared(A,B) / min(revs(A), revs(B))` | Świadomy wybór. Pułapka: plik z małą liczbą rewizji łatwo dostaje wagę 1.0, dlatego jest próg `minShared`. |
| Progi krawędzi | `minShared = 3`, `minWeight = 0.3` (konfigurowalne) | Odsiew przypadkowych par. |
| Algorytm | Leiden z funkcją jakości **modularność** (nie CPM) | Na start wystarczy. CPM później. |
| Determinizm | Stały seed + deterministyczne indeksowanie węzłów (posortowane ścieżki) i krawędzi | Ten sam input musi dać bajt w bajt ten sam output. To wymóg, nie opcja. |
| Resolution | Parametr, domyślnie liczymy dla `0.5, 1.0, 2.0` | Główna gałka wpływająca na wynik. Na razie oglądamy kilka wartości ręcznie. |
| Wynik | Pliki Markdown + TSV, nic więcej | Czytelne dla człowieka, łatwe do wklejenia do README i do dalszej obróbki. |

## Poza zakresem tracer bulleta (NIE implementuj)

- Analiza per klasa i parsowanie kodu Javy
- CPM, Louvain, porównywanie algorytmów
- Stabilność klastrów między wieloma seedami
- Wizualizacja grafu, HTML, UI
- Dopracowane CLI (picocli, subkomendy, kolory, progress bary)
- Automatyczne sugestie typu „wynieś moduł X”
- Analiza wielu repozytoriów naraz i coupling między repo
- Cache, bazy danych, równoległość, optymalizacje wydajności
- Języki inne niż Java
- Filtrowanie po dacie / oknie czasowym

Jeśli coś z tej listy wydaje się potrzebne do działania, zatrzymaj się i zapytaj, zamiast to dodawać.

## Znane pułapki interpretacyjne (kontekst, nie do implementacji)

- Testy zmieniają się razem z kodem, który testują, dlatego je odsiewamy.
- Klaster przecinający pakiety może znaczyć „to powinien być jeden moduł”, ale też „brakuje abstrakcji i te pliki powinny zostać rozsprzęgnięte”. Narzędzie tego nie rozstrzyga, robi to człowiek.
- Modularność ma „resolution limit” (nie widzi bardzo małych społeczności). W v0 świadomie to akceptujemy.
- Wspólny plik-„hub” (np. centralna klasa konfiguracji) może sklejać niepowiązane klastry. Raport ma to pokazywać, a nie ukrywać.

## Słowniczek

- **Changeset**: zbiór plików (ścieżek z HEAD) zmienionych w jednym commicie, po filtrach.
- **revs(A)**: liczba zachowanych changesetów, w których wystąpił plik A.
- **shared(A,B)**: liczba zachowanych changesetów, w których wystąpiły oba pliki.
- **Węzeł** to plik. **Krawędź** to para plików spełniająca progi, z wagą couplingu.
- **Klaster**: grupa węzłów gęsto połączonych wewnątrz i rzadko z resztą (wynik Leidena).
- **Pakiet**: pakiet Javy wyliczony ze ścieżki (katalog po `src/main/java/`, `/` → `.`).
- **Moduł builda**: prefiks ścieżki przed `src/main/java/` (np. `junit-jupiter-engine`). Dla repo jednomodułowych jest pusty i w raporcie wyświetla się jako `(root)`.

## Podział ról

- **Agent:** implementacja, testy, uruchomienie na repozytoriach, wygenerowanie raportów.
- **Karol:** interpretacja wyników, decyzje o wagach i progach, opis znalezisk w README.

Agent **nie pisze wniosków** o tym, co klastry znaczą dla analizowanych projektów. Raporty mają być faktograficzne. Obserwacje techniczne (np. „rename detection pominęła commit X”) są jak najbardziej mile widziane.
