# Code Archaeology: tracer bullet implementation plan

> Read `CONTEXT.md` first. This file says **what** to do and **in what order**; `CONTEXT.md` says **why** and what **not** to do.

## Status

- Steps 0–6 done; 🛑 Checkpoint 1 passed. **Now: 🛑 Checkpoint 2, waiting for Karol.** Step 7 comes after that.
- Karol's decision at Checkpoint 1: no tuning or fixes to thresholds, weights or filters yet. Run the pipeline as specified end to end first, then tune.
- Targets are cloned in `../targets/` (not in the repo); re-clone with full history if missing.

## Working rules

- Work through the steps in the given order. After each step: tests pass, commit describing the step.
- There are two **checkpoints** (marked 🛑). At those points stop, show Karol the results and wait for a decision.
- When you hit a decision not covered by `CONTEXT.md`, pick the simplest option, record it in `DECISIONS.md` (one line: decision + reason) and keep going. Stop only when the decision changes the analysis result (weights, filters, thresholds).
- No dependencies beyond those listed in `CONTEXT.md`.

## Target flow

```
git log ──► GitLogParser ──► RenameResolver + filters ──► CouplingCalculator ──► Leiden ──► ReportWriter
 (process)   (raw commits)    (changesets on HEAD paths)    (revs, shared, weights)  (clusters)  (md + tsv)
```

Suggested package layout (a suggestion, not dogma): `git`, `changeset`, `coupling`, `clustering`, `report`, plus `Main` in the root package.

---

## Step 0: project skeleton

- Gradle, Java 25 (toolchain), `application` plugin, single module.
- Dependencies: `nl.cwts:networkanalysis:1.3.0`; for tests JUnit 5 and AssertJ.
- `Main` with hand-written argument parsing:

```
./gradlew run --args="--repo ../targets/jabref --out results/jabref"
optional: --resolutions 0.5,1.0,2.0  --seed 42  --min-shared 3  --min-weight 0.3  --max-changeset 50
```

- Keep the parameters in a single `AnalysisConfig` record with the defaults from `CONTEXT.md` (see "Parameters at a glance" there for what each one means).

**Done when:** `./gradlew build` passes and `run` without arguments prints usage.

---

## Step 1: reading git history

**1a. Files at HEAD:**
`git -C <repo> -c core.quotepath=false ls-tree -r --name-only HEAD` → `Set<String>`.

**1b. Log:**
```
git -C <repo> -c core.quotepath=false -c diff.renameLimit=20000 \
    log --no-merges -M --name-status \
    --format=format:%x1e%H%x1f%at%x1f%s HEAD
```
- `%x1e` separates commits and `%x1f` separates header fields (hash, timestamp, subject).
- `diff.renameLimit=20000` lets git look for renames even in commits touching up to 20,000 files, so bulk moves are still detected.
- File lines have the form `<status>\t<path>` or, for renames, `R<score>\t<old>\t<new>`. Statuses to handle: `A`, `M`, `D`, `T`, `R###`. Report an unknown status with an exception containing the line, so no data is silently lost.
- **Read stdout as a stream** (JabRef has tens of thousands of commits). Collect stderr separately so the process doesn't block.
- If stderr contains a warning about skipped inexact rename detection, record it in the statistics and show it in the report.
- The log is ordered newest to oldest. Keep that order, because step 2 relies on it.

**Model:** `RawCommit(String hash, long epochSeconds, String subject, List<FileChange> changes)`, `FileChange(Status status, String oldPath, String newPath)`.

**Tests:**
- Parser tested on a **fixed string** (no git process): a regular commit, a commit with a rename, a commit with no files (e.g. empty), a subject with a tab and UTF-8 characters.
- One integration test: `git init` in a temp directory, a few commits, `git mv`, then read and assert. (Configure `user.name`/`user.email` locally in the test repo.)

---

## Step 2: renames, filters, changesets

**Path resolution.** Walk from the newest commit to the oldest, keeping a map `historical path → HEAD path`:
- Start: every HEAD path maps to itself.
- For each commit, for each change:
  - `R old new`: if `new` is in the map, set `map[old] = map[new]`. The file in this commit counts as `map[new]`.
  - Other statuses: the file counts as `map[path]` if the path is in the map. Otherwise the file doesn't exist at HEAD and is skipped.
- **Update the map for every commit, including one about to be discarded as a mega-commit.** Bulk moves are exactly the mega-commits.
- Known simplification: if a path was once used by another, deleted file, it may be misattributed. We accept this in v0. Record it in `DECISIONS.md`.

