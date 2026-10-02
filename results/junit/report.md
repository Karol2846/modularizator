# Co-change report: junit-framework

HEAD: `7fb2ce2b14a217b79ef3bb1140b1509cc6ec9950` · changesets: 2015-10-24 – 2026-09-30 · generated with parameters: minShared=3, minWeight=0.30, maxChangeset=50, seed=42

## Statistics

| metric | value | what it means |
|---|---|---|
| Commits read | 11013 | Non-merge commits reachable from HEAD. |
| Changesets kept | 3888 | Commits that touched production Java files and were used to compute coupling. |
| Skipped as empty | 7095 | Commits that touched no production Java file still present at HEAD. |
| Skipped as mega-commits | 30 | Commits touching more than 50 production Java files (moves, formatting, bumps), ignored because they would create false coupling. |
| Renames resolved | 807 | Old paths whose history was attributed to a file that exists at HEAD. |
| Rename detection warnings | 0 | Times git gave up on rename detection, so some moved files may have lost history. |
| Unique files | 914 | Production Java files that appear in at least one kept changeset. |
| Edges | 2265 | File pairs that changed together often enough to pass both thresholds (shared ≥ 3, weight ≥ 0.30). |
| Cross-package edges | 707 | Edges whose two files live in different Java packages. |
| Cross-module edges | 332 | Edges whose two files live in different build modules. |
| Graph nodes | 628 | Files with at least one edge; only these are clustered. |
| Files without edges | 286 | Files that changed, but never often enough together with any other file; left out of the graph. |

## Top 20 cross-package pairs

_Strongest edges between files in different packages, before clustering. shared = number of kept commits that changed both files; weight = shared divided by the number of commits of the less frequently changed file (1.00 = it never changed without the other)._

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExternalResourceSupport.java` | `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMember.java` | 8 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java` | `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java` | `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/AfterEachMethodAdapter.java` | 6 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/package-info.java` | `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/package-info.java` | 5 | 1.00 |
| `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java` | `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncherDiscoveryRequestBuilder.java` | 5 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassTemplate.java` | `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterClassTemplateInvocationCallback.java` | 4 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassTemplate.java` | `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeClassTemplateInvocationCallback.java` | 4 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Timeout.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java` | 4 | 1.00 |
| `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/package-info.java` | `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/package-info.java` | 4 | 1.00 |
| `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java` | `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/package-info.java` | 4 | 1.00 |
| `junit-platform-console/src/main/java/org/junit/platform/console/command/ConsoleTestExecutor.java` | `junit-platform-console/src/main/java/org/junit/platform/console/options/Details.java` | 4 | 1.00 |
| `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/OutputDirectoryProvider.java` | `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java` | 4 | 1.00 |
| `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TagFilter.java` | `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/ParseResults.java` | 4 | 1.00 |
| `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TagFilter.java` | `junit-platform-launcher/src/main/java/org/junit/platform/launcher/tagexpression/TagExpression.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerRequest.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunnerExecutor.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java` | 4 | 1.00 |

## Resolution = 0.5

Clusters (≥2 files): 34 · largest: 100 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.93

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 76.43% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 100 files, 18 packages, 5 modules

Packages: org.junit.jupiter.engine.descriptor (30), org.junit.jupiter.api.extension (14), org.junit.jupiter.engine.execution (13), org.junit.jupiter.api (10), org.junit.jupiter.engine.extension (8), org.junit.jupiter.api.parallel (3), org.junit.platform.engine.support.store (3), org.junit.jupiter.engine.discovery (2), org.junit.jupiter.engine.support (2), org.junit.platform.commons.util (2), org.junit.platform.engine (2), org.junit.platform.engine.reporting (2), org.junit.platform.engine.support.descriptor (2), org.junit.platform.engine.support.discovery (2), org.junit.platform.engine.support.hierarchical (2), org.junit.jupiter.engine (1), org.junit.jupiter.engine.discovery.predicates (1), platform.tooling.support (1)

