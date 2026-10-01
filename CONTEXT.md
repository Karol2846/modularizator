# Code Archaeology: project context

> This file describes **why** the tool exists and **which decisions have already been made**. Implementation steps are in `PLAN.md`.
> Read it before starting work. If something in the plan seems to contradict this file, stop and ask.

## What the project is

A Java CLI tool that analyzes git history and finds files that **change together** (temporal coupling / co-change). From that data it builds a weighted graph, runs the Leiden algorithm (community detection) and generates a report with clusters of files, i.e. candidates for "natural modules".

The most important part of the report are clusters that **span many packages**. If files from 4 different packages keep changing together, it is a signal that the boundaries in the code do not match how the code actually evolves.

The tool **proposes hypotheses backed by evidence, it does not pass verdicts**. It does not say "extract this module". It says: "these files change together, they live in different packages, and here are the commits that show it". A human makes the call.

## Nature of the project

- A hobby portfolio project, developed by one person (Karol).
- We analyze **public open-source repositories**, so the results can be shown in the README.
- The current phase is a **tracer bullet**: a thin pass through the whole pipeline, with the simplest working solution in every layer. The goal is to check whether the output is interesting at all, not to build a polished tool.
- Tracer bullet code is **not thrown away**, because later iterations will build on it. It should be clean and testable, but without premature abstractions (no "just in case" interfaces, no frameworks).

## Tracer bullet success criterion

Success means that the report for the "interesting" repo contains **at least one cluster spanning several packages** that Karol, after reviewing the listed commits, considers real and worth describing in the README.

That is why the report must contain **evidence**: concrete file pairs, counts of shared commits, and the hashes and titles of those commits. Without it a cluster cannot be verified.

Failure means clusters that merely mirror packages or are pure noise. That is valuable information too, because then Karol decides whether the problem lies in the graph weighting or in the repo itself.

## Target repositories

| Role | Repo | What we expect |
|---|---|---|
| Control group | JUnit: `https://github.com/junit-team/junit-framework` (formerly `junit5`, GitHub redirects) | Good modularity (platform / jupiter / vintage). Clusters should largely match build modules. If they don't, we first suspect a bug in the tool. |
| Interesting repo | JabRef: `https://github.com/JabRef/jabref` | A mature application with a long history and a documented layered architecture (gui → logic → model). This is where we look for findings. |
| Backup | Mockito: `https://github.com/mockito/mockito` | In case JabRef turns out to be unreadable. |

Target repositories are cloned **with full history** (no `--depth`) and **outside** the project directory, e.g. into `../targets/`.

## Decisions already made (do not change them without asking)

| Area | Decision | Rationale |
|---|---|---|
| Language / build | Java 25, Gradle (Groovy or Kotlin DSL), single module | A stack Karol knows, and the Leiden library is in Java. (Changed from Java 21 at Karol's request.) |
| Runtime dependencies | **Only** `nl.cwts:networkanalysis:1.3.0` | Reference Leiden implementation by the algorithm's authors. No Spring, picocli or JGit. |
| Test dependencies | JUnit 5 + AssertJ | Simple and standard. |
| History source | A `git` process started via `ProcessBuilder`, output parsed as text | Simplest option. JGit maybe later. |
| Granularity | **Per file**, not per class | Per-class analysis requires parsing code. That comes later. |
| File scope | Only `.java` files under `src/main/java/` (checked on the HEAD path) | One rule filters out tests, configs, docs and build files at once. |
| Mega-commits | Changesets with > 50 files (after path filtering) are skipped when computing coupling | Mass renames and dependency bumps create false coupling. |
| Renames | Tracked via `git log -M --name-status`. History of the old path is attributed to the current (HEAD) path. Renames in mega-commits **also** update the path map. | A large repo has almost certainly moved files in bulk, and without this we lose most of the history. |
| Deleted files | We analyze only files that exist at HEAD | There is no point proposing modules made of files that no longer exist. |
| Merges | `--no-merges` | A merge commit duplicates changes from the branch. |
| Edge weight | `shared(A,B) / min(revs(A), revs(B))` | A deliberate choice. Pitfall: a file with few revisions easily gets weight 1.0, hence the `minShared` threshold. |
| Edge thresholds | `minShared = 3`, `minWeight = 0.3` (configurable) | Filters out accidental pairs. |
| Algorithm | Leiden with **modularity** as the quality function (not CPM) | Good enough to start. CPM later. |
| Determinism | Fixed seed + deterministic node indexing (sorted paths) and edge ordering | The same input must produce byte-for-byte the same output. This is a requirement, not an option. |
| Resolution | A parameter; by default we compute `0.5, 1.0, 2.0` | The main knob affecting the result. For now we inspect a few values by hand. |
| Output | Markdown + TSV files, nothing else | Human-readable, easy to paste into the README and to process further. |

## Parameters at a glance

| Parameter | Default | What it means |
|---|---|---|
| `maxChangeset` | 50 | Commits touching more than 50 production Java files are treated as bulk changes (renames, formatting, bumps) and ignored for coupling. |
| `minShared` | 3 | Two files must have changed together in at least 3 commits before we consider them related, so one-off coincidences don't count. |
| `minWeight` | 0.3 | At least 30% of the less frequently changed file's commits must also touch the other file, so a pair isn't linked just because one file changes all the time. |
| `resolutions` | 0.5, 1.0, 2.0 | Controls cluster size: lower values produce fewer, bigger clusters, higher values produce more, smaller ones. |
| `seed` | 42 | Fixes the algorithm's randomness so every run gives identical results. |

## Out of scope for the tracer bullet (DO NOT implement)

- Per-class analysis and parsing Java code
- CPM, Louvain, comparing algorithms
- Cluster stability across many seeds
- Graph visualization, HTML, UI
- A polished CLI (picocli, subcommands, colors, progress bars)
- Automatic suggestions like "extract module X"
- Analyzing many repositories at once and cross-repo coupling
- Caches, databases, parallelism, performance optimizations
- Languages other than Java
- Filtering by date / time window

If anything on this list seems necessary to make things work, stop and ask instead of adding it.

## Known interpretation pitfalls (context, not to implement)

- Tests change together with the code they test, which is why we filter them out.
- A cluster spanning packages may mean "this should be one module", but also "an abstraction is missing and these files should be decoupled". The tool does not decide this; a human does.
- Modularity has a "resolution limit" (it cannot see very small communities). In v0 we accept this knowingly.
- A shared "hub" file (e.g. a central configuration class) can glue unrelated clusters together. The report should show this, not hide it.

## Glossary

- **Changeset**: the set of files (HEAD paths) changed in a single commit, after filtering.
- **revs(A)**: the number of retained changesets in which file A appears.
- **shared(A,B)**: the number of retained changesets in which both files appear.
- **Node** is a file. **Edge** is a pair of files that meets the thresholds, weighted by coupling.
- **Cluster**: a group of nodes densely connected internally and sparsely connected to the rest (Leiden output).
- **Package**: the Java package derived from the path (directory after `src/main/java/`, `/` → `.`).
- **Build module**: the path prefix before `src/main/java/` (e.g. `junit-jupiter-engine`). For single-module repos it is empty and shown in the report as `(root)`.

## Division of roles

- **Agent:** implementation, tests, running on the repositories, generating reports.
- **Karol:** interpreting results, decisions about weights and thresholds, describing findings in the README.

The agent **does not write conclusions** about what the clusters mean for the analyzed projects. Reports are to be factual. Technical observations (e.g. "rename detection skipped commit X") are very welcome.