**Filters (in this order):**
1. Path filter on the **HEAD path**: ends with `.java` and contains the segment `src/main/java/`.
2. Deduplication: a set, not a list.
3. Empty changeset → skip (count in statistics).
4. Changeset > `maxChangeset` → skip as a mega-commit (count in statistics).

**Model:** `Changeset(String hash, long epochSeconds, String subject, SortedSet<String> files)`.
**Statistics** (a record that ends up in the report): commits read, changesets kept, skipped as empty, skipped as mega-commits, number of renames detected, date range of kept changesets, number of unique files.

**File metadata** (a pure function, tested separately): `FileInfo(path, buildModule, javaPackage)`:
- `a/b/src/main/java/org/x/Foo.java` → module `a/b`, package `org.x`
- `src/main/java/Foo.java` → module `(root)`, package `(default)`

**Tests:** rename chain A→B→C (A's history goes to C), rename inside a mega-commit (map updated, changeset discarded), file deleted before HEAD (skipped), filtering of tests and non-Java files, `FileInfo` edge cases.

---

## Step 3: coupling

- `revs(file)`: number of kept changesets containing the file.
- `shared(a,b)`: for each changeset, all pairs (a < b lexicographically). With ≤ 50 files that's at most 1225 pairs per commit (50 × 49 / 2), which is cheap.
- An edge is created when `shared ≥ minShared` **and** `weight ≥ minWeight`, where `weight = shared / min(revs(a), revs(b))`. In plain words: weight is the fraction of the rarer file's commits that also touched the other file (1.0 = they always change together).
- **Evidence:** for pairs that became edges, collect the list of changesets (hash, date, subject) in which they appeared together. The simplest way is a second pass over the changesets, only for edge pairs, without keeping lists for all pairs.
- For each edge compute `crossPackage` (different packages) and `crossModule` (different build modules).

**Output (a file, so it can be inspected before clustering):** `pairs.tsv` with the header:
`fileA  fileB  revsA  revsB  shared  weight  crossPackage  crossModule`, sorted by `weight` descending, then `shared` descending, then by paths.

**Tests:** a small hand-computed example (3–4 changesets), pairs below thresholds rejected, symmetry (a,b) = (b,a), a file with revs=3 and shared=3 gives weight 1.0.

### 🛑 Checkpoint 1

Clone JUnit (`../targets/junit-framework`), run steps 1–3 and show Karol:
- the statistics from step 2,
- the top 20 pairs from `pairs.tsv` and the top 20 pairs with `crossPackage = true`,
- **manual verification of 2 pairs:** compare `shared` with `git log --format=%H -- <fileA>` ∩ `git log --format=%H -- <fileB>` (differences due to renames are expected, but describe them).

Each number shown gets a one-sentence explanation of what it means.

Don't go further without approval. This is the cheap moment to catch an error in the numbers before the algorithm hides it.

---

## Step 4: graph and Leiden

- Nodes: files with at least one edge, **sorted lexicographically**. A node's index is its position in that list. Files without edges don't go into the graph, but their count goes into the statistics.
- Edges: each pair once, sorted by (indexA, indexB).
- Model network construction and the algorithm run on `nl.cwts.networkanalysis.run.RunNetworkClustering` and `FileIO.readEdgeList` from the library repo (github.com/CWTSLeiden/networkanalysis). Key elements from there:
  - the network is built with `setNodeWeightsToTotalEdgeWeights = true` (this is the modularity variant, **without** `createNetworkWithoutNodeWeights()`, which is the CPM path),
  - the resolution passed to the algorithm for modularity: `resolution / (2 * network.getTotalEdgeWeight() + network.getTotalEdgeWeightSelfLinks())`,
  - `new LeidenAlgorithm(resolution2, nIterations, randomness, new Random(seed))`, then `improveClustering(network, clustering)` on a starting clustering of "every node on its own",
  - finally `orderClustersByNNodes()`.
  - Check exact signatures (e.g. whether edges are `int[][]` or `LargeIntArray[]`) in the library's javadoc, don't guess.
- Parameters: `nIterations = 50` (how many times Leiden refines the clustering; more iterations give a more stable result), `randomness` = the library default, 1 random start, seed from the config (default 42).
- Run separately for each value in `--resolutions`.
- Wrap it in a single class (e.g. `LeidenClusterer`) that takes a list of nodes and edges and returns `Map<String, Integer>` (file → cluster id) and the quality value. The rest of the code doesn't know the library's types.

**Tests:**
- Two 4-node cliques connected by one weak edge → 2 clusters, each clique in one.
- Determinism: two runs with the same seed give identical results.

---

## Step 5: report

The `--out` output directory contains:
- `report.md`: a single file, one section per resolution,
- `pairs.tsv` (from step 3),
- `clusters-r<resolution>.tsv`: `file  cluster  module  package`, sorted by cluster, then by file.

**`report.md` structure:**

```markdown
# Co-change report: <repo name>

HEAD: <hash> · changesets: <from> – <to> · generated with parameters: minShared=3, minWeight=0.3, maxChangeset=50, seed=42

## Statistics
(table with statistics from steps 2–4, including rename detection warnings;
columns: metric | value | what it means)

## Top 20 cross-package pairs
(table: fileA, fileB, shared, weight — no clustering, raw signal)

## Resolution = 1.0
Clusters (≥2 files): N · largest: K files · nodes in single-file clusters: M
Build module agreement: X% of files are in a cluster whose dominant module is their own module
_X% close to 100 means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

### Cluster 7 — 6 files, 4 packages, 2 modules
Packages: org.jabref.gui.entryeditor (3), org.jabref.logic.importer (1), …
Files:
- `jabgui/src/main/java/org/jabref/gui/entryeditor/Foo.java`
- …
Strongest edges inside the cluster (top 5):
| fileA | fileB | shared | weight |
Evidence for the strongest edge (up to 10 commits):
- `a1b2c3d` 2021-03-14 — Fix citation key generation in entry editor
- …
```

**Cluster order within a section:** number of packages descending, then number of files descending, then id. Show the **top 15 clusters** with ≥2 files in full, and the rest in a condensed table (id, files, packages, modules).

**Requirements:**
- Every number in the report (statistics, per-resolution summary, module agreement) comes with a one-sentence plain-language explanation of what it means: a "what it means" column in tables, a short italic line under summary lines. Explanations are fixed text, so the report stays deterministic.
- Put paths in Markdown inside backticks. In a cluster's file list give full paths; in edge tables shorten to the class name only (e.g. `EntryEditor.java`), since the full paths are already listed above.
- Format floating-point numbers with 2 decimal places and `Locale.ROOT`.
- No generation timestamps in the file, because the report must be deterministic.

**Tests:** a report test on a small hand-built input (golden file in `src/test/resources`).

---

## Step 6: running on real repos

1. `git clone https://github.com/junit-team/junit-framework ../targets/junit-framework` and run with `--out results/junit`.
2. `git clone https://github.com/JabRef/jabref ../targets/jabref` and run with `--out results/jabref`.
3. **Determinism test:** run JabRef a second time into a different directory; `diff -r` must show nothing.
4. Record execution time and peak memory usage (`/usr/bin/time -v` or a log from `Main` is enough). If JabRef doesn't fit in the default heap, raise `-Xmx` in `applicationDefaultJvmArgs` and record it in `DECISIONS.md`. **Don't optimize the algorithm.**
5. Results (`results/`) are committed to the repo, because they are part of the portfolio.

### 🛑 Checkpoint 2

Show Karol:
- for JUnit: build module agreement for each resolution and the 3 clusters with the most modules,
- for JabRef: the first 5 clusters from the resolution=1.0 section (full entries with evidence),
- execution times and any rename detection warnings.

Each number shown gets a one-sentence explanation of what it means, but **no interpretation** of what the clusters say about the projects' architecture (see `CONTEXT.md`, "Division of roles").

---

## Step 7: project README

Keep it short, Karol will write the rest:
- one sentence on what the tool does,
- how to build and run (the command from step 0),
- the algorithm in 5 points (reading history → renames and filters → coupling → Leiden → report) with the weight formula and threshold values, each with a one-sentence explanation,
- a list of deliberate simplifications from `CONTEXT.md` and `DECISIONS.md`,
- an empty `## Findings` section with a `<!-- Karol -->` comment.

---

## Tracer bullet Definition of Done

- [ ] `./gradlew build` passes, and tests cover the parser, renames, filters, coupling, Leiden and the report.
- [ ] `results/junit/` and `results/jabref/` exist with `report.md`, `pairs.tsv` and `clusters-r*.tsv`.
- [ ] Two runs on the same repo produce identical files.
- [ ] Every cluster in the report has evidence (commits) for its strongest edge.
- [ ] Every number in the report has a one-sentence explanation.
- [ ] `DECISIONS.md` contains all decisions made outside `CONTEXT.md`.
- [ ] Nothing from the "Out of scope" list has been implemented.
