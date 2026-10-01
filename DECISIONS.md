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
- Until there is a report (step 5), `Main` prints the statistics to stdout and only writes `pairs.tsv`; each printed number comes with a one-sentence explanation.
