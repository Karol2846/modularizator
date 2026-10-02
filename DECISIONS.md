# Decisions made outside `CONTEXT.md`

One line each: decision + reason.

## Step 0: skeleton
- Java 25 instead of 21 (also updated in `CONTEXT.md`): Karol's explicit request.
- Gradle 9.8.0 (wrapper), Kotlin DSL: Java 25 requires Gradle ≥ 9.1; Kotlin DSL gives IDE completion.
- `foojay-resolver-convention` plugin in `settings.gradle.kts`: the toolchain downloads JDK 25 itself if it's missing locally; it's a build plugin, not a runtime dependency.
- No Spring or other framework (despite Karol's approval): `CONTEXT.md` rules out frameworks, and a single-pass CLI doesn't need one.
- JUnit 5 (5.14.x), not 6: that's what `CONTEXT.md` says.
- Base package `io.github.karol2846.modularizator`: the convention for projects hosted on GitHub.
- `run` without arguments prints usage and exits with code 0; invalid arguments: message, usage and exit code 2.

## Step 1: reading history
- Paths that git quotes despite `core.quotepath=false` (control characters, `"`, `\`) are not decoded: they practically never occur in `.java` files, and `ls-tree` and `log` quote them the same way, so the mapping stays consistent.
- The rename detection warning is recognized by a stderr line containing `rename detection was skipped` (covers both the "inexact" and "exhaustive" variants); git doesn't say which commit it applies to, so we only report the count and the text.
- Statuses outside `A/M/D/T/R###` (e.g. `C`, `U`, `X`) throw an exception containing the line, as the plan says.

## Step 2: renames, filters, changesets
- Known simplification from the plan: if a path was once used by another, later deleted file, its history is attributed to the current file at that path; accepted in v0.
- All changes in a commit are resolved with the map from before that commit, and its renames are applied only afterwards: a rename only affects older commits (e.g. `R a→b` + `A a` in one commit doesn't mix the files up).
- "Renames resolved" is the number of old paths mapped to a HEAD file that passes the filter (`.java` under `src/main/java/`): we count only what affects the analysis.
- The date range in the statistics is the oldest and newest **kept** changeset (by `%at`, i.e. author date); 0 when nothing was kept.

## Step 3: coupling
- `weight` in `pairs.tsv` is rounded to 2 decimal places (`Locale.ROOT`), but sorting and thresholds use the exact value.
- Evidence (a pair's changesets) is kept in log order, i.e. newest first.

## Step 4: graph and Leiden
- Graph edge weight is the exact coupling weight (`shared / min(revs)`), not the 2-decimal value from `pairs.tsv`.
- The network is built directly with `new Network(nNodes, true, edges, weights, false, true)`, the same constructor `FileIO.readEdgeList` uses: each edge is passed once (unsorted) and the library adds the reverse direction; no temporary edge-list file.
- The reported quality is `LeidenAlgorithm.calcQuality` with the rescaled resolution, i.e. modularity with resolution parameter γ; values for different resolutions are therefore not directly comparable.
- Cluster ids come from `orderClustersByNNodes()` (0 = largest); the order of clusters in the report is a separate rule from step 5.
- A graph with no edges skips the library and yields no clusters: the modularity resolution would divide by a total edge weight of 0.

## Step 5: report
- Every number moved from stdout into `report.md`; stdout now only shows where the report went and the elapsed time (kept out of the report for determinism).
- Clusters beyond the first 15 go into the condensed table with their strongest edge, its `shared`/`weight` and the newest 3 evidence commits: the Definition of Done requires evidence for every cluster in the report.
- Single-file clusters are not listed, only counted in the per-resolution summary; they are all in `clusters-r*.tsv`.
- Build module agreement is computed over files in clusters with ≥2 files: a single-file cluster always agrees with itself and would inflate the value.
- Dominant module of a cluster: the module with most files, ties go to the lexicographically first one (the other files count as not agreeing).
- Packages and modules of a cluster are listed with file counts, most files first, then by name; the modules line is an addition to the plan's structure, so module agreement can be checked by eye.
- The top cross-package pairs table uses full paths (there is no file list above it to shorten against); edge tables inside clusters use class names, as in the plan.
- The modularity value is shown in each resolution section with its own explanation.
- The resolution is printed with `Double.toString` (`1.0`), both in section headings and in `clusters-r1.0.tsv`.
- HEAD is shown as the full 40-character hash; evidence commits as 7-character short hashes with the UTC author date.
- Commit subjects are copied verbatim (no Markdown escaping).
- Edge tables name a file by its file name only when that name is unique in the cluster, otherwise by its full path: on JUnit, clusters of `module-info.java` files rendered as an unreadable `module-info.java` – `module-info.java`.

## Step 6: real repositories
- `results/junit` was regenerated at the current JUnit HEAD (`7fb2ce2b1`), replacing the Checkpoint 1 `pairs.tsv`; the report states the HEAD it was made from.
- The default JVM heap is enough (peak RSS about 300 MB on JabRef), so `applicationDefaultJvmArgs` stays unset.
- Execution time and memory were measured with `/usr/bin/time -v` around the installed start script (`./gradlew installDist`), so Gradle start-up is not included.