Modules: junit-jupiter-engine (57), junit-jupiter-api (27), junit-platform-engine (13), junit-platform-commons (2), platform-tooling-support-tests (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassTemplate.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGeneration.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGenerator.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicContainer.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicNode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicTest.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/IndicativeSentencesGeneration.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestFactory.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestInfo.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestReporter.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterClassTemplateInvocationCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeClassTemplateInvocationCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ClassTemplateInvocationContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ClassTemplateInvocationContextProvider.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutableInvoker.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionConfigurationException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContextException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/MediaType.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolutionException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestTemplateInvocationContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestTemplateInvocationContextProvider.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestWatcher.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Execution.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceLock.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceLocks.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/JupiterTestEngine.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/AbstractExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DisplayNameUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicContainerTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicDescendantFilter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicNodeTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicTestTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExclusiveResourceCollector.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExtensionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/Filterable.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/NestedClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ResourceLockAware.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestFactoryTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestInstanceLifecycleUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/TestClassPredicates.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/AfterEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/BeforeEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluationException.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluator.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConstructorInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/NamespaceAwareStore.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/TestInstancesProvider.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/AutoCloseExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DefaultTestReporter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DisabledCondition.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistrar.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistry.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/MutableExtensionRegistry.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestReporterParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/MethodReflectionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/OpenTest4JAndJUnit4AwareThrowableCollector.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinFunctionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinReflectionUtils.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestEngine.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/FileEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/ReportEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/AbstractTestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/EngineDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/SelectorResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/EngineExecutionContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ThrowableCollector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/Namespace.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStore.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStoreException.java`
- `platform-tooling-support-tests/src/main/java/platform/tooling/support/OutputAttachingExtension.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DisplayNameGeneration.java` | `DisplayNameGenerator.java` | 6 | 1.00 |
| `TestMethodTestDescriptor.java` | `AfterEachMethodAdapter.java` | 6 | 1.00 |
| `TestMethodTestDescriptor.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `AfterEachMethodAdapter.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `ClassTemplate.java` | `AfterClassTemplateInvocationCallback.java` | 4 | 1.00 |

Evidence for the strongest edge (`DisplayNameGeneration.java` – `DisplayNameGenerator.java`, up to 10 commits, newest first):

- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `b7499dc` 2021-06-18 — Only search for annotations on enclosing class for inner classes
- `e69411d` 2020-08-01 — Promote DisplayNameGeneration and its dependencies
- `4db8e8e` 2018-09-23 — Introduce DisplayNameUtils helper
- `75de66e` 2018-09-22 — Document display name generation
- `7075ac1` 2018-09-16 — Introduce DisplayName generation SPI

### Cluster 1 — 70 files, 11 packages, 5 modules

Packages: org.junit.platform.launcher.core (23), org.junit.platform.launcher (11), org.junit.platform.engine (8), org.junit.platform.suite.api (8), org.junit.platform.suite.engine (8), org.junit.platform.launcher.listeners (4), org.junit.platform.engine.discovery (2), org.junit.platform.launcher.jfr (2), org.junit.platform.launcher.listeners.discovery (2), org.junit.platform.engine.reporting (1), org.junit.platform.testkit.engine (1)

Modules: junit-platform-launcher (42), junit-platform-engine (11), junit-platform-suite-api (8), junit-platform-suite-engine (8), junit-platform-testkit (1)

Files:

- `junit-platform-engine/src/main/java/org/junit/platform/engine/CompositeFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/DiscoveryFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineExecutionListener.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ExecutionRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestExecutionResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/IncludeClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/OutputDirectoryProvider.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/EngineFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/Launcher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherConstants.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherInterceptor.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSessionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/PostDiscoveryFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DelegatingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueCollector.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueNotifier.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineExecutionOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineIdValidator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ExecutionListenerAdapter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/HierarchicalOutputDirectoryCreator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InterceptingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InternalTestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryRequestBuilder.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryResult.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherFactory.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/OutcomeDelayingEngineExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/SessionPerRequestLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LoggingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/SummaryGeneratingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/TestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/CompositeLauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/LoggingLauncherDiscoveryListener.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/AdditionalDiscoverySelectors.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/DiscoverySelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/IsSuiteClass.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncher.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncherDiscoveryRequestBuilder.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestDescriptor.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestEngine.java`
- `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ClassSelectorResolver.java` | `DiscoverySelectorResolver.java` | 8 | 1.00 |
| `DelegatingLauncher.java` | `SessionPerRequestLauncher.java` | 6 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherConfig.java` | 5 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherFactory.java` | 5 | 1.00 |
| `ConfigurationParameter.java` | `SuiteLauncherDiscoveryRequestBuilder.java` | 5 | 1.00 |

Evidence for the strongest edge (`ClassSelectorResolver.java` – `DiscoverySelectorResolver.java`, up to 10 commits, newest first):

- `e47c253` 2025-09-09 — Deprecate `OutputDirectoryProvider` in favor of `OutputDirectoryCreator` (#4924)
- `f08c663` 2025-03-26 — Report discovery issue for cyclic suites
- `7f01c8d` 2025-03-26 — Report discovery issues for invalid `@Suite` classes
- `1aa837d` 2025-03-19 — Report discovery issues for invalid suite lifecycle methods
- `dbd4e2e` 2024-11-26 — Allow attaching files to test results (#4138)
- `8107424` 2021-05-16 — Discover suite tests using parent configuration parameters
- `2e796f0` 2021-08-10 — Fix Javadoc issues for the JUnit Platform Suite support
- `b2a9810` 2021-02-09 — Introduce junit-platform-suite-engine (#2416)

### Cluster 2 — 65 files, 8 packages, 3 modules

Packages: org.junit.jupiter.params.provider (30), org.junit.jupiter.params (10), org.junit.jupiter.params.converter (9), org.junit.jupiter.params.aggregator (7), org.junit.jupiter.params.support (4), org.junit.jupiter.api (2), org.junit.jupiter.engine.extension (2), org.junit.jupiter.api.condition (1)

Modules: junit-jupiter-params (60), junit-jupiter-api (3), junit-jupiter-engine (2)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/RepeatedTest.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/RepetitionInfo.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/MethodBasedCondition.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/RepeatedTestInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ArgumentCountValidator.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/DefaultParameterInfo.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/EvaluatedArgumentSet.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedInvocationNameFormatter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTest.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ResolverFacade.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/AggregateWith.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/ArgumentAccessException.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/ArgumentsAccessor.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/ArgumentsAggregationException.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/ArgumentsAggregator.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/DefaultArgumentsAccessor.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/aggregator/SimpleArgumentsAggregator.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/AnnotationBasedArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConversionException.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ConvertWith.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeConversionPattern.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/SimpleArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/AnnotationBasedArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/Arguments.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvReaderFactory.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptyArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullAndEmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullEnum.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumerInitializer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/ParameterInfo.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ArgumentAccessException.java` | `ArgumentsAggregationException.java` | 5 | 1.00 |
| `CsvFileSources.java` | `CsvSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `EnumSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `FieldSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `MethodSources.java` | 5 | 1.00 |

Evidence for the strongest edge (`ArgumentAccessException.java` – `ArgumentsAggregationException.java`, up to 10 commits, newest first):

- `ad922b1` 2026-06-08 — Document inheritance support (#5708)
- `800c4be` 2025-05-19 — Use `@Serial` annotation
- `52fadf6` 2020-08-01 — Promote junit-jupiter-params
- `3ec7799` 2018-04-07 — Polish argument aggregation support
- `e2295ab` 2018-03-10 — Support conversion of multiple arguments into a single object for parameterized tests

### Cluster 8 — 23 files, 8 packages, 2 modules

Packages: org.junit.vintage.engine.discovery (6), org.junit.vintage.engine.descriptor (5), org.junit.vintage.engine.execution (4), org.junit.jupiter.engine.discovery (2), org.junit.vintage.engine (2), org.junit.vintage.engine.support (2), org.junit.jupiter.engine.execution (1), org.junit.jupiter.engine.extension (1)

Modules: junit-vintage-engine (19), junit-jupiter-engine (4)

Files:

- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DiscoverySelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/Constants.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/VintageTestEngine.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/OrFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerRequest.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/VintageTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/ClassSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/MethodSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/RunnerTestDescriptorPostProcessor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/VintageDiscoverer.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunnerExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/TestRun.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/VintageExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdReader.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdStringifier.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `RunnerRequest.java` | `RunnerExecutor.java` | 4 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `OrFilter.java` | `VintageDiscoverer.java` | 5 | 0.83 |

Evidence for the strongest edge (`RunnerRequest.java` – `RunnerExecutor.java`, up to 10 commits, newest first):

- `f7741ec` 2016-06-18 — Rename base package of junit4-engine to org.junit.vintage.engine
- `7b80cb0` 2016-05-25 — Add missing @since tags
- `4cb0a31` 2016-01-14 — #40: Re-use JUnit 4's FilterRequest
- `7f05737` 2016-01-07 — #40: Extract RunnerRequest

### Cluster 12 — 18 files, 7 packages, 5 modules

Packages: org.junit.jupiter.engine.extension (7), org.junit.jupiter.engine.config (5), org.junit.jupiter.api (2), org.junit.jupiter.engine (1), org.junit.platform.commons.util (1), org.junit.platform.engine.support.hierarchical (1), org.junit.platform.launcher.core (1)

Modules: junit-jupiter-engine (13), junit-jupiter-api (2), junit-platform-commons (1), junit-platform-engine (1), junit-platform-launcher (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Timeout.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/Constants.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/CachingJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/DefaultJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/EnumConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/InstantiatingConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/JupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SameThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SeparateThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutDuration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExceptionFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutInvocationFactory.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassNamePatternFilterUtils.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelHierarchicalTestExecutorServiceFactory.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherPhase.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Timeout.java` | `TimeoutConfiguration.java` | 4 | 1.00 |
| `TimeoutConfiguration.java` | `TimeoutExtension.java` | 4 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java` | `DefaultJupiterConfiguration.java` | 3 | 1.00 |
| `DefaultJupiterConfiguration.java` | `ParallelHierarchicalTestExecutorServiceFactory.java` | 3 | 1.00 |
| `SameThreadTimeoutInvocation.java` | `TimeoutExceptionFactory.java` | 3 | 1.00 |

Evidence for the strongest edge (`Timeout.java` – `TimeoutConfiguration.java`, up to 10 commits, newest first):

- `95656d2` 2025-07-21 — Fail for invalid enum constants supplied as configuration parameters (#4781)
- `e713072` 2022-06-26 — Add thread mode to @Timeout (#2949)
- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `c8ea3db` 2019-05-28 — Introduce declarative timeouts

### Cluster 3 — 42 files, 6 packages, 3 modules

Packages: org.junit.platform.engine.discovery (16), org.junit.platform.commons.util (14), org.junit.platform.commons.support (9), org.junit.platform.engine (1), org.junit.platform.engine.support.discovery (1), org.junit.platform.launcher.core (1)

Modules: junit-platform-commons (23), junit-platform-engine (18), junit-platform-launcher (1)

Files:

- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ClassSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/DefaultResource.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/HierarchyTraversalMode.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ModifierSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/Resource.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ResourceSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/SearchOption.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathFileVisitor.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScannerLoader.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CloseablePath.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CollectionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/DefaultClasspathScanner.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ExceptionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/FunctionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ModuleUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/PackageUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/StringUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ToStringBuilder.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/DiscoverySelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClasspathResourceSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClasspathRootSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DirectorySelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectorIdentifierParsers.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FilePosition.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FileSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/IterationSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/MethodSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ModuleSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/NestedClassSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/NestedMethodSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/PackageSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/UniqueIdSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/UriSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/ResourceContainerSelectorResolver.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StackTracePruningEngineExecutionListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ReflectionSupport.java` | `ResourceSupport.java` | 3 | 1.00 |
| `ReflectionSupport.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |
| `ResourceSupport.java` | `DiscoverySelectors.java` | 3 | 1.00 |
| `ReflectionUtils.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |
| `DiscoverySelectors.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |

Evidence for the strongest edge (`ReflectionSupport.java` – `ResourceSupport.java`, up to 10 commits, newest first):

- `40c3b0a` 2025-10-09 — Add `Module` instance support in `ModuleSelector`
- `34a4032` 2025-09-23 — Adjust since information of code backported to 5.14
- `9798f6f` 2025-09-13 — Relocate `Resource` to `org.junit.platform.commons.io` package (#4891)

### Cluster 4 — 36 files, 6 packages, 3 modules

Packages: org.junit.jupiter.api.extension (20), org.junit.jupiter.api (9), org.junit.jupiter.api.io (3), org.junit.jupiter.engine.execution (2), org.junit.jupiter.engine.extension (1), org.junit.platform.engine (1)

Modules: junit-jupiter-api (32), junit-jupiter-engine (3), junit-platform-engine (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AfterAll.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AfterEach.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/BeforeAll.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/BeforeEach.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayName.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Nested.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Tag.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Tags.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Test.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutionCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtendWith.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extensions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/InvocationInterceptor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/LifecycleMethodExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolver.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/RegisterExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactory.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactoryContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePostProcessor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePreConstructCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstantiationAwareExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/CleanupMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDir.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDirFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionContextSupplier.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InvocationInterceptorChain.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestTag.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AfterAllCallback.java` | `BeforeAllCallback.java` | 21 | 1.00 |
| `AfterAllCallback.java` | `AfterEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `BeforeAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `AfterTestExecutionCallback.java` | 12 | 1.00 |

Evidence for the strongest edge (`AfterAllCallback.java` – `BeforeAllCallback.java`, up to 10 commits, newest first):

- `59df198` 2025-03-07 — Rename `ContainerTemplate` to `ClassTemplate`
- `517b9c0` 2025-03-04 — Introduce per-invocation lifecycle callbacks for container templates (#4353)
- `c9ae6e2` 2020-01-24 — Improve documentation for lifecycle callback extension APIs
- `4544de3` 2019-02-07 — Document wrapping for lifecycle callback extensions
- `83cd64f` 2018-05-22 — Document constructor requirements for extensions
- `5a3d4fe` 2017-11-21 — Improve JavaDoc for class-level extension APIs
- `83b3eb6` 2017-06-30 — Remove TestExtensionContext and ContainerExtensionContext
- `5e01f63` 2016-06-10 — Document nullability of arguments & return types in extensions
- `f68eba6` 2016-05-24 — Rename AfterTestMethodCallback to AfterTestExecutionCallback
- `6b9f227` 2016-05-24 — Rename BeforeTestMethodCallback to BeforeTestExecutionCallback

### Cluster 11 — 20 files, 6 packages, 15 modules

Packages: (default) (15), org.junit.platform.commons.function (1), org.junit.platform.commons.support (1), org.junit.platform.commons.support.conversion (1), org.junit.platform.commons.support.scanning (1), org.junit.platform.engine.support.store (1)

Modules: junit-platform-commons (5), junit-platform-engine (2), junit-jupiter (1), junit-jupiter-api (1), junit-jupiter-engine (1), junit-jupiter-migrationsupport (1), junit-jupiter-params (1), junit-platform-console (1), junit-platform-launcher (1), junit-platform-reporting (1), junit-platform-suite (1), junit-platform-suite-api (1), junit-platform-suite-engine (1), junit-platform-testkit (1), junit-vintage-engine (1)

Files:

- `junit-jupiter-api/src/main/java/module-info.java`
- `junit-jupiter-engine/src/main/java/module-info.java`
- `junit-jupiter-migrationsupport/src/main/java/module-info.java`
- `junit-jupiter-params/src/main/java/module-info.java`
- `junit-jupiter/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/function/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/conversion/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/scanning/package-info.java`
- `junit-platform-console/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/package-info.java`
- `junit-platform-launcher/src/main/java/module-info.java`
- `junit-platform-reporting/src/main/java/module-info.java`
- `junit-platform-suite-api/src/main/java/module-info.java`
- `junit-platform-suite-engine/src/main/java/module-info.java`
- `junit-platform-suite/src/main/java/module-info.java`
- `junit-platform-testkit/src/main/java/module-info.java`
- `junit-vintage-engine/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-jupiter-engine/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-params/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-platform-commons/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |
| `junit-platform-suite-api/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |

Evidence for the strongest edge (`junit-jupiter-engine/src/main/java/module-info.java` – `junit-jupiter/src/main/java/module-info.java`, up to 10 commits, newest first):

- `364380f` 2025-05-12 — Compile module descriptors using regular `compileJava` task (#4523)
- `495ed6c` 2025-01-27 — Configure Spotless for module descriptors and update copyright
- `c8e431b` 2020-01-19 — Make since Javadoc tag consistent
- `12f1c38` 2020-01-19 — Remove ineffective moduleGraph Javadoc tag
- `1d88346` 2019-12-20 — Revise module declarations of "org.junit.jupiter" group
- `0241727` 2019-04-15 — Introduce explicit Java modules

### Cluster 13 — 16 files, 6 packages, 4 modules

Packages: org.junit.jupiter.params (6), org.junit.jupiter.engine.discovery.predicates (4), org.junit.platform.engine.support.discovery (3), org.junit.jupiter.engine.descriptor (1), org.junit.platform.engine (1), org.junit.platform.suite.engine (1)

Modules: junit-jupiter-params (6), junit-jupiter-engine (5), junit-platform-engine (4), junit-platform-suite-engine (1)

Files:

- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/LifecycleMethodUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestFactoryMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestTemplateMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestableMethod.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/AfterParameterizedClassInvocationMethodInvoker.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/BeforeParameterizedClassInvocationMethodInvoker.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClass.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryListener.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/ClassContainerSelectorResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/DiscoveryIssueReporter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/LifecycleMethodUtils.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AfterParameterizedClassInvocationMethodInvoker.java` | `BeforeParameterizedClassInvocationMethodInvoker.java` | 3 | 1.00 |
| `AfterParameterizedClassInvocationMethodInvoker.java` | `ParameterizedClass.java` | 3 | 1.00 |
| `AfterParameterizedClassInvocationMethodInvoker.java` | `ParameterizedClassContext.java` | 3 | 1.00 |
| `AfterParameterizedClassInvocationMethodInvoker.java` | `ParameterizedClassInvocationContext.java` | 3 | 1.00 |
| `BeforeParameterizedClassInvocationMethodInvoker.java` | `ParameterizedClass.java` | 3 | 1.00 |

Evidence for the strongest edge (`AfterParameterizedClassInvocationMethodInvoker.java` – `BeforeParameterizedClassInvocationMethodInvoker.java`, up to 10 commits, newest first):

- `8c1933e` 2025-03-07 — Rename to `Before`/`AfterParameterizedClassInvocation`
- `59df198` 2025-03-07 — Rename `ContainerTemplate` to `ClassTemplate`
- `1e1f8d5` 2025-03-05 — Introduce `Before`/`AfterArgumentSet` lifecycle methods (#4366)

### Cluster 9 — 21 files, 5 packages, 1 module

Packages: org.junit.jupiter.migrationsupport.rules (6), org.junit.jupiter.migrationsupport.rules.adapter (6), org.junit.jupiter.migrationsupport.rules.member (5), org.junit.jupiter.migrationsupport (2), org.junit.jupiter.migrationsupport.conditions (2)

Modules: junit-jupiter-migrationsupport (21)

Files:

- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/EnableJUnit4MigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/IgnoreCondition.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/EnableRuleMigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExpectedExceptionSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExternalResourceSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/VerifierSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExpectedExceptionAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExternalResourceAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/GenericBeforeAndAfterAdvice.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/VerifierAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/AbstractTestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedField.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMethod.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AbstractTestRuleAdapter.java` | `ExternalResourceAdapter.java` | 9 | 1.00 |
| `ExternalResourceSupport.java` | `TestRuleAnnotatedMember.java` | 8 | 1.00 |
| `TestRuleSupport.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `GenericBeforeAndAfterAdvice.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |

Evidence for the strongest edge (`AbstractTestRuleAdapter.java` – `ExternalResourceAdapter.java`, up to 10 commits, newest first):

- `a19e6ee` 2017-06-07 — Rename Jupiter Migration Support to `junit-jupiter-migrationsupport`
- `298cdac` 2016-12-04 — Polish JUnit 4 migration support
- `4c19b69` 2016-11-18 — Add protection against mismatching target and adaptee classes
- `20598ff` 2016-11-03 — Add @API-annotations to all classes
- `9fa741b` 2016-11-03 — Move rule support to dedicated module
- `19fc678` 2016-09-06 — Improve package structure
- `aeb2045` 2016-09-05 — Cleanup and simplify implementation
- `fad84db` 2016-09-01 — Generalize to other subtypes of TestRule
- `184230f` 2016-08-31 — Refactor ExternalResourceSupport

### Cluster 5 — 31 files, 4 packages, 1 module

Packages: org.junit.platform.console.command (13), org.junit.platform.console.output (10), org.junit.platform.console.options (7), org.junit.platform.console (1)

Modules: junit-platform-console (31)

Files:

- `junit-platform-console/src/main/java/org/junit/platform/console/ConsoleLauncher.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/BaseCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandFacade.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandResult.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ConsoleTestExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomClassLoaderCloseStrategy.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomContextClassLoaderExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoverTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoveryRequestCreator.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ExecuteTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ListTestEnginesCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/MainCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ManifestVersionProvider.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/OutputStreamConfig.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/AnsiColorOptionMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/Details.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/SelectorConverter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/ColorPalette.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/DetailsPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/FlatPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Style.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TestFeedPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Theme.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreeNode.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrinter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/VerboseTreePrintingListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DiscoverTestsCommand.java` | `ExecuteTestsCommand.java` | 10 | 1.00 |
| `CommandResult.java` | `ExecuteTestsCommand.java` | 8 | 1.00 |
| `ConsoleTestExecutor.java` | `Details.java` | 4 | 1.00 |
| `MainCommand.java` | `ManifestVersionProvider.java` | 4 | 1.00 |
| `TestConsoleOutputOptions.java` | `TestConsoleOutputOptionsMixin.java` | 4 | 1.00 |

Evidence for the strongest edge (`DiscoverTestsCommand.java` – `ExecuteTestsCommand.java`, up to 10 commits, newest first):

- `3ef97bf` 2025-09-08 — Restructure `ConsoleLauncher` to avoid package cycles (#4926)
- `6b8e94a` 2025-03-10 — Polishing
- `abf5ac3` 2024-06-10 — Use module version of Console Launcher when on module path (#3847)
- `0173a37` 2023-03-13 — Separate discovery from output options
- `1a31235` 2023-03-01 — Hide implementation details
- `ce58e76` 2023-03-01 — Test new CLI parsing logic
- `feb691e` 2023-03-01 — Fix tests
- `f916512` 2023-02-26 — Fix some tests
- `cd62eec` 2023-02-25 — Introduce Picocli subcommands
- `99d2b55` 2023-02-24 — Introduce commands

### Cluster 6 — 26 files, 4 packages, 2 modules

Packages: org.junit.jupiter.api (22), org.junit.platform.commons.util (2), org.junit.jupiter.api.function (1), org.junit.jupiter.api.timeout (1)

Modules: junit-jupiter-api (24), junit-platform-commons (2)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertAll.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertDoesNotThrow.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertFalse.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertInstanceOf.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertIterableEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertLinesMatch.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotNull.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotSame.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNull.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertSame.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertThrows.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertThrowsExactly.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTrue.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionFailureBuilder.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionUtils.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assumptions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/timeout/PreemptiveTimeoutUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassLoaderUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/Preconditions.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AssertFalse.java` | `AssertTrue.java` | 12 | 1.00 |
| `AssertArrayEquals.java` | `AssertIterableEquals.java` | 10 | 1.00 |
| `AssertArrayEquals.java` | `AssertNotSame.java` | 8 | 1.00 |
| `AssertArrayEquals.java` | `AssertSame.java` | 8 | 1.00 |
| `AssertFalse.java` | `AssertNotNull.java` | 8 | 1.00 |

Evidence for the strongest edge (`AssertFalse.java` – `AssertTrue.java`, up to 10 commits, newest first):

- `1d3217a` 2025-12-10 — Trim internal frames from AssertionFailedError (#5159)
- `9794f19` 2025-07-09 — Add `@Contract` annotations and simplify code
- `aaa6552` 2025-05-22 — Annotate nullability in `org.junit.jupiter.api`
- `e91e5dc` 2022-07-17 — Introduce AssertionFailureBuilder (#2972)
- `4f4dd31` 2019-02-17 — Supply expected and actual values for failed boolean assertions
- `41aee1d` 2018-05-20 — Remove support for generating code coverage reports using Clover
- `ca72650` 2018-01-27 — Polish implementation of Assertions
- `c83d6c1` 2018-01-27 — Polish implementation of Assertions
- `1ac8c65` 2018-01-24 — Avoid lambdas in assertions & preconditions
- `212dddb` 2017-10-05 — Generate default failure messages for assertTrue() & assertFalse()

### Cluster 10 — 21 files, 4 packages, 2 modules

Packages: org.junit.platform.engine.support.hierarchical (17), org.junit.jupiter.api.parallel (2), org.junit.platform.engine (1), org.junit.platform.engine.support.config (1)

Modules: junit-platform-engine (19), junit-jupiter-api (2)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceAccessMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Resources.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/config/PrefixedConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/CompositeLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfigurationStrategy.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ExclusiveResource.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestEngine.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/LockManager.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTask.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTaskContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NopLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ResourceLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SameThreadHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SingleLock.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CompositeLock.java` | `NopLock.java` | 4 | 1.00 |
| `DefaultParallelExecutionConfiguration.java` | `DefaultParallelExecutionConfigurationStrategy.java` | 4 | 1.00 |
| `ForkJoinPoolHierarchicalTestExecutorService.java` | `NopLock.java` | 4 | 1.00 |
| `NopLock.java` | `ResourceLock.java` | 4 | 1.00 |
| `NopLock.java` | `SingleLock.java` | 4 | 1.00 |

Evidence for the strongest edge (`CompositeLock.java` – `NopLock.java`, up to 10 commits, newest first):

- `24bfbca` 2025-11-06 — Implement parallel test execution without using `ForkJoinPool` (#5060)
- `ebbf134` 2024-09-21 — Allow for work stealing when only holding read locks (#4012)
- `38e149f` 2018-06-28 — Polish HierarchicalTestEngine and collaborators
- `2f3440e` 2018-06-22 — Introduce support for parallel test execution

### Cluster 22 — 4 files, 4 packages, 1 module

Packages: org.junit.vintage.engine (1), org.junit.vintage.engine.descriptor (1), org.junit.vintage.engine.discovery (1), org.junit.vintage.engine.execution (1)

Modules: junit-vintage-engine (4)

Files:

- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java` | 4 | 1.00 |

Evidence for the strongest edge (`junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` – `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java`, up to 10 commits, newest first):

- `8f7bee9` 2025-05-22 — Move `@NullMarked` annotations to packages
- `a55b62d` 2016-06-20 — Rename JUnit 4 TestEngine to Vintage
- `f7741ec` 2016-06-18 — Rename base package of junit4-engine to org.junit.vintage.engine
- `c76a901` 2016-01-09 — Introduce package-info across the code base

### Cluster 7 — 25 files, 2 packages, 1 module

Packages: org.junit.jupiter.api.condition (24), org.junit.jupiter.api (1)

Modules: junit-jupiter-api (25)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Disabled.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRange.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledForJreRangeCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIf.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariable.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfEnvironmentVariableCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemProperty.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledIfSystemPropertyCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledInNativeImage.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJre.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnJreCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOs.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/DisabledOnOsCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRange.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledForJreRangeCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIf.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariable.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfEnvironmentVariableCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemProperty.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledIfSystemPropertyCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledInNativeImage.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJre.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnJreCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOs.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/EnabledOnOsCondition.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DisabledIf.java` | `EnabledIf.java` | 22 | 1.00 |
| `DisabledOnJre.java` | `EnabledOnJre.java` | 19 | 1.00 |
| `DisabledOnOs.java` | `EnabledOnOs.java` | 19 | 1.00 |
| `DisabledIfEnvironmentVariable.java` | `EnabledIfEnvironmentVariable.java` | 17 | 1.00 |
| `DisabledIfSystemProperty.java` | `EnabledIfSystemProperty.java` | 17 | 1.00 |

Evidence for the strongest edge (`DisabledIf.java` – `EnabledIf.java`, up to 10 commits, newest first):

- `2ecea3b` 2024-01-25 — Document semantics for a disabled test regarding class-level callbacks
- `766561f` 2023-10-15 — Use consistent wording in Javadoc for @[Enabled|Disabled] annotations
- `3fca251` 2023-09-15 — Document that @⁠Disabled & conditional annotations are not inherited
- `a76e1a5` 2023-02-18 — Suppress export warnings
- `34176c7` 2022-09-16 — Introduce @EnabledInNativeImage & @DisabledInNativeImage conditions for GraalVM
- `49ca772` 2022-07-15 — Polish Javadoc for @EnabledIf and @DisabledIf
- `19c5be5` 2021-08-30 — Update Javadoc for custom disabled reasons in condition annotations
- `c4e0a26` 2020-05-05 — Support custom reason in @Disabled* / @Enabled* variants (#2276)
- `6191c45` 2020-04-14 — Introduce `@EnabledIf`/`@DisabledIf` annotations (#2214)
- `3a42f0f` 2019-07-01 — Delete EnabledIf and DisabledIf from Jupiter API

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 14 | 15 | 2 | 1 | `TagFilter.java` – `ParseResults.java` | 4 | 1.00 | `41aee1d`, `996f023`, `f9c6e76` |
| 15 | 14 | 2 | 1 | `DirectorySource.java` – `FileSource.java` | 11 | 1.00 | `623652a`, `800c4be`, `a84575b` |
| 16 | 14 | 2 | 2 | `AbstractAnnotatedDescriptorWrapper.java` – `ClassOrderingVisitor.java` | 4 | 1.00 | `a5edcbf`, `044b3aa`, `49565e9` |
| 20 | 7 | 2 | 2 | `JUnitFactory.java` – `Type.java` | 5 | 1.00 | `61c6a9d`, `7ac2105`, `cfb3e30` |
| 27 | 2 | 2 | 1 | `junit-platform-commons/src/main/java/org/junit/platform/commons/package-info.java` – `junit-platform-commons/src/main/java/org/junit/platform/commons/util/package-info.java` | 3 | 0.60 | `8f7bee9`, `874ef28`, `8254216` |
| 28 | 2 | 2 | 2 | `ConfigurationParameter.java` – `ConfigurationMetadataAnnotationProcessor.java` | 3 | 1.00 | `e07cfa6`, `7b630f6`, `f8b3293` |
| 29 | 2 | 2 | 2 | `junit-platform-console/src/main/java/org/junit/platform/console/options/package-info.java` – `junit-platform-engine/src/main/java/org/junit/platform/engine/package-info.java` | 3 | 0.75 | `8f7bee9`, `26f7193`, `c76a901` |
| 17 | 12 | 1 | 1 | `Event.java` – `TerminationInfo.java` | 8 | 1.00 | `639325f`, `58bb81b`, `0fa9c2a` |
| 18 | 12 | 1 | 1 | `ExcludeTags.java` – `IncludeTags.java` | 21 | 1.00 | `41a42af`, `3f28207`, `030bfbd` |
| 19 | 10 | 1 | 1 | `ConversionSupport.java` – `StringToJavaTimeConverter.java` | 4 | 1.00 | `64de9f0`, `92f271d`, `14114f5` |
| 21 | 4 | 1 | 1 | `ReadsDefaultLocale.java` – `ReadsDefaultTimeZone.java` | 3 | 1.00 | `d03c7c9`, `41a42af`, `bea12a8` |
| 23 | 2 | 1 | 1 | `ThrowingConsumer.java` – `ThrowingSupplier.java` | 3 | 0.75 | `6c59231`, `17ea546`, `b0dda8c` |
| 24 | 2 | 1 | 1 | `ReadsSystemProperty.java` – `WritesSystemProperty.java` | 3 | 1.00 | `d03c7c9`, `c291139`, `b60d9f0` |
| 25 | 2 | 1 | 1 | `AfterParameterizedClassInvocation.java` – `BeforeParameterizedClassInvocation.java` | 5 | 1.00 | `fee9c4c`, `c83f28c`, `2aefea2` |
| 26 | 2 | 1 | 1 | `JUnitException.java` – `PreconditionViolationException.java` | 3 | 0.75 | `ca28a85`, `800c4be`, `dd66770` |
| 30 | 2 | 1 | 1 | `NodeExecutionAdvisor.java` – `NodeTreeWalker.java` | 3 | 1.00 | `871e800`, `60f3125`, `6aac242` |
| 31 | 2 | 1 | 1 | `XmlReportData.java` – `XmlReportWriter.java` | 3 | 0.75 | `734b4c5`, `3583c87`, `bc624c4` |
| 32 | 2 | 1 | 1 | `JUnit.java` – `package-info.java` | 3 | 1.00 | `c275c1c`, `efe0527`, `c33b283` |
| 33 | 2 | 1 | 1 | `Helper.java` – `MavenRepo.java` | 3 | 0.75 | `7cec9b1`, `4ca5bfd`, `f105349` |

## Resolution = 1.0

Clusters (≥2 files): 38 · largest: 84 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.90

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 76.59% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 84 files, 18 packages, 5 modules

Packages: org.junit.jupiter.engine.descriptor (28), org.junit.jupiter.engine.execution (13), org.junit.jupiter.api.extension (9), org.junit.jupiter.api (6), org.junit.jupiter.engine.extension (5), org.junit.jupiter.api.parallel (3), org.junit.jupiter.engine.discovery (2), org.junit.jupiter.engine.support (2), org.junit.platform.commons.util (2), org.junit.platform.engine (2), org.junit.platform.engine.reporting (2), org.junit.platform.engine.support.descriptor (2), org.junit.platform.engine.support.discovery (2), org.junit.platform.engine.support.hierarchical (2), org.junit.jupiter.engine (1), org.junit.jupiter.engine.discovery.predicates (1), org.junit.platform.engine.support.store (1), platform.tooling.support (1)

Modules: junit-jupiter-engine (52), junit-jupiter-api (18), junit-platform-engine (11), junit-platform-commons (2), platform-tooling-support-tests (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicContainer.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicNode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DynamicTest.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestFactory.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestInfo.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestReporter.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutableInvoker.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionConfigurationException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContextException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/MediaType.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolutionException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestTemplateInvocationContextProvider.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestWatcher.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Execution.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceLock.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceLocks.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/JupiterTestEngine.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/AbstractExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicContainerTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicDescendantFilter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicNodeTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicTestTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExclusiveResourceCollector.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/Filterable.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/NestedClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ResourceLockAware.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestFactoryTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestInstanceLifecycleUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/TestClassPredicates.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/AfterEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/BeforeEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluationException.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluator.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConstructorInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/NamespaceAwareStore.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/TestInstancesProvider.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DefaultTestReporter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DisabledCondition.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistry.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestReporterParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/MethodReflectionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/OpenTest4JAndJUnit4AwareThrowableCollector.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinFunctionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinReflectionUtils.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestEngine.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/FileEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/ReportEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/AbstractTestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/EngineDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/SelectorResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/EngineExecutionContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ThrowableCollector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/Namespace.java`
- `platform-tooling-support-tests/src/main/java/platform/tooling/support/OutputAttachingExtension.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `TestMethodTestDescriptor.java` | `AfterEachMethodAdapter.java` | 6 | 1.00 |
| `TestMethodTestDescriptor.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `AfterEachMethodAdapter.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `ConstructorInvocation.java` | `MethodInvocation.java` | 4 | 1.00 |
| `ExecutableInvoker.java` | `ExtensionContext.java` | 3 | 1.00 |

Evidence for the strongest edge (`TestMethodTestDescriptor.java` – `AfterEachMethodAdapter.java`, up to 10 commits, newest first):

- `a97e4d3` 2017-07-04 — Revert "Introduce getRequiredTestInstance() in AbstractExtensionContext"
- `0836f8f` 2017-07-04 — Introduce getRequiredTestInstance() in AbstractExtensionContext
- `83b3eb6` 2017-06-30 — Remove TestExtensionContext and ContainerExtensionContext
- `fedf713` 2016-10-08 — Invoke @[Before|After]Each methods w/ extensions registered for @Test
- `cc717e8` 2016-05-29 — Rename methods in [Before|After]EachMethodAdapter
- `b2ba6b9` 2016-05-01 — Do not mix execution of extensions and user code

### Cluster 2 — 42 files, 8 packages, 5 modules

Packages: org.junit.platform.launcher.core (11), org.junit.platform.suite.api (8), org.junit.platform.suite.engine (8), org.junit.platform.engine (7), org.junit.platform.launcher (4), org.junit.platform.engine.discovery (2), org.junit.platform.engine.reporting (1), org.junit.platform.testkit.engine (1)

Modules: junit-platform-launcher (15), junit-platform-engine (10), junit-platform-suite-api (8), junit-platform-suite-engine (8), junit-platform-testkit (1)

Files:

- `junit-platform-engine/src/main/java/org/junit/platform/engine/CompositeFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/DiscoveryFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ExecutionRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestExecutionResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/IncludeClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/OutputDirectoryProvider.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/EngineFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/PostDiscoveryFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueCollector.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueNotifier.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineExecutionOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineIdValidator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/HierarchicalOutputDirectoryCreator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InternalTestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryRequestBuilder.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryResult.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StackTracePruningEngineExecutionListener.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/AdditionalDiscoverySelectors.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/DiscoverySelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/IsSuiteClass.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncher.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncherDiscoveryRequestBuilder.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestDescriptor.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestEngine.java`
- `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ClassSelectorResolver.java` | `DiscoverySelectorResolver.java` | 8 | 1.00 |
| `ConfigurationParameter.java` | `SuiteLauncherDiscoveryRequestBuilder.java` | 5 | 1.00 |
| `OutputDirectoryProvider.java` | `EngineTestKit.java` | 4 | 1.00 |
| `ConfigurationParameter.java` | `SelectClasspathResource.java` | 3 | 1.00 |
| `ConfigurationParameter.java` | `SelectDirectories.java` | 3 | 1.00 |

Evidence for the strongest edge (`ClassSelectorResolver.java` – `DiscoverySelectorResolver.java`, up to 10 commits, newest first):

- `e47c253` 2025-09-09 — Deprecate `OutputDirectoryProvider` in favor of `OutputDirectoryCreator` (#4924)
- `f08c663` 2025-03-26 — Report discovery issue for cyclic suites
- `7f01c8d` 2025-03-26 — Report discovery issues for invalid `@Suite` classes
- `1aa837d` 2025-03-19 — Report discovery issues for invalid suite lifecycle methods
- `dbd4e2e` 2024-11-26 — Allow attaching files to test results (#4138)
- `8107424` 2021-05-16 — Discover suite tests using parent configuration parameters
- `2e796f0` 2021-08-10 — Fix Javadoc issues for the JUnit Platform Suite support
- `b2a9810` 2021-02-09 — Introduce junit-platform-suite-engine (#2416)

### Cluster 10 — 23 files, 8 packages, 2 modules

Packages: org.junit.vintage.engine.discovery (6), org.junit.vintage.engine.descriptor (5), org.junit.vintage.engine.execution (4), org.junit.jupiter.engine.discovery (2), org.junit.vintage.engine (2), org.junit.vintage.engine.support (2), org.junit.jupiter.engine.execution (1), org.junit.jupiter.engine.extension (1)

Modules: junit-vintage-engine (19), junit-jupiter-engine (4)

Files:

- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DiscoverySelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/Constants.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/VintageTestEngine.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/OrFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerRequest.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/VintageTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/ClassSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/MethodSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/RunnerTestDescriptorPostProcessor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/VintageDiscoverer.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunnerExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/TestRun.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/VintageExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdReader.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdStringifier.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `RunnerRequest.java` | `RunnerExecutor.java` | 4 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `OrFilter.java` | `VintageDiscoverer.java` | 5 | 0.83 |

Evidence for the strongest edge (`RunnerRequest.java` – `RunnerExecutor.java`, up to 10 commits, newest first):

- `f7741ec` 2016-06-18 — Rename base package of junit4-engine to org.junit.vintage.engine
- `7b80cb0` 2016-05-25 — Add missing @since tags
- `4cb0a31` 2016-01-14 — #40: Re-use JUnit 4's FilterRequest
- `7f05737` 2016-01-07 — #40: Extract RunnerRequest

### Cluster 12 — 22 files, 8 packages, 5 modules

Packages: org.junit.jupiter.params (6), org.junit.jupiter.api.extension (5), org.junit.jupiter.engine.discovery.predicates (4), org.junit.platform.engine.support.discovery (3), org.junit.jupiter.api (1), org.junit.jupiter.engine.descriptor (1), org.junit.platform.engine (1), org.junit.platform.suite.engine (1)

Modules: junit-jupiter-api (6), junit-jupiter-params (6), junit-jupiter-engine (5), junit-platform-engine (4), junit-platform-suite-engine (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassTemplate.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterClassTemplateInvocationCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeClassTemplateInvocationCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ClassTemplateInvocationContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ClassTemplateInvocationContextProvider.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestTemplateInvocationContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/LifecycleMethodUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestFactoryMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestTemplateMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestableMethod.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/AfterParameterizedClassInvocationMethodInvoker.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/BeforeParameterizedClassInvocationMethodInvoker.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClass.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryListener.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/ClassContainerSelectorResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/DiscoveryIssueReporter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/LifecycleMethodUtils.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ClassTemplate.java` | `AfterClassTemplateInvocationCallback.java` | 4 | 1.00 |
| `ClassTemplate.java` | `BeforeClassTemplateInvocationCallback.java` | 4 | 1.00 |
| `AfterClassTemplateInvocationCallback.java` | `BeforeClassTemplateInvocationCallback.java` | 4 | 1.00 |
| `AfterParameterizedClassInvocationMethodInvoker.java` | `BeforeParameterizedClassInvocationMethodInvoker.java` | 3 | 1.00 |
| `AfterParameterizedClassInvocationMethodInvoker.java` | `ParameterizedClass.java` | 3 | 1.00 |

Evidence for the strongest edge (`ClassTemplate.java` – `AfterClassTemplateInvocationCallback.java`, up to 10 commits, newest first):

- `6c69384` 2025-11-20 — Improve Javadoc for @ClassTemplate, ParameterDeclarations, etc.
- `c83f28c` 2025-06-27 — Update "since" for experimental APIs promoted in 5.13.3
- `59df198` 2025-03-07 — Rename `ContainerTemplate` to `ClassTemplate`
- `517b9c0` 2025-03-04 — Introduce per-invocation lifecycle callbacks for container templates (#4353)

### Cluster 14 — 20 files, 8 packages, 5 modules

Packages: org.junit.jupiter.engine.extension (7), org.junit.jupiter.engine.config (5), org.junit.jupiter.api (2), org.junit.platform.engine.support.store (2), org.junit.jupiter.engine (1), org.junit.platform.commons.util (1), org.junit.platform.engine.support.hierarchical (1), org.junit.platform.launcher.core (1)

Modules: junit-jupiter-engine (13), junit-platform-engine (3), junit-jupiter-api (2), junit-platform-commons (1), junit-platform-launcher (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Timeout.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/Constants.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/CachingJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/DefaultJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/EnumConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/InstantiatingConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/JupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SameThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SeparateThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutDuration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExceptionFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutInvocationFactory.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassNamePatternFilterUtils.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelHierarchicalTestExecutorServiceFactory.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStore.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStoreException.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherPhase.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Timeout.java` | `TimeoutConfiguration.java` | 4 | 1.00 |
| `TimeoutConfiguration.java` | `TimeoutExtension.java` | 4 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java` | `DefaultJupiterConfiguration.java` | 3 | 1.00 |
| `DefaultJupiterConfiguration.java` | `ParallelHierarchicalTestExecutorServiceFactory.java` | 3 | 1.00 |
| `SameThreadTimeoutInvocation.java` | `TimeoutExceptionFactory.java` | 3 | 1.00 |

Evidence for the strongest edge (`Timeout.java` – `TimeoutConfiguration.java`, up to 10 commits, newest first):

- `95656d2` 2025-07-21 — Fail for invalid enum constants supplied as configuration parameters (#4781)
- `e713072` 2022-06-26 — Add thread mode to @Timeout (#2949)
- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `c8ea3db` 2019-05-28 — Introduce declarative timeouts

### Cluster 5 — 28 files, 6 packages, 2 modules

Packages: org.junit.platform.launcher.core (12), org.junit.platform.launcher (7), org.junit.platform.launcher.listeners (4), org.junit.platform.launcher.jfr (2), org.junit.platform.launcher.listeners.discovery (2), org.junit.platform.engine (1)

Modules: junit-platform-launcher (27), junit-platform-engine (1)

Files:

- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/Launcher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherConstants.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherInterceptor.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSessionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DelegatingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ExecutionListenerAdapter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InterceptingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherFactory.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/OutcomeDelayingEngineExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/SessionPerRequestLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LoggingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/SummaryGeneratingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/TestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/CompositeLauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/LoggingLauncherDiscoveryListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DelegatingLauncher.java` | `SessionPerRequestLauncher.java` | 6 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherConfig.java` | 5 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherFactory.java` | 5 | 1.00 |
| `LauncherSessionListener.java` | `LauncherFactory.java` | 3 | 1.00 |
| `DefaultLauncherSession.java` | `SessionPerRequestLauncher.java` | 7 | 0.88 |

Evidence for the strongest edge (`DelegatingLauncher.java` – `SessionPerRequestLauncher.java`, up to 10 commits, newest first):

- `a9deb4a` 2026-01-26 — Add missing precondition checks to Launcher implementations (#5281)
- `6157f3a` 2025-08-29 — Remove obsolete suppressions
- `f6f1a70` 2025-07-07 — Introduce `LauncherExecutionRequest` (#4724)
- `7a056cd` 2022-11-16 — Load interceptors before session listeners
- `a13b99a` 2022-11-15 — Create interceptors before launcher
- `fa47602` 2022-11-11 — Introduce LauncherInterceptor

### Cluster 15 — 20 files, 6 packages, 15 modules

Packages: (default) (15), org.junit.platform.commons.function (1), org.junit.platform.commons.support (1), org.junit.platform.commons.support.conversion (1), org.junit.platform.commons.support.scanning (1), org.junit.platform.engine.support.store (1)

Modules: junit-platform-commons (5), junit-platform-engine (2), junit-jupiter (1), junit-jupiter-api (1), junit-jupiter-engine (1), junit-jupiter-migrationsupport (1), junit-jupiter-params (1), junit-platform-console (1), junit-platform-launcher (1), junit-platform-reporting (1), junit-platform-suite (1), junit-platform-suite-api (1), junit-platform-suite-engine (1), junit-platform-testkit (1), junit-vintage-engine (1)

Files:

- `junit-jupiter-api/src/main/java/module-info.java`
- `junit-jupiter-engine/src/main/java/module-info.java`
- `junit-jupiter-migrationsupport/src/main/java/module-info.java`
- `junit-jupiter-params/src/main/java/module-info.java`
- `junit-jupiter/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/function/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/conversion/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/scanning/package-info.java`
- `junit-platform-console/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/package-info.java`
- `junit-platform-launcher/src/main/java/module-info.java`
- `junit-platform-reporting/src/main/java/module-info.java`
- `junit-platform-suite-api/src/main/java/module-info.java`
- `junit-platform-suite-engine/src/main/java/module-info.java`
- `junit-platform-suite/src/main/java/module-info.java`
- `junit-platform-testkit/src/main/java/module-info.java`
- `junit-vintage-engine/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-jupiter-engine/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-params/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-platform-commons/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |
| `junit-platform-suite-api/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |

Evidence for the strongest edge (`junit-jupiter-engine/src/main/java/module-info.java` – `junit-jupiter/src/main/java/module-info.java`, up to 10 commits, newest first):

- `364380f` 2025-05-12 — Compile module descriptors using regular `compileJava` task (#4523)
- `495ed6c` 2025-01-27 — Configure Spotless for module descriptors and update copyright
- `c8e431b` 2020-01-19 — Make since Javadoc tag consistent
- `12f1c38` 2020-01-19 — Remove ineffective moduleGraph Javadoc tag
- `1d88346` 2019-12-20 — Revise module declarations of "org.junit.jupiter" group
- `0241727` 2019-04-15 — Introduce explicit Java modules

### Cluster 1 — 46 files, 5 packages, 2 modules

Packages: org.junit.jupiter.params.provider (29), org.junit.jupiter.params.converter (9), org.junit.jupiter.params (4), org.junit.jupiter.params.support (3), org.junit.jupiter.api.condition (1)

Modules: junit-jupiter-params (45), junit-jupiter-api (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/MethodBasedCondition.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTest.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/AnnotationBasedArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConversionException.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ConvertWith.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeConversionPattern.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/SimpleArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/AnnotationBasedArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/Arguments.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvReaderFactory.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptyArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullAndEmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullEnum.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumerInitializer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CsvFileSources.java` | `CsvSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `EnumSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `FieldSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `MethodSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `ValueSources.java` | 5 | 1.00 |

Evidence for the strongest edge (`CsvFileSources.java` – `CsvSources.java`, up to 10 commits, newest first):

- `22af4a2` 2025-11-24 — Improve wording and formatting in Javadoc
- `014192b` 2025-03-07 — Inherit `ParameterizedClass` and `..Source` annotations to subclasses (#4369)
- `34509e5` 2025-03-02 — Apply consistent code formatting
- `4ff42a7` 2024-10-09 — Allow repeating `@…Source` annotations when used as meta annotations
- `2886963` 2024-05-14 — Make parameterized ArgumentSource annotations repeatable

### Cluster 3 — 41 files, 5 packages, 2 modules

Packages: org.junit.platform.engine.discovery (16), org.junit.platform.commons.util (14), org.junit.platform.commons.support (9), org.junit.platform.engine (1), org.junit.platform.engine.support.discovery (1)

Modules: junit-platform-commons (23), junit-platform-engine (18)

Files:

- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/AnnotationSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ClassSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/DefaultResource.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/HierarchyTraversalMode.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ModifierSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ReflectionSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/Resource.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/ResourceSupport.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/SearchOption.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/AnnotationUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathFileVisitor.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScannerLoader.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CloseablePath.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/CollectionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/DefaultClasspathScanner.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ExceptionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/FunctionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ModuleUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/PackageUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ReflectionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/StringUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ToStringBuilder.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/DiscoverySelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClasspathResourceSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClasspathRootSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DirectorySelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectorIdentifierParsers.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FilePosition.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/FileSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/IterationSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/MethodSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ModuleSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/NestedClassSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/NestedMethodSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/PackageSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/UniqueIdSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/UriSelector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/ResourceContainerSelectorResolver.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ReflectionSupport.java` | `ResourceSupport.java` | 3 | 1.00 |
| `ReflectionSupport.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |
| `ResourceSupport.java` | `DiscoverySelectors.java` | 3 | 1.00 |
| `ReflectionUtils.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |
| `DiscoverySelectors.java` | `ResourceContainerSelectorResolver.java` | 3 | 1.00 |

Evidence for the strongest edge (`ReflectionSupport.java` – `ResourceSupport.java`, up to 10 commits, newest first):

- `40c3b0a` 2025-10-09 — Add `Module` instance support in `ModuleSelector`
- `34a4032` 2025-09-23 — Adjust since information of code backported to 5.14
- `9798f6f` 2025-09-13 — Relocate `Resource` to `org.junit.platform.commons.io` package (#4891)

### Cluster 9 — 23 files, 5 packages, 3 modules

Packages: org.junit.jupiter.api (10), org.junit.jupiter.engine.discovery (7), org.junit.jupiter.engine.extension (3), org.junit.jupiter.engine.descriptor (2), org.junit.jupiter.params.provider (1)

Modules: junit-jupiter-engine (12), junit-jupiter-api (10), junit-jupiter-params (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/ClassOrderer.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGeneration.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGenerator.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/IndicativeSentencesGeneration.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodDescriptor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrderer.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/MethodOrdererContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Order.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestClassOrder.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestMethodOrder.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DisplayNameUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExtensionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractAnnotatedDescriptorWrapper.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/AbstractOrderingVisitor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassOrderingVisitor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DefaultClassDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DefaultMethodDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DefaultMethodOrdererContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodOrderingVisitor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/AutoCloseExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistrar.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/MutableExtensionRegistry.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldArgumentsProvider.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DisplayNameGeneration.java` | `DisplayNameGenerator.java` | 6 | 1.00 |
| `DisplayNameGenerator.java` | `IndicativeSentencesGeneration.java` | 4 | 1.00 |
| `AbstractAnnotatedDescriptorWrapper.java` | `ClassOrderingVisitor.java` | 4 | 1.00 |
| `MethodOrderer.java` | `MethodOrdererContext.java` | 3 | 1.00 |
| `AbstractAnnotatedDescriptorWrapper.java` | `DefaultClassDescriptor.java` | 3 | 1.00 |

Evidence for the strongest edge (`DisplayNameGeneration.java` – `DisplayNameGenerator.java`, up to 10 commits, newest first):

- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `b7499dc` 2021-06-18 — Only search for annotations on enclosing class for inner classes
- `e69411d` 2020-08-01 — Promote DisplayNameGeneration and its dependencies
- `4db8e8e` 2018-09-23 — Introduce DisplayNameUtils helper
- `75de66e` 2018-09-22 — Document display name generation
- `7075ac1` 2018-09-16 — Introduce DisplayName generation SPI

### Cluster 11 — 22 files, 5 packages, 3 modules

Packages: org.junit.platform.engine.support.hierarchical (17), org.junit.jupiter.api.parallel (2), org.junit.platform.engine (1), org.junit.platform.engine.support.config (1), org.junit.platform.launcher.core (1)

Modules: junit-platform-engine (19), junit-jupiter-api (2), junit-platform-launcher (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceAccessMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Resources.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/config/PrefixedConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/CompositeLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfigurationStrategy.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ExclusiveResource.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestEngine.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/LockManager.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTask.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTaskContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NopLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ResourceLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SameThreadHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SingleLock.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CompositeLock.java` | `NopLock.java` | 4 | 1.00 |
| `DefaultParallelExecutionConfiguration.java` | `DefaultParallelExecutionConfigurationStrategy.java` | 4 | 1.00 |
| `ForkJoinPoolHierarchicalTestExecutorService.java` | `NopLock.java` | 4 | 1.00 |
| `NopLock.java` | `ResourceLock.java` | 4 | 1.00 |
| `NopLock.java` | `SingleLock.java` | 4 | 1.00 |

Evidence for the strongest edge (`CompositeLock.java` – `NopLock.java`, up to 10 commits, newest first):

- `24bfbca` 2025-11-06 — Implement parallel test execution without using `ForkJoinPool` (#5060)
- `ebbf134` 2024-09-21 — Allow for work stealing when only holding read locks (#4012)
- `38e149f` 2018-06-28 — Polish HierarchicalTestEngine and collaborators
- `2f3440e` 2018-06-22 — Introduce support for parallel test execution

### Cluster 13 — 21 files, 5 packages, 1 module

Packages: org.junit.jupiter.migrationsupport.rules (6), org.junit.jupiter.migrationsupport.rules.adapter (6), org.junit.jupiter.migrationsupport.rules.member (5), org.junit.jupiter.migrationsupport (2), org.junit.jupiter.migrationsupport.conditions (2)

Modules: junit-jupiter-migrationsupport (21)

Files:

- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/EnableJUnit4MigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/IgnoreCondition.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/EnableRuleMigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExpectedExceptionSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExternalResourceSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/VerifierSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExpectedExceptionAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExternalResourceAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/GenericBeforeAndAfterAdvice.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/VerifierAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/AbstractTestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedField.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMethod.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AbstractTestRuleAdapter.java` | `ExternalResourceAdapter.java` | 9 | 1.00 |
| `ExternalResourceSupport.java` | `TestRuleAnnotatedMember.java` | 8 | 1.00 |
| `TestRuleSupport.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `GenericBeforeAndAfterAdvice.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |

Evidence for the strongest edge (`AbstractTestRuleAdapter.java` – `ExternalResourceAdapter.java`, up to 10 commits, newest first):

- `a19e6ee` 2017-06-07 — Rename Jupiter Migration Support to `junit-jupiter-migrationsupport`
- `298cdac` 2016-12-04 — Polish JUnit 4 migration support
- `4c19b69` 2016-11-18 — Add protection against mismatching target and adaptee classes
- `20598ff` 2016-11-03 — Add @API-annotations to all classes
- `9fa741b` 2016-11-03 — Move rule support to dedicated module
- `19fc678` 2016-09-06 — Improve package structure
- `aeb2045` 2016-09-05 — Cleanup and simplify implementation
- `fad84db` 2016-09-01 — Generalize to other subtypes of TestRule
- `184230f` 2016-08-31 — Refactor ExternalResourceSupport

### Cluster 4 — 31 files, 4 packages, 1 module

Packages: org.junit.platform.console.command (13), org.junit.platform.console.output (10), org.junit.platform.console.options (7), org.junit.platform.console (1)

Modules: junit-platform-console (31)

Files:

- `junit-platform-console/src/main/java/org/junit/platform/console/ConsoleLauncher.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/BaseCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandFacade.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandResult.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ConsoleTestExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomClassLoaderCloseStrategy.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomContextClassLoaderExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoverTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoveryRequestCreator.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ExecuteTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ListTestEnginesCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/MainCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ManifestVersionProvider.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/OutputStreamConfig.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/AnsiColorOptionMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/Details.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/SelectorConverter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/ColorPalette.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/DetailsPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/FlatPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Style.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TestFeedPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Theme.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreeNode.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrinter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/VerboseTreePrintingListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DiscoverTestsCommand.java` | `ExecuteTestsCommand.java` | 10 | 1.00 |
| `CommandResult.java` | `ExecuteTestsCommand.java` | 8 | 1.00 |
| `ConsoleTestExecutor.java` | `Details.java` | 4 | 1.00 |
| `MainCommand.java` | `ManifestVersionProvider.java` | 4 | 1.00 |
| `TestConsoleOutputOptions.java` | `TestConsoleOutputOptionsMixin.java` | 4 | 1.00 |

Evidence for the strongest edge (`DiscoverTestsCommand.java` – `ExecuteTestsCommand.java`, up to 10 commits, newest first):

- `3ef97bf` 2025-09-08 — Restructure `ConsoleLauncher` to avoid package cycles (#4926)
- `6b8e94a` 2025-03-10 — Polishing
- `abf5ac3` 2024-06-10 — Use module version of Console Launcher when on module path (#3847)
- `0173a37` 2023-03-13 — Separate discovery from output options
- `1a31235` 2023-03-01 — Hide implementation details
- `ce58e76` 2023-03-01 — Test new CLI parsing logic
- `feb691e` 2023-03-01 — Fix tests
- `f916512` 2023-02-26 — Fix some tests
- `cd62eec` 2023-02-25 — Introduce Picocli subcommands
- `99d2b55` 2023-02-24 — Introduce commands

### Cluster 6 — 26 files, 4 packages, 2 modules

Packages: org.junit.jupiter.api (22), org.junit.platform.commons.util (2), org.junit.jupiter.api.function (1), org.junit.jupiter.api.timeout (1)

Modules: junit-jupiter-api (24), junit-platform-commons (2)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertAll.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertArrayEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertDoesNotThrow.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertFalse.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertInstanceOf.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertIterableEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertLinesMatch.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotEquals.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotNull.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNotSame.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertNull.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertSame.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertThrows.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertThrowsExactly.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeout.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTimeoutPreemptively.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertTrue.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionFailureBuilder.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/AssertionUtils.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assumptions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/function/Executable.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/timeout/PreemptiveTimeoutUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassLoaderUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/Preconditions.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AssertFalse.java` | `AssertTrue.java` | 12 | 1.00 |
| `AssertArrayEquals.java` | `AssertIterableEquals.java` | 10 | 1.00 |
| `AssertArrayEquals.java` | `AssertNotSame.java` | 8 | 1.00 |
| `AssertArrayEquals.java` | `AssertSame.java` | 8 | 1.00 |
| `AssertFalse.java` | `AssertNotNull.java` | 8 | 1.00 |

Evidence for the strongest edge (`AssertFalse.java` – `AssertTrue.java`, up to 10 commits, newest first):

- `1d3217a` 2025-12-10 — Trim internal frames from AssertionFailedError (#5159)
- `9794f19` 2025-07-09 — Add `@Contract` annotations and simplify code
- `aaa6552` 2025-05-22 — Annotate nullability in `org.junit.jupiter.api`
- `e91e5dc` 2022-07-17 — Introduce AssertionFailureBuilder (#2972)
- `4f4dd31` 2019-02-17 — Supply expected and actual values for failed boolean assertions
- `41aee1d` 2018-05-20 — Remove support for generating code coverage reports using Clover
- `ca72650` 2018-01-27 — Polish implementation of Assertions
- `c83d6c1` 2018-01-27 — Polish implementation of Assertions
- `1ac8c65` 2018-01-24 — Avoid lambdas in assertions & preconditions
- `212dddb` 2017-10-05 — Generate default failure messages for assertTrue() & assertFalse()

### Cluster 7 — 26 files, 4 packages, 2 modules

Packages: org.junit.jupiter.api.extension (20), org.junit.jupiter.api.io (3), org.junit.jupiter.engine.execution (2), org.junit.jupiter.engine.extension (1)

Modules: junit-jupiter-api (23), junit-jupiter-engine (3)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutionCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtendWith.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extensions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/InvocationInterceptor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/LifecycleMethodExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolver.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/RegisterExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactory.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactoryContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePostProcessor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePreConstructCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstantiationAwareExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/CleanupMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDir.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDirFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionContextSupplier.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InvocationInterceptorChain.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AfterAllCallback.java` | `BeforeAllCallback.java` | 21 | 1.00 |
| `AfterAllCallback.java` | `AfterEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `BeforeAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `AfterTestExecutionCallback.java` | 12 | 1.00 |

Evidence for the strongest edge (`AfterAllCallback.java` – `BeforeAllCallback.java`, up to 10 commits, newest first):

- `59df198` 2025-03-07 — Rename `ContainerTemplate` to `ClassTemplate`
- `517b9c0` 2025-03-04 — Introduce per-invocation lifecycle callbacks for container templates (#4353)
- `c9ae6e2` 2020-01-24 — Improve documentation for lifecycle callback extension APIs
- `4544de3` 2019-02-07 — Document wrapping for lifecycle callback extensions
- `83cd64f` 2018-05-22 — Document constructor requirements for extensions
- `5a3d4fe` 2017-11-21 — Improve JavaDoc for class-level extension APIs
- `83b3eb6` 2017-06-30 — Remove TestExtensionContext and ContainerExtensionContext
- `5e01f63` 2016-06-10 — Document nullability of arguments & return types in extensions
- `f68eba6` 2016-05-24 — Rename AfterTestMethodCallback to AfterTestExecutionCallback
- `6b9f227` 2016-05-24 — Rename BeforeTestMethodCallback to BeforeTestExecutionCallback

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 26 | 4 | 4 | 1 | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` – `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | 4 | 1.00 | `8f7bee9`, `a55b62d`, `f7741ec` |
| 17 | 14 | 3 | 1 | `ArgumentAccessException.java` – `ArgumentsAggregationException.java` | 5 | 1.00 | `ad922b1`, `800c4be`, `52fadf6` |
| 8 | 25 | 2 | 1 | `DisabledIf.java` – `EnabledIf.java` | 22 | 1.00 | `2ecea3b`, `766561f`, `3fca251` |
| 16 | 15 | 2 | 1 | `TagFilter.java` – `ParseResults.java` | 4 | 1.00 | `41aee1d`, `996f023`, `f9c6e76` |
| 18 | 14 | 2 | 1 | `DirectorySource.java` – `FileSource.java` | 11 | 1.00 | `623652a`, `800c4be`, `a84575b` |
| 21 | 10 | 2 | 2 | `AfterEach.java` – `BeforeEach.java` | 19 | 0.95 | `656b9ed`, `cb9df8a`, `594f7e4` |
| 23 | 7 | 2 | 2 | `JUnitFactory.java` – `Type.java` | 5 | 1.00 | `61c6a9d`, `7ac2105`, `cfb3e30` |
| 25 | 4 | 2 | 2 | `RepeatedTest.java` – `RepetitionInfo.java` | 3 | 0.75 | `5b54e0d`, `c86b509`, `2199096` |
| 31 | 2 | 2 | 1 | `junit-platform-commons/src/main/java/org/junit/platform/commons/package-info.java` – `junit-platform-commons/src/main/java/org/junit/platform/commons/util/package-info.java` | 3 | 0.60 | `8f7bee9`, `874ef28`, `8254216` |
| 32 | 2 | 2 | 2 | `ConfigurationParameter.java` – `ConfigurationMetadataAnnotationProcessor.java` | 3 | 1.00 | `e07cfa6`, `7b630f6`, `f8b3293` |
| 33 | 2 | 2 | 2 | `junit-platform-console/src/main/java/org/junit/platform/console/options/package-info.java` – `junit-platform-engine/src/main/java/org/junit/platform/engine/package-info.java` | 3 | 0.75 | `8f7bee9`, `26f7193`, `c76a901` |
| 19 | 12 | 1 | 1 | `Event.java` – `TerminationInfo.java` | 8 | 1.00 | `639325f`, `58bb81b`, `0fa9c2a` |
| 20 | 12 | 1 | 1 | `ExcludeTags.java` – `IncludeTags.java` | 21 | 1.00 | `41a42af`, `3f28207`, `030bfbd` |
| 22 | 10 | 1 | 1 | `ConversionSupport.java` – `StringToJavaTimeConverter.java` | 4 | 1.00 | `64de9f0`, `92f271d`, `14114f5` |
| 24 | 4 | 1 | 1 | `ReadsDefaultLocale.java` – `ReadsDefaultTimeZone.java` | 3 | 1.00 | `d03c7c9`, `41a42af`, `bea12a8` |
| 27 | 2 | 1 | 1 | `ThrowingConsumer.java` – `ThrowingSupplier.java` | 3 | 0.75 | `6c59231`, `17ea546`, `b0dda8c` |
| 28 | 2 | 1 | 1 | `ReadsSystemProperty.java` – `WritesSystemProperty.java` | 3 | 1.00 | `d03c7c9`, `c291139`, `b60d9f0` |
| 29 | 2 | 1 | 1 | `AfterParameterizedClassInvocation.java` – `BeforeParameterizedClassInvocation.java` | 5 | 1.00 | `fee9c4c`, `c83f28c`, `2aefea2` |
| 30 | 2 | 1 | 1 | `JUnitException.java` – `PreconditionViolationException.java` | 3 | 0.75 | `ca28a85`, `800c4be`, `dd66770` |
| 34 | 2 | 1 | 1 | `NodeExecutionAdvisor.java` – `NodeTreeWalker.java` | 3 | 1.00 | `871e800`, `60f3125`, `6aac242` |
| 35 | 2 | 1 | 1 | `XmlReportData.java` – `XmlReportWriter.java` | 3 | 0.75 | `734b4c5`, `3583c87`, `bc624c4` |
| 36 | 2 | 1 | 1 | `JUnit.java` – `package-info.java` | 3 | 1.00 | `c275c1c`, `efe0527`, `c33b283` |
| 37 | 2 | 1 | 1 | `Helper.java` – `MavenRepo.java` | 3 | 0.75 | `7cec9b1`, `4ca5bfd`, `f105349` |

## Resolution = 2.0

Clusters (≥2 files): 44 · largest: 55 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.84

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 81.85% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 55 files, 13 packages, 4 modules

Packages: org.junit.jupiter.engine.descriptor (27), org.junit.jupiter.engine.execution (7), org.junit.jupiter.api.extension (5), org.junit.jupiter.engine.extension (3), org.junit.jupiter.api (2), org.junit.platform.engine.reporting (2), org.junit.platform.engine.support.descriptor (2), org.junit.platform.engine.support.hierarchical (2), org.junit.jupiter.engine (1), org.junit.jupiter.engine.support (1), org.junit.platform.engine (1), org.junit.platform.engine.support.store (1), platform.tooling.support (1)

Modules: junit-jupiter-engine (39), junit-platform-engine (8), junit-jupiter-api (7), platform-tooling-support-tests (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestInfo.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/TestReporter.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutableInvoker.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/MediaType.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestTemplateInvocationContextProvider.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestWatcher.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/JupiterTestEngine.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/AbstractExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DefaultTestInstanceFactoryContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicContainerTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicDescendantFilter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicNodeTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DynamicTestTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExclusiveResourceCollector.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/Filterable.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterEngineExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/JupiterTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodBasedTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/MethodExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/NestedClassTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ResourceLockAware.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestFactoryTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestInstanceLifecycleUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateExtensionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateInvocationTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/AfterEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/BeforeEachMethodAdapter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluationException.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConditionEvaluator.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/JupiterEngineExecutionContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/NamespaceAwareStore.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/TestInstancesProvider.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DefaultTestReporter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/DisabledCondition.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistry.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/OpenTest4JAndJUnit4AwareThrowableCollector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/FileEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/ReportEntry.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/AbstractTestDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/descriptor/EngineDescriptor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/EngineExecutionContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ThrowableCollector.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/Namespace.java`
- `platform-tooling-support-tests/src/main/java/platform/tooling/support/OutputAttachingExtension.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `TestMethodTestDescriptor.java` | `AfterEachMethodAdapter.java` | 6 | 1.00 |
| `TestMethodTestDescriptor.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `AfterEachMethodAdapter.java` | `BeforeEachMethodAdapter.java` | 6 | 1.00 |
| `ExecutableInvoker.java` | `ExtensionContext.java` | 3 | 1.00 |
| `ExtensionContext.java` | `Namespace.java` | 3 | 1.00 |

Evidence for the strongest edge (`TestMethodTestDescriptor.java` – `AfterEachMethodAdapter.java`, up to 10 commits, newest first):

- `a97e4d3` 2017-07-04 — Revert "Introduce getRequiredTestInstance() in AbstractExtensionContext"
- `0836f8f` 2017-07-04 — Introduce getRequiredTestInstance() in AbstractExtensionContext
- `83b3eb6` 2017-06-30 — Remove TestExtensionContext and ContainerExtensionContext
- `fedf713` 2016-10-08 — Invoke @[Before|After]Each methods w/ extensions registered for @Test
- `cc717e8` 2016-05-29 — Rename methods in [Before|After]EachMethodAdapter
- `b2ba6b9` 2016-05-01 — Do not mix execution of extensions and user code

### Cluster 10 — 21 files, 9 packages, 4 modules

Packages: org.junit.jupiter.engine.discovery.predicates (5), org.junit.platform.engine.support.discovery (5), org.junit.jupiter.engine.discovery (4), org.junit.jupiter.engine.descriptor (2), org.junit.jupiter.engine.execution (1), org.junit.jupiter.engine.extension (1), org.junit.platform.engine (1), org.junit.platform.launcher.core (1), org.junit.platform.suite.engine (1)

Modules: junit-jupiter-engine (13), junit-platform-engine (6), junit-platform-launcher (1), junit-platform-suite-engine (1)

Files:

- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ClassTemplateTestDescriptor.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/LifecycleMethodUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/ClassSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/DiscoverySelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/MethodSelectorResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestFactoryMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestTemplateMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/IsTestableMethod.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/predicates/TestClassPredicates.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryListener.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/ClassContainerSelectorResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/DiscoveryIssueReporter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolution.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/EngineDiscoveryRequestResolver.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/discovery/SelectorResolver.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/StackTracePruningEngineExecutionListener.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/LifecycleMethodUtils.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java` | `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/package-info.java` | 3 | 1.00 |
| `IsTestFactoryMethod.java` | `IsTestTemplateMethod.java` | 5 | 0.83 |
| `IsTestMethod.java` | `IsTestTemplateMethod.java` | 5 | 0.83 |

Evidence for the strongest edge (`junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/discovery/package-info.java` – `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/package-info.java`, up to 10 commits, newest first):

- `ab45546` 2025-05-22 — Annotate nullability in remaining `org.junit.jupiter.engine..` packages
- `d195400` 2016-06-20 — Rename JUnit 5 TestEngine to Jupiter
- `c76a901` 2016-01-09 — Introduce package-info across the code base

### Cluster 2 — 41 files, 8 packages, 5 modules

Packages: org.junit.platform.launcher.core (10), org.junit.platform.suite.api (8), org.junit.platform.suite.engine (8), org.junit.platform.engine (7), org.junit.platform.launcher (4), org.junit.platform.engine.discovery (2), org.junit.platform.engine.reporting (1), org.junit.platform.testkit.engine (1)

Modules: junit-platform-launcher (14), junit-platform-engine (10), junit-platform-suite-api (8), junit-platform-suite-engine (8), junit-platform-testkit (1)

Files:

- `junit-platform-engine/src/main/java/org/junit/platform/engine/CompositeFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/DiscoveryFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineDiscoveryRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ExecutionRequest.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/Filter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/FilterResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestExecutionResult.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/ClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/IncludeClassNameFilter.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/reporting/OutputDirectoryProvider.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/EngineFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/PostDiscoveryFilter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultDiscoveryRequest.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueCollector.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DiscoveryIssueNotifier.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineDiscoveryOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineExecutionOrchestrator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/EngineIdValidator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/HierarchicalOutputDirectoryCreator.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InternalTestPlan.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryRequestBuilder.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherDiscoveryResult.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/ConfigurationParameter.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectClasspathResource.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectDirectories.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectFile.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectMethod.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectModules.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/SelectUris.java`
- `junit-platform-suite-api/src/main/java/org/junit/platform/suite/api/Suite.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/AdditionalDiscoverySelectors.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/ClassSelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/DiscoverySelectorResolver.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/IsSuiteClass.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncher.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteLauncherDiscoveryRequestBuilder.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestDescriptor.java`
- `junit-platform-suite-engine/src/main/java/org/junit/platform/suite/engine/SuiteTestEngine.java`
- `junit-platform-testkit/src/main/java/org/junit/platform/testkit/engine/EngineTestKit.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ClassSelectorResolver.java` | `DiscoverySelectorResolver.java` | 8 | 1.00 |
| `ConfigurationParameter.java` | `SuiteLauncherDiscoveryRequestBuilder.java` | 5 | 1.00 |
| `OutputDirectoryProvider.java` | `EngineTestKit.java` | 4 | 1.00 |
| `ConfigurationParameter.java` | `SelectClasspathResource.java` | 3 | 1.00 |
| `ConfigurationParameter.java` | `SelectDirectories.java` | 3 | 1.00 |

Evidence for the strongest edge (`ClassSelectorResolver.java` – `DiscoverySelectorResolver.java`, up to 10 commits, newest first):

- `e47c253` 2025-09-09 — Deprecate `OutputDirectoryProvider` in favor of `OutputDirectoryCreator` (#4924)
- `f08c663` 2025-03-26 — Report discovery issue for cyclic suites
- `7f01c8d` 2025-03-26 — Report discovery issues for invalid `@Suite` classes
- `1aa837d` 2025-03-19 — Report discovery issues for invalid suite lifecycle methods
- `dbd4e2e` 2024-11-26 — Allow attaching files to test results (#4138)
- `8107424` 2021-05-16 — Discover suite tests using parent configuration parameters
- `2e796f0` 2021-08-10 — Fix Javadoc issues for the JUnit Platform Suite support
- `b2a9810` 2021-02-09 — Introduce junit-platform-suite-engine (#2416)

### Cluster 12 — 20 files, 8 packages, 5 modules

Packages: org.junit.jupiter.engine.extension (7), org.junit.jupiter.engine.config (5), org.junit.jupiter.api (2), org.junit.platform.engine.support.store (2), org.junit.jupiter.engine (1), org.junit.platform.commons.util (1), org.junit.platform.engine.support.hierarchical (1), org.junit.platform.launcher.core (1)

Modules: junit-jupiter-engine (13), junit-platform-engine (3), junit-jupiter-api (2), junit-platform-commons (1), junit-platform-launcher (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Timeout.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/Constants.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/CachingJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/DefaultJupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/EnumConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/InstantiatingConfigurationParameterConverter.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/config/JupiterConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SameThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/SeparateThreadTimeoutInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutConfiguration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutDuration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExceptionFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TimeoutInvocationFactory.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClassNamePatternFilterUtils.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelHierarchicalTestExecutorServiceFactory.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStore.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/NamespacedHierarchicalStoreException.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherPhase.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `Timeout.java` | `TimeoutConfiguration.java` | 4 | 1.00 |
| `TimeoutConfiguration.java` | `TimeoutExtension.java` | 4 | 1.00 |
| `junit-jupiter-api/src/main/java/org/junit/jupiter/api/Constants.java` | `DefaultJupiterConfiguration.java` | 3 | 1.00 |
| `DefaultJupiterConfiguration.java` | `ParallelHierarchicalTestExecutorServiceFactory.java` | 3 | 1.00 |
| `SameThreadTimeoutInvocation.java` | `TimeoutExceptionFactory.java` | 3 | 1.00 |

Evidence for the strongest edge (`Timeout.java` – `TimeoutConfiguration.java`, up to 10 commits, newest first):

- `95656d2` 2025-07-21 — Fail for invalid enum constants supplied as configuration parameters (#4781)
- `e713072` 2022-06-26 — Add thread mode to @Timeout (#2949)
- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `c8ea3db` 2019-05-28 — Introduce declarative timeouts

### Cluster 4 — 29 files, 6 packages, 2 modules

Packages: org.junit.platform.launcher.core (12), org.junit.platform.launcher (7), org.junit.platform.launcher.listeners (4), org.junit.platform.engine (2), org.junit.platform.launcher.jfr (2), org.junit.platform.launcher.listeners.discovery (2)

Modules: junit-platform-launcher (27), junit-platform-engine (2)

Files:

- `junit-platform-engine/src/main/java/org/junit/platform/engine/EngineExecutionListener.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/TestEngine.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/Launcher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherConstants.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherInterceptor.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/LauncherSessionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/TestExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DefaultLauncherSession.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/DelegatingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ExecutionListenerAdapter.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/InterceptingLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfig.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherFactory.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/OutcomeDelayingEngineExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/SessionPerRequestLauncher.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/jfr/FlightRecordingExecutionListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/LoggingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/MutableTestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/SummaryGeneratingListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/TestExecutionSummary.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/CompositeLauncherDiscoveryListener.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/listeners/discovery/LoggingLauncherDiscoveryListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DelegatingLauncher.java` | `SessionPerRequestLauncher.java` | 6 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherConfig.java` | 5 | 1.00 |
| `DefaultLauncherConfig.java` | `LauncherFactory.java` | 5 | 1.00 |
| `LauncherSessionListener.java` | `LauncherFactory.java` | 3 | 1.00 |
| `DefaultLauncherSession.java` | `SessionPerRequestLauncher.java` | 7 | 0.88 |

Evidence for the strongest edge (`DelegatingLauncher.java` – `SessionPerRequestLauncher.java`, up to 10 commits, newest first):

- `a9deb4a` 2026-01-26 — Add missing precondition checks to Launcher implementations (#5281)
- `6157f3a` 2025-08-29 — Remove obsolete suppressions
- `f6f1a70` 2025-07-07 — Introduce `LauncherExecutionRequest` (#4724)
- `7a056cd` 2022-11-16 — Load interceptors before session listeners
- `a13b99a` 2022-11-15 — Create interceptors before launcher
- `fa47602` 2022-11-11 — Introduce LauncherInterceptor

### Cluster 13 — 20 files, 6 packages, 15 modules

Packages: (default) (15), org.junit.platform.commons.function (1), org.junit.platform.commons.support (1), org.junit.platform.commons.support.conversion (1), org.junit.platform.commons.support.scanning (1), org.junit.platform.engine.support.store (1)

Modules: junit-platform-commons (5), junit-platform-engine (2), junit-jupiter (1), junit-jupiter-api (1), junit-jupiter-engine (1), junit-jupiter-migrationsupport (1), junit-jupiter-params (1), junit-platform-console (1), junit-platform-launcher (1), junit-platform-reporting (1), junit-platform-suite (1), junit-platform-suite-api (1), junit-platform-suite-engine (1), junit-platform-testkit (1), junit-vintage-engine (1)

Files:

- `junit-jupiter-api/src/main/java/module-info.java`
- `junit-jupiter-engine/src/main/java/module-info.java`
- `junit-jupiter-migrationsupport/src/main/java/module-info.java`
- `junit-jupiter-params/src/main/java/module-info.java`
- `junit-jupiter/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/module-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/function/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/conversion/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/package-info.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/support/scanning/package-info.java`
- `junit-platform-console/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/module-info.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/store/package-info.java`
- `junit-platform-launcher/src/main/java/module-info.java`
- `junit-platform-reporting/src/main/java/module-info.java`
- `junit-platform-suite-api/src/main/java/module-info.java`
- `junit-platform-suite-engine/src/main/java/module-info.java`
- `junit-platform-suite/src/main/java/module-info.java`
- `junit-platform-testkit/src/main/java/module-info.java`
- `junit-vintage-engine/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-jupiter-engine/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-migrationsupport/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-jupiter-params/src/main/java/module-info.java` | `junit-jupiter/src/main/java/module-info.java` | 6 | 1.00 |
| `junit-platform-commons/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |
| `junit-platform-suite-api/src/main/java/module-info.java` | `junit-platform-suite/src/main/java/module-info.java` | 3 | 1.00 |

Evidence for the strongest edge (`junit-jupiter-engine/src/main/java/module-info.java` – `junit-jupiter/src/main/java/module-info.java`, up to 10 commits, newest first):

- `364380f` 2025-05-12 — Compile module descriptors using regular `compileJava` task (#4523)
- `495ed6c` 2025-01-27 — Configure Spotless for module descriptors and update copyright
- `c8e431b` 2020-01-19 — Make since Javadoc tag consistent
- `12f1c38` 2020-01-19 — Remove ineffective moduleGraph Javadoc tag
- `1d88346` 2019-12-20 — Revise module declarations of "org.junit.jupiter" group
- `0241727` 2019-04-15 — Introduce explicit Java modules

### Cluster 1 — 46 files, 5 packages, 2 modules

Packages: org.junit.jupiter.params.provider (29), org.junit.jupiter.params.converter (9), org.junit.jupiter.params (4), org.junit.jupiter.params.support (3), org.junit.jupiter.api.condition (1)

Modules: junit-jupiter-params (45), junit-jupiter-api (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/MethodBasedCondition.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedClassExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTest.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestExtension.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestInvocationContext.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/AnnotationBasedArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConversionException.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/ConvertWith.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/DefaultArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/JavaTimeConversionPattern.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/SimpleArgumentConverter.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/converter/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/AnnotationBasedArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/Arguments.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ArgumentsSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvFileSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvReaderFactory.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/CsvSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptyArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/EnumSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullAndEmptySource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullEnum.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/NullSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueArgumentsProvider.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSource.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/ValueSources.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/package-info.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/AnnotationConsumerInitializer.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/support/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CsvFileSources.java` | `CsvSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `EnumSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `FieldSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `MethodSources.java` | 5 | 1.00 |
| `CsvFileSources.java` | `ValueSources.java` | 5 | 1.00 |

Evidence for the strongest edge (`CsvFileSources.java` – `CsvSources.java`, up to 10 commits, newest first):

- `22af4a2` 2025-11-24 — Improve wording and formatting in Javadoc
- `014192b` 2025-03-07 — Inherit `ParameterizedClass` and `..Source` annotations to subclasses (#4369)
- `34509e5` 2025-03-02 — Apply consistent code formatting
- `4ff42a7` 2024-10-09 — Allow repeating `@…Source` annotations when used as meta annotations
- `2886963` 2024-05-14 — Make parameterized ArgumentSource annotations repeatable

### Cluster 9 — 22 files, 5 packages, 3 modules

Packages: org.junit.platform.engine.support.hierarchical (17), org.junit.jupiter.api.parallel (2), org.junit.platform.engine (1), org.junit.platform.engine.support.config (1), org.junit.platform.launcher.core (1)

Modules: junit-platform-engine (19), junit-jupiter-api (2), junit-platform-launcher (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/ResourceAccessMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/parallel/Resources.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/ConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/config/PrefixedConfigurationParameters.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/CompositeLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/DefaultParallelExecutionConfigurationStrategy.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ExclusiveResource.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ForkJoinPoolHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestEngine.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutor.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/HierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/LockManager.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/Node.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTask.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NodeTestTaskContext.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/NopLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ParallelExecutionConfiguration.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/ResourceLock.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SameThreadHierarchicalTestExecutorService.java`
- `junit-platform-engine/src/main/java/org/junit/platform/engine/support/hierarchical/SingleLock.java`
- `junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/LauncherConfigurationParameters.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CompositeLock.java` | `NopLock.java` | 4 | 1.00 |
| `DefaultParallelExecutionConfiguration.java` | `DefaultParallelExecutionConfigurationStrategy.java` | 4 | 1.00 |
| `ForkJoinPoolHierarchicalTestExecutorService.java` | `NopLock.java` | 4 | 1.00 |
| `NopLock.java` | `ResourceLock.java` | 4 | 1.00 |
| `NopLock.java` | `SingleLock.java` | 4 | 1.00 |

Evidence for the strongest edge (`CompositeLock.java` – `NopLock.java`, up to 10 commits, newest first):

- `24bfbca` 2025-11-06 — Implement parallel test execution without using `ForkJoinPool` (#5060)
- `ebbf134` 2024-09-21 — Allow for work stealing when only holding read locks (#4012)
- `38e149f` 2018-06-28 — Polish HierarchicalTestEngine and collaborators
- `2f3440e` 2018-06-22 — Introduce support for parallel test execution

### Cluster 11 — 21 files, 5 packages, 1 module

Packages: org.junit.jupiter.migrationsupport.rules (6), org.junit.jupiter.migrationsupport.rules.adapter (6), org.junit.jupiter.migrationsupport.rules.member (5), org.junit.jupiter.migrationsupport (2), org.junit.jupiter.migrationsupport.conditions (2)

Modules: junit-jupiter-migrationsupport (21)

Files:

- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/EnableJUnit4MigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/IgnoreCondition.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/conditions/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/EnableRuleMigrationSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExpectedExceptionSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/ExternalResourceSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/TestRuleSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/VerifierSupport.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/AbstractTestRuleAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExpectedExceptionAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/ExternalResourceAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/GenericBeforeAndAfterAdvice.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/VerifierAdapter.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/adapter/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/AbstractTestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedField.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMember.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/TestRuleAnnotatedMethod.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/member/package-info.java`
- `junit-jupiter-migrationsupport/src/main/java/org/junit/jupiter/migrationsupport/rules/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AbstractTestRuleAdapter.java` | `ExternalResourceAdapter.java` | 9 | 1.00 |
| `ExternalResourceSupport.java` | `TestRuleAnnotatedMember.java` | 8 | 1.00 |
| `TestRuleSupport.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `GenericBeforeAndAfterAdvice.java` | 7 | 1.00 |
| `AbstractTestRuleAdapter.java` | `AbstractTestRuleAnnotatedMember.java` | 7 | 1.00 |

Evidence for the strongest edge (`AbstractTestRuleAdapter.java` – `ExternalResourceAdapter.java`, up to 10 commits, newest first):

- `a19e6ee` 2017-06-07 — Rename Jupiter Migration Support to `junit-jupiter-migrationsupport`
- `298cdac` 2016-12-04 — Polish JUnit 4 migration support
- `4c19b69` 2016-11-18 — Add protection against mismatching target and adaptee classes
- `20598ff` 2016-11-03 — Add @API-annotations to all classes
- `9fa741b` 2016-11-03 — Move rule support to dedicated module
- `19fc678` 2016-09-06 — Improve package structure
- `aeb2045` 2016-09-05 — Cleanup and simplify implementation
- `fad84db` 2016-09-01 — Generalize to other subtypes of TestRule
- `184230f` 2016-08-31 — Refactor ExternalResourceSupport

### Cluster 14 — 19 files, 5 packages, 1 module

Packages: org.junit.vintage.engine.discovery (6), org.junit.vintage.engine.descriptor (5), org.junit.vintage.engine.execution (4), org.junit.vintage.engine (2), org.junit.vintage.engine.support (2)

Modules: junit-vintage-engine (19)

Files:

- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/Constants.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/VintageTestEngine.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/OrFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerRequest.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/TestSourceProvider.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/VintageTestDescriptor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/ClassSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/DefensiveAllDefaultPossibilitiesBuilder.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/MethodSelectorResolver.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/RunnerTestDescriptorPostProcessor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/UniqueIdFilter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/VintageDiscoverer.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunListenerAdapter.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/RunnerExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/TestRun.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/VintageExecutor.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdReader.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/support/UniqueIdStringifier.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `RunnerRequest.java` | `RunnerExecutor.java` | 4 | 1.00 |
| `OrFilter.java` | `VintageDiscoverer.java` | 5 | 0.83 |
| `RunnerTestDescriptorPostProcessor.java` | `UniqueIdStringifier.java` | 4 | 0.80 |
| `UniqueIdReader.java` | `UniqueIdStringifier.java` | 4 | 0.80 |
| `RunnerTestDescriptorPostProcessor.java` | `UniqueIdReader.java` | 7 | 0.78 |

Evidence for the strongest edge (`RunnerRequest.java` – `RunnerExecutor.java`, up to 10 commits, newest first):

- `f7741ec` 2016-06-18 — Rename base package of junit4-engine to org.junit.vintage.engine
- `7b80cb0` 2016-05-25 — Add missing @since tags
- `4cb0a31` 2016-01-14 — #40: Re-use JUnit 4's FilterRequest
- `7f05737` 2016-01-07 — #40: Extract RunnerRequest

### Cluster 16 — 15 files, 5 packages, 3 modules

Packages: org.junit.jupiter.engine.execution (6), org.junit.jupiter.api.extension (4), org.junit.jupiter.engine.extension (2), org.junit.platform.commons.util (2), org.junit.jupiter.engine.support (1)

Modules: junit-jupiter-engine (9), junit-jupiter-api (4), junit-platform-commons (2)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionConfigurationException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContextException.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolutionException.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ConstructorInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/DefaultParameterContext.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InterceptingExecutableInvoker.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/MethodInvocation.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ParameterResolutionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestInfoParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TestReporterParameterResolver.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/support/MethodReflectionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinFunctionUtils.java`
- `junit-platform-commons/src/main/java/org/junit/platform/commons/util/KotlinReflectionUtils.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ConstructorInvocation.java` | `MethodInvocation.java` | 4 | 1.00 |
| `DefaultExecutableInvoker.java` | `ParameterResolutionUtils.java` | 4 | 0.80 |
| `ConstructorInvocation.java` | `ParameterResolutionUtils.java` | 3 | 0.75 |
| `ParameterResolutionUtils.java` | `MethodReflectionUtils.java` | 3 | 0.75 |
| `MethodReflectionUtils.java` | `KotlinReflectionUtils.java` | 3 | 0.75 |

Evidence for the strongest edge (`ConstructorInvocation.java` – `MethodInvocation.java`, up to 10 commits, newest first):

- `dd6d1d6` 2026-05-27 — Prefer @Nullable to Optional for InterceptingExecutableInvoker (#5701)
- `ab45546` 2025-05-22 — Annotate nullability in remaining `org.junit.jupiter.engine..` packages
- `e31e58d` 2020-11-20 — Polishing
- `bb79507` 2019-03-29 — Introduce InvocationInterceptor extension API

### Cluster 3 — 31 files, 4 packages, 1 module

Packages: org.junit.platform.console.command (13), org.junit.platform.console.output (10), org.junit.platform.console.options (7), org.junit.platform.console (1)

Modules: junit-platform-console (31)

Files:

- `junit-platform-console/src/main/java/org/junit/platform/console/ConsoleLauncher.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/BaseCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandFacade.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CommandResult.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ConsoleTestExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomClassLoaderCloseStrategy.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/CustomContextClassLoaderExecutor.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoverTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/DiscoveryRequestCreator.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ExecuteTestsCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ListTestEnginesCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/MainCommand.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/ManifestVersionProvider.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/command/OutputStreamConfig.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/AnsiColorOptionMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/Details.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/SelectorConverter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestConsoleOutputOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptions.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/options/TestDiscoveryOptionsMixin.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/ColorPalette.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/DetailsPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/FlatPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Style.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TestFeedPrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/Theme.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreeNode.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrinter.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/TreePrintingListener.java`
- `junit-platform-console/src/main/java/org/junit/platform/console/output/VerboseTreePrintingListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DiscoverTestsCommand.java` | `ExecuteTestsCommand.java` | 10 | 1.00 |
| `CommandResult.java` | `ExecuteTestsCommand.java` | 8 | 1.00 |
| `ConsoleTestExecutor.java` | `Details.java` | 4 | 1.00 |
| `MainCommand.java` | `ManifestVersionProvider.java` | 4 | 1.00 |
| `TestConsoleOutputOptions.java` | `TestConsoleOutputOptionsMixin.java` | 4 | 1.00 |

Evidence for the strongest edge (`DiscoverTestsCommand.java` – `ExecuteTestsCommand.java`, up to 10 commits, newest first):

- `3ef97bf` 2025-09-08 — Restructure `ConsoleLauncher` to avoid package cycles (#4926)
- `6b8e94a` 2025-03-10 — Polishing
- `abf5ac3` 2024-06-10 — Use module version of Console Launcher when on module path (#3847)
- `0173a37` 2023-03-13 — Separate discovery from output options
- `1a31235` 2023-03-01 — Hide implementation details
- `ce58e76` 2023-03-01 — Test new CLI parsing logic
- `feb691e` 2023-03-01 — Fix tests
- `f916512` 2023-02-26 — Fix some tests
- `cd62eec` 2023-02-25 — Introduce Picocli subcommands
- `99d2b55` 2023-02-24 — Introduce commands

### Cluster 5 — 26 files, 4 packages, 2 modules

Packages: org.junit.jupiter.api.extension (20), org.junit.jupiter.api.io (3), org.junit.jupiter.engine.execution (2), org.junit.jupiter.engine.extension (1)

Modules: junit-jupiter-api (23), junit-jupiter-engine (3)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/AfterTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeAllCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeEachCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/BeforeTestExecutionCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExecutionCondition.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtendWith.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/Extensions.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/InvocationInterceptor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/LifecycleMethodExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ParameterResolver.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/RegisterExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestExecutionExceptionHandler.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactory.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstanceFactoryContext.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePostProcessor.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstancePreConstructCallback.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/TestInstantiationAwareExtension.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/CleanupMode.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDir.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/io/TempDirFactory.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/ExtensionContextSupplier.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/execution/InvocationInterceptorChain.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/TempDirectory.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AfterAllCallback.java` | `BeforeAllCallback.java` | 21 | 1.00 |
| `AfterAllCallback.java` | `AfterEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `BeforeAllCallback.java` | `BeforeEachCallback.java` | 20 | 1.00 |
| `AfterAllCallback.java` | `AfterTestExecutionCallback.java` | 12 | 1.00 |

Evidence for the strongest edge (`AfterAllCallback.java` – `BeforeAllCallback.java`, up to 10 commits, newest first):

- `59df198` 2025-03-07 — Rename `ContainerTemplate` to `ClassTemplate`
- `517b9c0` 2025-03-04 — Introduce per-invocation lifecycle callbacks for container templates (#4353)
- `c9ae6e2` 2020-01-24 — Improve documentation for lifecycle callback extension APIs
- `4544de3` 2019-02-07 — Document wrapping for lifecycle callback extensions
- `83cd64f` 2018-05-22 — Document constructor requirements for extensions
- `5a3d4fe` 2017-11-21 — Improve JavaDoc for class-level extension APIs
- `83b3eb6` 2017-06-30 — Remove TestExtensionContext and ContainerExtensionContext
- `5e01f63` 2016-06-10 — Document nullability of arguments & return types in extensions
- `f68eba6` 2016-05-24 — Rename AfterTestMethodCallback to AfterTestExecutionCallback
- `6b9f227` 2016-05-24 — Rename BeforeTestMethodCallback to BeforeTestExecutionCallback

### Cluster 26 — 9 files, 4 packages, 3 modules

Packages: org.junit.jupiter.api (3), org.junit.jupiter.engine.extension (3), org.junit.jupiter.engine.descriptor (2), org.junit.jupiter.params.provider (1)

Modules: junit-jupiter-engine (5), junit-jupiter-api (3), junit-jupiter-params (1)

Files:

- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGeneration.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/DisplayNameGenerator.java`
- `junit-jupiter-api/src/main/java/org/junit/jupiter/api/IndicativeSentencesGeneration.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/DisplayNameUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/ExtensionUtils.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/AutoCloseExtension.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/ExtensionRegistrar.java`
- `junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/extension/MutableExtensionRegistry.java`
- `junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/FieldArgumentsProvider.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DisplayNameGeneration.java` | `DisplayNameGenerator.java` | 6 | 1.00 |
| `DisplayNameGenerator.java` | `IndicativeSentencesGeneration.java` | 4 | 1.00 |
| `IndicativeSentencesGeneration.java` | `DisplayNameUtils.java` | 3 | 0.75 |
| `ExtensionRegistrar.java` | `MutableExtensionRegistry.java` | 4 | 0.67 |
| `DisplayNameGenerator.java` | `DisplayNameUtils.java` | 13 | 0.62 |

Evidence for the strongest edge (`DisplayNameGeneration.java` – `DisplayNameGenerator.java`, up to 10 commits, newest first):

- `920b688` 2022-03-06 — Use value references in Javadoc to eliminate duplication (#2769)
- `b7499dc` 2021-06-18 — Only search for annotations on enclosing class for inner classes
- `e69411d` 2020-08-01 — Promote DisplayNameGeneration and its dependencies
- `4db8e8e` 2018-09-23 — Introduce DisplayNameUtils helper
- `75de66e` 2018-09-22 — Document display name generation
- `7075ac1` 2018-09-16 — Introduce DisplayName generation SPI

### Cluster 31 — 4 files, 4 packages, 1 module

Packages: org.junit.vintage.engine (1), org.junit.vintage.engine.descriptor (1), org.junit.vintage.engine.discovery (1), org.junit.vintage.engine.execution (1)

Modules: junit-vintage-engine (4)

Files:

- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java`
- `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/execution/package-info.java` | 4 | 1.00 |
| `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java` | `junit-vintage-engine/src/main/java/org/junit/vintage/engine/package-info.java` | 4 | 1.00 |

Evidence for the strongest edge (`junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/package-info.java` – `junit-vintage-engine/src/main/java/org/junit/vintage/engine/discovery/package-info.java`, up to 10 commits, newest first):

- `8f7bee9` 2025-05-22 — Move `@NullMarked` annotations to packages
- `a55b62d` 2016-06-20 — Rename JUnit 4 TestEngine to Vintage
- `f7741ec` 2016-06-18 — Rename base package of junit4-engine to org.junit.vintage.engine
- `c76a901` 2016-01-09 — Introduce package-info across the code base

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 7 | 25 | 3 | 2 | `ReflectionSupport.java` – `ResourceSupport.java` | 3 | 1.00 | `40c3b0a`, `34a4032`, `9798f6f` |
| 8 | 24 | 3 | 2 | `AssertFalse.java` – `AssertTrue.java` | 12 | 1.00 | `1d3217a`, `9794f19`, `aaa6552` |
| 19 | 14 | 3 | 1 | `ArgumentAccessException.java` – `ArgumentsAggregationException.java` | 5 | 1.00 | `ad922b1`, `800c4be`, `52fadf6` |
| 21 | 12 | 3 | 2 | `ClassTemplate.java` – `AfterClassTemplateInvocationCallback.java` | 4 | 1.00 | `6c69384`, `c83f28c`, `59df198` |
| 24 | 11 | 3 | 2 | `AfterEach.java` – `BeforeEach.java` | 19 | 0.95 | `656b9ed`, `cb9df8a`, `594f7e4` |
| 6 | 25 | 2 | 1 | `DisabledIf.java` – `EnabledIf.java` | 22 | 1.00 | `2ecea3b`, `766561f`, `3fca251` |
| 15 | 17 | 2 | 1 | `DirectorySelector.java` – `FileSelector.java` | 8 | 0.89 | `fa22a75`, `751467c`, `2a777a8` |
| 17 | 15 | 2 | 1 | `TagFilter.java` – `ParseResults.java` | 4 | 1.00 | `41aee1d`, `996f023`, `f9c6e76` |
| 18 | 14 | 2 | 2 | `AbstractAnnotatedDescriptorWrapper.java` – `ClassOrderingVisitor.java` | 4 | 1.00 | `a5edcbf`, `044b3aa`, `49565e9` |
| 20 | 14 | 2 | 1 | `DirectorySource.java` – `FileSource.java` | 11 | 1.00 | `623652a`, `800c4be`, `a84575b` |
| 27 | 7 | 2 | 2 | `JUnitFactory.java` – `Type.java` | 5 | 1.00 | `61c6a9d`, `7ac2105`, `cfb3e30` |
| 30 | 4 | 2 | 2 | `RepeatedTest.java` – `RepetitionInfo.java` | 3 | 0.75 | `5b54e0d`, `c86b509`, `2199096` |
| 37 | 2 | 2 | 1 | `junit-platform-commons/src/main/java/org/junit/platform/commons/package-info.java` – `junit-platform-commons/src/main/java/org/junit/platform/commons/util/package-info.java` | 3 | 0.60 | `8f7bee9`, `874ef28`, `8254216` |
| 38 | 2 | 2 | 2 | `ConfigurationParameter.java` – `ConfigurationMetadataAnnotationProcessor.java` | 3 | 1.00 | `e07cfa6`, `7b630f6`, `f8b3293` |
| 39 | 2 | 2 | 2 | `junit-platform-console/src/main/java/org/junit/platform/console/options/package-info.java` – `junit-platform-engine/src/main/java/org/junit/platform/engine/package-info.java` | 3 | 0.75 | `8f7bee9`, `26f7193`, `c76a901` |
| 22 | 12 | 1 | 1 | `ExcludeTags.java` – `IncludeTags.java` | 21 | 1.00 | `41a42af`, `3f28207`, `030bfbd` |
| 23 | 12 | 1 | 1 | `Event.java` – `TerminationInfo.java` | 8 | 1.00 | `639325f`, `58bb81b`, `0fa9c2a` |
| 25 | 10 | 1 | 1 | `ConversionSupport.java` – `StringToJavaTimeConverter.java` | 4 | 1.00 | `64de9f0`, `92f271d`, `14114f5` |
| 28 | 4 | 1 | 1 | `DynamicContainer.java` – `DynamicNode.java` | 9 | 0.82 | `1f7be03`, `aaa6552`, `bff5d33` |
| 29 | 4 | 1 | 1 | `ReadsDefaultLocale.java` – `ReadsDefaultTimeZone.java` | 3 | 1.00 | `d03c7c9`, `41a42af`, `bea12a8` |
| 32 | 3 | 1 | 1 | `Execution.java` – `ResourceLocks.java` | 3 | 0.60 | `06e0742`, `91e8cd6`, `2f3440e` |
| 33 | 2 | 1 | 1 | `ThrowingConsumer.java` – `ThrowingSupplier.java` | 3 | 0.75 | `6c59231`, `17ea546`, `b0dda8c` |
| 34 | 2 | 1 | 1 | `ReadsSystemProperty.java` – `WritesSystemProperty.java` | 3 | 1.00 | `d03c7c9`, `c291139`, `b60d9f0` |
| 35 | 2 | 1 | 1 | `AfterParameterizedClassInvocation.java` – `BeforeParameterizedClassInvocation.java` | 5 | 1.00 | `fee9c4c`, `c83f28c`, `2aefea2` |
| 36 | 2 | 1 | 1 | `JUnitException.java` – `PreconditionViolationException.java` | 3 | 0.75 | `ca28a85`, `800c4be`, `dd66770` |
| 40 | 2 | 1 | 1 | `NodeExecutionAdvisor.java` – `NodeTreeWalker.java` | 3 | 1.00 | `871e800`, `60f3125`, `6aac242` |
| 41 | 2 | 1 | 1 | `XmlReportData.java` – `XmlReportWriter.java` | 3 | 0.75 | `734b4c5`, `3583c87`, `bc624c4` |
| 42 | 2 | 1 | 1 | `JUnit.java` – `package-info.java` | 3 | 1.00 | `c275c1c`, `efe0527`, `c33b283` |
| 43 | 2 | 1 | 1 | `Helper.java` – `MavenRepo.java` | 3 | 0.75 | `7cec9b1`, `4ca5bfd`, `f105349` |

