# Co-change report: demo

HEAD: `0123456789abcdef0123456789abcdef01234567` · changesets: 2021-03-14 – 2021-03-18 · generated with parameters: minShared=3, minWeight=0.30, maxChangeset=50, seed=42

## Statistics

| metric | value | what it means |
|---|---|---|
| Commits read | 120 | Non-merge commits reachable from HEAD. |
| Changesets kept | 40 | Commits that touched production Java files and were used to compute coupling. |
| Skipped as empty | 70 | Commits that touched no production Java file still present at HEAD. |
| Skipped as mega-commits | 10 | Commits touching more than 50 production Java files (moves, formatting, bumps), ignored because they would create false coupling. |
| Renames resolved | 5 | Old paths whose history was attributed to a file that exists at HEAD. |
| Rename detection warnings | 1 | Times git gave up on rename detection, so some moved files may have lost history. |
| Unique files | 9 | Production Java files that appear in at least one kept changeset. |
| Edges | 7 | File pairs that changed together often enough to pass both thresholds (shared ≥ 3, weight ≥ 0.30). |
| Cross-package edges | 4 | Edges whose two files live in different Java packages. |
| Cross-module edges | 3 | Edges whose two files live in different build modules. |
| Graph nodes | 7 | Files with at least one edge; only these are clustered. |
| Files without edges | 2 | Files that changed, but never often enough together with any other file; left out of the graph. |

Rename detection warnings from git:

- `warning: exhaustive rename detection was skipped due to too many files.`

## Top 20 cross-package pairs

_Strongest edges between files in different packages, before clustering. shared = number of kept commits that changed both files; weight = shared divided by the number of commits of the less frequently changed file (1.00 = it never changed without the other)._

| fileA | fileB | shared | weight |
|---|---|---|---|
| `app/src/main/java/org/x/gui/Editor.java` | `core/src/main/java/org/x/model/Entry.java` | 3 | 1.00 |
| `app/src/main/java/org/x/gui/Editor.java` | `app/src/main/java/org/x/logic/Importer.java` | 3 | 1.00 |
| `app/src/main/java/org/x/logic/Importer.java` | `core/src/main/java/org/x/model/Entry.java` | 3 | 1.00 |
| `core/src/main/java/org/x/model/Field.java` | `src/main/java/Main.java` | 3 | 1.00 |

## Resolution = 0.5

Clusters (≥2 files): 1 · largest: 7 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.12

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 42.86% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 7 files, 4 packages, 3 modules

Packages: org.x.model (3), org.x.gui (2), (default) (1), org.x.logic (1)

Modules: app (3), core (3), (root) (1)

Files:

- `app/src/main/java/org/x/gui/Editor.java`
- `app/src/main/java/org/x/gui/Panel.java`
- `app/src/main/java/org/x/logic/Importer.java`
- `core/src/main/java/org/x/model/Author.java`
- `core/src/main/java/org/x/model/Entry.java`
- `core/src/main/java/org/x/model/Field.java`
- `src/main/java/Main.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Editor.java` | `Entry.java` | 3 | 1.00 |
| `Author.java` | `Field.java` | 3 | 1.00 |
| `Editor.java` | `Importer.java` | 3 | 1.00 |
| `Importer.java` | `Entry.java` | 3 | 1.00 |
| `Editor.java` | `Panel.java` | 3 | 1.00 |

Evidence for the strongest edge (`Editor.java` – `Entry.java`, up to 10 commits, newest first):

- `5555555` 2021-03-18 — Wire `Main` | startup
- `3333333` 2021-03-16 — Add field to entry editor
- `1111111` 2021-03-14 — Initial editor

## Resolution = 1.0

Clusters (≥2 files): 2 · largest: 4 files · nodes in single-file clusters: 1

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.46

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 83.33% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 4 files, 3 packages, 2 modules

Packages: org.x.gui (2), org.x.logic (1), org.x.model (1)

Modules: app (3), core (1)

Files:

- `app/src/main/java/org/x/gui/Editor.java`
- `app/src/main/java/org/x/gui/Panel.java`
- `app/src/main/java/org/x/logic/Importer.java`
- `core/src/main/java/org/x/model/Entry.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Editor.java` | `Entry.java` | 3 | 1.00 |
| `Editor.java` | `Importer.java` | 3 | 1.00 |
| `Importer.java` | `Entry.java` | 3 | 1.00 |
| `Editor.java` | `Panel.java` | 3 | 1.00 |

Evidence for the strongest edge (`Editor.java` – `Entry.java`, up to 10 commits, newest first):

- `5555555` 2021-03-18 — Wire `Main` | startup
- `3333333` 2021-03-16 — Add field to entry editor
- `1111111` 2021-03-14 — Initial editor

### Cluster 1 — 2 files, 1 package, 1 module

Packages: org.x.model (2)

Modules: core (2)

Files:

- `core/src/main/java/org/x/model/Author.java`
- `core/src/main/java/org/x/model/Field.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Author.java` | `Field.java` | 3 | 1.00 |

Evidence for the strongest edge (`Author.java` – `Field.java`, up to 10 commits, newest first):

- `4444444` 2021-03-17 — Rename author field
- `3333333` 2021-03-16 — Add field to entry editor
- `2222222` 2021-03-15 — Fix import of entries

