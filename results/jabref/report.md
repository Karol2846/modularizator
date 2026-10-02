# Co-change report: jabref

HEAD: `e8391b1b29797ce0258c2a85cb39b4bb23ca66e9` · changesets: 2003-10-16 – 2026-10-01 · generated with parameters: minShared=3, minWeight=0.30, maxChangeset=50, seed=42

## Statistics

| metric | value | what it means |
|---|---|---|
| Commits read | 22170 | Non-merge commits reachable from HEAD. |
| Changesets kept | 8642 | Commits that touched production Java files and were used to compute coupling. |
| Skipped as empty | 13449 | Commits that touched no production Java file still present at HEAD. |
| Skipped as mega-commits | 79 | Commits touching more than 50 production Java files (moves, formatting, bumps), ignored because they would create false coupling. |
| Renames resolved | 3401 | Old paths whose history was attributed to a file that exists at HEAD. |
| Rename detection warnings | 0 | Times git gave up on rename detection, so some moved files may have lost history. |
| Unique files | 2143 | Production Java files that appear in at least one kept changeset. |
| Edges | 5671 | File pairs that changed together often enough to pass both thresholds (shared ≥ 3, weight ≥ 0.30). |
| Cross-package edges | 3846 | Edges whose two files live in different Java packages. |
| Cross-module edges | 1049 | Edges whose two files live in different build modules. |
| Graph nodes | 1243 | Files with at least one edge; only these are clustered. |
| Files without edges | 900 | Files that changed, but never often enough together with any other file; left out of the graph. |

## Top 20 cross-package pairs

_Strongest edges between files in different packages, before clustering. shared = number of kept commits that changed both files; weight = shared divided by the number of commits of the less frequently changed file (1.00 = it never changed without the other)._

| fileA | fileB | shared | weight |
|---|---|---|---|
| `jabgui/src/main/java/org/jabref/gui/dialogs/AutosaveUiManager.java` | `jabgui/src/main/java/org/jabref/gui/exporter/SaveDatabaseAction.java` | 15 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java` | `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesAction.java` | 10 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java` | `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneViewModel.java` | 9 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeResolverFactory.java` | `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryChangeResolver.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/editfieldcontent/EditFieldContentTabView.java` | `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/renamefield/RenameFieldTabView.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java` | `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldMenuItemFactory.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBinding.java` | `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/NewEntryBindingPreset.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/maintable/RightClickMenu.java` | `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldMenuItemFactory.java` | 6 | 1.00 |
| `jabkit/src/main/java/org/jabref/toolkit/JabKitLauncher.java` | `jabkit/src/main/java/org/jabref/toolkit/commands/Fetch.java` | 6 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/autocompleter/ContentSelectorSuggestionProvider.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/edit/OpenBrowserAction.java` | `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/editfieldcontent/EditFieldContentViewModel.java` | `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/renamefield/RenameFieldTabView.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabModel.java` | `jabgui/src/main/java/org/jabref/gui/preferences/JabRefGuiPreferences.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditorViewModel.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/PatentTypeEditorViewModel.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/YesNoEditorViewModel.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/PatentTypeEditorViewModel.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/YesNoEditorViewModel.java` | 5 | 1.00 |
| `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditorViewModel.java` | `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/MapBasedEditorViewModel.java` | 5 | 1.00 |

## Resolution = 0.5

Clusters (≥2 files): 41 · largest: 389 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.83

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 73.85% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 389 files, 107 packages, 3 modules

Packages: org.jabref.logic.exporter (17), org.jabref.gui.maintable (16), org.jabref.logic.cleanup (12), org.jabref.gui.entryeditor (11), org.jabref.gui.util (11), org.jabref.logic.layout.format (11), org.jabref.logic.shared (10), org.jabref.gui (9), org.jabref.gui.edit (9), org.jabref.gui.frame (9), org.jabref.logic.push (9), org.jabref.logic.util (9), org.jabref.gui.help (8), org.jabref.gui.search (8), org.jabref.gui.exporter (7), org.jabref.gui.externalfiles (7), org.jabref.gui.collab (6), org.jabref.gui.icon (6), org.jabref.gui.importer (6), org.jabref.gui.sidepane (6), org.jabref.logic.bibtex.comparator (6), org.jabref.logic.preferences (6), org.jabref.logic.util.io (6), org.jabref.logic.xmp (6), org.jabref.gui.cleanup (5), org.jabref.gui.groups (5), org.jabref.gui.specialfields (5), org.jabref.model.database (5), org.jabref.gui.fieldeditors (4), org.jabref.gui.importer.actions (4), org.jabref.gui.maintable.columns (4), org.jabref.gui.push (4), org.jabref.gui.shared (4), org.jabref.logic (4), org.jabref.logic.importer (4), org.jabref.logic.shared.exception (4), org.jabref.model.entry.event (4), org.jabref.gui.actions (3), org.jabref.gui.autocompleter (3), org.jabref.gui.commonfxcontrols (3), org.jabref.gui.copyfiles (3), org.jabref.gui.externalfiletype (3), org.jabref.gui.importer.fetcher (3), org.jabref.gui.linkedfile (3), org.jabref.gui.preferences (3), org.jabref.gui.preferences.protectedterms (3), org.jabref.logic.bibtex (3), org.jabref.logic.layout (3), org.jabref.logic.remote (3), org.jabref.logic.remote.server (3), org.jabref.model.database.event (3), org.jabref.model.entry (3), org.jabref.model.entry.field (3), org.jabref.model.groups (3), org.jabref.cli (2), org.jabref.gui.autosaveandbackup (2), org.jabref.gui.auximport (2), org.jabref.gui.citationkeypattern (2), org.jabref.gui.dialogs (2), org.jabref.gui.menus (2), org.jabref.gui.preferences.customexporter (2), org.jabref.gui.preferences.customimporter (2), org.jabref.gui.preferences.entry (2), org.jabref.gui.preferences.export (2), org.jabref.gui.preferences.linkedfiles (2), org.jabref.gui.preferences.websearch (2), org.jabref.logic.auxparser (2), org.jabref.logic.importer.util (2), org.jabref.logic.net.ssl (2), org.jabref.logic.protectedterms (2), org.jabref.logic.shared.event (2), org.jabref.model.util (2), org.jabref (1), org.jabref.gui.backup (1), org.jabref.gui.duplicationFinder (1), org.jabref.gui.entryeditor.fileannotationtab (1), org.jabref.gui.errorconsole (1), org.jabref.gui.integrity (1), org.jabref.gui.libraryproperties (1), org.jabref.gui.libraryproperties.saving (1), org.jabref.gui.mergeentries (1), org.jabref.gui.preferences.table (1), org.jabref.gui.preview (1), org.jabref.gui.remote (1), org.jabref.gui.util.comparator (1), org.jabref.logic.ai.embedding (1), org.jabref.logic.ai.util (1), org.jabref.logic.citationstyle (1), org.jabref.logic.externalfiles (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.fetcher (1), org.jabref.logic.importer.fileformat (1), org.jabref.logic.journals (1), org.jabref.logic.l10n (1), org.jabref.logic.net (1), org.jabref.logic.pdf (1), org.jabref.logic.remote.client (1), org.jabref.logic.search (1), org.jabref.logic.search.sqlbased (1), org.jabref.logic.shared.prefs (1), org.jabref.logic.shared.security (1), org.jabref.migrations (1), org.jabref.model (1), org.jabref.model.metadata (1), org.jabref.model.metadata.event (1), org.jabref.model.search (1), org.jabref.support (1)

Modules: jabgui (219), jablib (169), test-support (1)

Files:

- `jabgui/src/main/java/org/jabref/Launcher.java`
- `jabgui/src/main/java/org/jabref/cli/ArgumentProcessor.java`
- `jabgui/src/main/java/org/jabref/cli/GuiCommandLine.java`
- `jabgui/src/main/java/org/jabref/gui/CoreGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/DialogService.java`
- `jabgui/src/main/java/org/jabref/gui/DragAndDropDataFormats.java`
- `jabgui/src/main/java/org/jabref/gui/FXDialog.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefDialogService.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefGuiStateManager.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTab.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTabContainer.java`
- `jabgui/src/main/java/org/jabref/gui/StateManager.java`
- `jabgui/src/main/java/org/jabref/gui/actions/Action.java`
- `jabgui/src/main/java/org/jabref/gui/actions/ActionFactory.java`
- `jabgui/src/main/java/org/jabref/gui/actions/JabRefAction.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletionTextInputBinding.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/WordSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/AutosaveManager.java`
- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/BackupManager.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/FromAuxDialog.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/NewSubLibraryAction.java`
- `jabgui/src/main/java/org/jabref/gui/backup/BackupResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeyAction.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeySingleAction.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupAction.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupDialog.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupMultiFieldPanel.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupSingleAction.java`
- `jabgui/src/main/java/org/jabref/gui/collab/ChangeScanner.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChange.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeListener.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeMonitor.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangesResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/collab/ExternalChangesResolverViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SortCriterionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesTask.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/AutosaveUiManager.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/BackupUIManager.java`
- `jabgui/src/main/java/org/jabref/gui/duplicationFinder/DuplicateSearch.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyMoreAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/EditAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsDialog.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/OpenBrowserAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiChatTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiSummaryTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/FieldsEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/JumpToFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/OpenEntryEditorAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewSwitchAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/UserDefinedFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FulltextSearchResultsTab.java`
- `jabgui/src/main/java/org/jabref/gui/errorconsole/LogEventViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAllAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoLinkFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/DownloadFullTextAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ExternalFilesEntryLinker.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileExtensionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FindUnlinkedFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileTypes.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/UnknownExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditorFX.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldNameLabel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ExternalApplicationsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/frame/FileHistoryMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrameViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/OpenConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ProcessingLibraryDialog.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsEMailAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsStandardEmailAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SidePanePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupViewMode.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/help/ErrorConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/HelpAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/NewVersionDialog.java`
- `jabgui/src/main/java/org/jabref/gui/help/SearchForUpdateAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/VersionWorker.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IconTheme.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IkonliIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIconView.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIkonHandler.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefMaterialDesignIcon.java`
- `jabgui/src/main/java/org/jabref/gui/importer/GrobidUseDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/CheckForNewEntryTypesAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/GUIPostOpenAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/ImportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/OpenDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/LookupIdentifierAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneView.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/integrity/IntegrityCheckAction.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesAction.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/saving/SavingPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialog.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/BibEntryTableViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/CellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferencesRecorder.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTable.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableFieldValueFormatter.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableHeaderContextMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTablePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableTooltip.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenFolderAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenUrlAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/RightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/SearchShortScienceAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FieldColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FileColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/LinkedIdentifierColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/MainTableColumn.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeAction.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeMenu.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/MergeWithFetchedEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilter.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilterDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ShowPreferencesAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/NewProtectedTermsFileDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPanel.java`
- `jabgui/src/main/java/org/jabref/gui/push/GuiPushToApplicationCommand.java`
- `jabgui/src/main/java/org/jabref/gui/push/GuiPushToApplicationSettings.java`
- `jabgui/src/main/java/org/jabref/gui/push/GuiPushToEmacsSettings.java`
- `jabgui/src/main/java/org/jabref/gui/push/GuiPushToVimSettings.java`
- `jabgui/src/main/java/org/jabref/gui/remote/CLIMessageHandler.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchBar.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialog.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/RebuildFulltextSearchIndexAction.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchFieldRightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTable.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchTextField.java`
- `jabgui/src/main/java/org/jabref/gui/shared/ConnectToSharedDatabaseCommand.java`
- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseLoginDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseLoginDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseUIManager.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/GroupsSidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePane.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneContentFactory.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneType.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldAction.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldMenuItemFactory.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldValueViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/util/BaseDialog.java`
- `jabgui/src/main/java/org/jabref/gui/util/CustomLocalDragboard.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileDialogConfiguration.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileFilterConverter.java`
- `jabgui/src/main/java/org/jabref/gui/util/IconValidationDecorator.java`
- `jabgui/src/main/java/org/jabref/gui/util/RecursiveTreeItem.java`
- `jabgui/src/main/java/org/jabref/gui/util/UiTaskExecutor.java`
- `jabgui/src/main/java/org/jabref/gui/util/ValueTableCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTableRowFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTreeTableCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTreeTableRowFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/comparator/RankingFieldComparator.java`
- `jabgui/src/main/java/org/jabref/migrations/ConvertLegacyExplicitGroups.java`
- `jablib/src/main/java/org/jabref/logic/FilePreferences.java`
- `jablib/src/main/java/org/jabref/logic/InternalPreferences.java`
- `jablib/src/main/java/org/jabref/logic/LibraryPreferences.java`
- `jablib/src/main/java/org/jabref/logic/UiCommand.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/MVStoreEmbeddingStore.java`
- `jablib/src/main/java/org/jabref/logic/ai/util/MVStoreBase.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/AuxParserResult.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/DefaultAuxParser.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/BibEntryWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldPreferences.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/TypedBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/BibtexStringComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/CrossRefEntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/EntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparatorStack.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/IdComparator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefItemDataProvider.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupJob.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupPreferences.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupWorker.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/ConvertToBiblatexCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/ConvertToBibtexCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FieldFormatterCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FieldFormatterCleanupActions.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FileLinksCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/MoveFilesCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/RelativePathsCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/RenamePdfCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/UpgradePdfPsToFileCleanup.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibDatabaseWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/EmbeddedBibFilePdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExportPreferences.java`
- `jablib/src/main/java/org/jabref/logic/exporter/Exporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExporterFactory.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MSBibExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ModsExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OOCalcDatabase.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentRepresentation.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentSpreadsheetCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenOfficeDocumentCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveException.java`
- `jablib/src/main/java/org/jabref/logic/exporter/TemplateExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpPdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/ExternalFilesContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/ConvertMSCCodesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImporterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/Parser.java`
- `jablib/src/main/java/org/jabref/logic/importer/ParserResult.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDlibPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidService.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationPreferences.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Language.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutHelper.java`
- `jablib/src/main/java/org/jabref/logic/layout/ParamLayoutFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/FileLink.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690FormatDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690NamesAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NotFoundFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Number.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Replace.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisMonth.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/WrapContent.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/WrapFileLinks.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/SSLPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/TrustStoreManager.java`
- `jablib/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java`
- `jablib/src/main/java/org/jabref/logic/preferences/CliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/DOIPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/JabRefCliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/LastFilesOpenedPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/OwnerPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/TimestampPreferences.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsList.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsPreferences.java`
- `jablib/src/main/java/org/jabref/logic/push/AbstractPushToApplication.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplication.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToEmacs.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToLyx.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToSublimeText.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToTeXstudio.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToTexShop.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToTexmaker.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToVim.java`
- `jablib/src/main/java/org/jabref/logic/remote/Protocol.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteMessage.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemotePreferences.java`
- `jablib/src/main/java/org/jabref/logic/remote/client/RemoteClient.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServer.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServerThread.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteMessageHandler.java`
- `jablib/src/main/java/org/jabref/logic/search/SearchPreferences.java`
- `jablib/src/main/java/org/jabref/logic/search/sqlbased/SqlBasedLibrarySearcher.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnection.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnectionProperties.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnectionPropertiesBuilder.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSProcessor.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSSynchronizer.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSType.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseConnection.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseConnectionProperties.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseNotSupportedException.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseSynchronizer.java`
- `jablib/src/main/java/org/jabref/logic/shared/event/ConnectionLostEvent.java`
- `jablib/src/main/java/org/jabref/logic/shared/event/UpdateRefusedEvent.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/InvalidDBMSConnectionPropertiesException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/NotASharedDatabaseException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/OfflineLockException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/SharedEntryNotPresentException.java`
- `jablib/src/main/java/org/jabref/logic/shared/prefs/SharedDatabasePreferences.java`
- `jablib/src/main/java/org/jabref/logic/shared/security/Password.java`
- `jablib/src/main/java/org/jabref/logic/util/BackgroundTask.java`
- `jablib/src/main/java/org/jabref/logic/util/CoarseChangeFilter.java`
- `jablib/src/main/java/org/jabref/logic/util/CurrentThreadTaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/util/DelayTaskThrottler.java`
- `jablib/src/main/java/org/jabref/logic/util/FileType.java`
- `jablib/src/main/java/org/jabref/logic/util/OptionalObjectProperty.java`
- `jablib/src/main/java/org/jabref/logic/util/ProgressCounter.java`
- `jablib/src/main/java/org/jabref/logic/util/StandardFileType.java`
- `jablib/src/main/java/org/jabref/logic/util/TaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/util/io/AutoLinkPreferences.java`
- `jablib/src/main/java/org/jabref/logic/util/io/BackupFileUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/CitationKeyBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/DatabaseFileLookup.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinders.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileHistory.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DocumentInformationExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DublinCoreExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpPreferences.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilReader.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilShared.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilWriter.java`
- `jablib/src/main/java/org/jabref/model/FieldChange.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabase.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseContext.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseMode.java`
- `jablib/src/main/java/org/jabref/model/database/CitationKeyListener.java`
- `jablib/src/main/java/org/jabref/model/database/KeyCollisionException.java`
- `jablib/src/main/java/org/jabref/model/database/event/BibDatabaseContextChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesAddedEvent.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryPreferences.java`
- `jablib/src/main/java/org/jabref/model/entry/SharedBibEntryData.java`
- `jablib/src/main/java/org/jabref/model/entry/event/EntriesEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/EntryChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldAddedOrRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/field/FieldProperty.java`
- `jablib/src/main/java/org/jabref/model/entry/field/InternalField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/SpecialFieldValue.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticDateGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/DateGroup.java`
- `jablib/src/main/java/org/jabref/model/metadata/SaveOrder.java`
- `jablib/src/main/java/org/jabref/model/metadata/event/MetaDataChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/search/SearchDisplayMode.java`
- `jablib/src/main/java/org/jabref/model/util/FileUpdateListener.java`
- `jablib/src/main/java/org/jabref/model/util/TreeCollector.java`
- `test-support/src/main/java/org/jabref/support/BibEntryAssert.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AutosaveUiManager.java` | `SaveDatabaseAction.java` | 15 | 1.00 |
| `JabRefFrame.java` | `LibraryPropertiesAction.java` | 10 | 1.00 |
| `JabRefFrame.java` | `SidePaneViewModel.java` | 9 | 1.00 |
| `GuiPushToEmacsSettings.java` | `GuiPushToVimSettings.java` | 8 | 1.00 |
| `DBMSConnectionProperties.java` | `DatabaseConnectionProperties.java` | 7 | 1.00 |

Evidence for the strongest edge (`AutosaveUiManager.java` – `SaveDatabaseAction.java`, up to 10 commits, newest first):

- `a77969d` 2026-09-06 — Add auto-commit, push & pull features for Git (#16651)
- `a20d356` 2026-08-06 — Add per library journal abbreviation type (LTWA) on save  (#15517)
- `5be9e29` 2025-04-16 — Fix "Reveal in file explorer" option (#12950)
- `c951dd7` 2023-09-04 — Refactored importAction and addTab methods, introduced MainToolbar and MainMenu (#10305)
- `6a71395` 2022-08-16 — AtomicFileOutputStream does not overwrite file if exception occurred during write (#9067)
- `3f9922e` 2020-03-15 — More refactorings
- `b364396` 2020-03-14 — Refactor SaveAction
- `382c4b2` 2019-11-28 — Add tests for "changed" flag (#5640)
- `67780cc` 2019-11-06 — Fix 5555 status popups (#5560)
- `7f970bc` 2019-08-25 — Remove Globals at SaveDatabaseAction

### Cluster 2 — 115 files, 47 packages, 2 modules

Packages: org.jabref.gui.preferences (7), org.jabref.gui.texparser (7), org.jabref.gui.entryeditor (5), org.jabref.gui.externalfiles (5), org.jabref.logic.bst (5), org.jabref.logic.citationstyle (4), org.jabref.gui.commonfxcontrols (3), org.jabref.gui.groups (3), org.jabref.gui.libraryproperties (3), org.jabref.gui.libraryproperties.constants (3), org.jabref.gui.mergeentries.multiwaymerge (3), org.jabref.gui.newentry (3), org.jabref.gui.preview (3), org.jabref.gui.util (3), org.jabref.logic.citationkeypattern (3), org.jabref.logic.preview (3), org.jabref.model.texparser (3), org.jabref.gui.libraryproperties.contentselectors (2), org.jabref.gui.libraryproperties.general (2), org.jabref.gui.libraryproperties.keypattern (2), org.jabref.gui.preferences.citationkeypattern (2), org.jabref.gui.preferences.entryeditor (2), org.jabref.gui.preferences.external (2), org.jabref.gui.preferences.general (2), org.jabref.gui.preferences.groups (2), org.jabref.gui.preferences.nameformatter (2), org.jabref.gui.preferences.network (2), org.jabref.gui.preferences.preview (2), org.jabref.gui.preferences.xmp (2), org.jabref.gui.welcome.quicksettings.viewmodel (2), org.jabref.logic.bst.util (2), org.jabref.logic.push (2), org.jabref.logic.texparser (2), org.jabref.logic.util (2), org.jabref.logic.util.io (2), org.jabref.model.entry (2), org.jabref.gui (1), org.jabref.gui.edit (1), org.jabref.gui.importer (1), org.jabref.gui.integrity (1), org.jabref.gui.libraryproperties.saving (1), org.jabref.gui.preferences.table (1), org.jabref.gui.welcome (1), org.jabref.logic.externalfiles (1), org.jabref.logic.importer.plaincitation (1), org.jabref.logic.openoffice.bst (1), org.jabref.migrations (1)

Modules: jabgui (82), jablib (33)

Files:

- `jabgui/src/main/java/org/jabref/gui/WorkspacePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelItemModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyToPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AllFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabFactory.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportHandler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/PdfMergeDialog.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesCrawler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedPDFFileFilter.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/importer/BookCoverFetcher.java`
- `jabgui/src/main/java/org/jabref/gui/integrity/IntegrityCheckDialog.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/AbstractPropertiesTabView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsItemModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/contentselectors/ContentSelectorView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/contentselectors/ContentSelectorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/general/GeneralPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/general/GeneralPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/keypattern/KeyPatternPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/keypattern/KeyPatternPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/saving/SavingPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/DiffHighlightingEllipsingTextFlow.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/AbstractPreferenceTabView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/GuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/JabRefGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferenceTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preview/CopyCitationAction.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewViewer.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/CitationsDisplay.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexAction.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ReferenceViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/FieldsUtil.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTextFieldTableCellVisualizationFactory.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/DonationPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/PushApplicationDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/ThemeDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/migrations/PreferencesMigrations.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstEntry.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstFunctions.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVM.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVMContext.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVMVisitor.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstCaseChanger.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstWidthCalculator.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGeneratorTestUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPattern.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPatternPreferences.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLAdapter.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleCache.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleGenerator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleOutputFormat.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/LinkedFileHandler.java`
- `jablib/src/main/java/org/jabref/logic/importer/plaincitation/LlmPlainCitationParser.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/BSTFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/preview/BstPreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/CitationStylePreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/PreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationDetector.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationPreferences.java`
- `jablib/src/main/java/org/jabref/logic/texparser/DefaultLatexParser.java`
- `jablib/src/main/java/org/jabref/logic/texparser/TexBibEntriesResolver.java`
- `jablib/src/main/java/org/jabref/logic/util/Directories.java`
- `jablib/src/main/java/org/jabref/logic/util/URLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameUniqueness.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileUtil.java`
- `jablib/src/main/java/org/jabref/model/entry/BibtexString.java`
- `jablib/src/main/java/org/jabref/model/entry/LinkedFile.java`
- `jablib/src/main/java/org/jabref/model/texparser/Citation.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexBibEntriesResolverResult.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexParserResult.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GroupsTab.java` | `GroupsTabViewModel.java` | 10 | 1.00 |
| `NameFormatterTab.java` | `NameFormatterTabViewModel.java` | 6 | 1.00 |
| `EntryEditorTabModel.java` | `JabRefGuiPreferences.java` | 5 | 1.00 |
| `AbstractPreferenceTabView.java` | `PreviewTab.java` | 5 | 1.00 |
| `GuiPreferences.java` | `JabRefGuiPreferences.java` | 5 | 1.00 |

Evidence for the strongest edge (`GroupsTab.java` – `GroupsTabViewModel.java`, up to 10 commits, newest first):

- `2f3a00e` 2026-08-16 — Create new group from selected entries (#16588)
- `ef5eb77` 2023-02-28 — persist selected hierarchical context in groups preferences
- `8da0a3a` 2023-02-26 — add default hierarchical context preference option
- `82db990` 2022-12-06 — Extracted KeywordSeparator from GroupsPreferences and created new PreferencesTab EntryTab
- `ba5beb2` 2021-12-26 — Observable preferences I (Internal [formerly Version], Groups, Xmp, AutoComplete) (#8336)
- `5a11412` 2021-02-01 — Grand unified preferences dialog (#7384)
- `5850341` 2020-09-01 — Refactor of remaining preference tabs to PreferencesService (#6836)
- `efc69be` 2020-04-05 — Add disable/enable calculation of items in group (#6233)
- `a01ea20` 2019-09-17 — Conversion of preferences/exportsorting, import, maintable and entryeditor to mvvm (#5315)
- `f51ba49` 2019-08-18 — Conversion of preferencesDialog/advancedTab, networkTab and groupsTab to mvvm (#5141)

### Cluster 1 — 169 files, 40 packages, 2 modules

Packages: org.jabref.logic.layout.format (41), org.jabref.logic.importer.fileformat (18), org.jabref.model.groups (14), org.jabref.logic.msbib (7), org.jabref.logic.importer.fileformat.pdf (6), org.jabref.logic.journals (6), org.jabref.model.entry (6), org.jabref.logic.util.strings (5), org.jabref.model.entry.types (5), org.jabref.gui.preferences.journals (4), org.jabref.logic.integrity (4), org.jabref.logic.layout (4), org.jabref.logic.util (4), org.jabref.logic.util.io (4), org.jabref.logic.bst.util (3), org.jabref.logic.importer (3), org.jabref.logic.importer.util (3), org.jabref.model.metadata (3), org.jabref.model.search.matchers (3), org.jabref.gui.groups (2), org.jabref.logic.bibtex (2), org.jabref.logic.citationkeypattern (2), org.jabref.logic.exporter (2), org.jabref.model.database (2), org.jabref.gui.entryeditor (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.maintable (1), org.jabref.gui.util (1), org.jabref.logic.bibtex.comparator (1), org.jabref.logic.database (1), org.jabref.logic.formatter (1), org.jabref.logic.formatter.casechanger (1), org.jabref.logic.importer.fetcher (1), org.jabref.logic.l10n (1), org.jabref.logic.net (1), org.jabref.logic.openoffice.style (1), org.jabref.logic.remote (1), org.jabref.migrations (1), org.jabref.model (1), org.jabref.model.strings (1)

Modules: jablib (158), jabgui (11)

Files:

- `jabgui/src/main/java/org/jabref/gui/entryeditor/RelatedArticlesTab.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/URLUtil.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDescriptions.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ExtractReferencesAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationsFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/BindingsHelper.java`
- `jabgui/src/main/java/org/jabref/migrations/CustomEntryTypePreferenceMigration.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FileFieldWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/MetaDataDiff.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstNameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstPurifier.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstTextPrefixer.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/AbstractCitationKeyPatterns.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGenerator.java`
- `jablib/src/main/java/org/jabref/logic/database/DuplicateCheck.java`
- `jablib/src/main/java/org/jabref/logic/exporter/GroupSerializer.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MetaDataSerializer.java`
- `jablib/src/main/java/org/jabref/logic/formatter/Formatters.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/Title.java`
- `jablib/src/main/java/org/jabref/logic/importer/AuthorListParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/Importer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDLibFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BiblioscapeImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CffImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CopacImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CustomImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteXmlImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/InspecImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/IsiImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlineImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlinePlainImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ModsImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MrDLibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MsBibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/OvidImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ReferImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RepecNepImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RisImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfEmbeddedBibFileImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfMergeMetadataImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfXmpImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/RuleBasedBibliographyPdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/FileFieldParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GroupsParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/MetaDataParser.java`
- `jablib/src/main/java/org/jabref/logic/integrity/CitationKeyDuplicationChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/FieldCheckers.java`
- `jablib/src/main/java/org/jabref/logic/integrity/NoBibtexFieldChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ValidCitationKeyChecker.java`
- `jablib/src/main/java/org/jabref/logic/journals/Abbreviation.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationParser.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationType.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationWriter.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationLoader.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationRepository.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Localization.java`
- `jablib/src/main/java/org/jabref/logic/layout/AbstractParamLayoutFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/Layout.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutEntry.java`
- `jablib/src/main/java/org/jabref/logic/layout/StringInt.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsCommaReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FF.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FFAbbr.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorNatBib.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorOrgSci.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Authors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CompositeFormat.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateBibORDFAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateDocBook4Editors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CurrentDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DocBookAuthorFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/GetOpenOfficeType.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLParagraphs.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/IfPlural.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/JournalAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/LatexToUnicodeFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RTFChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBrackets.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBracketsAddComma.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveLatexCommandsFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveTilde.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisKeywords.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToLowerCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToUpperCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/XMLChars.java`
- `jablib/src/main/java/org/jabref/logic/msbib/BibTeXConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibDatabase.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibMapping.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MsBibAuthor.java`
- `jablib/src/main/java/org/jabref/logic/msbib/PageNumbers.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyRegisterer.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOPreFormatter.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/BuildInfo.java`
- `jablib/src/main/java/org/jabref/logic/util/MetadataSerializationConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/util/TestEntry.java`
- `jablib/src/main/java/org/jabref/logic/util/UpdateField.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameCleaner.java`
- `jablib/src/main/java/org/jabref/logic/util/io/RegExpBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/XMLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/HTMLUnicodeConversionMaps.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/QuotedStringTokenizer.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/RtfCharMap.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/StringUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/XmlCharsMap.java`
- `jablib/src/main/java/org/jabref/model/TreeNode.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseModeDetection.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabases.java`
- `jablib/src/main/java/org/jabref/model/entry/Author.java`
- `jablib/src/main/java/org/jabref/model/entry/AuthorList.java`
- `jablib/src/main/java/org/jabref/model/entry/CanonicalBibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryConverter.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryLinkList.java`
- `jablib/src/main/java/org/jabref/model/entry/IdGenerator.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BiblatexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BibtexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/EntryType.java`
- `jablib/src/main/java/org/jabref/model/entry/types/IEEETranEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/StandardEntryType.java`
- `jablib/src/main/java/org/jabref/model/groups/AbstractGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AllEntriesGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticPersonsGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/ExplicitGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupEntryChanger.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupHierarchyType.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupTreeNode.java`
- `jablib/src/main/java/org/jabref/model/groups/KeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/LastNameGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/RegexKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/SearchGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/TexGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/WordKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelector.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelectors.java`
- `jablib/src/main/java/org/jabref/model/metadata/MetaData.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/AndMatcher.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/MatcherSet.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/OrMatcher.java`
- `jablib/src/main/java/org/jabref/model/strings/UnicodeToReadableCharMap.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CreateDocBook4Editors.java` | `DocBookAuthorFormatter.java` | 10 | 1.00 |
| `AuthorLF_FF.java` | `AuthorLF_FFAbbr.java` | 8 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorFirstLastCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstAbbrCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstCommas.java` | 7 | 1.00 |

Evidence for the strongest edge (`CreateDocBook4Editors.java` – `DocBookAuthorFormatter.java`, up to 10 commits, newest first):

- `9213e3c` 2018-11-25 — Add docbook 5 support (#4319)
- `ae4d4da` 2016-03-26 — Rename getAuthors to parse
- `f566b8d` 2016-03-26 — Rename some methods and add tests
- `3c8a68b` 2016-03-08 — Fixed some messed up formatting leading to a few split tests
- `122ece4` 2015-08-19 — Move AuthorList into model.entry
- `c076c80` 2015-08-17 — Move AuthorList to logic package
- `2ebb2a1` 2015-07-17 — Remove old SVN keyword fields and obsolete comments
- `ad87162` 2009-11-06 — Reworked author and editor handling in Docbook export. Added Docbook XML header.
- `cdcb374` 2007-08-19 — Second batch of fixing the warnings and generifying JabRef. Another 600 warnings are done.
- `5dd9ba3` 2005-01-27 — Fixed output of book editors, and added output of URL and DOI fields

### Cluster 4 — 73 files, 33 packages, 3 modules

Packages: org.jabref.gui.walkthrough (6), org.jabref.gui.welcome.quicksettings (6), org.jabref.gui.theme (5), org.jabref.gui.entryeditor.citationrelationtab (4), org.jabref.languageserver (4), org.jabref.gui.externalfiles (3), org.jabref.gui.walkthrough.declarative (3), org.jabref.gui.welcome.components (3), org.jabref.languageserver.util (3), org.jabref.logic.ai.embedding (3), org.jabref.logic.citation.repository (3), org.jabref.gui.ai.chat (2), org.jabref.gui.fieldeditors (2), org.jabref.gui.preferences.ai (2), org.jabref.gui.walkthrough.effects (2), org.jabref.logic.ai.models (2), org.jabref.logic.ai.preferences (2), org.jabref.logic.importer.fetcher.citation (2), org.jabref.model.entry (2), org.jabref.gui (1), org.jabref.gui.ai (1), org.jabref.gui.walkthrough.utils (1), org.jabref.gui.welcome (1), org.jabref.languageserver.controller (1), org.jabref.logic.ai (1), org.jabref.logic.ai.chatting (1), org.jabref.logic.ai.ingestion.repositories (1), org.jabref.logic.citation (1), org.jabref.logic.importer.fetcher.citation.crossref (1), org.jabref.logic.importer.fetcher.citation.opencitations (1), org.jabref.logic.importer.fetcher.citation.semanticscholar (1), org.jabref.model (1), org.jabref.model.ai.chatting (1)

Modules: jabgui (42), jablib (23), jabls (8)

Files:

- `jabgui/src/main/java/org/jabref/gui/JabRefGUI.java`
- `jabgui/src/main/java/org/jabref/gui/ai/AiPrivacyNoticeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/ai/chat/AiChatStatusViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/ai/chat/AiChatViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/BibEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationItem.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationsRelationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileSelectionPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportResultsPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesWizard.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ai/AiTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ai/AiTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheet.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetDataUrl.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetFile.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetResource.java`
- `jabgui/src/main/java/org/jabref/gui/theme/ThemeManager.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/Walkthrough.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughAction.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughOverlay.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughRenderer.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WindowOverlay.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/NodeResolver.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/Trigger.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/WindowResolver.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/effects/FullScreenDarken.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/effects/Spotlight.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/utils/WalkthroughReverter.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/WelcomeTab.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/DonationProvider.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/QuickSettings.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/Walkthroughs.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/EntryTableConfigurationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/LargeLibraryOptimizationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/MainFileDirectoryDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/OnlineServicesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/PushApplicationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/ThemeDialog.java`
- `jablib/src/main/java/org/jabref/logic/ai/AiService.java`
- `jablib/src/main/java/org/jabref/logic/ai/chatting/JvmOpenAiChatLanguageModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/AsyncEmbeddingModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/DeepJavaEmbeddingModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/EmbeddingModelCache.java`
- `jablib/src/main/java/org/jabref/logic/ai/ingestion/repositories/MVStoreIngestedDocumentsRepository.java`
- `jablib/src/main/java/org/jabref/logic/ai/models/AiModelService.java`
- `jablib/src/main/java/org/jabref/logic/ai/models/OpenAiCompatibleModelProvider.java`
- `jablib/src/main/java/org/jabref/logic/ai/preferences/AiDefaultExpertSettings.java`
- `jablib/src/main/java/org/jabref/logic/ai/preferences/AiPreferences.java`
- `jablib/src/main/java/org/jabref/logic/citation/SearchCitationsRelationsService.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepository.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepositoryShell.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/MVStoreBibEntryRelationRepository.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcherType.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/crossref/CrossRefCitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/opencitations/OpenCitationsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/semanticscholar/SemanticScholarCitationFetcher.java`
- `jablib/src/main/java/org/jabref/model/ChainNode.java`
- `jablib/src/main/java/org/jabref/model/ai/chatting/ErrorMessage.java`
- `jablib/src/main/java/org/jabref/model/entry/Keyword.java`
- `jablib/src/main/java/org/jabref/model/entry/KeywordList.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexTextDocumentService.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexWorkspaceService.java`
- `jabls/src/main/java/org/jabref/languageserver/LspClientHandler.java`
- `jabls/src/main/java/org/jabref/languageserver/LspLauncher.java`
- `jabls/src/main/java/org/jabref/languageserver/controller/LanguageServerController.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspConsistencyCheck.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticBuilder.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticHandler.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JabRefGUI.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `JabRefGUI.java` | `LanguageServerController.java` | 4 | 1.00 |
| `CitationRelationsTab.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `FileSelectionPage.java` | `ImportResultsPage.java` | 4 | 1.00 |
| `WelcomeTab.java` | `Walkthroughs.java` | 4 | 1.00 |

Evidence for the strongest edge (`JabRefGUI.java` – `BibEntryCitationsAndReferencesRepositoryShell.java`, up to 10 commits, newest first):

- `a2502f2` 2026-03-04 — Fix threading issues in citations relations tab (#15233)
- `9e9e0e4` 2026-02-04 — Add OpenAlex-based Citation Fetcher (#15023)
- `d5f1f63` 2025-12-28 — feat(citation): add support for selecting citation fetcher in Citatio… (#14652)
- `3135c1a` 2025-06-07 — Fix issue #11189 - Implement a caching solution with local storage for citation relations  (#11845)

### Cluster 5 — 57 files, 21 packages, 8 modules

Packages: org.jabref.toolkit.commands (16), (default) (8), org.jabref.http.server.resources (6), org.jabref.http.server.cayw.format (4), org.jabref.http.server.cayw.gui (3), org.jabref.http.server.command (3), org.jabref.http.manager (2), org.jabref.http.server.cayw (2), org.jabref.gui.consistency (1), org.jabref.gui.importer (1), org.jabref.http (1), org.jabref.http.dto (1), org.jabref.http.server (1), org.jabref.http.server.cli (1), org.jabref.http.server.services (1), org.jabref.languageserver (1), org.jabref.logic.git.io (1), org.jabref.logic.quality.consistency (1), org.jabref.model.search (1), org.jabref.toolkit (1), org.jabref.toolkit.converter (1)

Modules: jabsrv (25), jabkit (19), jablib (4), jabgui (3), jabls (2), jabsrv-cli (2), jabls-cli (1), test-support (1)

Files:

- `jabgui/src/main/java/module-info.java`
- `jabgui/src/main/java/org/jabref/gui/consistency/ConsistencyCheckAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesDialog.java`
- `jabkit/src/main/java/module-info.java`
- `jabkit/src/main/java/org/jabref/toolkit/JabKitLauncher.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Check.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/CheckConsistency.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/CheckIntegrity.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Convert.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/DoiToBibtex.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Fetch.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GenerateBibFromAux.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GenerateCitationKeys.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GetCitedWorks.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GetCitingWorks.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/JabKit.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Pdf.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/PdfUpdate.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Preferences.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Pseudonymize.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Search.java`
- `jabkit/src/main/java/org/jabref/toolkit/converter/CygWinPathConverter.java`
- `jablib/src/main/java/module-info.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitFileWriter.java`
- `jablib/src/main/java/org/jabref/logic/quality/consistency/BibliographyConsistencyCheck.java`
- `jablib/src/main/java/org/jabref/model/search/LinkedFilesConstants.java`
- `jabls-cli/src/main/java/module-info.java`
- `jabls/src/main/java/module-info.java`
- `jabls/src/main/java/org/jabref/languageserver/ExtensionSettings.java`
- `jabsrv-cli/src/main/java/module-info.java`
- `jabsrv-cli/src/main/java/org/jabref/http/server/cli/ServerCli.java`
- `jabsrv/src/main/java/module-info.java`
- `jabsrv/src/main/java/org/jabref/http/JabRefSrvStateManager.java`
- `jabsrv/src/main/java/org/jabref/http/dto/GlobalExceptionMapper.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerManager.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerThread.java`
- `jabsrv/src/main/java/org/jabref/http/server/Server.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/CAYWQueryParams.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/CAYWResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/format/BibLatexFormatter.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/format/CAYWFormatter.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/format/FormatterService.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/format/SimpleJsonFormatter.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/gui/CAYWEntry.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/gui/SearchDialog.java`
- `jabsrv/src/main/java/org/jabref/http/server/cayw/gui/SelectedItemsContainer.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/Command.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/CommandResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/SelectEntriesCommand.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/CitationsResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntriesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibrariesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibraryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/MapResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/services/ServerUtils.java`
- `test-support/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `jabsrv-cli/src/main/java/module-info.java` | `jabsrv/src/main/java/module-info.java` | 11 | 1.00 |
| `Convert.java` | `GenerateBibFromAux.java` | 9 | 1.00 |
| `JabKitLauncher.java` | `Fetch.java` | 6 | 1.00 |
| `CheckConsistency.java` | `Fetch.java` | 6 | 1.00 |
| `CheckIntegrity.java` | `Fetch.java` | 6 | 1.00 |

Evidence for the strongest edge (`jabsrv-cli/src/main/java/module-info.java` – `jabsrv/src/main/java/module-info.java`, up to 10 commits, newest first):

- `655964d` 2026-09-03 — Document package- and module-level Javadoc expectations in AGENTS.md (#16836)
- `30df54f` 2026-03-03 — Reduce complexity in dependencies setup (restore) (#15194)
- `eb08ca0` 2026-02-22 — Revert "Reduce complexity in dependencies setup (#15169)" (#15191)
- `10196d5` 2026-02-22 — Reduce complexity in dependencies setup (#15169)
- `96e9d29` 2025-11-16 — Chore(deps): Bump org.glassfish.jersey.core:jersey-server from 3.1.11 to 4.0.0 in /versions (#14305)
- `71c230f` 2025-07-09 — Revert module name changes for remaining 'unnamed' Jars (#13515)
- `0848124` 2025-07-09 — fix: revert Java module names to restore Status Log compatibility in JabRef 5.15 (#13511)
- `9656cf1` 2025-07-04 — Add http sever to GUI (#13457)
- `2c8615e` 2025-07-01 — Switch the Gradle build to org.gradlex.java-module plugins (#13401)
- `2c511c2` 2025-06-18 — Remove XJC plugin (#13376)

### Cluster 8 — 41 files, 17 packages, 2 modules

Packages: org.jabref.gui.git (9), org.jabref.gui.entryeditor.fileannotationtab (4), org.jabref.gui.fieldeditors.contextmenu (3), org.jabref.gui.keyboard (3), org.jabref.gui.preferences.keybindings (3), org.jabref.logic.pdf (3), org.jabref.gui.actions (2), org.jabref.gui.frame (2), org.jabref.gui.preferences.keybindings.presets (2), org.jabref.logic.git (2), org.jabref.model.pdf (2), org.jabref.gui.errorconsole (1), org.jabref.gui.util (1), org.jabref.logic.git.io (1), org.jabref.logic.git.preferences (1), org.jabref.logic.git.status (1), org.jabref.logic.git.util (1)

Modules: jabgui (30), jablib (11)

Files:

- `jabgui/src/main/java/org/jabref/gui/actions/ActionHelper.java`
- `jabgui/src/main/java/org/jabref/gui/actions/StandardActions.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationTabView.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/errorconsole/ErrorConsoleView.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextMenuFactory.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/SingleSelectionMenuBuilder.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainToolBar.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPullAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPushAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitStatusViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBinding.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingCategory.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingRepository.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/BashKeyBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/NewEntryBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/util/URLs.java`
- `jablib/src/main/java/org/jabref/logic/git/GitHandler.java`
- `jablib/src/main/java/org/jabref/logic/git/GitSyncService.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitRevisionLocator.java`
- `jablib/src/main/java/org/jabref/logic/git/preferences/GitPreferences.java`
- `jablib/src/main/java/org/jabref/logic/git/status/GitStatusChecker.java`
- `jablib/src/main/java/org/jabref/logic/git/util/GitInitService.java`
- `jablib/src/main/java/org/jabref/logic/pdf/AnnotationImporter.java`
- `jablib/src/main/java/org/jabref/logic/pdf/EntryAnnotationImporter.java`
- `jablib/src/main/java/org/jabref/logic/pdf/PdfAnnotationImporter.java`
- `jablib/src/main/java/org/jabref/model/pdf/FileAnnotation.java`
- `jablib/src/main/java/org/jabref/model/pdf/FileAnnotationType.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GitHandler.java` | `GitSyncService.java` | 7 | 1.00 |
| `KeyBinding.java` | `NewEntryBindingPreset.java` | 6 | 1.00 |
| `GitHandler.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `GitSyncService.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `StandardActions.java` | `ContextAction.java` | 4 | 1.00 |

Evidence for the strongest edge (`GitHandler.java` – `GitSyncService.java`, up to 10 commits, newest first):

- `76baea0` 2026-09-06 — Gracefully handle JGit errors (#16882)
- `f7fb890` 2026-09-02 — Refactor/rewrite a bit requirements (#16798)
- `e7660a6` 2026-07-26 — Improve GitHub sharing and push handling (#16367)
- `5a91a7f` 2025-10-16 — Fix external file modification warnings during Git merge  (#13946)
- `0221118` 2025-08-29 — feat: implement Git pull & push with semantic merge support (#13744)
- `592fd18` 2025-08-07 — Fix: Decouple GitHandler creation via registry and extend semantic conflict detection (#13666)
- `bfa37f0` 2025-08-01 — Implement logic orchestration for Git Pull/Push operations (#13518)

### Cluster 3 — 106 files, 14 packages, 2 modules

Packages: org.jabref.logic.importer.fetcher (40), org.jabref.logic.integrity (21), org.jabref.logic.importer (15), org.jabref.model.entry.identifier (8), org.jabref.logic.importer.fetcher.transformers (7), org.jabref.gui.documentviewer (3), org.jabref.logic.importer.fetcher.isbntobibtex (2), org.jabref.logic.importer.fileformat (2), org.jabref.logic.importer.util (2), org.jabref.logic.layout.format (2), org.jabref.gui.clipboard (1), org.jabref.gui.edit (1), org.jabref.logic.cleanup (1), org.jabref.logic.net (1)

Modules: jablib (101), jabgui (5)

Files:

- `jabgui/src/main/java/org/jabref/gui/clipboard/ClipBoardManager.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/DocumentViewerView.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/DocumentViewerViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/ShowDocumentViewerAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyDoiUrlAction.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/DoiCleanup.java`
- `jablib/src/main/java/org/jabref/logic/importer/CompositeIdFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/EntryBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FetcherResult.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/QueryParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACMPortalFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACS.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AbstractIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ApsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ArXivFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AstrophysicsDataSystem.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BiodiversityLibrary.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BvbFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ComplexSearchQuery.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CompositeSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CrossRef.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CustomizableKeyFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DBLPFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DOAJFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DiVA.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiResolution.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GoogleScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GvkFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IEEE.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/INSPIREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ISIDOREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IacrEprintFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/JstorFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/LibraryOfCongress.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MathSciNet.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MedlineFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/Medra.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/OpenAccessDoi.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ResearchGate.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/RfcFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ScienceDirect.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SemanticScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureFullTextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureWebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TitleFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TrustLevel.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ZbMATH.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/EbookDeIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/IsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/AbstractQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/CollectionOfComputerScienceBibliographiesQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/GVKQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/IEEEQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/JstorQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/SpringerQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/ZbMathQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MarcXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/PicaXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/JsonReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/ShortDOIService.java`
- `jablib/src/main/java/org/jabref/logic/integrity/AbbreviationChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/BooktitleChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/BracketChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/CitationKeyChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/DoiValidityChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/EditionChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/FileChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/HTMLCharacterChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/HowPublishedChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ISBNChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ISSNChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/IntegrityCheck.java`
- `jablib/src/main/java/org/jabref/logic/integrity/IntegrityMessage.java`
- `jablib/src/main/java/org/jabref/logic/integrity/JournalInAbbreviationListChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/MonthChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/NoteChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/PagesChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/PersonNamesChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/TitleChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/UrlChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/YearChecker.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOICheck.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOIStrip.java`
- `jablib/src/main/java/org/jabref/logic/net/URLDownload.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ARK.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ArXivIdentifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/DOI.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISBN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISSN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/IacrEprint.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/Identifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/MathSciNetId.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `HowPublishedChecker.java` | `NoteChecker.java` | 5 | 1.00 |
| `BooktitleChecker.java` | `BracketChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `FileChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `ISSNChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `PagesChecker.java` | 4 | 1.00 |

Evidence for the strongest edge (`HowPublishedChecker.java` – `NoteChecker.java`, up to 10 commits, newest first):

- `f1746d2` 2026-04-22 — Fix npe in Bracket Checker (#15616)
- `f0b90ba` 2017-08-10 — Add validation to entry editor (#3090)
- `8f3f526` 2017-04-07 — Only check capitalization of note and howpublished fields if they start with a word character
- `8bdc55c` 2017-02-15 — Correct naming of biblatex (#2549)
- `f572318` 2017-01-15 — Group all checker which only check the value of one field (#2437)

### Cluster 7 — 51 files, 14 packages, 3 modules

Packages: org.jabref.logic.openoffice.style (9), org.jabref.gui.openoffice (8), org.jabref.logic.openoffice.oocsltext (7), org.jabref.logic.citationstyle (4), org.jabref.logic.openoffice.action (4), org.jabref.logic.openoffice.backend (4), org.jabref.logic.openoffice (3), org.jabref.logic.openoffice.frontend (3), org.jabref.model.openoffice.style (3), org.jabref.gui.preferences.openoffice (2), (default) (1), org.jabref.logic.openoffice.bst (1), org.jabref.model.openoffice (1), org.jabref.model.openoffice.backend (1)

Modules: jablib (40), jabgui (10), build-support (1)

Files:

- `build-support/src/main/java/CitationStyleCatalogGenerator.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/CSLStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/DetectOpenOfficeInstallation.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/JStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBase.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBaseConnect.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OpenOfficePanel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTabViewModel.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyle.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefLocaleProvider.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficeFileSearch.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficePreferences.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/ReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditInsert.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditMerge.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditSeparate.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/Update.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/Backend52.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/JStyleReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeManagerReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/PandocLatexConverter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/OOFrontend.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateCitationMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLUpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/BstStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyle.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetNumericCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOFormatBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessAuthorYearMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessCitationKeyMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessNumericMarkers.java`
- `jablib/src/main/java/org/jabref/model/openoffice/CitationEntry.java`
- `jablib/src/main/java/org/jabref/model/openoffice/backend/NamedRangeManager.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroup.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroups.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationType.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JStyleSelectViewModel.java` | `StyleSelectDialogViewModel.java` | 6 | 1.00 |
| `EditInsert.java` | `EditSeparate.java` | 5 | 1.00 |
| `EditMerge.java` | `EditSeparate.java` | 5 | 1.00 |
| `JStyle.java` | `JStyleGetNumericCitationMarker.java` | 5 | 1.00 |
| `OOFormatBibliography.java` | `OOProcessAuthorYearMarkers.java` | 5 | 1.00 |

Evidence for the strongest edge (`JStyleSelectViewModel.java` – `StyleSelectDialogViewModel.java`, up to 10 commits, newest first):

- `8a1ec40` 2026-07-25 — Support BST styles in LibreOffice (#16315)
- `f50e3e3` 2025-04-18 — CSL4LibreOffice - G [Custom CSL Styles, build-time loading] (#12951)
- `771c4cd` 2024-07-25 — CSL4LibreOffice - B [GSoC '24] (#11521)
- `ebed223` 2021-06-03 — step0 : start model/openoffice, logic/openoffice/style (#7772)
- `d223bdd` 2020-04-05 — Fix storing of custom jstyles (#6242)
- `18aba35` 2019-01-25 —  Convert OO/LO SidePanel to javafx (#4341)

### Cluster 6 — 52 files, 12 packages, 2 modules

Packages: org.jabref.gui.fieldeditors (25), org.jabref.gui.autocompleter (7), org.jabref.gui.fieldeditors.identifier (5), org.jabref.gui.fieldeditors.optioneditors (3), org.jabref.gui.fieldeditors.optioneditors.mapbased (3), org.jabref.gui.fieldeditors.contextmenu (2), org.jabref.gui.linkedfile (2), org.jabref.gui.util (1), org.jabref.gui.util.component (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.util (1), org.jabref.model.entry (1)

Modules: jabgui (49), jablib (3)

Files:

- `jabgui/src/main/java/org/jabref/gui/autocompleter/BibEntrySuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/ContentSelectorSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/JournalsSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/PersonNameSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/StringSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProviders.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/AbstractEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationCountEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextArea.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextField.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/ISSNEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalInfoOptInDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/MarkdownEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/DefaultMenu.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/EditorMenus.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/BaseIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/DoiIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/EprintIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/ISBNIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/IdentifierEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/MapBasedEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/PatentTypeEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/YesNoEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileFromURLAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/DeleteFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelListCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/component/TemporalAccessorPicker.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/CleanupUrlFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/IdentifierParser.java`
- `jablib/src/main/java/org/jabref/model/entry/Date.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `FieldEditors.java` | `MonthEditorViewModel.java` | 6 | 1.00 |
| `ContentSelectorSuggestionProvider.java` | `FieldEditors.java` | 5 | 1.00 |
| `FieldEditors.java` | `OwnerEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `OptionEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `PatentTypeEditorViewModel.java` | 5 | 1.00 |

Evidence for the strongest edge (`FieldEditors.java` – `MonthEditorViewModel.java`, up to 10 commits, newest first):

- `d9b38ce` 2024-12-02 — Added support for (biblatex) `langid` to be an optional field in entry editor (#12071)
- `e0333c4` 2024-06-13 — Fix content selector present for custom entry type (#11371)
- `5217bad` 2020-04-19 — Remove cache of auto completion results (#6310)
- `f0b90ba` 2017-08-10 — Add validation to entry editor (#3090)
- `b9bd27c` 2017-07-11 — [WIP] Complete rework of the auto completion (#2965)
- `4543592` 2017-05-06 — Reimplement option field editors in JavaFX (#2824)

### Cluster 9 — 28 files, 10 packages, 1 module

Packages: org.jabref.gui.mergeentries.threewaymerge (7), org.jabref.gui.mergeentries.threewaymerge.cell (6), org.jabref.gui.mergeentries.threewaymerge.fieldsmerger (6), org.jabref.gui.mergeentries.threewaymerge.diffhighlighter (3), org.jabref.gui.collab (1), org.jabref.gui.collab.entrychange (1), org.jabref.gui.duplicationFinder (1), org.jabref.gui.mergeentries (1), org.jabref.gui.mergeentries.threewaymerge.cell.sidebuttons (1), org.jabref.gui.mergeentries.threewaymerge.toolbar (1)

Modules: jabgui (28)

Files:

- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeResolverFactory.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryChangeResolver.java`
- `jabgui/src/main/java/org/jabref/gui/duplicationFinder/DuplicateResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/FetchAndMergeEntry.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/FieldRowView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/FieldRowViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/MergeEntriesAction.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/MergeEntriesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeHeaderView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/FieldNameCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/FieldValueCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/HeaderCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/MergedFieldCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/OpenExternalLinkAction.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/ThreeWayMergeCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/sidebuttons/ToggleMergeUnmergeButton.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/DiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/SplitDiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/UnifiedDiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/CommentMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FieldMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FieldMergerFactory.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FileMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/GroupMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/KeywordMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/toolbar/ThreeWayMergeToolbar.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DatabaseChangeResolverFactory.java` | `EntryChangeResolver.java` | 6 | 1.00 |
| `ThreeWayMergeView.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `FieldValueCell.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `HeaderCell.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `DuplicateResolverDialog.java` | `ThreeWayMergeHeaderView.java` | 3 | 1.00 |

Evidence for the strongest edge (`DatabaseChangeResolverFactory.java` – `EntryChangeResolver.java`, up to 10 commits, newest first):

- `998ac47` 2023-03-26 — Update preference; remove guiPreference redundant objects
- `d0cd71e` 2023-03-26 — Refactor out PlainTextOrDiff Enum(?); Use guiPreferences; add mergePlainTextOrDiff to JabrefPreferences
- `c43caa7` 2022-12-11 — Fixed tests, reduced calls to preferencesService and applied minor ide suggestions
- `e86839a` 2022-12-05 — Allow users to review backup changes before restoring them or merge them selectively (#9311)
- `4fd60d2` 2022-11-28 — Fix for issue 9053: highlights wrong characters (#9289)
- `05ff677` 2022-08-30 — [WIP][GSOC22] - C - Improve the external changes resolver dialog (#9021)

### Cluster 13 — 14 files, 10 packages, 1 module

Packages: org.jabref.gui.collab.entrychange (3), org.jabref.gui.collab (2), org.jabref.gui.git (2), org.jabref.gui.collab.groupchange (1), org.jabref.gui.collab.metedatachange (1), org.jabref.gui.collab.preamblechange (1), org.jabref.gui.collab.stringadd (1), org.jabref.gui.collab.stringchange (1), org.jabref.gui.collab.stringdelete (1), org.jabref.gui.collab.stringrename (1)

Modules: jabgui (14)

Files:

- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeDetailsViewFactory.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryWithPreviewAndSourceDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/PreviewWithSourceTab.java`
- `jabgui/src/main/java/org/jabref/gui/collab/groupchange/GroupChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/metedatachange/MetadataChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/preamblechange/PreambleChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringadd/BibTexStringAddDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringchange/BibTexStringChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringdelete/BibTexStringDeleteDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringrename/BibTexStringRenameDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitDiffDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitEntryChangeDetailsView.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DatabaseChangeDetailsView.java` | `PreambleChangeDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringAddDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringChangeDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringDeleteDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringRenameDetailsView.java` | 3 | 1.00 |

Evidence for the strongest edge (`DatabaseChangeDetailsView.java` – `PreambleChangeDetailsView.java`, up to 10 commits, newest first):

- `3401b71` 2024-06-23 — Fix missing external changes resolver dialog scrollbar  (#11415)
- `e86839a` 2022-12-05 — Allow users to review backup changes before restoring them or merge them selectively (#9311)
- `05ff677` 2022-08-30 — [WIP][GSOC22] - C - Improve the external changes resolver dialog (#9021)

### Cluster 14 — 14 files, 5 packages, 1 module

Packages: org.jabref.gui.edit.automaticfieldeditor (6), org.jabref.gui.edit.automaticfieldeditor.clearcontent (2), org.jabref.gui.edit.automaticfieldeditor.copyormovecontent (2), org.jabref.gui.edit.automaticfieldeditor.editfieldcontent (2), org.jabref.gui.edit.automaticfieldeditor.renamefield (2)

Modules: jabgui (14)

Files:

- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/AbstractAutomaticFieldEditorTabView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/AbstractAutomaticFieldEditorTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/AutomaticFieldEditorAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/AutomaticFieldEditorDialog.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/AutomaticFieldEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/MoveFieldValueAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/clearcontent/ClearContentTabView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/clearcontent/ClearContentViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/copyormovecontent/CopyOrMoveFieldContentTabView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/copyormovecontent/CopyOrMoveFieldContentTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/editfieldcontent/EditFieldContentTabView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/editfieldcontent/EditFieldContentViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/renamefield/RenameFieldTabView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/automaticfieldeditor/renamefield/RenameFieldViewModel.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `EditFieldContentTabView.java` | `RenameFieldTabView.java` | 6 | 1.00 |
| `EditFieldContentTabView.java` | `EditFieldContentViewModel.java` | 5 | 1.00 |
| `EditFieldContentViewModel.java` | `RenameFieldTabView.java` | 5 | 1.00 |
| `RenameFieldTabView.java` | `RenameFieldViewModel.java` | 5 | 1.00 |
| `AutomaticFieldEditorAction.java` | `AutomaticFieldEditorDialog.java` | 4 | 1.00 |

Evidence for the strongest edge (`EditFieldContentTabView.java` – `RenameFieldTabView.java`, up to 10 commits, newest first):

- `75464e8` 2026-08-24 — Fix typo in package name: automaticfiededitor -> automaticfieldeditor (#16657)
- `a07a0a4` 2026-03-06 — Migrate to GemsFX Notifications (#14762)
- `5c362e3` 2026-02-14 — Refine Automatic Field Editor filtering logic (fixes #15066) (#15094)
- `0a63038` 2025-10-07 — Automatic field editor: Add Clear content tab + viewmodel (#13824)
- `712e58b` 2023-04-13 — Moved CustomEntryTypeDialog as tab to PreferencesDialog
- `0d82506` 2022-08-01 — Improve Automatic Field Editor Dialog (#8973)

### Cluster 10 — 25 files, 4 packages, 1 module

Packages: org.jabref.logic.formatter.bibtexfields (16), org.jabref.logic.formatter.casechanger (6), org.jabref.logic.formatter (2), org.jabref.logic.formatter.minifier (1)

Modules: jablib (25)

Files:

- `jablib/src/main/java/org/jabref/logic/formatter/Formatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/IdentityFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/AddBracesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/ClearFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/EscapeUnderscoresFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/HtmlToLatexFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/LatexCleanupFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/NormalizeDateFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/NormalizeMonthFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/NormalizeNamesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/NormalizePagesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/OrdinalsToSuperscriptFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/RegexFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/RemoveEnclosingBracesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/RemoveHyphenatedNewlinesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/RemoveNewlinesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/UnicodeToLatexFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/UnitsToLatexFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/CapitalizeFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/LowerCaseFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/ProtectTermsFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/SentenceCaseFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/TitleCaseFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/UpperCaseFormatter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/minifier/MinifyNameListFormatter.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CapitalizeFormatter.java` | `LowerCaseFormatter.java` | 10 | 0.91 |
| `CapitalizeFormatter.java` | `TitleCaseFormatter.java` | 10 | 0.91 |
| `CapitalizeFormatter.java` | `UpperCaseFormatter.java` | 10 | 0.91 |
| `LowerCaseFormatter.java` | `TitleCaseFormatter.java` | 10 | 0.91 |
| `LowerCaseFormatter.java` | `UpperCaseFormatter.java` | 10 | 0.91 |

Evidence for the strongest edge (`CapitalizeFormatter.java` – `LowerCaseFormatter.java`, up to 10 commits, newest first):

- `1e3bc02` 2022-11-30 — Exemplified menu entries for change case menu (#9382)
- `8aab893` 2018-05-24 — Fix checkstyle
- `c09e472` 2018-05-22 — Make Formatter an abstract class (and remove AbstractFormatter)
- `cd431b4` 2018-05-21 — Introduce AbstractFormatter to ensure that hashCode and equals are implemented the same way
- `b0d2c4f` 2016-04-10 — Add method getExampleInput() to Format class
- `5b3de9a` 2016-04-01 — Rename Formatters
- `744d7d3` 2016-03-07 — Add description tooltip to cleanup formatters
- `0b328c6` 2016-01-26 — Add formatter keys to be able to identify Formatters
- `275fef4` 2015-11-07 — Fixed a number of false positive translation strings and cleaned up some parts related to translations
- `2b79053` 2015-10-29 — Extract and refactor CaseChangers

### Cluster 11 — 21 files, 4 packages, 2 modules

Packages: org.jabref.model.entry.field (11), org.jabref.gui.preferences.customentrytypes (5), org.jabref.model.entry (3), org.jabref.model.entry.types (2)

Modules: jablib (16), jabgui (5)

Files:

- `jabgui/src/main/java/org/jabref/gui/preferences/customentrytypes/CustomEntryTypeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customentrytypes/CustomEntryTypesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customentrytypes/CustomEntryTypesTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customentrytypes/EntryTypeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customentrytypes/FieldViewModel.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryType.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryTypeBuilder.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryTypesManager.java`
- `jablib/src/main/java/org/jabref/model/entry/field/AMSField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/BiblatexApaField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/BiblatexSoftwareField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/Field.java`
- `jablib/src/main/java/org/jabref/model/entry/field/FieldFactory.java`
- `jablib/src/main/java/org/jabref/model/entry/field/FieldPriority.java`
- `jablib/src/main/java/org/jabref/model/entry/field/IEEEField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/OrFields.java`
- `jablib/src/main/java/org/jabref/model/entry/field/StandardField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/UnknownField.java`
- `jablib/src/main/java/org/jabref/model/entry/field/UserSpecificCommentField.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BiblatexSoftwareEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/EntryTypeFactory.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `BiblatexApaField.java` | `StandardField.java` | 5 | 1.00 |
| `BibEntryType.java` | `FieldPriority.java` | 3 | 1.00 |
| `BibEntryTypesManager.java` | `BiblatexSoftwareEntryTypeDefinitions.java` | 3 | 1.00 |
| `CustomEntryTypesTabViewModel.java` | `FieldViewModel.java` | 13 | 0.93 |
| `CustomEntryTypesTab.java` | `EntryTypeViewModel.java` | 5 | 0.83 |

Evidence for the strongest edge (`BiblatexApaField.java` – `StandardField.java`, up to 10 commits, newest first):

- `ccda46d` 2025-09-14 — Consistent casing in fieldnames (#13867)
- `97e0130` 2024-04-01 — Try to write good order of ContentSelectors
- `49eb6b2` 2024-03-19 — Workaround missing "Optional 2" display (#11022)
- `fd37cd3` 2023-01-02 — Create a better solution for define multi line fields (#9456)
- `02f51f7` 2022-08-01 — Support biblatex apa citation for legal entry types (#8966)

### Cluster 12 — 16 files, 4 packages, 2 modules

Packages: org.jabref.gui.slr (6), org.jabref.logic.crawler (6), org.jabref.model.study (3), org.jabref.logic.git (1)

Modules: jablib (10), jabgui (6)

Files:

- `jabgui/src/main/java/org/jabref/gui/slr/EditExistingStudyAction.java`
- `jabgui/src/main/java/org/jabref/gui/slr/ExistingStudySearchAction.java`
- `jabgui/src/main/java/org/jabref/gui/slr/ManageStudyDefinitionView.java`
- `jabgui/src/main/java/org/jabref/gui/slr/ManageStudyDefinitionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/slr/StartNewStudyAction.java`
- `jabgui/src/main/java/org/jabref/gui/slr/StudyCatalogItem.java`
- `jablib/src/main/java/org/jabref/logic/crawler/Crawler.java`
- `jablib/src/main/java/org/jabref/logic/crawler/StudyCatalogToFetcherConverter.java`
- `jablib/src/main/java/org/jabref/logic/crawler/StudyFetcher.java`
- `jablib/src/main/java/org/jabref/logic/crawler/StudyRepository.java`
- `jablib/src/main/java/org/jabref/logic/crawler/StudyYamlParser.java`
- `jablib/src/main/java/org/jabref/logic/crawler/StudyYamlV1Migrator.java`
- `jablib/src/main/java/org/jabref/logic/git/SlrGitHandler.java`
- `jablib/src/main/java/org/jabref/model/study/Study.java`
- `jablib/src/main/java/org/jabref/model/study/StudyCatalog.java`
- `jablib/src/main/java/org/jabref/model/study/StudyQuery.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `StudyCatalogToFetcherConverter.java` | `StudyQuery.java` | 4 | 1.00 |
| `StudyRepository.java` | `StudyQuery.java` | 4 | 1.00 |
| `StudyYamlParser.java` | `StudyQuery.java` | 4 | 1.00 |
| `Study.java` | `StudyQuery.java` | 4 | 1.00 |
| `StudyCatalog.java` | `StudyQuery.java` | 4 | 1.00 |

Evidence for the strongest edge (`StudyCatalogToFetcherConverter.java` – `StudyQuery.java`, up to 10 commits, newest first):

- `939f293` 2026-05-16 — SLR : Improved study.yml format (v2) and terminology alignment (#15215)
- `546e041` 2025-10-30 — Revert "New study.yml format (#13844)" (#14204)
- `db1e651` 2025-10-20 — New study.yml format (#13844)
- `7117b61` 2021-01-26 — Change format for study definition to yaml (#7126)

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 15 | 8 | 4 | 2 | `OcrTab.java` – `OcrTabViewModel.java` | 5 | 1.00 | `5f20a6c`, `b058fa6`, `bdae0d9` |
| 21 | 3 | 3 | 2 | `ISSNEditorViewModel.java` – `JournalInformationFetcher.java` | 3 | 1.00 | `61ef1e8`, `86870cb`, `17a215d` |
| 23 | 3 | 3 | 1 | `BibFieldsIndexer.java` – `PostgresConstants.java` | 3 | 1.00 | `fdb26b4`, `f07dfad`, `1bb4e39` |
| 24 | 3 | 3 | 1 | `BibTeXHighlighter.java` – `SourceTab.java` | 4 | 1.00 | `3d6b90c`, `7ba0d72`, `6b92b7a` |
| 17 | 4 | 2 | 1 | `CleanupSingleFieldPanel.java` – `CleanupSingleFieldViewModel.java` | 3 | 1.00 | `bae2346`, `23525e9`, `c0642a7` |
| 19 | 4 | 2 | 1 | `SearchQueryExtractorVisitor.java` – `SearchToLuceneVisitor.java` | 3 | 1.00 | `7ba0d72`, `97d548a`, `861b00b` |
| 20 | 3 | 2 | 2 | `DefaultFileUpdateMonitor.java` – `FileUpdateMonitor.java` | 4 | 0.80 | `85dff5f`, `5c9edc9`, `e8eb8e6` |
| 22 | 3 | 2 | 2 | `ProtectedTermsLoader.java` – `ProtectedTermsParser.java` | 3 | 0.60 | `4a8404c`, `4c82d3e`, `381b569` |
| 26 | 2 | 2 | 2 | `AiChatView.java` – `GenerateSummaryAiDatabaseListener.java` | 3 | 0.75 | `6278949`, `e56d5ee`, `e3ec1a1` |
| 29 | 2 | 2 | 1 | `ErrorConsoleViewModel.java` – `LogMessages.java` | 4 | 0.80 | `1c7da01`, `b3381ed`, `462bce4` |
| 34 | 2 | 2 | 1 | `SelectableTextFlow.java` – `MarkdownTextFlow.java` | 4 | 0.80 | `97d6111`, `7ecbaa5`, `074b682` |
| 40 | 2 | 2 | 1 | `RemoteListenerServerManager.java` – `HeadlessExecutorService.java` | 4 | 1.00 | `9656cf1`, `861b00b`, `0e7c1ff` |
| 16 | 5 | 1 | 1 | `DefaultDesktop.java` – `Linux.java` | 16 | 1.00 | `434db3d`, `3a731fa`, `84f15fd` |
| 18 | 4 | 1 | 1 | `ExternalFileTypesTab.java` – `ExternalFileTypesTabViewModel.java` | 6 | 0.75 | `ca3ed25`, `c604ecb`, `0b58079` |
| 25 | 2 | 1 | 1 | `JournalListMvGenerator.java` – `LtwaListMvGenerator.java` | 17 | 0.81 | `c5d988b`, `fd6ed4c`, `4f329ae` |
| 27 | 2 | 1 | 1 | `ConsistencyCheckDialog.java` – `ConsistencyCheckDialogViewModel.java` | 4 | 0.57 | `ccda46d`, `f8f5a38`, `5063bc3` |
| 28 | 2 | 1 | 1 | `DownloadLinkedFileAction.java` – `RedownloadMissingFilesAction.java` | 3 | 1.00 | `e801f41`, `9f2418b`, `2777ebc` |
| 30 | 2 | 1 | 1 | `DiffMethod.java` – `GroupDiffMode.java` | 3 | 1.00 | `dddaa7a`, `f63eb46`, `4fd60d2` |
| 31 | 2 | 1 | 1 | `ModifyBibliographyPropertiesDialogView.java` – `ModifyBibliographyPropertiesDialogViewModel.java` | 3 | 1.00 | `6013237`, `8a1ec40`, `0a1d67b` |
| 32 | 2 | 1 | 1 | `AutoCompletionTab.java` – `AutoCompletionTabViewModel.java` | 3 | 1.00 | `ccda46d`, `8afe793`, `bc5c4fc` |
| 33 | 2 | 1 | 1 | `RedoAction.java` – `UndoAction.java` | 3 | 1.00 | `ecd78de`, `9634a13`, `3ee825d` |
| 35 | 2 | 1 | 1 | `AtomicFileOutputStream.java` – `AtomicFileWriter.java` | 3 | 1.00 | `aa3821a`, `99b4bae`, `e83680f` |
| 36 | 2 | 1 | 1 | `ConflictRules.java` – `FieldPatchComputer.java` | 3 | 1.00 | `c759eda`, `5a91a7f`, `24c55e7` |
| 37 | 2 | 1 | 1 | `FirstPage.java` – `LastPage.java` | 4 | 0.80 | `d687c08`, `e034c51`, `37c81b9` |
| 38 | 2 | 1 | 1 | `ZoteroCitationData.java` – `ZoteroCitationMarkParser.java` | 4 | 1.00 | `45f2b8a`, `9d77273`, `cbe82e2` |
| 39 | 2 | 1 | 1 | `DefinitionProvider.java` – `DefinitionProviderFactory.java` | 3 | 1.00 | `cbb4d1f`, `ea18473`, `a985422` |

## Resolution = 1.0

Clusters (≥2 files): 49 · largest: 220 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.78

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 79.16% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 0 — 220 files, 66 packages, 2 modules

Packages: org.jabref.gui.maintable (16), org.jabref.gui.entryeditor (10), org.jabref.logic.exporter (10), org.jabref.logic.util (9), org.jabref.gui.search (8), org.jabref.gui.util (8), org.jabref.gui (7), org.jabref.gui.edit (7), org.jabref.gui.frame (7), org.jabref.gui.collab (6), org.jabref.gui.externalfiles (6), org.jabref.gui.help (6), org.jabref.gui.icon (6), org.jabref.gui.sidepane (6), org.jabref.logic.bibtex.comparator (6), org.jabref.logic.layout.format (6), org.jabref.gui.exporter (4), org.jabref.gui.groups (4), org.jabref.gui.importer.actions (4), org.jabref.gui.maintable.columns (4), org.jabref.gui.specialfields (4), org.jabref.model.database (4), org.jabref.gui.actions (3), org.jabref.gui.copyfiles (3), org.jabref.gui.externalfiletype (3), org.jabref.gui.fieldeditors (3), org.jabref.gui.importer (3), org.jabref.gui.importer.fetcher (3), org.jabref.logic.util.io (3), org.jabref.model.entry.event (3), org.jabref.gui.autocompleter (2), org.jabref.gui.autosaveandbackup (2), org.jabref.gui.auximport (2), org.jabref.gui.citationkeypattern (2), org.jabref.gui.dialogs (2), org.jabref.gui.menus (2), org.jabref.gui.preferences (2), org.jabref.logic.auxparser (2), org.jabref.logic.bibtex (2), org.jabref.logic.importer (2), org.jabref.model.database.event (2), org.jabref.model.entry.field (2), org.jabref.gui.backup (1), org.jabref.gui.cleanup (1), org.jabref.gui.duplicationFinder (1), org.jabref.gui.entryeditor.fileannotationtab (1), org.jabref.gui.integrity (1), org.jabref.gui.libraryproperties (1), org.jabref.gui.linkedfile (1), org.jabref.gui.mergeentries (1), org.jabref.gui.preferences.customimporter (1), org.jabref.gui.preferences.protectedterms (1), org.jabref.gui.preview (1), org.jabref.gui.shared (1), org.jabref.gui.util.comparator (1), org.jabref.logic.citationstyle (1), org.jabref.logic.importer.fileformat (1), org.jabref.logic.pdf (1), org.jabref.logic.search (1), org.jabref.logic.search.sqlbased (1), org.jabref.migrations (1), org.jabref.model (1), org.jabref.model.entry (1), org.jabref.model.metadata.event (1), org.jabref.model.search (1), org.jabref.model.util (1)

Modules: jabgui (159), jablib (61)

Files:

- `jabgui/src/main/java/org/jabref/gui/DialogService.java`
- `jabgui/src/main/java/org/jabref/gui/FXDialog.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefDialogService.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefGuiStateManager.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTab.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTabContainer.java`
- `jabgui/src/main/java/org/jabref/gui/StateManager.java`
- `jabgui/src/main/java/org/jabref/gui/actions/Action.java`
- `jabgui/src/main/java/org/jabref/gui/actions/ActionFactory.java`
- `jabgui/src/main/java/org/jabref/gui/actions/JabRefAction.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletionTextInputBinding.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/WordSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/AutosaveManager.java`
- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/BackupManager.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/FromAuxDialog.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/NewSubLibraryAction.java`
- `jabgui/src/main/java/org/jabref/gui/backup/BackupResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeyAction.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeySingleAction.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupAction.java`
- `jabgui/src/main/java/org/jabref/gui/collab/ChangeScanner.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChange.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeListener.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeMonitor.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangesResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/collab/ExternalChangesResolverViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesTask.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/AutosaveUiManager.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/BackupUIManager.java`
- `jabgui/src/main/java/org/jabref/gui/duplicationFinder/DuplicateSearch.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyMoreAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/EditAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/OpenBrowserAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiChatTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiSummaryTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/FieldsEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/JumpToFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/OpenEntryEditorAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewSwitchAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/UserDefinedFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FulltextSearchResultsTab.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAllAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoLinkFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/DownloadFullTextAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ExternalFilesEntryLinker.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FindUnlinkedFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileTypes.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/UnknownExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditorFX.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldNameLabel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/FileHistoryMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java`
- `jabgui/src/main/java/org/jabref/gui/frame/OpenConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ProcessingLibraryDialog.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsEMailAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsStandardEmailAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SidePanePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupViewMode.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/help/ErrorConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/HelpAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/NewVersionDialog.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IconTheme.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IkonliIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIconView.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIkonHandler.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefMaterialDesignIcon.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/CheckForNewEntryTypesAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/GUIPostOpenAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/ImportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/OpenDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/LookupIdentifierAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneView.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/integrity/IntegrityCheckAction.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/BibEntryTableViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/CellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferencesRecorder.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTable.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableFieldValueFormatter.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableHeaderContextMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTablePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableTooltip.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenFolderAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenUrlAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/RightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/SearchShortScienceAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FieldColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FileColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/LinkedIdentifierColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/MainTableColumn.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeAction.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeMenu.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/MergeWithFetchedEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilterDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ShowPreferencesAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/NewProtectedTermsFileDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPanel.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchBar.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialog.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/RebuildFulltextSearchIndexAction.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchFieldRightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTable.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchTextField.java`
- `jabgui/src/main/java/org/jabref/gui/shared/ConnectToSharedDatabaseCommand.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/GroupsSidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePane.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneContentFactory.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneType.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldAction.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldMenuItemFactory.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldValueViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/BaseDialog.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileDialogConfiguration.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileFilterConverter.java`
- `jabgui/src/main/java/org/jabref/gui/util/IconValidationDecorator.java`
- `jabgui/src/main/java/org/jabref/gui/util/UiTaskExecutor.java`
- `jabgui/src/main/java/org/jabref/gui/util/ValueTableCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTableRowFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTreeTableRowFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/comparator/RankingFieldComparator.java`
- `jabgui/src/main/java/org/jabref/migrations/ConvertLegacyExplicitGroups.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/AuxParserResult.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/DefaultAuxParser.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/BibEntryWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/TypedBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/BibtexStringComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/CrossRefEntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/EntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparatorStack.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/IdComparator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefItemDataProvider.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/Exporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MSBibExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ModsExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OOCalcDatabase.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentRepresentation.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentSpreadsheetCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenOfficeDocumentCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveException.java`
- `jablib/src/main/java/org/jabref/logic/exporter/TemplateExporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/Parser.java`
- `jablib/src/main/java/org/jabref/logic/importer/ParserResult.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexParser.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690FormatDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690NamesAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NotFoundFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Number.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisMonth.java`
- `jablib/src/main/java/org/jabref/logic/pdf/FileAnnotationCache.java`
- `jablib/src/main/java/org/jabref/logic/search/SearchPreferences.java`
- `jablib/src/main/java/org/jabref/logic/search/sqlbased/SqlBasedLibrarySearcher.java`
- `jablib/src/main/java/org/jabref/logic/util/BackgroundTask.java`
- `jablib/src/main/java/org/jabref/logic/util/CoarseChangeFilter.java`
- `jablib/src/main/java/org/jabref/logic/util/CurrentThreadTaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/util/DelayTaskThrottler.java`
- `jablib/src/main/java/org/jabref/logic/util/FileType.java`
- `jablib/src/main/java/org/jabref/logic/util/OptionalObjectProperty.java`
- `jablib/src/main/java/org/jabref/logic/util/ProgressCounter.java`
- `jablib/src/main/java/org/jabref/logic/util/StandardFileType.java`
- `jablib/src/main/java/org/jabref/logic/util/TaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/util/io/BackupFileUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/CitationKeyBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileHistory.java`
- `jablib/src/main/java/org/jabref/model/FieldChange.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabase.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseMode.java`
- `jablib/src/main/java/org/jabref/model/database/CitationKeyListener.java`
- `jablib/src/main/java/org/jabref/model/database/KeyCollisionException.java`
- `jablib/src/main/java/org/jabref/model/database/event/BibDatabaseContextChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesAddedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/event/EntryChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldAddedOrRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/field/FieldProperty.java`
- `jablib/src/main/java/org/jabref/model/entry/field/SpecialFieldValue.java`
- `jablib/src/main/java/org/jabref/model/metadata/event/MetaDataChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/search/SearchDisplayMode.java`
- `jablib/src/main/java/org/jabref/model/util/FileUpdateListener.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AutosaveUiManager.java` | `SaveDatabaseAction.java` | 15 | 1.00 |
| `JabRefFrame.java` | `LibraryPropertiesAction.java` | 10 | 1.00 |
| `JabRefFrame.java` | `SidePaneViewModel.java` | 9 | 1.00 |
| `AiChatTab.java` | `AiSummaryTab.java` | 6 | 1.00 |
| `AiSummaryTab.java` | `EntryEditor.java` | 6 | 1.00 |

Evidence for the strongest edge (`AutosaveUiManager.java` – `SaveDatabaseAction.java`, up to 10 commits, newest first):

- `a77969d` 2026-09-06 — Add auto-commit, push & pull features for Git (#16651)
- `a20d356` 2026-08-06 — Add per library journal abbreviation type (LTWA) on save  (#15517)
- `5be9e29` 2025-04-16 — Fix "Reveal in file explorer" option (#12950)
- `c951dd7` 2023-09-04 — Refactored importAction and addTab methods, introduced MainToolbar and MainMenu (#10305)
- `6a71395` 2022-08-16 — AtomicFileOutputStream does not overwrite file if exception occurred during write (#9067)
- `3f9922e` 2020-03-15 — More refactorings
- `b364396` 2020-03-14 — Refactor SaveAction
- `382c4b2` 2019-11-28 — Add tests for "changed" flag (#5640)
- `67780cc` 2019-11-06 — Fix 5555 status popups (#5560)
- `7f970bc` 2019-08-25 — Remove Globals at SaveDatabaseAction

### Cluster 1 — 144 files, 66 packages, 3 modules

Packages: org.jabref.logic.exporter (7), org.jabref.gui.commonfxcontrols (6), org.jabref.gui.preferences (6), org.jabref.logic.preferences (6), org.jabref.logic.xmp (6), org.jabref.gui.entryeditor (4), org.jabref.logic (4), org.jabref.logic.ocr (4), org.jabref.gui.cleanup (3), org.jabref.gui.exporter (3), org.jabref.gui.groups (3), org.jabref.gui.importer (3), org.jabref.gui.linkedfile (3), org.jabref.logic.citationkeypattern (3), org.jabref.logic.remote (3), org.jabref.logic.remote.server (3), org.jabref.cli (2), org.jabref.gui (2), org.jabref.gui.edit (2), org.jabref.gui.frame (2), org.jabref.gui.preferences.citationkeypattern (2), org.jabref.gui.preferences.customexporter (2), org.jabref.gui.preferences.entry (2), org.jabref.gui.preferences.entryeditor (2), org.jabref.gui.preferences.export (2), org.jabref.gui.preferences.external (2), org.jabref.gui.preferences.general (2), org.jabref.gui.preferences.groups (2), org.jabref.gui.preferences.linkedfiles (2), org.jabref.gui.preferences.nameformatter (2), org.jabref.gui.preferences.network (2), org.jabref.gui.preferences.ocr (2), org.jabref.gui.preferences.protectedterms (2), org.jabref.gui.preferences.table (2), org.jabref.gui.preferences.websearch (2), org.jabref.gui.preferences.xmp (2), org.jabref.logic.cleanup (2), org.jabref.logic.importer (2), org.jabref.logic.importer.util (2), org.jabref.logic.net.ssl (2), org.jabref.logic.protectedterms (2), org.jabref.logic.util.io (2), org.jabref.migrations (2), org.jabref (1), org.jabref.gui.autocompleter (1), org.jabref.gui.externalfiles (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.libraryproperties.saving (1), org.jabref.gui.preferences.customimporter (1), org.jabref.gui.remote (1), org.jabref.gui.specialfields (1), org.jabref.gui.util (1), org.jabref.logic.bibtex (1), org.jabref.logic.externalfiles (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.fetcher (1), org.jabref.logic.l10n (1), org.jabref.logic.layout (1), org.jabref.logic.layout.format (1), org.jabref.logic.net (1), org.jabref.logic.ocr.docling (1), org.jabref.logic.push (1), org.jabref.logic.remote.client (1), org.jabref.model.entry (1), org.jabref.model.metadata (1), org.jabref.support (1)

Modules: jabgui (82), jablib (61), test-support (1)

Files:

- `jabgui/src/main/java/org/jabref/Launcher.java`
- `jabgui/src/main/java/org/jabref/cli/ArgumentProcessor.java`
- `jabgui/src/main/java/org/jabref/cli/GuiCommandLine.java`
- `jabgui/src/main/java/org/jabref/gui/CoreGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/WorkspacePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupDialog.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupMultiFieldPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelItemModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SortCriterionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsDialog.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AllFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabFactory.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileExtensionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ExternalApplicationsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrameViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/importer/GrobidUseDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/saving/SavingPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialog.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/OcrLinkedFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/AbstractPreferenceTabView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferenceTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilter.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ocr/OcrTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ocr/OcrTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/remote/CLIMessageHandler.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/util/FieldsUtil.java`
- `jabgui/src/main/java/org/jabref/migrations/CustomEntryTypePreferenceMigration.java`
- `jabgui/src/main/java/org/jabref/migrations/PreferencesMigrations.java`
- `jablib/src/main/java/org/jabref/logic/FilePreferences.java`
- `jablib/src/main/java/org/jabref/logic/InternalPreferences.java`
- `jablib/src/main/java/org/jabref/logic/LibraryPreferences.java`
- `jablib/src/main/java/org/jabref/logic/UiCommand.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldPreferences.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGeneratorTestUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPattern.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPatternPreferences.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupPreferences.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FieldFormatterCleanupActions.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibDatabaseWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/EmbeddedBibFilePdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExportPreferences.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExporterFactory.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpPdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/ExternalFilesContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/ConvertMSCCodesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImporterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDlibPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidService.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Language.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/SSLPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/TrustStoreManager.java`
- `jablib/src/main/java/org/jabref/logic/ocr/OcrEngine.java`
- `jablib/src/main/java/org/jabref/logic/ocr/OcrMyPdfEngine.java`
- `jablib/src/main/java/org/jabref/logic/ocr/OcrPreferences.java`
- `jablib/src/main/java/org/jabref/logic/ocr/OcrUtils.java`
- `jablib/src/main/java/org/jabref/logic/ocr/docling/DoclingEngine.java`
- `jablib/src/main/java/org/jabref/logic/preferences/CliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/DOIPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/JabRefCliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/LastFilesOpenedPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/OwnerPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/TimestampPreferences.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsList.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsPreferences.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationPreferences.java`
- `jablib/src/main/java/org/jabref/logic/remote/Protocol.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteMessage.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemotePreferences.java`
- `jablib/src/main/java/org/jabref/logic/remote/client/RemoteClient.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServer.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServerThread.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteMessageHandler.java`
- `jablib/src/main/java/org/jabref/logic/util/io/AutoLinkPreferences.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinders.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DocumentInformationExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DublinCoreExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpPreferences.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilReader.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilShared.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilWriter.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryPreferences.java`
- `jablib/src/main/java/org/jabref/model/metadata/SaveOrder.java`
- `test-support/src/main/java/org/jabref/support/BibEntryAssert.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GroupsTab.java` | `GroupsTabViewModel.java` | 10 | 1.00 |
| `NameFormatterTab.java` | `NameFormatterTabViewModel.java` | 6 | 1.00 |
| `JabRefCliPreferences.java` | `TimestampPreferences.java` | 6 | 1.00 |
| `OcrTab.java` | `OcrTabViewModel.java` | 5 | 1.00 |
| `SortCriterionViewModel.java` | `JabRefCliPreferences.java` | 4 | 1.00 |

Evidence for the strongest edge (`GroupsTab.java` – `GroupsTabViewModel.java`, up to 10 commits, newest first):

- `2f3a00e` 2026-08-16 — Create new group from selected entries (#16588)
- `ef5eb77` 2023-02-28 — persist selected hierarchical context in groups preferences
- `8da0a3a` 2023-02-26 — add default hierarchical context preference option
- `82db990` 2022-12-06 — Extracted KeywordSeparator from GroupsPreferences and created new PreferencesTab EntryTab
- `ba5beb2` 2021-12-26 — Observable preferences I (Internal [formerly Version], Groups, Xmp, AutoComplete) (#8336)
- `5a11412` 2021-02-01 — Grand unified preferences dialog (#7384)
- `5850341` 2020-09-01 — Refactor of remaining preference tabs to PreferencesService (#6836)
- `efc69be` 2020-04-05 — Add disable/enable calculation of items in group (#6233)
- `a01ea20` 2019-09-17 — Conversion of preferences/exportsorting, import, maintable and entryeditor to mvvm (#5315)
- `f51ba49` 2019-08-18 — Conversion of preferencesDialog/advancedTab, networkTab and groupsTab to mvvm (#5141)

### Cluster 3 — 95 files, 31 packages, 2 modules

Packages: org.jabref.logic.cleanup (10), org.jabref.logic.journals (7), org.jabref.logic.msbib (7), org.jabref.logic.util.io (6), org.jabref.logic.bst (5), org.jabref.logic.bst.util (5), org.jabref.logic.layout.format (5), org.jabref.model.entry (5), org.jabref.model.entry.types (5), org.jabref.gui.preferences.journals (4), org.jabref.logic.citationstyle (4), org.jabref.logic.importer.util (3), org.jabref.logic.integrity (3), org.jabref.logic.util (3), org.jabref.model.metadata (3), org.jabref.logic.exporter (2), org.jabref.logic.layout (2), org.jabref.model.database (2), org.jabref.model.groups (2), org.jabref.gui.cleanup (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.groups (1), org.jabref.gui.util (1), org.jabref.logic.bibtex (1), org.jabref.logic.bibtex.comparator (1), org.jabref.logic.formatter (1), org.jabref.logic.importer (1), org.jabref.logic.l10n (1), org.jabref.logic.net (1), org.jabref.logic.remote (1), org.jabref.logic.util.strings (1)

Modules: jablib (87), jabgui (8)

Files:

- `jabgui/src/main/java/org/jabref/gui/cleanup/CleanupSingleAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/URLUtil.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDescriptions.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationsFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/BindingsHelper.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FileFieldWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/MetaDataDiff.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstEntry.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstFunctions.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVM.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVMContext.java`
- `jablib/src/main/java/org/jabref/logic/bst/BstVMVisitor.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstCaseChanger.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstNameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstPurifier.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstTextPrefixer.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstWidthCalculator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLAdapter.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleCache.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleGenerator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleOutputFormat.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupJob.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/CleanupWorker.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/ConvertToBiblatexCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/ConvertToBibtexCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FieldFormatterCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FileLinksCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/MoveFilesCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/RelativePathsCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/RenamePdfCleanup.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/UpgradePdfPsToFileCleanup.java`
- `jablib/src/main/java/org/jabref/logic/exporter/GroupSerializer.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MetaDataSerializer.java`
- `jablib/src/main/java/org/jabref/logic/formatter/Formatters.java`
- `jablib/src/main/java/org/jabref/logic/importer/AuthorListParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/FileFieldParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GroupsParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/MetaDataParser.java`
- `jablib/src/main/java/org/jabref/logic/integrity/CitationKeyDuplicationChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/FieldCheckers.java`
- `jablib/src/main/java/org/jabref/logic/integrity/NoBibtexFieldChecker.java`
- `jablib/src/main/java/org/jabref/logic/journals/Abbreviation.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationParser.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationPreferences.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationType.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationWriter.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationLoader.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationRepository.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Localization.java`
- `jablib/src/main/java/org/jabref/logic/layout/AbstractParamLayoutFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/ParamLayoutFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/FileLink.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/JournalAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Replace.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/WrapContent.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/WrapFileLinks.java`
- `jablib/src/main/java/org/jabref/logic/msbib/BibTeXConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibDatabase.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibMapping.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MsBibAuthor.java`
- `jablib/src/main/java/org/jabref/logic/msbib/PageNumbers.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyRegisterer.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/MetadataSerializationConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/util/TestEntry.java`
- `jablib/src/main/java/org/jabref/logic/util/UpdateField.java`
- `jablib/src/main/java/org/jabref/logic/util/io/DatabaseFileLookup.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameCleaner.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/RegExpBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/XMLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/HTMLUnicodeConversionMaps.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseModeDetection.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabases.java`
- `jablib/src/main/java/org/jabref/model/entry/Author.java`
- `jablib/src/main/java/org/jabref/model/entry/CanonicalBibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryConverter.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryLinkList.java`
- `jablib/src/main/java/org/jabref/model/entry/IdGenerator.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BiblatexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BibtexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/EntryType.java`
- `jablib/src/main/java/org/jabref/model/entry/types/IEEETranEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/StandardEntryType.java`
- `jablib/src/main/java/org/jabref/model/groups/LastNameGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/TexGroup.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelector.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelectors.java`
- `jablib/src/main/java/org/jabref/model/metadata/MetaData.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AbbreviationType.java` | `JournalAbbreviationRepository.java` | 4 | 1.00 |
| `BstEntry.java` | `BstFunctions.java` | 3 | 1.00 |
| `BstEntry.java` | `BstVMVisitor.java` | 3 | 1.00 |
| `BstFunctions.java` | `BstVMContext.java` | 3 | 1.00 |
| `BstVM.java` | `BstVMContext.java` | 3 | 1.00 |

Evidence for the strongest edge (`AbbreviationType.java` – `JournalAbbreviationRepository.java`, up to 10 commits, newest first):

- `6a2c153` 2026-01-25 — Move journal abbreaviation actions to the "Cleanup entries" dialog (#14850)
- `1a4e1f3` 2025-04-08 — Add support for LTWA (issue #12276) (#12880)
- `88c9f56` 2023-01-02 — Fix journal abbbrev checker for curly braces (#9504)
- `ac7875a` 2019-10-31 — Convert abbreviation data to CSV and adapt JabRef accordingly (#5538)

### Cluster 5 — 67 files, 31 packages, 2 modules

Packages: org.jabref.gui.texparser (7), org.jabref.gui.externalfiles (5), org.jabref.gui.libraryproperties (3), org.jabref.gui.libraryproperties.constants (3), org.jabref.gui.mergeentries.multiwaymerge (3), org.jabref.gui.newentry (3), org.jabref.gui.preview (3), org.jabref.gui.util (3), org.jabref.logic.preview (3), org.jabref.model.texparser (3), org.jabref.gui.entryeditor (2), org.jabref.gui.libraryproperties.contentselectors (2), org.jabref.gui.libraryproperties.general (2), org.jabref.gui.libraryproperties.keypattern (2), org.jabref.gui.preferences (2), org.jabref.gui.preferences.preview (2), org.jabref.gui.welcome.quicksettings.viewmodel (2), org.jabref.logic.texparser (2), org.jabref.logic.util (2), org.jabref.model.entry (2), org.jabref.gui (1), org.jabref.gui.edit (1), org.jabref.gui.importer (1), org.jabref.gui.integrity (1), org.jabref.gui.libraryproperties.saving (1), org.jabref.gui.welcome (1), org.jabref.logic.externalfiles (1), org.jabref.logic.importer.plaincitation (1), org.jabref.logic.openoffice.bst (1), org.jabref.logic.push (1), org.jabref.logic.util.io (1)

Modules: jabgui (50), jablib (17)

Files:

- `jabgui/src/main/java/org/jabref/gui/DragAndDropDataFormats.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyToPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportHandler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/PdfMergeDialog.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesCrawler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedPDFFileFilter.java`
- `jabgui/src/main/java/org/jabref/gui/importer/BookCoverFetcher.java`
- `jabgui/src/main/java/org/jabref/gui/integrity/IntegrityCheckDialog.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/AbstractPropertiesTabView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsItemModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/constants/ConstantsPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/contentselectors/ContentSelectorView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/contentselectors/ContentSelectorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/general/GeneralPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/general/GeneralPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/keypattern/KeyPatternPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/keypattern/KeyPatternPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/saving/SavingPropertiesView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/DiffHighlightingEllipsingTextFlow.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/GuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/JabRefGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preview/CopyCitationAction.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewViewer.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/CitationsDisplay.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexAction.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ReferenceViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/CustomLocalDragboard.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTextFieldTableCellVisualizationFactory.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/DonationPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/PushApplicationDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/ThemeDialogViewModel.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/LinkedFileHandler.java`
- `jablib/src/main/java/org/jabref/logic/importer/plaincitation/LlmPlainCitationParser.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/BSTFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/preview/BstPreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/CitationStylePreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/PreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationDetector.java`
- `jablib/src/main/java/org/jabref/logic/texparser/DefaultLatexParser.java`
- `jablib/src/main/java/org/jabref/logic/texparser/TexBibEntriesResolver.java`
- `jablib/src/main/java/org/jabref/logic/util/Directories.java`
- `jablib/src/main/java/org/jabref/logic/util/URLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameUniqueness.java`
- `jablib/src/main/java/org/jabref/model/entry/BibtexString.java`
- `jablib/src/main/java/org/jabref/model/entry/LinkedFile.java`
- `jablib/src/main/java/org/jabref/model/texparser/Citation.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexBibEntriesResolverResult.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexParserResult.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GuiPreferences.java` | `JabRefGuiPreferences.java` | 5 | 1.00 |
| `ThemeDialogViewModel.java` | `PushToApplicationDetector.java` | 5 | 1.00 |
| `CopyToPreferences.java` | `JabRefGuiPreferences.java` | 4 | 1.00 |
| `BookCoverFetcher.java` | `PreviewViewer.java` | 4 | 1.00 |
| `PushApplicationDialogViewModel.java` | `ThemeDialogViewModel.java` | 4 | 1.00 |

Evidence for the strongest edge (`GuiPreferences.java` – `JabRefGuiPreferences.java`, up to 10 commits, newest first):

- `3825c73` 2026-07-06 — Render entry preview with html-to-node and remove javafx.web (#16145)
- `90434cc` 2026-05-31 — Fix MrDlib, SSL and BibEntryPreferences reset and import (#15862)
- `00fc407` 2025-08-22 — Add more walkthroughs, donation prompt, and responsive layout for welcome tab (#13679)
- `de56006` 2025-05-02 — Merging Entry Creation Buttons Into a Single Tool (#13020)
- `6161661` 2025-01-27 — Copy to option (#12374)

### Cluster 6 — 59 files, 24 packages, 3 modules

Packages: org.jabref.gui.walkthrough (6), org.jabref.gui.welcome.quicksettings (6), org.jabref.gui.theme (5), org.jabref.gui.entryeditor.citationrelationtab (4), org.jabref.languageserver (4), org.jabref.gui.externalfiles (3), org.jabref.gui.walkthrough.declarative (3), org.jabref.gui.welcome.components (3), org.jabref.languageserver.util (3), org.jabref.logic.citation.repository (3), org.jabref.gui.fieldeditors (2), org.jabref.gui.help (2), org.jabref.gui.walkthrough.effects (2), org.jabref.logic.importer.fetcher.citation (2), org.jabref.model.entry (2), org.jabref.gui (1), org.jabref.gui.walkthrough.utils (1), org.jabref.gui.welcome (1), org.jabref.languageserver.controller (1), org.jabref.logic.citation (1), org.jabref.logic.importer.fetcher.citation.crossref (1), org.jabref.logic.importer.fetcher.citation.opencitations (1), org.jabref.logic.importer.fetcher.citation.semanticscholar (1), org.jabref.model (1)

Modules: jabgui (39), jablib (12), jabls (8)

Files:

- `jabgui/src/main/java/org/jabref/gui/JabRefGUI.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/BibEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationItem.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationsRelationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileSelectionPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportResultsPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesWizard.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/help/SearchForUpdateAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/VersionWorker.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheet.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetDataUrl.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetFile.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetResource.java`
- `jabgui/src/main/java/org/jabref/gui/theme/ThemeManager.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/Walkthrough.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughAction.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughOverlay.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WalkthroughRenderer.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/WindowOverlay.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/NodeResolver.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/Trigger.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/declarative/WindowResolver.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/effects/FullScreenDarken.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/effects/Spotlight.java`
- `jabgui/src/main/java/org/jabref/gui/walkthrough/utils/WalkthroughReverter.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/WelcomeTab.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/DonationProvider.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/QuickSettings.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/components/Walkthroughs.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/EntryTableConfigurationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/LargeLibraryOptimizationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/MainFileDirectoryDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/OnlineServicesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/PushApplicationDialog.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/ThemeDialog.java`
- `jablib/src/main/java/org/jabref/logic/citation/SearchCitationsRelationsService.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepository.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepositoryShell.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/MVStoreBibEntryRelationRepository.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcherType.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/crossref/CrossRefCitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/opencitations/OpenCitationsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/semanticscholar/SemanticScholarCitationFetcher.java`
- `jablib/src/main/java/org/jabref/model/ChainNode.java`
- `jablib/src/main/java/org/jabref/model/entry/Keyword.java`
- `jablib/src/main/java/org/jabref/model/entry/KeywordList.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexTextDocumentService.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexWorkspaceService.java`
- `jabls/src/main/java/org/jabref/languageserver/LspClientHandler.java`
- `jabls/src/main/java/org/jabref/languageserver/LspLauncher.java`
- `jabls/src/main/java/org/jabref/languageserver/controller/LanguageServerController.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspConsistencyCheck.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticBuilder.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticHandler.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JabRefGUI.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `JabRefGUI.java` | `LanguageServerController.java` | 4 | 1.00 |
| `CitationRelationsTab.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `FileSelectionPage.java` | `ImportResultsPage.java` | 4 | 1.00 |
| `WelcomeTab.java` | `Walkthroughs.java` | 4 | 1.00 |

Evidence for the strongest edge (`JabRefGUI.java` – `BibEntryCitationsAndReferencesRepositoryShell.java`, up to 10 commits, newest first):

- `a2502f2` 2026-03-04 — Fix threading issues in citations relations tab (#15233)
- `9e9e0e4` 2026-02-04 — Add OpenAlex-based Citation Fetcher (#15023)
- `d5f1f63` 2025-12-28 — feat(citation): add support for selecting citation fetcher in Citatio… (#14652)
- `3135c1a` 2025-06-07 — Fix issue #11189 - Implement a caching solution with local storage for citation relations  (#11845)

### Cluster 9 — 48 files, 18 packages, 8 modules

Packages: org.jabref.toolkit.commands (16), (default) (8), org.jabref.http.server.resources (6), org.jabref.http.server.command (3), org.jabref.http.manager (2), org.jabref.gui.consistency (1), org.jabref.gui.importer (1), org.jabref.http (1), org.jabref.http.dto (1), org.jabref.http.server (1), org.jabref.http.server.cli (1), org.jabref.http.server.services (1), org.jabref.languageserver (1), org.jabref.logic.git.io (1), org.jabref.logic.quality.consistency (1), org.jabref.model.search (1), org.jabref.toolkit (1), org.jabref.toolkit.converter (1)

Modules: jabkit (19), jabsrv (16), jablib (4), jabgui (3), jabls (2), jabsrv-cli (2), jabls-cli (1), test-support (1)

Files:

- `jabgui/src/main/java/module-info.java`
- `jabgui/src/main/java/org/jabref/gui/consistency/ConsistencyCheckAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesDialog.java`
- `jabkit/src/main/java/module-info.java`
- `jabkit/src/main/java/org/jabref/toolkit/JabKitLauncher.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Check.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/CheckConsistency.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/CheckIntegrity.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Convert.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/DoiToBibtex.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Fetch.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GenerateBibFromAux.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GenerateCitationKeys.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GetCitedWorks.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/GetCitingWorks.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/JabKit.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Pdf.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/PdfUpdate.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Preferences.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Pseudonymize.java`
- `jabkit/src/main/java/org/jabref/toolkit/commands/Search.java`
- `jabkit/src/main/java/org/jabref/toolkit/converter/CygWinPathConverter.java`
- `jablib/src/main/java/module-info.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitFileWriter.java`
- `jablib/src/main/java/org/jabref/logic/quality/consistency/BibliographyConsistencyCheck.java`
- `jablib/src/main/java/org/jabref/model/search/LinkedFilesConstants.java`
- `jabls-cli/src/main/java/module-info.java`
- `jabls/src/main/java/module-info.java`
- `jabls/src/main/java/org/jabref/languageserver/ExtensionSettings.java`
- `jabsrv-cli/src/main/java/module-info.java`
- `jabsrv-cli/src/main/java/org/jabref/http/server/cli/ServerCli.java`
- `jabsrv/src/main/java/module-info.java`
- `jabsrv/src/main/java/org/jabref/http/JabRefSrvStateManager.java`
- `jabsrv/src/main/java/org/jabref/http/dto/GlobalExceptionMapper.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerManager.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerThread.java`
- `jabsrv/src/main/java/org/jabref/http/server/Server.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/Command.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/CommandResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/SelectEntriesCommand.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/CitationsResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntriesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibrariesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibraryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/MapResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/services/ServerUtils.java`
- `test-support/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `jabsrv-cli/src/main/java/module-info.java` | `jabsrv/src/main/java/module-info.java` | 11 | 1.00 |
| `Convert.java` | `GenerateBibFromAux.java` | 9 | 1.00 |
| `JabKitLauncher.java` | `Fetch.java` | 6 | 1.00 |
| `CheckConsistency.java` | `Fetch.java` | 6 | 1.00 |
| `CheckIntegrity.java` | `Fetch.java` | 6 | 1.00 |

Evidence for the strongest edge (`jabsrv-cli/src/main/java/module-info.java` – `jabsrv/src/main/java/module-info.java`, up to 10 commits, newest first):

- `655964d` 2026-09-03 — Document package- and module-level Javadoc expectations in AGENTS.md (#16836)
- `30df54f` 2026-03-03 — Reduce complexity in dependencies setup (restore) (#15194)
- `eb08ca0` 2026-02-22 — Revert "Reduce complexity in dependencies setup (#15169)" (#15191)
- `10196d5` 2026-02-22 — Reduce complexity in dependencies setup (#15169)
- `96e9d29` 2025-11-16 — Chore(deps): Bump org.glassfish.jersey.core:jersey-server from 3.1.11 to 4.0.0 in /versions (#14305)
- `71c230f` 2025-07-09 — Revert module name changes for remaining 'unnamed' Jars (#13515)
- `0848124` 2025-07-09 — fix: revert Java module names to restore Status Log compatibility in JabRef 5.15 (#13511)
- `9656cf1` 2025-07-04 — Add http sever to GUI (#13457)
- `2c8615e` 2025-07-01 — Switch the Gradle build to org.gradlex.java-module plugins (#13401)
- `2c511c2` 2025-06-18 — Remove XJC plugin (#13376)

### Cluster 4 — 85 files, 17 packages, 2 modules

Packages: org.jabref.logic.layout.format (40), org.jabref.logic.importer.fileformat (18), org.jabref.logic.importer.fileformat.pdf (6), org.jabref.logic.layout (4), org.jabref.logic.util.strings (3), org.jabref.logic.citationkeypattern (2), org.jabref.logic.importer (2), org.jabref.gui.entryeditor (1), org.jabref.gui.maintable (1), org.jabref.logic.bibtex (1), org.jabref.logic.database (1), org.jabref.logic.formatter.casechanger (1), org.jabref.logic.importer.fetcher (1), org.jabref.logic.integrity (1), org.jabref.logic.openoffice.style (1), org.jabref.model.entry (1), org.jabref.model.strings (1)

Modules: jablib (83), jabgui (2)

Files:

- `jabgui/src/main/java/org/jabref/gui/entryeditor/RelatedArticlesTab.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ExtractReferencesAction.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldWriter.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/AbstractCitationKeyPatterns.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGenerator.java`
- `jablib/src/main/java/org/jabref/logic/database/DuplicateCheck.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/Title.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/Importer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDLibFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BiblioscapeImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CffImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CopacImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CustomImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteXmlImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/InspecImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/IsiImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlineImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlinePlainImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ModsImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MrDLibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MsBibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/OvidImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ReferImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RepecNepImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RisImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfEmbeddedBibFileImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfMergeMetadataImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfXmpImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/RuleBasedBibliographyPdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ValidCitationKeyChecker.java`
- `jablib/src/main/java/org/jabref/logic/layout/Layout.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutEntry.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutHelper.java`
- `jablib/src/main/java/org/jabref/logic/layout/StringInt.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsCommaReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FF.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FFAbbr.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorNatBib.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorOrgSci.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Authors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CompositeFormat.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateBibORDFAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateDocBook4Editors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CurrentDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DocBookAuthorFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/GetOpenOfficeType.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLParagraphs.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/IfPlural.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/LatexToUnicodeFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RTFChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBrackets.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBracketsAddComma.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveLatexCommandsFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveTilde.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisKeywords.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToLowerCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToUpperCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/XMLChars.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOPreFormatter.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/RtfCharMap.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/StringUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/XmlCharsMap.java`
- `jablib/src/main/java/org/jabref/model/entry/AuthorList.java`
- `jablib/src/main/java/org/jabref/model/strings/UnicodeToReadableCharMap.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CreateDocBook4Editors.java` | `DocBookAuthorFormatter.java` | 10 | 1.00 |
| `AuthorLF_FF.java` | `AuthorLF_FFAbbr.java` | 8 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorFirstLastCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstAbbrCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstCommas.java` | 7 | 1.00 |

Evidence for the strongest edge (`CreateDocBook4Editors.java` – `DocBookAuthorFormatter.java`, up to 10 commits, newest first):

- `9213e3c` 2018-11-25 — Add docbook 5 support (#4319)
- `ae4d4da` 2016-03-26 — Rename getAuthors to parse
- `f566b8d` 2016-03-26 — Rename some methods and add tests
- `3c8a68b` 2016-03-08 — Fixed some messed up formatting leading to a few split tests
- `122ece4` 2015-08-19 — Move AuthorList into model.entry
- `c076c80` 2015-08-17 — Move AuthorList to logic package
- `2ebb2a1` 2015-07-17 — Remove old SVN keyword fields and obsolete comments
- `ad87162` 2009-11-06 — Reworked author and editor handling in Docbook export. Added Docbook XML header.
- `cdcb374` 2007-08-19 — Second batch of fixing the warnings and generifying JabRef. Another 600 warnings are done.
- `5dd9ba3` 2005-01-27 — Fixed output of book editors, and added output of URL and DOI fields

### Cluster 10 — 33 files, 15 packages, 2 modules

Packages: org.jabref.gui.git (9), org.jabref.gui.fieldeditors.contextmenu (3), org.jabref.gui.keyboard (3), org.jabref.gui.preferences.keybindings (3), org.jabref.gui.actions (2), org.jabref.gui.frame (2), org.jabref.gui.preferences.keybindings.presets (2), org.jabref.logic.git (2), org.jabref.gui.entryeditor.fileannotationtab (1), org.jabref.gui.errorconsole (1), org.jabref.gui.util (1), org.jabref.logic.git.io (1), org.jabref.logic.git.preferences (1), org.jabref.logic.git.status (1), org.jabref.logic.git.util (1)

Modules: jabgui (27), jablib (6)

Files:

- `jabgui/src/main/java/org/jabref/gui/actions/ActionHelper.java`
- `jabgui/src/main/java/org/jabref/gui/actions/StandardActions.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationTabView.java`
- `jabgui/src/main/java/org/jabref/gui/errorconsole/ErrorConsoleView.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextMenuFactory.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/SingleSelectionMenuBuilder.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainToolBar.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPullAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPushAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitStatusViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBinding.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingCategory.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingRepository.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/BashKeyBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/NewEntryBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/util/URLs.java`
- `jablib/src/main/java/org/jabref/logic/git/GitHandler.java`
- `jablib/src/main/java/org/jabref/logic/git/GitSyncService.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitRevisionLocator.java`
- `jablib/src/main/java/org/jabref/logic/git/preferences/GitPreferences.java`
- `jablib/src/main/java/org/jabref/logic/git/status/GitStatusChecker.java`
- `jablib/src/main/java/org/jabref/logic/git/util/GitInitService.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GitHandler.java` | `GitSyncService.java` | 7 | 1.00 |
| `KeyBinding.java` | `NewEntryBindingPreset.java` | 6 | 1.00 |
| `GitHandler.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `GitSyncService.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `StandardActions.java` | `ContextAction.java` | 4 | 1.00 |

Evidence for the strongest edge (`GitHandler.java` – `GitSyncService.java`, up to 10 commits, newest first):

- `76baea0` 2026-09-06 — Gracefully handle JGit errors (#16882)
- `f7fb890` 2026-09-02 — Refactor/rewrite a bit requirements (#16798)
- `e7660a6` 2026-07-26 — Improve GitHub sharing and push handling (#16367)
- `5a91a7f` 2025-10-16 — Fix external file modification warnings during Git merge  (#13946)
- `0221118` 2025-08-29 — feat: implement Git pull & push with semantic merge support (#13744)
- `592fd18` 2025-08-07 — Fix: Decouple GitHandler creation via registry and extend semantic conflict detection (#13666)
- `bfa37f0` 2025-08-01 — Implement logic orchestration for Git Pull/Push operations (#13518)

### Cluster 2 — 106 files, 14 packages, 2 modules

Packages: org.jabref.logic.importer.fetcher (40), org.jabref.logic.integrity (21), org.jabref.logic.importer (15), org.jabref.model.entry.identifier (8), org.jabref.logic.importer.fetcher.transformers (7), org.jabref.gui.documentviewer (3), org.jabref.logic.importer.fetcher.isbntobibtex (2), org.jabref.logic.importer.fileformat (2), org.jabref.logic.importer.util (2), org.jabref.logic.layout.format (2), org.jabref.gui.clipboard (1), org.jabref.gui.edit (1), org.jabref.logic.cleanup (1), org.jabref.logic.net (1)

Modules: jablib (101), jabgui (5)

Files:

- `jabgui/src/main/java/org/jabref/gui/clipboard/ClipBoardManager.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/DocumentViewerView.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/DocumentViewerViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/documentviewer/ShowDocumentViewerAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyDoiUrlAction.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/DoiCleanup.java`
- `jablib/src/main/java/org/jabref/logic/importer/CompositeIdFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/EntryBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FetcherResult.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/QueryParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACMPortalFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACS.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AbstractIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ApsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ArXivFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AstrophysicsDataSystem.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BiodiversityLibrary.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BvbFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ComplexSearchQuery.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CompositeSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CrossRef.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CustomizableKeyFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DBLPFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DOAJFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DiVA.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiResolution.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GoogleScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GvkFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IEEE.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/INSPIREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ISIDOREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IacrEprintFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/JstorFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/LibraryOfCongress.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MathSciNet.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MedlineFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/Medra.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/OpenAccessDoi.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ResearchGate.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/RfcFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ScienceDirect.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SemanticScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureFullTextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureWebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TitleFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TrustLevel.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ZbMATH.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/EbookDeIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/IsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/AbstractQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/CollectionOfComputerScienceBibliographiesQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/GVKQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/IEEEQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/JstorQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/SpringerQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/ZbMathQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MarcXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/PicaXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/JsonReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/ShortDOIService.java`
- `jablib/src/main/java/org/jabref/logic/integrity/AbbreviationChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/BooktitleChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/BracketChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/CitationKeyChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/DoiValidityChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/EditionChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/FileChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/HTMLCharacterChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/HowPublishedChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ISBNChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/ISSNChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/IntegrityCheck.java`
- `jablib/src/main/java/org/jabref/logic/integrity/IntegrityMessage.java`
- `jablib/src/main/java/org/jabref/logic/integrity/JournalInAbbreviationListChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/MonthChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/NoteChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/PagesChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/PersonNamesChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/TitleChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/UrlChecker.java`
- `jablib/src/main/java/org/jabref/logic/integrity/YearChecker.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOICheck.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOIStrip.java`
- `jablib/src/main/java/org/jabref/logic/net/URLDownload.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ARK.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ArXivIdentifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/DOI.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISBN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISSN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/IacrEprint.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/Identifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/MathSciNetId.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `HowPublishedChecker.java` | `NoteChecker.java` | 5 | 1.00 |
| `BooktitleChecker.java` | `BracketChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `FileChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `ISSNChecker.java` | 4 | 1.00 |
| `BooktitleChecker.java` | `PagesChecker.java` | 4 | 1.00 |

Evidence for the strongest edge (`HowPublishedChecker.java` – `NoteChecker.java`, up to 10 commits, newest first):

- `f1746d2` 2026-04-22 — Fix npe in Bracket Checker (#15616)
- `f0b90ba` 2017-08-10 — Add validation to entry editor (#3090)
- `8f3f526` 2017-04-07 — Only check capitalization of note and howpublished fields if they start with a word character
- `8bdc55c` 2017-02-15 — Correct naming of biblatex (#2549)
- `f572318` 2017-01-15 — Group all checker which only check the value of one field (#2437)

### Cluster 8 — 51 files, 14 packages, 3 modules

Packages: org.jabref.logic.openoffice.style (9), org.jabref.gui.openoffice (8), org.jabref.logic.openoffice.oocsltext (7), org.jabref.logic.citationstyle (4), org.jabref.logic.openoffice.action (4), org.jabref.logic.openoffice.backend (4), org.jabref.logic.openoffice (3), org.jabref.logic.openoffice.frontend (3), org.jabref.model.openoffice.style (3), org.jabref.gui.preferences.openoffice (2), (default) (1), org.jabref.logic.openoffice.bst (1), org.jabref.model.openoffice (1), org.jabref.model.openoffice.backend (1)

Modules: jablib (40), jabgui (10), build-support (1)

Files:

- `build-support/src/main/java/CitationStyleCatalogGenerator.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/CSLStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/DetectOpenOfficeInstallation.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/JStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBase.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBaseConnect.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OpenOfficePanel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTabViewModel.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyle.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefLocaleProvider.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficeFileSearch.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficePreferences.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/ReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditInsert.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditMerge.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditSeparate.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/Update.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/Backend52.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/JStyleReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeManagerReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/PandocLatexConverter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/OOFrontend.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateCitationMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLUpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/BstStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyle.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetNumericCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOFormatBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessAuthorYearMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessCitationKeyMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessNumericMarkers.java`
- `jablib/src/main/java/org/jabref/model/openoffice/CitationEntry.java`
- `jablib/src/main/java/org/jabref/model/openoffice/backend/NamedRangeManager.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroup.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroups.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationType.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JStyleSelectViewModel.java` | `StyleSelectDialogViewModel.java` | 6 | 1.00 |
| `EditInsert.java` | `EditSeparate.java` | 5 | 1.00 |
| `EditMerge.java` | `EditSeparate.java` | 5 | 1.00 |
| `JStyle.java` | `JStyleGetNumericCitationMarker.java` | 5 | 1.00 |
| `OOFormatBibliography.java` | `OOProcessAuthorYearMarkers.java` | 5 | 1.00 |

Evidence for the strongest edge (`JStyleSelectViewModel.java` – `StyleSelectDialogViewModel.java`, up to 10 commits, newest first):

- `8a1ec40` 2026-07-25 — Support BST styles in LibreOffice (#16315)
- `f50e3e3` 2025-04-18 — CSL4LibreOffice - G [Custom CSL Styles, build-time loading] (#12951)
- `771c4cd` 2024-07-25 — CSL4LibreOffice - B [GSoC '24] (#11521)
- `ebed223` 2021-06-03 — step0 : start model/openoffice, logic/openoffice/style (#7772)
- `d223bdd` 2020-04-05 — Fix storing of custom jstyles (#6242)
- `18aba35` 2019-01-25 —  Convert OO/LO SidePanel to javafx (#4341)

### Cluster 7 — 52 files, 12 packages, 2 modules

Packages: org.jabref.gui.fieldeditors (25), org.jabref.gui.autocompleter (7), org.jabref.gui.fieldeditors.identifier (5), org.jabref.gui.fieldeditors.optioneditors (3), org.jabref.gui.fieldeditors.optioneditors.mapbased (3), org.jabref.gui.fieldeditors.contextmenu (2), org.jabref.gui.linkedfile (2), org.jabref.gui.util (1), org.jabref.gui.util.component (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.util (1), org.jabref.model.entry (1)

Modules: jabgui (49), jablib (3)

Files:

- `jabgui/src/main/java/org/jabref/gui/autocompleter/BibEntrySuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/ContentSelectorSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/JournalsSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/PersonNameSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/StringSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProviders.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/AbstractEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationCountEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextArea.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextField.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/ISSNEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalInfoOptInDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/MarkdownEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/DefaultMenu.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/EditorMenus.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/BaseIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/DoiIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/EprintIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/ISBNIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/IdentifierEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/MapBasedEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/PatentTypeEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/YesNoEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileFromURLAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/DeleteFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelListCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/component/TemporalAccessorPicker.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/CleanupUrlFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/IdentifierParser.java`
- `jablib/src/main/java/org/jabref/model/entry/Date.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `FieldEditors.java` | `MonthEditorViewModel.java` | 6 | 1.00 |
| `ContentSelectorSuggestionProvider.java` | `FieldEditors.java` | 5 | 1.00 |
| `FieldEditors.java` | `OwnerEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `OptionEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `PatentTypeEditorViewModel.java` | 5 | 1.00 |

Evidence for the strongest edge (`FieldEditors.java` – `MonthEditorViewModel.java`, up to 10 commits, newest first):

- `d9b38ce` 2024-12-02 — Added support for (biblatex) `langid` to be an optional field in entry editor (#12071)
- `e0333c4` 2024-06-13 — Fix content selector present for custom entry type (#11371)
- `5217bad` 2020-04-19 — Remove cache of auto completion results (#6310)
- `f0b90ba` 2017-08-10 — Add validation to entry editor (#3090)
- `b9bd27c` 2017-07-11 — [WIP] Complete rework of the auto completion (#2965)
- `4543592` 2017-05-06 — Reimplement option field editors in JavaFX (#2824)

### Cluster 12 — 27 files, 12 packages, 2 modules

Packages: org.jabref.logic.shared (10), org.jabref.logic.shared.exception (4), org.jabref.gui.shared (3), org.jabref.logic.shared.event (2), org.jabref.logic.ai.embedding (1), org.jabref.logic.ai.util (1), org.jabref.logic.shared.prefs (1), org.jabref.logic.shared.security (1), org.jabref.model.database (1), org.jabref.model.database.event (1), org.jabref.model.entry (1), org.jabref.model.entry.event (1)

Modules: jablib (24), jabgui (3)

Files:

- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseLoginDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseLoginDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/shared/SharedDatabaseUIManager.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/MVStoreEmbeddingStore.java`
- `jablib/src/main/java/org/jabref/logic/ai/util/MVStoreBase.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnection.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnectionProperties.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSConnectionPropertiesBuilder.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSProcessor.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSSynchronizer.java`
- `jablib/src/main/java/org/jabref/logic/shared/DBMSType.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseConnection.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseConnectionProperties.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseNotSupportedException.java`
- `jablib/src/main/java/org/jabref/logic/shared/DatabaseSynchronizer.java`
- `jablib/src/main/java/org/jabref/logic/shared/event/ConnectionLostEvent.java`
- `jablib/src/main/java/org/jabref/logic/shared/event/UpdateRefusedEvent.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/InvalidDBMSConnectionPropertiesException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/NotASharedDatabaseException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/OfflineLockException.java`
- `jablib/src/main/java/org/jabref/logic/shared/exception/SharedEntryNotPresentException.java`
- `jablib/src/main/java/org/jabref/logic/shared/prefs/SharedDatabasePreferences.java`
- `jablib/src/main/java/org/jabref/logic/shared/security/Password.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseContext.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/SharedBibEntryData.java`
- `jablib/src/main/java/org/jabref/model/entry/event/EntriesEvent.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DBMSConnectionProperties.java` | `DatabaseConnectionProperties.java` | 7 | 1.00 |
| `SharedDatabaseLoginDialogViewModel.java` | `DBMSConnectionPropertiesBuilder.java` | 4 | 1.00 |
| `SharedDatabaseUIManager.java` | `ConnectionLostEvent.java` | 4 | 1.00 |
| `DBMSConnection.java` | `ConnectionLostEvent.java` | 4 | 1.00 |
| `DBMSConnectionProperties.java` | `DBMSConnectionPropertiesBuilder.java` | 4 | 1.00 |

Evidence for the strongest edge (`DBMSConnectionProperties.java` – `DatabaseConnectionProperties.java`, up to 10 commits, newest first):

- `0e74a43` 2026-09-07 — Fill shared database login from a pasted connection URL (#16800)
- `1584dea` 2026-09-06 — Rework shared SQL database synchronization (PostgreSQL, live updates) (#11879)
- `77c5188` 2024-06-17 — Add expert mode for shared database connection (#11303)
- `ea5e632` 2019-11-29 — Fix database tests and enable running using GitHub workflows (#5676)
- `544a2d5` 2018-11-15 — Added feature to add server timezone when connecting to shared database (#4483)
- `ef088e2` 2018-08-31 — Convert SharedDatabaseConnect Dialog to Javafx (#4040)
- `c751715` 2018-01-02 — Refactor shared package into the architecture (#3523)

### Cluster 11 — 28 files, 10 packages, 1 module

Packages: org.jabref.gui.mergeentries.threewaymerge (7), org.jabref.gui.mergeentries.threewaymerge.cell (6), org.jabref.gui.mergeentries.threewaymerge.fieldsmerger (6), org.jabref.gui.mergeentries.threewaymerge.diffhighlighter (3), org.jabref.gui.collab (1), org.jabref.gui.collab.entrychange (1), org.jabref.gui.duplicationFinder (1), org.jabref.gui.mergeentries (1), org.jabref.gui.mergeentries.threewaymerge.cell.sidebuttons (1), org.jabref.gui.mergeentries.threewaymerge.toolbar (1)

Modules: jabgui (28)

Files:

- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeResolverFactory.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryChangeResolver.java`
- `jabgui/src/main/java/org/jabref/gui/duplicationFinder/DuplicateResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/FetchAndMergeEntry.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/FieldRowView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/FieldRowViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/MergeEntriesAction.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/MergeEntriesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeHeaderView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/ThreeWayMergeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/FieldNameCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/FieldValueCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/HeaderCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/MergedFieldCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/OpenExternalLinkAction.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/ThreeWayMergeCell.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/cell/sidebuttons/ToggleMergeUnmergeButton.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/DiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/SplitDiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/diffhighlighter/UnifiedDiffHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/CommentMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FieldMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FieldMergerFactory.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/FileMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/GroupMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/fieldsmerger/KeywordMerger.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/threewaymerge/toolbar/ThreeWayMergeToolbar.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DatabaseChangeResolverFactory.java` | `EntryChangeResolver.java` | 6 | 1.00 |
| `ThreeWayMergeView.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `FieldValueCell.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `HeaderCell.java` | `OpenExternalLinkAction.java` | 4 | 1.00 |
| `DuplicateResolverDialog.java` | `ThreeWayMergeHeaderView.java` | 3 | 1.00 |

Evidence for the strongest edge (`DatabaseChangeResolverFactory.java` – `EntryChangeResolver.java`, up to 10 commits, newest first):

- `998ac47` 2023-03-26 — Update preference; remove guiPreference redundant objects
- `d0cd71e` 2023-03-26 — Refactor out PlainTextOrDiff Enum(?); Use guiPreferences; add mergePlainTextOrDiff to JabrefPreferences
- `c43caa7` 2022-12-11 — Fixed tests, reduced calls to preferencesService and applied minor ide suggestions
- `e86839a` 2022-12-05 — Allow users to review backup changes before restoring them or merge them selectively (#9311)
- `4fd60d2` 2022-11-28 — Fix for issue 9053: highlights wrong characters (#9289)
- `05ff677` 2022-08-30 — [WIP][GSOC22] - C - Improve the external changes resolver dialog (#9021)

### Cluster 16 — 16 files, 10 packages, 2 modules

Packages: org.jabref.logic.ai.embedding (3), org.jabref.gui.ai.chat (2), org.jabref.gui.preferences.ai (2), org.jabref.logic.ai.models (2), org.jabref.logic.ai.preferences (2), org.jabref.gui.ai (1), org.jabref.logic.ai (1), org.jabref.logic.ai.chatting (1), org.jabref.logic.ai.ingestion.repositories (1), org.jabref.model.ai.chatting (1)

Modules: jablib (11), jabgui (5)

Files:

- `jabgui/src/main/java/org/jabref/gui/ai/AiPrivacyNoticeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/ai/chat/AiChatStatusViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/ai/chat/AiChatViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ai/AiTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ai/AiTabViewModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/AiService.java`
- `jablib/src/main/java/org/jabref/logic/ai/chatting/JvmOpenAiChatLanguageModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/AsyncEmbeddingModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/DeepJavaEmbeddingModel.java`
- `jablib/src/main/java/org/jabref/logic/ai/embedding/EmbeddingModelCache.java`
- `jablib/src/main/java/org/jabref/logic/ai/ingestion/repositories/MVStoreIngestedDocumentsRepository.java`
- `jablib/src/main/java/org/jabref/logic/ai/models/AiModelService.java`
- `jablib/src/main/java/org/jabref/logic/ai/models/OpenAiCompatibleModelProvider.java`
- `jablib/src/main/java/org/jabref/logic/ai/preferences/AiDefaultExpertSettings.java`
- `jablib/src/main/java/org/jabref/logic/ai/preferences/AiPreferences.java`
- `jablib/src/main/java/org/jabref/model/ai/chatting/ErrorMessage.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AiPrivacyNoticeViewModel.java` | `EmbeddingModelCache.java` | 3 | 1.00 |
| `AiChatStatusViewModel.java` | `AiChatViewModel.java` | 3 | 1.00 |
| `AiService.java` | `DeepJavaEmbeddingModel.java` | 3 | 1.00 |
| `AiService.java` | `EmbeddingModelCache.java` | 3 | 1.00 |
| `AiService.java` | `MVStoreIngestedDocumentsRepository.java` | 3 | 1.00 |

Evidence for the strongest edge (`AiPrivacyNoticeViewModel.java` – `EmbeddingModelCache.java`, up to 10 commits, newest first):

- `df06646` 2026-09-15 — Use intfloat/multilingual-e5-small as default embedding model (#17120)
- `3c8485b` 2026-09-09 — Dynamically discover embedding model sizes and token sequence limits (#16914)
- `e3ec1a1` 2026-06-18 — Fix start of AI processes when they are disabled (#15976)

### Cluster 18 — 14 files, 10 packages, 1 module

Packages: org.jabref.gui.collab.entrychange (3), org.jabref.gui.collab (2), org.jabref.gui.git (2), org.jabref.gui.collab.groupchange (1), org.jabref.gui.collab.metedatachange (1), org.jabref.gui.collab.preamblechange (1), org.jabref.gui.collab.stringadd (1), org.jabref.gui.collab.stringchange (1), org.jabref.gui.collab.stringdelete (1), org.jabref.gui.collab.stringrename (1)

Modules: jabgui (14)

Files:

- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/DatabaseChangeDetailsViewFactory.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/EntryWithPreviewAndSourceDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/entrychange/PreviewWithSourceTab.java`
- `jabgui/src/main/java/org/jabref/gui/collab/groupchange/GroupChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/metedatachange/MetadataChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/preamblechange/PreambleChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringadd/BibTexStringAddDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringchange/BibTexStringChangeDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringdelete/BibTexStringDeleteDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/collab/stringrename/BibTexStringRenameDetailsView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitDiffDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitEntryChangeDetailsView.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `DatabaseChangeDetailsView.java` | `PreambleChangeDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringAddDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringChangeDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringDeleteDetailsView.java` | 3 | 1.00 |
| `DatabaseChangeDetailsView.java` | `BibTexStringRenameDetailsView.java` | 3 | 1.00 |

Evidence for the strongest edge (`DatabaseChangeDetailsView.java` – `PreambleChangeDetailsView.java`, up to 10 commits, newest first):

- `3401b71` 2024-06-23 — Fix missing external changes resolver dialog scrollbar  (#11415)
- `e86839a` 2022-12-05 — Allow users to review backup changes before restoring them or merge them selectively (#9311)
- `05ff677` 2022-08-30 — [WIP][GSOC22] - C - Improve the external changes resolver dialog (#9021)

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 15 | 19 | 6 | 2 | `AndMatcher.java` – `OrMatcher.java` | 6 | 0.86 | `bd3ef32`, `5e513d0`, `afb7835` |
| 19 | 14 | 5 | 1 | `EditFieldContentTabView.java` – `RenameFieldTabView.java` | 6 | 1.00 | `75464e8`, `a07a0a4`, `5c362e3` |
| 23 | 8 | 5 | 2 | `GroupNodeViewModel.java` – `AutomaticGroup.java` | 3 | 1.00 | `772fe14`, `67e457c`, `1973386` |
| 13 | 25 | 4 | 1 | `CapitalizeFormatter.java` – `LowerCaseFormatter.java` | 10 | 0.91 | `1e3bc02`, `8aab893`, `c09e472` |
| 14 | 22 | 4 | 2 | `BiblatexApaField.java` – `StandardField.java` | 5 | 1.00 | `ccda46d`, `97e0130`, `49eb6b2` |
| 17 | 16 | 4 | 2 | `StudyCatalogToFetcherConverter.java` – `StudyQuery.java` | 4 | 1.00 | `939f293`, `546e041`, `db1e651` |
| 21 | 9 | 3 | 1 | `CAYWResource.java` – `BibLatexFormatter.java` | 5 | 1.00 | `dd5d481`, `ce5cd12`, `f31eebd` |
| 22 | 8 | 3 | 2 | `FileAnnotationTab.java` – `AnnotationImporter.java` | 3 | 1.00 | `8751cef`, `e669157`, `41d1551` |
| 28 | 3 | 3 | 1 | `BibTeXHighlighter.java` – `SourceTab.java` | 4 | 1.00 | `3d6b90c`, `7ba0d72`, `6b92b7a` |
| 30 | 3 | 3 | 2 | `ISSNEditorViewModel.java` – `JournalInformationFetcher.java` | 3 | 1.00 | `61ef1e8`, `86870cb`, `17a215d` |
| 32 | 3 | 3 | 1 | `BibFieldsIndexer.java` – `PostgresConstants.java` | 3 | 1.00 | `fdb26b4`, `f07dfad`, `1bb4e39` |
| 20 | 13 | 2 | 2 | `GuiPushToEmacsSettings.java` – `GuiPushToVimSettings.java` | 8 | 1.00 | `ce08d0d`, `ab13b2a`, `9a5b7d1` |
| 25 | 4 | 2 | 1 | `CleanupSingleFieldPanel.java` – `CleanupSingleFieldViewModel.java` | 3 | 1.00 | `bae2346`, `23525e9`, `c0642a7` |
| 27 | 4 | 2 | 1 | `SearchQueryExtractorVisitor.java` – `SearchToLuceneVisitor.java` | 3 | 1.00 | `7ba0d72`, `97d548a`, `861b00b` |
| 29 | 3 | 2 | 2 | `DefaultFileUpdateMonitor.java` – `FileUpdateMonitor.java` | 4 | 0.80 | `85dff5f`, `5c9edc9`, `e8eb8e6` |
| 31 | 3 | 2 | 2 | `ProtectedTermsLoader.java` – `ProtectedTermsParser.java` | 3 | 0.60 | `4a8404c`, `4c82d3e`, `381b569` |
| 34 | 2 | 2 | 2 | `AiChatView.java` – `GenerateSummaryAiDatabaseListener.java` | 3 | 0.75 | `6278949`, `e56d5ee`, `e3ec1a1` |
| 37 | 2 | 2 | 1 | `ErrorConsoleViewModel.java` – `LogMessages.java` | 4 | 0.80 | `1c7da01`, `b3381ed`, `462bce4` |
| 42 | 2 | 2 | 1 | `SelectableTextFlow.java` – `MarkdownTextFlow.java` | 4 | 0.80 | `97d6111`, `7ecbaa5`, `074b682` |
| 48 | 2 | 2 | 1 | `RemoteListenerServerManager.java` – `HeadlessExecutorService.java` | 4 | 1.00 | `9656cf1`, `861b00b`, `0e7c1ff` |
| 24 | 5 | 1 | 1 | `DefaultDesktop.java` – `Linux.java` | 16 | 1.00 | `434db3d`, `3a731fa`, `84f15fd` |
| 26 | 4 | 1 | 1 | `ExternalFileTypesTab.java` – `ExternalFileTypesTabViewModel.java` | 6 | 0.75 | `ca3ed25`, `c604ecb`, `0b58079` |
| 33 | 2 | 1 | 1 | `JournalListMvGenerator.java` – `LtwaListMvGenerator.java` | 17 | 0.81 | `c5d988b`, `fd6ed4c`, `4f329ae` |
| 35 | 2 | 1 | 1 | `ConsistencyCheckDialog.java` – `ConsistencyCheckDialogViewModel.java` | 4 | 0.57 | `ccda46d`, `f8f5a38`, `5063bc3` |
| 36 | 2 | 1 | 1 | `DownloadLinkedFileAction.java` – `RedownloadMissingFilesAction.java` | 3 | 1.00 | `e801f41`, `9f2418b`, `2777ebc` |
| 38 | 2 | 1 | 1 | `DiffMethod.java` – `GroupDiffMode.java` | 3 | 1.00 | `dddaa7a`, `f63eb46`, `4fd60d2` |
| 39 | 2 | 1 | 1 | `ModifyBibliographyPropertiesDialogView.java` – `ModifyBibliographyPropertiesDialogViewModel.java` | 3 | 1.00 | `6013237`, `8a1ec40`, `0a1d67b` |
| 40 | 2 | 1 | 1 | `AutoCompletionTab.java` – `AutoCompletionTabViewModel.java` | 3 | 1.00 | `ccda46d`, `8afe793`, `bc5c4fc` |
| 41 | 2 | 1 | 1 | `RedoAction.java` – `UndoAction.java` | 3 | 1.00 | `ecd78de`, `9634a13`, `3ee825d` |
| 43 | 2 | 1 | 1 | `AtomicFileOutputStream.java` – `AtomicFileWriter.java` | 3 | 1.00 | `aa3821a`, `99b4bae`, `e83680f` |
| 44 | 2 | 1 | 1 | `ConflictRules.java` – `FieldPatchComputer.java` | 3 | 1.00 | `c759eda`, `5a91a7f`, `24c55e7` |
| 45 | 2 | 1 | 1 | `FirstPage.java` – `LastPage.java` | 4 | 0.80 | `d687c08`, `e034c51`, `37c81b9` |
| 46 | 2 | 1 | 1 | `ZoteroCitationData.java` – `ZoteroCitationMarkParser.java` | 4 | 1.00 | `45f2b8a`, `9d77273`, `cbe82e2` |
| 47 | 2 | 1 | 1 | `DefinitionProvider.java` – `DefinitionProviderFactory.java` | 3 | 1.00 | `cbb4d1f`, `ea18473`, `a985422` |

## Resolution = 2.0

Clusters (≥2 files): 56 · largest: 105 files · nodes in single-file clusters: 0

_Clusters are groups of files that Leiden put together because they are densely connected by co-change; single-file clusters are graph nodes that were not grouped with any other file._

Modularity: 0.72

_How much denser the links inside clusters are than expected by chance at this resolution (higher = sharper split); values for different resolutions are not directly comparable._

Build module agreement: 83.43% of files in clusters with ≥2 files are in a cluster whose dominant module is their own module

_Close to 100% means clusters mostly mirror build modules; lower values mean co-change crosses module boundaries._

_Clusters are ordered by number of packages, then number of files. The first 15 are shown in full, the rest in a condensed table._

### Cluster 1 — 88 files, 46 packages, 3 modules

Packages: org.jabref.logic.exporter (7), org.jabref.logic.preferences (6), org.jabref.logic.xmp (6), org.jabref.logic (4), org.jabref.gui.commonfxcontrols (3), org.jabref.gui.exporter (3), org.jabref.gui.importer (3), org.jabref.logic.remote (3), org.jabref.logic.remote.server (3), org.jabref.cli (2), org.jabref.gui.edit (2), org.jabref.gui.linkedfile (2), org.jabref.gui.preferences.customexporter (2), org.jabref.gui.preferences.entry (2), org.jabref.gui.preferences.export (2), org.jabref.gui.preferences.linkedfiles (2), org.jabref.gui.preferences.websearch (2), org.jabref.logic.importer (2), org.jabref.logic.importer.util (2), org.jabref.logic.net.ssl (2), org.jabref.logic.protectedterms (2), org.jabref.logic.util.io (2), org.jabref (1), org.jabref.gui (1), org.jabref.gui.autocompleter (1), org.jabref.gui.externalfiles (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.frame (1), org.jabref.gui.libraryproperties.saving (1), org.jabref.gui.preferences (1), org.jabref.gui.preferences.customimporter (1), org.jabref.gui.remote (1), org.jabref.gui.specialfields (1), org.jabref.logic.bibtex (1), org.jabref.logic.cleanup (1), org.jabref.logic.externalfiles (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.fetcher (1), org.jabref.logic.l10n (1), org.jabref.logic.layout (1), org.jabref.logic.layout.format (1), org.jabref.logic.net (1), org.jabref.logic.remote.client (1), org.jabref.model.entry (1), org.jabref.model.metadata (1), org.jabref.support (1)

Modules: jablib (51), jabgui (36), test-support (1)

Files:

- `jabgui/src/main/java/org/jabref/Launcher.java`
- `jabgui/src/main/java/org/jabref/cli/ArgumentProcessor.java`
- `jabgui/src/main/java/org/jabref/cli/GuiCommandLine.java`
- `jabgui/src/main/java/org/jabref/gui/CoreGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SaveOrderConfigPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/SortCriterionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsDialog.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/CreateModifyExporterDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileExtensionViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrameViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/importer/GrobidUseDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialog.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportCustomEntryTypesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/saving/SavingPropertiesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialog.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/LinkedFileEditDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilter.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customexporter/CustomExporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entry/EntryTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/export/ExportTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/linkedfiles/LinkedFilesTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/websearch/WebSearchTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/remote/CLIMessageHandler.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldsPreferences.java`
- `jablib/src/main/java/org/jabref/logic/FilePreferences.java`
- `jablib/src/main/java/org/jabref/logic/InternalPreferences.java`
- `jablib/src/main/java/org/jabref/logic/LibraryPreferences.java`
- `jablib/src/main/java/org/jabref/logic/UiCommand.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldPreferences.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/FieldFormatterCleanupActions.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibDatabaseWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/EmbeddedBibFilePdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExportPreferences.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ExporterFactory.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/XmpPdfExporter.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/ExternalFilesContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/ConvertMSCCodesFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImporterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDlibPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidPreferences.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GrobidService.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Language.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatterPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/SSLPreferences.java`
- `jablib/src/main/java/org/jabref/logic/net/ssl/TrustStoreManager.java`
- `jablib/src/main/java/org/jabref/logic/preferences/CliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/DOIPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/JabRefCliPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/LastFilesOpenedPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/OwnerPreferences.java`
- `jablib/src/main/java/org/jabref/logic/preferences/TimestampPreferences.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsList.java`
- `jablib/src/main/java/org/jabref/logic/protectedterms/ProtectedTermsPreferences.java`
- `jablib/src/main/java/org/jabref/logic/remote/Protocol.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteMessage.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemotePreferences.java`
- `jablib/src/main/java/org/jabref/logic/remote/client/RemoteClient.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServer.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServerThread.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteMessageHandler.java`
- `jablib/src/main/java/org/jabref/logic/util/io/AutoLinkPreferences.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinders.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DocumentInformationExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/DublinCoreExtractor.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpPreferences.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilReader.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilShared.java`
- `jablib/src/main/java/org/jabref/logic/xmp/XmpUtilWriter.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntryPreferences.java`
- `jablib/src/main/java/org/jabref/model/metadata/SaveOrder.java`
- `test-support/src/main/java/org/jabref/support/BibEntryAssert.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JabRefCliPreferences.java` | `TimestampPreferences.java` | 6 | 1.00 |
| `SortCriterionViewModel.java` | `JabRefCliPreferences.java` | 4 | 1.00 |
| `SortCriterionViewModel.java` | `SaveOrder.java` | 4 | 1.00 |
| `LibraryPreferences.java` | `JabRefCliPreferences.java` | 4 | 1.00 |
| `SSLPreferences.java` | `JabRefCliPreferences.java` | 4 | 1.00 |

Evidence for the strongest edge (`JabRefCliPreferences.java` – `TimestampPreferences.java`, up to 10 commits, newest first):

- `246d787` 2026-06-30 — Introduce PreferencesBinding in JabRefCliPreferences, Comeback of PreferencesFilter (#16101)
- `59f1797` 2026-04-08 — Fix reset and import for Library, DOI, Owner, Timestamp and Remote Preferences (#15514)
- `ac84e5d` 2021-09-01 — Observable Preferences C (General) (#8047)
- `e66f5be` 2021-01-14 — Add date fields (#7334)
- `64e35c1` 2020-03-28 — Refactored general preferences (#6171)
- `451d829` 2017-08-10 — Fetcher timestamp (#3092)

### Cluster 0 — 105 files, 43 packages, 2 modules

Packages: org.jabref.logic.exporter (7), org.jabref.gui.edit (6), org.jabref.gui.help (6), org.jabref.gui.frame (5), org.jabref.logic.layout.format (5), org.jabref.gui (4), org.jabref.gui.exporter (4), org.jabref.gui.externalfiles (4), org.jabref.gui.importer.actions (4), org.jabref.gui.maintable (4), org.jabref.gui.specialfields (4), org.jabref.gui.copyfiles (3), org.jabref.gui.entryeditor (3), org.jabref.gui.importer (3), org.jabref.gui.preferences.protectedterms (3), org.jabref.gui.util (3), org.jabref.logic.util (3), org.jabref.logic.util.io (3), org.jabref.gui.actions (2), org.jabref.gui.auximport (2), org.jabref.gui.citationkeypattern (2), org.jabref.gui.dialogs (2), org.jabref.gui.menus (2), org.jabref.gui.preferences (2), org.jabref.gui.autocompleter (1), org.jabref.gui.backup (1), org.jabref.gui.duplicationFinder (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.importer.fetcher (1), org.jabref.gui.integrity (1), org.jabref.gui.libraryproperties (1), org.jabref.gui.linkedfile (1), org.jabref.gui.maintable.columns (1), org.jabref.gui.mergeentries (1), org.jabref.gui.preferences.customimporter (1), org.jabref.gui.search (1), org.jabref.gui.shared (1), org.jabref.gui.util.comparator (1), org.jabref.logic.importer (1), org.jabref.logic.search.sqlbased (1), org.jabref.migrations (1), org.jabref.model.entry.field (1), org.jabref.model.search (1)

Modules: jabgui (83), jablib (22)

Files:

- `jabgui/src/main/java/org/jabref/gui/JabRefGuiStateManager.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTab.java`
- `jabgui/src/main/java/org/jabref/gui/LibraryTabContainer.java`
- `jabgui/src/main/java/org/jabref/gui/StateManager.java`
- `jabgui/src/main/java/org/jabref/gui/actions/ActionFactory.java`
- `jabgui/src/main/java/org/jabref/gui/actions/JabRefAction.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/WordSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/FromAuxDialog.java`
- `jabgui/src/main/java/org/jabref/gui/auximport/NewSubLibraryAction.java`
- `jabgui/src/main/java/org/jabref/gui/backup/BackupResolverDialog.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeyAction.java`
- `jabgui/src/main/java/org/jabref/gui/citationkeypattern/GenerateCitationKeySingleAction.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/copyfiles/CopyFilesTask.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/AutosaveUiManager.java`
- `jabgui/src/main/java/org/jabref/gui/dialogs/BackupUIManager.java`
- `jabgui/src/main/java/org/jabref/gui/duplicationFinder/DuplicateSearch.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyMoreAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ManageKeywordsAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/OpenBrowserAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringAction.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringView.java`
- `jabgui/src/main/java/org/jabref/gui/edit/ReplaceStringViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/OpenEntryEditorAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewSwitchAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveAllAction.java`
- `jabgui/src/main/java/org/jabref/gui/exporter/SaveDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoLinkFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/DownloadFullTextAction.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FindUnlinkedFilesAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldNameLabel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/FileHistoryMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/JabRefFrame.java`
- `jabgui/src/main/java/org/jabref/gui/frame/OpenConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsEMailAction.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SendAsStandardEmailAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/help/AboutDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/help/ErrorConsoleAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/HelpAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/NewVersionDialog.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/NewEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/CheckForNewEntryTypesAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/GUIPostOpenAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/ImportCommand.java`
- `jabgui/src/main/java/org/jabref/gui/importer/actions/OpenDatabaseAction.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/LookupIdentifierAction.java`
- `jabgui/src/main/java/org/jabref/gui/integrity/IntegrityCheckAction.java`
- `jabgui/src/main/java/org/jabref/gui/libraryproperties/LibraryPropertiesAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenFolderAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/OpenUrlAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/RightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/SearchShortScienceAction.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FileColumn.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeAction.java`
- `jabgui/src/main/java/org/jabref/gui/menus/ChangeEntryTypeMenu.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/MergeWithFetchedEntryAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesFilterDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/ShowPreferencesAction.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/customimporter/CustomImporterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/NewProtectedTermsFileDialog.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/protectedterms/ProtectedTermsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/RebuildFulltextSearchIndexAction.java`
- `jabgui/src/main/java/org/jabref/gui/shared/ConnectToSharedDatabaseCommand.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldAction.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldMenuItemFactory.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldValueViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/specialfields/SpecialFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileDialogConfiguration.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileFilterConverter.java`
- `jabgui/src/main/java/org/jabref/gui/util/IconValidationDecorator.java`
- `jabgui/src/main/java/org/jabref/gui/util/comparator/RankingFieldComparator.java`
- `jabgui/src/main/java/org/jabref/migrations/ConvertLegacyExplicitGroups.java`
- `jablib/src/main/java/org/jabref/logic/exporter/Exporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MSBibExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/ModsExporter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentSpreadsheetCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenOfficeDocumentCreator.java`
- `jablib/src/main/java/org/jabref/logic/exporter/SaveException.java`
- `jablib/src/main/java/org/jabref/logic/exporter/TemplateExporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/ParserResult.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NotFoundFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Number.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Replace.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/WrapContent.java`
- `jablib/src/main/java/org/jabref/logic/search/sqlbased/SqlBasedLibrarySearcher.java`
- `jablib/src/main/java/org/jabref/logic/util/FileType.java`
- `jablib/src/main/java/org/jabref/logic/util/OptionalObjectProperty.java`
- `jablib/src/main/java/org/jabref/logic/util/StandardFileType.java`
- `jablib/src/main/java/org/jabref/logic/util/io/BackupFileUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/CitationKeyBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileHistory.java`
- `jablib/src/main/java/org/jabref/model/entry/field/SpecialFieldValue.java`
- `jablib/src/main/java/org/jabref/model/search/SearchDisplayMode.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AutosaveUiManager.java` | `SaveDatabaseAction.java` | 15 | 1.00 |
| `JabRefFrame.java` | `LibraryPropertiesAction.java` | 10 | 1.00 |
| `JabRefFrame.java` | `SpecialFieldMenuItemFactory.java` | 6 | 1.00 |
| `RightClickMenu.java` | `SpecialFieldMenuItemFactory.java` | 6 | 1.00 |
| `OpenBrowserAction.java` | `JabRefFrame.java` | 5 | 1.00 |

Evidence for the strongest edge (`AutosaveUiManager.java` – `SaveDatabaseAction.java`, up to 10 commits, newest first):

- `a77969d` 2026-09-06 — Add auto-commit, push & pull features for Git (#16651)
- `a20d356` 2026-08-06 — Add per library journal abbreviation type (LTWA) on save  (#15517)
- `5be9e29` 2025-04-16 — Fix "Reveal in file explorer" option (#12950)
- `c951dd7` 2023-09-04 — Refactored importAction and addTab methods, introduced MainToolbar and MainMenu (#10305)
- `6a71395` 2022-08-16 — AtomicFileOutputStream does not overwrite file if exception occurred during write (#9067)
- `3f9922e` 2020-03-15 — More refactorings
- `b364396` 2020-03-14 — Refactor SaveAction
- `382c4b2` 2019-11-28 — Add tests for "changed" flag (#5640)
- `67780cc` 2019-11-06 — Fix 5555 status popups (#5560)
- `7f970bc` 2019-08-25 — Remove Globals at SaveDatabaseAction

### Cluster 4 — 65 files, 28 packages, 2 modules

Packages: org.jabref.logic.journals (7), org.jabref.model.entry (5), org.jabref.model.entry.types (5), org.jabref.gui.preferences.journals (4), org.jabref.logic.citationstyle (4), org.jabref.logic.msbib (4), org.jabref.logic.util.io (4), org.jabref.logic.bst.util (3), org.jabref.logic.util (3), org.jabref.model.database (3), org.jabref.model.metadata (3), org.jabref.logic.exporter (2), org.jabref.logic.importer.util (2), org.jabref.model.groups (2), org.jabref.gui.fieldeditors (1), org.jabref.gui.groups (1), org.jabref.gui.util (1), org.jabref.logic.bibtex.comparator (1), org.jabref.logic.formatter (1), org.jabref.logic.importer (1), org.jabref.logic.integrity (1), org.jabref.logic.l10n (1), org.jabref.logic.layout (1), org.jabref.logic.layout.format (1), org.jabref.logic.net (1), org.jabref.logic.remote (1), org.jabref.logic.util.strings (1), org.jabref.migrations (1)

Modules: jablib (57), jabgui (8)

Files:

- `jabgui/src/main/java/org/jabref/gui/fieldeditors/URLUtil.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDescriptions.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/AbbreviationsFileViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/BindingsHelper.java`
- `jabgui/src/main/java/org/jabref/migrations/CustomEntryTypePreferenceMigration.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/MetaDataDiff.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstNameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstPurifier.java`
- `jablib/src/main/java/org/jabref/logic/bst/util/BstTextPrefixer.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLAdapter.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleCache.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleGenerator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyleOutputFormat.java`
- `jablib/src/main/java/org/jabref/logic/exporter/GroupSerializer.java`
- `jablib/src/main/java/org/jabref/logic/exporter/MetaDataSerializer.java`
- `jablib/src/main/java/org/jabref/logic/formatter/Formatters.java`
- `jablib/src/main/java/org/jabref/logic/importer/AuthorListParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/GroupsParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/MetaDataParser.java`
- `jablib/src/main/java/org/jabref/logic/integrity/NoBibtexFieldChecker.java`
- `jablib/src/main/java/org/jabref/logic/journals/Abbreviation.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationParser.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationPreferences.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationType.java`
- `jablib/src/main/java/org/jabref/logic/journals/AbbreviationWriter.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationLoader.java`
- `jablib/src/main/java/org/jabref/logic/journals/JournalAbbreviationRepository.java`
- `jablib/src/main/java/org/jabref/logic/l10n/Localization.java`
- `jablib/src/main/java/org/jabref/logic/layout/AbstractParamLayoutFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/JournalAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/msbib/BibTeXConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibConverter.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibMapping.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MsBibAuthor.java`
- `jablib/src/main/java/org/jabref/logic/net/ProxyRegisterer.java`
- `jablib/src/main/java/org/jabref/logic/remote/RemoteUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/MetadataSerializationConfiguration.java`
- `jablib/src/main/java/org/jabref/logic/util/TestEntry.java`
- `jablib/src/main/java/org/jabref/logic/util/UpdateField.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameCleaner.java`
- `jablib/src/main/java/org/jabref/logic/util/io/RegExpBasedFileFinder.java`
- `jablib/src/main/java/org/jabref/logic/util/io/XMLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/HTMLUnicodeConversionMaps.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseMode.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabaseModeDetection.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabases.java`
- `jablib/src/main/java/org/jabref/model/entry/Author.java`
- `jablib/src/main/java/org/jabref/model/entry/CanonicalBibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryConverter.java`
- `jablib/src/main/java/org/jabref/model/entry/EntryLinkList.java`
- `jablib/src/main/java/org/jabref/model/entry/IdGenerator.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BiblatexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/BibtexEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/EntryType.java`
- `jablib/src/main/java/org/jabref/model/entry/types/IEEETranEntryTypeDefinitions.java`
- `jablib/src/main/java/org/jabref/model/entry/types/StandardEntryType.java`
- `jablib/src/main/java/org/jabref/model/groups/LastNameGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/TexGroup.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelector.java`
- `jablib/src/main/java/org/jabref/model/metadata/ContentSelectors.java`
- `jablib/src/main/java/org/jabref/model/metadata/MetaData.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AbbreviationType.java` | `JournalAbbreviationRepository.java` | 4 | 1.00 |
| `Author.java` | `LastNameGroup.java` | 3 | 1.00 |
| `AbbreviationViewModel.java` | `AbbreviationsFileViewModel.java` | 6 | 0.86 |
| `AbbreviationViewModel.java` | `JournalAbbreviationsTab.java` | 6 | 0.86 |
| `AbbreviationViewModel.java` | `JournalAbbreviationsTabViewModel.java` | 6 | 0.86 |

Evidence for the strongest edge (`AbbreviationType.java` – `JournalAbbreviationRepository.java`, up to 10 commits, newest first):

- `6a2c153` 2026-01-25 — Move journal abbreaviation actions to the "Cleanup entries" dialog (#14850)
- `1a4e1f3` 2025-04-08 — Add support for LTWA (issue #12276) (#12880)
- `88c9f56` 2023-01-02 — Fix journal abbbrev checker for curly braces (#9504)
- `ac7875a` 2019-10-31 — Convert abbreviation data to CSV and adapt JabRef accordingly (#5538)

### Cluster 3 — 77 files, 26 packages, 2 modules

Packages: org.jabref.gui.maintable (12), org.jabref.gui.entryeditor (9), org.jabref.gui.search (7), org.jabref.gui.icon (6), org.jabref.gui.sidepane (6), org.jabref.gui.util (6), org.jabref.gui.groups (5), org.jabref.gui.externalfiletype (3), org.jabref.gui.maintable.columns (3), org.jabref.model.groups (3), org.jabref.gui.importer.fetcher (2), org.jabref.gui (1), org.jabref.gui.actions (1), org.jabref.gui.bibtexhighlighter (1), org.jabref.gui.edit (1), org.jabref.gui.entryeditor.fileannotationtab (1), org.jabref.gui.errorconsole (1), org.jabref.gui.externalfiles (1), org.jabref.gui.fieldeditors (1), org.jabref.gui.frame (1), org.jabref.gui.keyboard (1), org.jabref.gui.preview (1), org.jabref.logic.search (1), org.jabref.logic.util (1), org.jabref.model.entry.field (1), org.jabref.model.util (1)

Modules: jabgui (70), jablib (7)

Files:

- `jabgui/src/main/java/org/jabref/gui/DragAndDropDataFormats.java`
- `jabgui/src/main/java/org/jabref/gui/actions/Action.java`
- `jabgui/src/main/java/org/jabref/gui/bibtexhighlighter/BibTeXHighlighter.java`
- `jabgui/src/main/java/org/jabref/gui/edit/EditAction.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiChatTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AiSummaryTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/FieldsEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/JumpToFieldViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/SourceTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/UserDefinedFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FulltextSearchResultsTab.java`
- `jabgui/src/main/java/org/jabref/gui/errorconsole/LogEventViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ExternalFilesEntryLinker.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/ExternalFileTypes.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiletype/UnknownExternalFileType.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditorFX.java`
- `jabgui/src/main/java/org/jabref/gui/frame/SidePanePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupViewMode.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IconTheme.java`
- `jabgui/src/main/java/org/jabref/gui/icon/IkonliIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIcon.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIconView.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefIkonHandler.java`
- `jabgui/src/main/java/org/jabref/gui/icon/JabRefMaterialDesignIcon.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneView.java`
- `jabgui/src/main/java/org/jabref/gui/importer/fetcher/WebSearchPaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/CodeAreaKeyBindings.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/BibEntryTableViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/CellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ColumnPreferencesRecorder.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTable.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnFactory.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableColumnModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableFieldValueFormatter.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableHeaderContextMenu.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTablePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/MainTableTooltip.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/FieldColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/LinkedIdentifierColumn.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/columns/MainTableColumn.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPanel.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchBar.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialog.java`
- `jabgui/src/main/java/org/jabref/gui/search/GlobalSearchResultDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchFieldRightClickMenu.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTable.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchResultsTableDataModel.java`
- `jabgui/src/main/java/org/jabref/gui/search/SearchTextField.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/GroupsSidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePane.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneComponent.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneContentFactory.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneType.java`
- `jabgui/src/main/java/org/jabref/gui/sidepane/SidePaneViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/CustomLocalDragboard.java`
- `jabgui/src/main/java/org/jabref/gui/util/RecursiveTreeItem.java`
- `jabgui/src/main/java/org/jabref/gui/util/ValueTableCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTableRowFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTreeTableCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelTreeTableRowFactory.java`
- `jablib/src/main/java/org/jabref/logic/search/SearchPreferences.java`
- `jablib/src/main/java/org/jabref/logic/util/ProgressCounter.java`
- `jablib/src/main/java/org/jabref/model/entry/field/FieldProperty.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticDateGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/DateGroup.java`
- `jablib/src/main/java/org/jabref/model/util/TreeCollector.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `AiChatTab.java` | `AiSummaryTab.java` | 6 | 1.00 |
| `AiSummaryTab.java` | `EntryEditor.java` | 6 | 1.00 |
| `BibTeXHighlighter.java` | `SourceTab.java` | 4 | 1.00 |
| `GroupTreeView.java` | `ViewModelTreeTableRowFactory.java` | 4 | 1.00 |
| `GroupModeViewModel.java` | `GroupViewMode.java` | 3 | 1.00 |

Evidence for the strongest edge (`AiChatTab.java` – `AiSummaryTab.java`, up to 10 commits, newest first):

- `f3cadd7` 2026-06-21 — MVVM refactor of the Entry Editor + model-driven tab configuration (#15998)
- `e00ad67` 2025-12-17 — Add Markdown and JSON export buttons to AI Summary and Chat tabs (#14486)
- `f019d37` 2025-05-09 — Hide tabs without restart (#12958)
- `2f88ba2` 2025-04-15 — Refactor IoC - A: Extract Entry Editor (#12210)
- `7f7726e` 2024-09-04 — Chat with groups + AI chat UI and logic overhaul (#11666)
- `8a0edc2` 2024-08-14 — AI chatting functionality (#11430)

### Cluster 7 — 51 files, 23 packages, 2 modules

Packages: org.jabref.gui.texparser (7), org.jabref.gui.externalfiles (6), org.jabref.gui.mergeentries.multiwaymerge (3), org.jabref.gui.newentry (3), org.jabref.gui.preview (3), org.jabref.logic.preview (3), org.jabref.model.texparser (3), org.jabref.gui.entryeditor (2), org.jabref.gui.preferences (2), org.jabref.gui.preferences.preview (2), org.jabref.gui.welcome.quicksettings.viewmodel (2), org.jabref.logic.texparser (2), org.jabref.logic.util (2), org.jabref.logic.util.io (2), org.jabref.gui.edit (1), org.jabref.gui.importer (1), org.jabref.gui.util (1), org.jabref.gui.welcome (1), org.jabref.logic.externalfiles (1), org.jabref.logic.importer.plaincitation (1), org.jabref.logic.openoffice.bst (1), org.jabref.logic.push (1), org.jabref.model.entry (1)

Modules: jabgui (34), jablib (17)

Files:

- `jabgui/src/main/java/org/jabref/gui/edit/CopyToPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/LatexCitationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportHandler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/PdfMergeDialog.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesCrawler.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedPDFFileFilter.java`
- `jabgui/src/main/java/org/jabref/gui/importer/BookCoverFetcher.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/DiffHighlightingEllipsingTextFlow.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesView.java`
- `jabgui/src/main/java/org/jabref/gui/mergeentries/multiwaymerge/MultiMergeEntriesViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/newentry/NewEntryViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/GuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/JabRefGuiPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/preview/PreviewTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preview/CopyCitationAction.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preview/PreviewViewer.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/CitationsDisplay.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexAction.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultView.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ParseLatexResultViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/texparser/ReferenceViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/FileNodeViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/DonationPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/PushApplicationDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/welcome/quicksettings/viewmodel/ThemeDialogViewModel.java`
- `jablib/src/main/java/org/jabref/logic/externalfiles/LinkedFileHandler.java`
- `jablib/src/main/java/org/jabref/logic/importer/plaincitation/LlmPlainCitationParser.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/BSTFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/preview/BstPreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/CitationStylePreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/preview/PreviewLayout.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationDetector.java`
- `jablib/src/main/java/org/jabref/logic/texparser/DefaultLatexParser.java`
- `jablib/src/main/java/org/jabref/logic/texparser/TexBibEntriesResolver.java`
- `jablib/src/main/java/org/jabref/logic/util/Directories.java`
- `jablib/src/main/java/org/jabref/logic/util/URLUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileNameUniqueness.java`
- `jablib/src/main/java/org/jabref/logic/util/io/FileUtil.java`
- `jablib/src/main/java/org/jabref/model/entry/LinkedFile.java`
- `jablib/src/main/java/org/jabref/model/texparser/Citation.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexBibEntriesResolverResult.java`
- `jablib/src/main/java/org/jabref/model/texparser/LatexParserResult.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GuiPreferences.java` | `JabRefGuiPreferences.java` | 5 | 1.00 |
| `ThemeDialogViewModel.java` | `PushToApplicationDetector.java` | 5 | 1.00 |
| `CopyToPreferences.java` | `JabRefGuiPreferences.java` | 4 | 1.00 |
| `BookCoverFetcher.java` | `PreviewViewer.java` | 4 | 1.00 |
| `PushApplicationDialogViewModel.java` | `ThemeDialogViewModel.java` | 4 | 1.00 |

Evidence for the strongest edge (`GuiPreferences.java` – `JabRefGuiPreferences.java`, up to 10 commits, newest first):

- `3825c73` 2026-07-06 — Render entry preview with html-to-node and remove javafx.web (#16145)
- `90434cc` 2026-05-31 — Fix MrDlib, SSL and BibEntryPreferences reset and import (#15862)
- `00fc407` 2025-08-22 — Add more walkthroughs, donation prompt, and responsive layout for welcome tab (#13679)
- `de56006` 2025-05-02 — Merging Entry Creation Buttons Into a Single Tool (#13020)
- `6161661` 2025-01-27 — Copy to option (#12374)

### Cluster 9 — 49 files, 21 packages, 3 modules

Packages: org.jabref.gui.theme (5), org.jabref.logic.util (5), org.jabref.gui (4), org.jabref.gui.entryeditor.citationrelationtab (4), org.jabref.languageserver (4), org.jabref.gui.externalfiles (3), org.jabref.languageserver.util (3), org.jabref.logic.citation.repository (3), org.jabref.gui.fieldeditors (2), org.jabref.gui.help (2), org.jabref.gui.util (2), org.jabref.logic.importer.fetcher.citation (2), org.jabref.model.entry (2), org.jabref.gui.frame (1), org.jabref.languageserver.controller (1), org.jabref.logic.citation (1), org.jabref.logic.importer.fetcher.citation.crossref (1), org.jabref.logic.importer.fetcher.citation.opencitations (1), org.jabref.logic.importer.fetcher.citation.semanticscholar (1), org.jabref.logic.remote.server (1), org.jabref.model (1)

Modules: jabgui (23), jablib (18), jabls (8)

Files:

- `jabgui/src/main/java/org/jabref/gui/DialogService.java`
- `jabgui/src/main/java/org/jabref/gui/FXDialog.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefDialogService.java`
- `jabgui/src/main/java/org/jabref/gui/JabRefGUI.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/BibEntryView.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationItem.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationRelationsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/citationrelationtab/CitationsRelationsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/FileSelectionPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/ImportResultsPage.java`
- `jabgui/src/main/java/org/jabref/gui/externalfiles/UnlinkedFilesWizard.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/KeywordsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ProcessingLibraryDialog.java`
- `jabgui/src/main/java/org/jabref/gui/help/SearchForUpdateAction.java`
- `jabgui/src/main/java/org/jabref/gui/help/VersionWorker.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheet.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetDataUrl.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetFile.java`
- `jabgui/src/main/java/org/jabref/gui/theme/StyleSheetResource.java`
- `jabgui/src/main/java/org/jabref/gui/theme/ThemeManager.java`
- `jabgui/src/main/java/org/jabref/gui/util/BaseDialog.java`
- `jabgui/src/main/java/org/jabref/gui/util/UiTaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/citation/SearchCitationsRelationsService.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepository.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/BibEntryCitationsAndReferencesRepositoryShell.java`
- `jablib/src/main/java/org/jabref/logic/citation/repository/MVStoreBibEntryRelationRepository.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/CitationFetcherType.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/crossref/CrossRefCitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/opencitations/OpenCitationsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/citation/semanticscholar/SemanticScholarCitationFetcher.java`
- `jablib/src/main/java/org/jabref/logic/remote/server/RemoteListenerServerManager.java`
- `jablib/src/main/java/org/jabref/logic/util/BackgroundTask.java`
- `jablib/src/main/java/org/jabref/logic/util/CurrentThreadTaskExecutor.java`
- `jablib/src/main/java/org/jabref/logic/util/DelayTaskThrottler.java`
- `jablib/src/main/java/org/jabref/logic/util/HeadlessExecutorService.java`
- `jablib/src/main/java/org/jabref/logic/util/TaskExecutor.java`
- `jablib/src/main/java/org/jabref/model/ChainNode.java`
- `jablib/src/main/java/org/jabref/model/entry/Keyword.java`
- `jablib/src/main/java/org/jabref/model/entry/KeywordList.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexTextDocumentService.java`
- `jabls/src/main/java/org/jabref/languageserver/BibtexWorkspaceService.java`
- `jabls/src/main/java/org/jabref/languageserver/LspClientHandler.java`
- `jabls/src/main/java/org/jabref/languageserver/LspLauncher.java`
- `jabls/src/main/java/org/jabref/languageserver/controller/LanguageServerController.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspConsistencyCheck.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticBuilder.java`
- `jabls/src/main/java/org/jabref/languageserver/util/LspDiagnosticHandler.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JabRefGUI.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `JabRefGUI.java` | `LanguageServerController.java` | 4 | 1.00 |
| `CitationRelationsTab.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |
| `FileSelectionPage.java` | `ImportResultsPage.java` | 4 | 1.00 |
| `SearchCitationsRelationsService.java` | `BibEntryCitationsAndReferencesRepositoryShell.java` | 4 | 1.00 |

Evidence for the strongest edge (`JabRefGUI.java` – `BibEntryCitationsAndReferencesRepositoryShell.java`, up to 10 commits, newest first):

- `a2502f2` 2026-03-04 — Fix threading issues in citations relations tab (#15233)
- `9e9e0e4` 2026-02-04 — Add OpenAlex-based Citation Fetcher (#15023)
- `d5f1f63` 2025-12-28 — feat(citation): add support for selecting citation fetcher in Citatio… (#14652)
- `3135c1a` 2025-06-07 — Fix issue #11189 - Implement a caching solution with local storage for citation relations  (#11845)

### Cluster 11 — 40 files, 19 packages, 2 modules

Packages: org.jabref.gui.preferences (5), org.jabref.gui.commonfxcontrols (3), org.jabref.gui.entryeditor (3), org.jabref.gui.groups (3), org.jabref.logic.citationkeypattern (3), org.jabref.gui.preferences.citationkeypattern (2), org.jabref.gui.preferences.entryeditor (2), org.jabref.gui.preferences.external (2), org.jabref.gui.preferences.general (2), org.jabref.gui.preferences.groups (2), org.jabref.gui.preferences.nameformatter (2), org.jabref.gui.preferences.network (2), org.jabref.gui.preferences.table (2), org.jabref.gui.preferences.xmp (2), org.jabref.gui (1), org.jabref.gui.frame (1), org.jabref.gui.util (1), org.jabref.logic.push (1), org.jabref.migrations (1)

Modules: jabgui (36), jablib (4)

Files:

- `jabgui/src/main/java/org/jabref/gui/WorkspacePreferences.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelItemModel.java`
- `jabgui/src/main/java/org/jabref/gui/commonfxcontrols/CitationKeyPatternsPanelViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/AllFieldsTab.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabFactory.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/EntryEditorTabModel.java`
- `jabgui/src/main/java/org/jabref/gui/frame/ExternalApplicationsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/groups/GroupsPreferences.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/AbstractPreferenceTabView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferenceTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/PreferencesTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/citationkeypattern/CitationKeyPatternTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/entryeditor/EntryEditorTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/external/ExternalTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/general/GeneralTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/groups/GroupsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/nameformatter/NameFormatterTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/network/NetworkTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/table/TableTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/xmp/XmpPrivacyTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/util/FieldsUtil.java`
- `jabgui/src/main/java/org/jabref/migrations/PreferencesMigrations.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGeneratorTestUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPattern.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyPatternPreferences.java`
- `jablib/src/main/java/org/jabref/logic/push/PushToApplicationPreferences.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GroupsTab.java` | `GroupsTabViewModel.java` | 10 | 1.00 |
| `NameFormatterTab.java` | `NameFormatterTabViewModel.java` | 6 | 1.00 |
| `CitationKeyPatternsPanel.java` | `CitationKeyPatternsPanelItemModel.java` | 3 | 1.00 |
| `CitationKeyPatternsPanel.java` | `CitationKeyPattern.java` | 3 | 1.00 |
| `CitationKeyPatternsPanelItemModel.java` | `CitationKeyPatternsPanelViewModel.java` | 3 | 1.00 |

Evidence for the strongest edge (`GroupsTab.java` – `GroupsTabViewModel.java`, up to 10 commits, newest first):

- `2f3a00e` 2026-08-16 — Create new group from selected entries (#16588)
- `ef5eb77` 2023-02-28 — persist selected hierarchical context in groups preferences
- `8da0a3a` 2023-02-26 — add default hierarchical context preference option
- `82db990` 2022-12-06 — Extracted KeywordSeparator from GroupsPreferences and created new PreferencesTab EntryTab
- `ba5beb2` 2021-12-26 — Observable preferences I (Internal [formerly Version], Groups, Xmp, AutoComplete) (#8336)
- `5a11412` 2021-02-01 — Grand unified preferences dialog (#7384)
- `5850341` 2020-09-01 — Refactor of remaining preference tabs to PreferencesService (#6836)
- `efc69be` 2020-04-05 — Add disable/enable calculation of items in group (#6233)
- `a01ea20` 2019-09-17 — Conversion of preferences/exportsorting, import, maintable and entryeditor to mvvm (#5315)
- `f51ba49` 2019-08-18 — Conversion of preferencesDialog/advancedTab, networkTab and groupsTab to mvvm (#5141)

### Cluster 12 — 38 files, 18 packages, 2 modules

Packages: org.jabref.logic.bibtex.comparator (6), org.jabref.logic.exporter (3), org.jabref.logic.layout.format (3), org.jabref.logic.msbib (3), org.jabref.model.database (3), org.jabref.model.database.event (3), org.jabref.model.entry.event (3), org.jabref.gui.autosaveandbackup (2), org.jabref.logic.auxparser (2), org.jabref.logic.bibtex (2), org.jabref.logic.citationstyle (1), org.jabref.logic.importer (1), org.jabref.logic.importer.fileformat (1), org.jabref.logic.util (1), org.jabref.model (1), org.jabref.model.entry (1), org.jabref.model.entry.field (1), org.jabref.model.metadata.event (1)

Modules: jablib (36), jabgui (2)

Files:

- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/AutosaveManager.java`
- `jabgui/src/main/java/org/jabref/gui/autosaveandbackup/BackupManager.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/AuxParserResult.java`
- `jablib/src/main/java/org/jabref/logic/auxparser/DefaultAuxParser.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/BibEntryWriter.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/TypedBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/BibtexStringComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/CrossRefEntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/EntryComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparator.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/FieldComparatorStack.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/comparator/IdComparator.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefItemDataProvider.java`
- `jablib/src/main/java/org/jabref/logic/exporter/BibWriter.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OOCalcDatabase.java`
- `jablib/src/main/java/org/jabref/logic/exporter/OpenDocumentRepresentation.java`
- `jablib/src/main/java/org/jabref/logic/importer/Parser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexParser.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690FormatDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Iso690NamesAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisMonth.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibDatabase.java`
- `jablib/src/main/java/org/jabref/logic/msbib/MSBibEntry.java`
- `jablib/src/main/java/org/jabref/logic/msbib/PageNumbers.java`
- `jablib/src/main/java/org/jabref/logic/util/CoarseChangeFilter.java`
- `jablib/src/main/java/org/jabref/model/FieldChange.java`
- `jablib/src/main/java/org/jabref/model/database/BibDatabase.java`
- `jablib/src/main/java/org/jabref/model/database/CitationKeyListener.java`
- `jablib/src/main/java/org/jabref/model/database/KeyCollisionException.java`
- `jablib/src/main/java/org/jabref/model/database/event/BibDatabaseContextChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesAddedEvent.java`
- `jablib/src/main/java/org/jabref/model/database/event/EntriesRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/BibEntry.java`
- `jablib/src/main/java/org/jabref/model/entry/event/EntryChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldAddedOrRemovedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/event/FieldChangedEvent.java`
- `jablib/src/main/java/org/jabref/model/entry/field/InternalField.java`
- `jablib/src/main/java/org/jabref/model/metadata/event/MetaDataChangedEvent.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CrossRefEntryComparator.java` | `FieldComparatorStack.java` | 5 | 1.00 |
| `FieldComparator.java` | `FieldComparatorStack.java` | 5 | 1.00 |
| `FieldComparatorStack.java` | `OOCalcDatabase.java` | 5 | 1.00 |
| `FieldComparatorStack.java` | `OpenDocumentRepresentation.java` | 5 | 1.00 |
| `BibDatabase.java` | `EntriesAddedEvent.java` | 3 | 1.00 |

Evidence for the strongest edge (`CrossRefEntryComparator.java` – `FieldComparatorStack.java`, up to 10 commits, newest first):

- `1e644d3` 2016-05-23 — Cleanup guiglobals (#1409)
- `5d40143` 2015-10-14 — Move net.sf.jabref.logic.bibtex package to net.sf.jabref.bibtex
- `645057b` 2015-08-19 — Move classes implementing Comparator<BibtexEntry> into separate logic package
- `cdcb374` 2007-08-19 — Second batch of fixing the warnings and generifying JabRef. Another 600 warnings are done.
- `a55d536` 2005-11-08 — Added Repec importer. Added OpenDocument spreadsheet export similar to OOo calc. Several refactorings that don't change functionality.

### Cluster 13 — 33 files, 15 packages, 2 modules

Packages: org.jabref.gui.git (9), org.jabref.gui.fieldeditors.contextmenu (3), org.jabref.gui.keyboard (3), org.jabref.gui.preferences.keybindings (3), org.jabref.gui.actions (2), org.jabref.gui.frame (2), org.jabref.gui.preferences.keybindings.presets (2), org.jabref.logic.git (2), org.jabref.gui.entryeditor.fileannotationtab (1), org.jabref.gui.errorconsole (1), org.jabref.gui.util (1), org.jabref.logic.git.io (1), org.jabref.logic.git.preferences (1), org.jabref.logic.git.status (1), org.jabref.logic.git.util (1)

Modules: jabgui (27), jablib (6)

Files:

- `jabgui/src/main/java/org/jabref/gui/actions/ActionHelper.java`
- `jabgui/src/main/java/org/jabref/gui/actions/StandardActions.java`
- `jabgui/src/main/java/org/jabref/gui/entryeditor/fileannotationtab/FileAnnotationTabView.java`
- `jabgui/src/main/java/org/jabref/gui/errorconsole/ErrorConsoleView.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/ContextMenuFactory.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/SingleSelectionMenuBuilder.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainMenu.java`
- `jabgui/src/main/java/org/jabref/gui/frame/MainToolBar.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitCommitDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPullAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitPushAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubAction.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitShareToGitHubDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/git/GitStatusViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBinding.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingCategory.java`
- `jabgui/src/main/java/org/jabref/gui/keyboard/KeyBindingRepository.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/KeyBindingsTabViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/BashKeyBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/keybindings/presets/NewEntryBindingPreset.java`
- `jabgui/src/main/java/org/jabref/gui/util/URLs.java`
- `jablib/src/main/java/org/jabref/logic/git/GitHandler.java`
- `jablib/src/main/java/org/jabref/logic/git/GitSyncService.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitRevisionLocator.java`
- `jablib/src/main/java/org/jabref/logic/git/preferences/GitPreferences.java`
- `jablib/src/main/java/org/jabref/logic/git/status/GitStatusChecker.java`
- `jablib/src/main/java/org/jabref/logic/git/util/GitInitService.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `GitHandler.java` | `GitSyncService.java` | 7 | 1.00 |
| `KeyBinding.java` | `NewEntryBindingPreset.java` | 6 | 1.00 |
| `GitHandler.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `GitSyncService.java` | `GitRevisionLocator.java` | 5 | 1.00 |
| `StandardActions.java` | `ContextAction.java` | 4 | 1.00 |

Evidence for the strongest edge (`GitHandler.java` – `GitSyncService.java`, up to 10 commits, newest first):

- `76baea0` 2026-09-06 — Gracefully handle JGit errors (#16882)
- `f7fb890` 2026-09-02 — Refactor/rewrite a bit requirements (#16798)
- `e7660a6` 2026-07-26 — Improve GitHub sharing and push handling (#16367)
- `5a91a7f` 2025-10-16 — Fix external file modification warnings during Git merge  (#13946)
- `0221118` 2025-08-29 — feat: implement Git pull & push with semantic merge support (#13744)
- `592fd18` 2025-08-07 — Fix: Decouple GitHandler creation via registry and extend semantic conflict detection (#13666)
- `bfa37f0` 2025-08-01 — Implement logic orchestration for Git Pull/Push operations (#13518)

### Cluster 8 — 51 files, 14 packages, 3 modules

Packages: org.jabref.logic.openoffice.style (9), org.jabref.gui.openoffice (8), org.jabref.logic.openoffice.oocsltext (7), org.jabref.logic.citationstyle (4), org.jabref.logic.openoffice.action (4), org.jabref.logic.openoffice.backend (4), org.jabref.logic.openoffice (3), org.jabref.logic.openoffice.frontend (3), org.jabref.model.openoffice.style (3), org.jabref.gui.preferences.openoffice (2), (default) (1), org.jabref.logic.openoffice.bst (1), org.jabref.model.openoffice (1), org.jabref.model.openoffice.backend (1)

Modules: jablib (40), jabgui (10), build-support (1)

Files:

- `build-support/src/main/java/CitationStyleCatalogGenerator.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/CSLStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/DetectOpenOfficeInstallation.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/JStyleSelectViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBase.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OOBibBaseConnect.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/OpenOfficePanel.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogView.java`
- `jabgui/src/main/java/org/jabref/gui/openoffice/StyleSelectDialogViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTab.java`
- `jabgui/src/main/java/org/jabref/gui/preferences/openoffice/OpenOfficeTabViewModel.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CSLStyleUtils.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/CitationStyle.java`
- `jablib/src/main/java/org/jabref/logic/citationstyle/JabRefLocaleProvider.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficeFileSearch.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/OpenOfficePreferences.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/ReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditInsert.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditMerge.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/EditSeparate.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/action/Update.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/Backend52.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/JStyleReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeManagerReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/backend/NamedRangeReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/bst/PandocLatexConverter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/OOFrontend.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/frontend/UpdateCitationMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/BSTReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLCitationOOAdapter.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLFormatUtils.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMark.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLReferenceMarkManager.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/oocsltext/CSLUpdateBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/BstStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyle.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleGetNumericCitationMarker.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/JStyleLoader.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOFormatBibliography.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessAuthorYearMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessCitationKeyMarkers.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOProcessNumericMarkers.java`
- `jablib/src/main/java/org/jabref/model/openoffice/CitationEntry.java`
- `jablib/src/main/java/org/jabref/model/openoffice/backend/NamedRangeManager.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroup.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationGroups.java`
- `jablib/src/main/java/org/jabref/model/openoffice/style/CitationType.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `JStyleSelectViewModel.java` | `StyleSelectDialogViewModel.java` | 6 | 1.00 |
| `EditInsert.java` | `EditSeparate.java` | 5 | 1.00 |
| `EditMerge.java` | `EditSeparate.java` | 5 | 1.00 |
| `JStyle.java` | `JStyleGetNumericCitationMarker.java` | 5 | 1.00 |
| `OOFormatBibliography.java` | `OOProcessAuthorYearMarkers.java` | 5 | 1.00 |

Evidence for the strongest edge (`JStyleSelectViewModel.java` – `StyleSelectDialogViewModel.java`, up to 10 commits, newest first):

- `8a1ec40` 2026-07-25 — Support BST styles in LibreOffice (#16315)
- `f50e3e3` 2025-04-18 — CSL4LibreOffice - G [Custom CSL Styles, build-time loading] (#12951)
- `771c4cd` 2024-07-25 — CSL4LibreOffice - B [GSoC '24] (#11521)
- `ebed223` 2021-06-03 — step0 : start model/openoffice, logic/openoffice/style (#7772)
- `d223bdd` 2020-04-05 — Fix storing of custom jstyles (#6242)
- `18aba35` 2019-01-25 —  Convert OO/LO SidePanel to javafx (#4341)

### Cluster 2 — 84 files, 13 packages, 2 modules

Packages: org.jabref.logic.importer.fetcher (40), org.jabref.logic.importer (15), org.jabref.model.entry.identifier (8), org.jabref.logic.importer.fetcher.transformers (7), org.jabref.gui.fieldeditors.contextmenu (2), org.jabref.logic.importer.fetcher.isbntobibtex (2), org.jabref.logic.importer.fileformat (2), org.jabref.logic.importer.util (2), org.jabref.logic.layout.format (2), org.jabref.gui.clipboard (1), org.jabref.gui.edit (1), org.jabref.logic.cleanup (1), org.jabref.logic.net (1)

Modules: jablib (80), jabgui (4)

Files:

- `jabgui/src/main/java/org/jabref/gui/clipboard/ClipBoardManager.java`
- `jabgui/src/main/java/org/jabref/gui/edit/CopyDoiUrlAction.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/DefaultMenu.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/contextmenu/EditorMenus.java`
- `jablib/src/main/java/org/jabref/logic/cleanup/DoiCleanup.java`
- `jablib/src/main/java/org/jabref/logic/importer/CompositeIdFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/EntryBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FetcherResult.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/FulltextFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/IdParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/PagedSearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/QueryParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/SearchBasedParserFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/WebFetchers.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACMPortalFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ACS.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AbstractIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ApsFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ArXivFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/AstrophysicsDataSystem.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BiodiversityLibrary.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/BvbFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CollectionOfComputerScienceBibliographiesParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ComplexSearchQuery.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CompositeSearchBasedFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CrossRef.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/CustomizableKeyFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DBLPFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DOAJFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DiVA.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/DoiResolution.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GoogleScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/GvkFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IEEE.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/INSPIREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ISIDOREFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/IacrEprintFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/JstorFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/LibraryOfCongress.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MathSciNet.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MedlineFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/Medra.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/OpenAccessDoi.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ResearchGate.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/RfcFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ScienceDirect.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SemanticScholar.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureFullTextFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/SpringerNatureWebFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TitleFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/TrustLevel.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/ZbMATH.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/EbookDeIsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/isbntobibtex/IsbnFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/AbstractQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/CollectionOfComputerScienceBibliographiesQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/GVKQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/IEEEQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/JstorQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/SpringerQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/transformers/ZbMathQueryTransformer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MarcXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/PicaXmlParser.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/JsonReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/ShortDOIService.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOICheck.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DOIStrip.java`
- `jablib/src/main/java/org/jabref/logic/net/URLDownload.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ARK.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ArXivIdentifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/DOI.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISBN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/ISSN.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/IacrEprint.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/Identifier.java`
- `jablib/src/main/java/org/jabref/model/entry/identifier/MathSciNetId.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `FetcherResult.java` | `FulltextFetcher.java` | 3 | 1.00 |
| `FetcherResult.java` | `FulltextFetchers.java` | 3 | 1.00 |
| `FetcherResult.java` | `WebFetchers.java` | 3 | 1.00 |
| `QueryParser.java` | `SearchBasedFetcher.java` | 3 | 1.00 |
| `QueryParser.java` | `ComplexSearchQuery.java` | 3 | 1.00 |

Evidence for the strongest edge (`FetcherResult.java` – `FulltextFetcher.java`, up to 10 commits, newest first):

- `98ee51e` 2026-03-27 — Add fulltext fetcher for Wiley via their TDM API (#15388)
- `abef16b` 2018-04-07 — Merge
- `40a007a` 2018-03-28 — Priority fetcher (#3882)

### Cluster 16 — 27 files, 13 packages, 7 modules

Packages: (default) (7), org.jabref.http.server.resources (6), org.jabref.http.server.command (3), org.jabref.http.manager (2), org.jabref.gui.importer (1), org.jabref.http (1), org.jabref.http.dto (1), org.jabref.http.server (1), org.jabref.http.server.cli (1), org.jabref.http.server.services (1), org.jabref.languageserver (1), org.jabref.logic.git.io (1), org.jabref.model.search (1)

Modules: jabsrv (16), jablib (3), jabgui (2), jabls (2), jabsrv-cli (2), jabls-cli (1), test-support (1)

Files:

- `jabgui/src/main/java/module-info.java`
- `jabgui/src/main/java/org/jabref/gui/importer/ImportEntriesDialog.java`
- `jablib/src/main/java/module-info.java`
- `jablib/src/main/java/org/jabref/logic/git/io/GitFileWriter.java`
- `jablib/src/main/java/org/jabref/model/search/LinkedFilesConstants.java`
- `jabls-cli/src/main/java/module-info.java`
- `jabls/src/main/java/module-info.java`
- `jabls/src/main/java/org/jabref/languageserver/ExtensionSettings.java`
- `jabsrv-cli/src/main/java/module-info.java`
- `jabsrv-cli/src/main/java/org/jabref/http/server/cli/ServerCli.java`
- `jabsrv/src/main/java/module-info.java`
- `jabsrv/src/main/java/org/jabref/http/JabRefSrvStateManager.java`
- `jabsrv/src/main/java/org/jabref/http/dto/GlobalExceptionMapper.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerManager.java`
- `jabsrv/src/main/java/org/jabref/http/manager/HttpServerThread.java`
- `jabsrv/src/main/java/org/jabref/http/server/Server.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/Command.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/CommandResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/command/SelectEntriesCommand.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/CitationsResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntriesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/EntryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibrariesResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/LibraryResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/resources/MapResource.java`
- `jabsrv/src/main/java/org/jabref/http/server/services/ServerUtils.java`
- `test-support/src/main/java/module-info.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `jabsrv-cli/src/main/java/module-info.java` | `jabsrv/src/main/java/module-info.java` | 11 | 1.00 |
| `jabls-cli/src/main/java/module-info.java` | `jabls/src/main/java/module-info.java` | 5 | 1.00 |
| `jabls-cli/src/main/java/module-info.java` | `jabsrv/src/main/java/module-info.java` | 5 | 1.00 |
| `jabls/src/main/java/module-info.java` | `ExtensionSettings.java` | 4 | 1.00 |
| `GlobalExceptionMapper.java` | `Server.java` | 4 | 1.00 |

Evidence for the strongest edge (`jabsrv-cli/src/main/java/module-info.java` – `jabsrv/src/main/java/module-info.java`, up to 10 commits, newest first):

- `655964d` 2026-09-03 — Document package- and module-level Javadoc expectations in AGENTS.md (#16836)
- `30df54f` 2026-03-03 — Reduce complexity in dependencies setup (restore) (#15194)
- `eb08ca0` 2026-02-22 — Revert "Reduce complexity in dependencies setup (#15169)" (#15191)
- `10196d5` 2026-02-22 — Reduce complexity in dependencies setup (#15169)
- `96e9d29` 2025-11-16 — Chore(deps): Bump org.glassfish.jersey.core:jersey-server from 3.1.11 to 4.0.0 in /versions (#14305)
- `71c230f` 2025-07-09 — Revert module name changes for remaining 'unnamed' Jars (#13515)
- `0848124` 2025-07-09 — fix: revert Java module names to restore Status Log compatibility in JabRef 5.15 (#13511)
- `9656cf1` 2025-07-04 — Add http sever to GUI (#13457)
- `2c8615e` 2025-07-01 — Switch the Gradle build to org.gradlex.java-module plugins (#13401)
- `2c511c2` 2025-06-18 — Remove XJC plugin (#13376)

### Cluster 5 — 58 files, 11 packages, 2 modules

Packages: org.jabref.logic.layout.format (24), org.jabref.logic.importer.fileformat (18), org.jabref.logic.importer.fileformat.pdf (6), org.jabref.logic.citationkeypattern (2), org.jabref.logic.importer (2), org.jabref.gui.entryeditor (1), org.jabref.gui.maintable (1), org.jabref.logic.database (1), org.jabref.logic.formatter.casechanger (1), org.jabref.logic.importer.fetcher (1), org.jabref.model.entry (1)

Modules: jablib (56), jabgui (2)

Files:

- `jabgui/src/main/java/org/jabref/gui/entryeditor/RelatedArticlesTab.java`
- `jabgui/src/main/java/org/jabref/gui/maintable/ExtractReferencesAction.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/AbstractCitationKeyPatterns.java`
- `jablib/src/main/java/org/jabref/logic/citationkeypattern/CitationKeyGenerator.java`
- `jablib/src/main/java/org/jabref/logic/database/DuplicateCheck.java`
- `jablib/src/main/java/org/jabref/logic/formatter/casechanger/Title.java`
- `jablib/src/main/java/org/jabref/logic/importer/ImportFormatReader.java`
- `jablib/src/main/java/org/jabref/logic/importer/Importer.java`
- `jablib/src/main/java/org/jabref/logic/importer/fetcher/MrDLibFetcher.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BiblioscapeImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/BibtexImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CffImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CopacImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/CustomImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/EndnoteXmlImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/InspecImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/IsiImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlineImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MedlinePlainImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ModsImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MrDLibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/MsBibImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/OvidImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/ReferImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RepecNepImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/RisImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfContentImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfEmbeddedBibFileImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfMergeMetadataImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/PdfXmpImporter.java`
- `jablib/src/main/java/org/jabref/logic/importer/fileformat/pdf/RuleBasedBibliographyPdfImporter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAbbreviator.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsCommaReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorAndsReplacer.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstAbbrLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorFirstLastOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FF.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLF_FFAbbr.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirst.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstAbbrOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorLastFirstOxfordCommas.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorNatBib.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/AuthorOrgSci.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/Authors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateDocBook4Editors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CurrentDate.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/DocBookAuthorFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/GetOpenOfficeType.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisAuthors.java`
- `jablib/src/main/java/org/jabref/model/entry/AuthorList.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `CreateDocBook4Editors.java` | `DocBookAuthorFormatter.java` | 10 | 1.00 |
| `AuthorLF_FF.java` | `AuthorLF_FFAbbr.java` | 8 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorFirstLastCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstAbbrCommas.java` | 7 | 1.00 |
| `AuthorFirstAbbrLastCommas.java` | `AuthorLastFirstCommas.java` | 7 | 1.00 |

Evidence for the strongest edge (`CreateDocBook4Editors.java` – `DocBookAuthorFormatter.java`, up to 10 commits, newest first):

- `9213e3c` 2018-11-25 — Add docbook 5 support (#4319)
- `ae4d4da` 2016-03-26 — Rename getAuthors to parse
- `f566b8d` 2016-03-26 — Rename some methods and add tests
- `3c8a68b` 2016-03-08 — Fixed some messed up formatting leading to a few split tests
- `122ece4` 2015-08-19 — Move AuthorList into model.entry
- `c076c80` 2015-08-17 — Move AuthorList to logic package
- `2ebb2a1` 2015-07-17 — Remove old SVN keyword fields and obsolete comments
- `ad87162` 2009-11-06 — Reworked author and editor handling in Docbook export. Added Docbook XML header.
- `cdcb374` 2007-08-19 — Second batch of fixing the warnings and generifying JabRef. Another 600 warnings are done.
- `5dd9ba3` 2005-01-27 — Fixed output of book editors, and added output of URL and DOI fields

### Cluster 6 — 52 files, 11 packages, 2 modules

Packages: org.jabref.gui.fieldeditors (26), org.jabref.gui.autocompleter (8), org.jabref.gui.fieldeditors.identifier (5), org.jabref.gui.fieldeditors.optioneditors (3), org.jabref.gui.fieldeditors.optioneditors.mapbased (3), org.jabref.gui.linkedfile (2), org.jabref.gui.util (1), org.jabref.gui.util.component (1), org.jabref.logic.formatter.bibtexfields (1), org.jabref.logic.importer.util (1), org.jabref.model.entry (1)

Modules: jabgui (49), jablib (3)

Files:

- `jabgui/src/main/java/org/jabref/gui/autocompleter/AutoCompletionTextInputBinding.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/BibEntrySuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/ContentSelectorSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/JournalsSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/PersonNameSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/StringSuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProvider.java`
- `jabgui/src/main/java/org/jabref/gui/autocompleter/SuggestionProviders.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/AbstractEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationCountEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/CitationKeyEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/DateEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextArea.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/EditorTextField.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/FieldEditors.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/ISSNEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/JournalInfoOptInDialogHelper.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedEntriesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/LinkedFilesEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/MarkdownEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/OwnerEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/PersonsEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/SimpleEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/UrlEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/BaseIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/DoiIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/EprintIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/ISBNIdentifierEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/identifier/IdentifierEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/MonthEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditor.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/OptionEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/MapBasedEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/PatentTypeEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/fieldeditors/optioneditors/mapbased/YesNoEditorViewModel.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/AttachFileFromURLAction.java`
- `jabgui/src/main/java/org/jabref/gui/linkedfile/DeleteFileAction.java`
- `jabgui/src/main/java/org/jabref/gui/util/ViewModelListCellFactory.java`
- `jabgui/src/main/java/org/jabref/gui/util/component/TemporalAccessorPicker.java`
- `jablib/src/main/java/org/jabref/logic/formatter/bibtexfields/CleanupUrlFormatter.java`
- `jablib/src/main/java/org/jabref/logic/importer/util/IdentifierParser.java`
- `jablib/src/main/java/org/jabref/model/entry/Date.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `FieldEditors.java` | `MonthEditorViewModel.java` | 6 | 1.00 |
| `ContentSelectorSuggestionProvider.java` | `FieldEditors.java` | 5 | 1.00 |
| `FieldEditors.java` | `OwnerEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `OptionEditorViewModel.java` | 5 | 1.00 |
| `FieldEditors.java` | `PatentTypeEditorViewModel.java` | 5 | 1.00 |

Evidence for the strongest edge (`FieldEditors.java` – `MonthEditorViewModel.java`, up to 10 commits, newest first):

- `d9b38ce` 2024-12-02 — Added support for (biblatex) `langid` to be an optional field in entry editor (#12071)
- `e0333c4` 2024-06-13 — Fix content selector present for custom entry type (#11371)
- `5217bad` 2020-04-19 — Remove cache of auto completion results (#6310)
- `f0b90ba` 2017-08-10 — Add validation to entry editor (#3090)
- `b9bd27c` 2017-07-11 — [WIP] Complete rework of the auto completion (#2965)
- `4543592` 2017-05-06 — Reimplement option field editors in JavaFX (#2824)

### Cluster 10 — 45 files, 11 packages, 2 modules

Packages: org.jabref.logic.layout.format (16), org.jabref.model.groups (12), org.jabref.logic.layout (4), org.jabref.logic.util.strings (4), org.jabref.model.search.matchers (3), org.jabref.gui.groups (1), org.jabref.logic.bibtex (1), org.jabref.logic.openoffice.style (1), org.jabref.logic.util (1), org.jabref.model (1), org.jabref.model.strings (1)

Modules: jablib (44), jabgui (1)

Files:

- `jabgui/src/main/java/org/jabref/gui/groups/GroupTreeNodeViewModel.java`
- `jablib/src/main/java/org/jabref/logic/bibtex/FieldWriter.java`
- `jablib/src/main/java/org/jabref/logic/layout/Layout.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutEntry.java`
- `jablib/src/main/java/org/jabref/logic/layout/LayoutHelper.java`
- `jablib/src/main/java/org/jabref/logic/layout/StringInt.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CompositeFormat.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/CreateBibORDFAuthors.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/HTMLParagraphs.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/IfPlural.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/LatexToUnicodeFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/NameFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RTFChars.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBrackets.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveBracketsAddComma.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveLatexCommandsFormatter.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RemoveTilde.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/RisKeywords.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToLowerCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/ToUpperCase.java`
- `jablib/src/main/java/org/jabref/logic/layout/format/XMLChars.java`
- `jablib/src/main/java/org/jabref/logic/openoffice/style/OOPreFormatter.java`
- `jablib/src/main/java/org/jabref/logic/util/BuildInfo.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/QuotedStringTokenizer.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/RtfCharMap.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/StringUtil.java`
- `jablib/src/main/java/org/jabref/logic/util/strings/XmlCharsMap.java`
- `jablib/src/main/java/org/jabref/model/TreeNode.java`
- `jablib/src/main/java/org/jabref/model/groups/AbstractGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AllEntriesGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/AutomaticPersonsGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/ExplicitGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupEntryChanger.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupHierarchyType.java`
- `jablib/src/main/java/org/jabref/model/groups/GroupTreeNode.java`
- `jablib/src/main/java/org/jabref/model/groups/KeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/RegexKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/SearchGroup.java`
- `jablib/src/main/java/org/jabref/model/groups/WordKeywordGroup.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/AndMatcher.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/MatcherSet.java`
- `jablib/src/main/java/org/jabref/model/search/matchers/OrMatcher.java`
- `jablib/src/main/java/org/jabref/model/strings/UnicodeToReadableCharMap.java`

Strongest edges inside the cluster (top 5):

| fileA | fileB | shared | weight |
|---|---|---|---|
| `ToLowerCase.java` | `ToUpperCase.java` | 3 | 1.00 |
| `AndMatcher.java` | `OrMatcher.java` | 6 | 0.86 |
| `AutomaticKeywordGroup.java` | `AutomaticPersonsGroup.java` | 4 | 0.80 |
| `AllEntriesGroup.java` | `KeywordGroup.java` | 33 | 0.79 |
| `RtfCharMap.java` | `XmlCharsMap.java` | 3 | 0.75 |

Evidence for the strongest edge (`ToLowerCase.java` – `ToUpperCase.java`, up to 10 commits, newest first):

- `68ea6c8` 2017-02-22 — Added Locale.ROOT to toUpper/toLower Methods
- `daa084d` 2016-01-03 — Changed based on review comments, moved a few tests, added a few tests
- `e19e427` 2008-09-01 — Merged changes from beta_2.4 branch at release of 2.4 final.

### Other clusters

| cluster | files | packages | modules | strongest edge | shared | weight | evidence (newest 3 commits) |
|---|---|---|---|---|---|---|---|
| 17 | 26 | 11 | 2 | `DBMSConnectionProperties.java` – `DatabaseConnectionProperties.java` | 7 | 1.00 | `0e74a43`, `1584dea`, `77c5188` |
| 21 | 21 | 11 | 2 | `ChangeScanner.java` – `DatabaseChangeListener.java` | 3 | 1.00 | `e86839a`, `05ff677`, `930fa4e` |
| 14 | 28 | 10 | 1 | `DatabaseChangeResolverFactory.java` – `EntryChangeResolver.java` | 6 | 1.00 | `998ac47`, `d0cd71e`, `c43caa7` |
| 24 | 16 | 10 | 2 | `AiPrivacyNoticeViewModel.java` – `EmbeddingModelCache.java` | 3 | 1.00 | `df06646`, `3c8485b`, `e3ec1a1` |
| 26 | 16 | 9 | 2 | `AbstractPropertiesTabView.java` – `LibraryPropertiesView.java` | 3 | 1.00 | `46f5bcb`, `5e5b72b`, `8aae8f2` |
| 19 | 22 | 7 | 1 | `WelcomeTab.java` – `Walkthroughs.java` | 4 | 1.00 | `aada224`, `3d6b90c`, `74f74a0` |
| 20 | 22 | 7 | 2 | `MoveFilesCleanup.java` – `RenamePdfCleanup.java` | 19 | 0.86 | `fcf1752`, `5594f85`, `ac9afd7` |
| 22 | 21 | 6 | 3 | `Convert.java` – `GenerateBibFromAux.java` | 9 | 1.00 | `2b5fc95`, `39fc369`, `2cc3fdb` |
| 27 | 14 | 5 | 1 | `EditFieldContentTabView.java` – `RenameFieldTabView.java` | 6 | 1.00 | `75464e8`, `a07a0a4`, `5c362e3` |
| 18 | 25 | 4 | 1 | `CapitalizeFormatter.java` – `LowerCaseFormatter.java` | 10 | 0.91 | `1e3bc02`, `8aab893`, `c09e472` |
| 23 | 21 | 4 | 2 | `BiblatexApaField.java` – `StandardField.java` | 5 | 1.00 | `ccda46d`, `97e0130`, `49eb6b2` |
| 25 | 16 | 4 | 2 | `StudyCatalogToFetcherConverter.java` – `StudyQuery.java` | 4 | 1.00 | `939f293`, `546e041`, `db1e651` |
| 31 | 8 | 4 | 2 | `OcrTab.java` – `OcrTabViewModel.java` | 5 | 1.00 | `5f20a6c`, `b058fa6`, `bdae0d9` |
| 29 | 9 | 3 | 2 | `FileAnnotationTab.java` – `AnnotationImporter.java` | 3 | 1.00 | `8751cef`, `e669157`, `41d1551` |
| 30 | 9 | 3 | 1 | `CAYWResource.java` – `BibLatexFormatter.java` | 5 | 1.00 | `dd5d481`, `ce5cd12`, `f31eebd` |
| 38 | 3 | 3 | 2 | `ISSNEditorViewModel.java` – `JournalInformationFetcher.java` | 3 | 1.00 | `61ef1e8`, `86870cb`, `17a215d` |
| 40 | 3 | 3 | 1 | `BibFieldsIndexer.java` – `PostgresConstants.java` | 3 | 1.00 | `fdb26b4`, `f07dfad`, `1bb4e39` |
| 15 | 27 | 2 | 2 | `HowPublishedChecker.java` – `NoteChecker.java` | 5 | 1.00 | `f1746d2`, `f0b90ba`, `8f3f526` |
| 28 | 13 | 2 | 2 | `GuiPushToEmacsSettings.java` – `GuiPushToVimSettings.java` | 8 | 1.00 | `ce08d0d`, `ab13b2a`, `9a5b7d1` |
| 32 | 7 | 2 | 1 | `BstEntry.java` – `BstFunctions.java` | 3 | 1.00 | `1155434`, `c4c0a23`, `0a1e98b` |
| 34 | 4 | 2 | 1 | `CleanupSingleFieldPanel.java` – `CleanupSingleFieldViewModel.java` | 3 | 1.00 | `bae2346`, `23525e9`, `c0642a7` |
| 36 | 4 | 2 | 1 | `SearchQueryExtractorVisitor.java` – `SearchToLuceneVisitor.java` | 3 | 1.00 | `7ba0d72`, `97d548a`, `861b00b` |
| 37 | 3 | 2 | 2 | `DefaultFileUpdateMonitor.java` – `FileUpdateMonitor.java` | 4 | 0.80 | `85dff5f`, `5c9edc9`, `e8eb8e6` |
| 39 | 3 | 2 | 2 | `ProtectedTermsLoader.java` – `ProtectedTermsParser.java` | 3 | 0.60 | `4a8404c`, `4c82d3e`, `381b569` |
| 42 | 2 | 2 | 2 | `AiChatView.java` – `GenerateSummaryAiDatabaseListener.java` | 3 | 0.75 | `6278949`, `e56d5ee`, `e3ec1a1` |
| 45 | 2 | 2 | 1 | `ErrorConsoleViewModel.java` – `LogMessages.java` | 4 | 0.80 | `1c7da01`, `b3381ed`, `462bce4` |
| 50 | 2 | 2 | 1 | `SelectableTextFlow.java` – `MarkdownTextFlow.java` | 4 | 0.80 | `97d6111`, `7ecbaa5`, `074b682` |
| 33 | 5 | 1 | 1 | `DefaultDesktop.java` – `Linux.java` | 16 | 1.00 | `434db3d`, `3a731fa`, `84f15fd` |
| 35 | 4 | 1 | 1 | `ExternalFileTypesTab.java` – `ExternalFileTypesTabViewModel.java` | 6 | 0.75 | `ca3ed25`, `c604ecb`, `0b58079` |
| 41 | 2 | 1 | 1 | `JournalListMvGenerator.java` – `LtwaListMvGenerator.java` | 17 | 0.81 | `c5d988b`, `fd6ed4c`, `4f329ae` |
| 43 | 2 | 1 | 1 | `ConsistencyCheckDialog.java` – `ConsistencyCheckDialogViewModel.java` | 4 | 0.57 | `ccda46d`, `f8f5a38`, `5063bc3` |
| 44 | 2 | 1 | 1 | `DownloadLinkedFileAction.java` – `RedownloadMissingFilesAction.java` | 3 | 1.00 | `e801f41`, `9f2418b`, `2777ebc` |
| 46 | 2 | 1 | 1 | `DiffMethod.java` – `GroupDiffMode.java` | 3 | 1.00 | `dddaa7a`, `f63eb46`, `4fd60d2` |
| 47 | 2 | 1 | 1 | `ModifyBibliographyPropertiesDialogView.java` – `ModifyBibliographyPropertiesDialogViewModel.java` | 3 | 1.00 | `6013237`, `8a1ec40`, `0a1d67b` |
| 48 | 2 | 1 | 1 | `AutoCompletionTab.java` – `AutoCompletionTabViewModel.java` | 3 | 1.00 | `ccda46d`, `8afe793`, `bc5c4fc` |
| 49 | 2 | 1 | 1 | `RedoAction.java` – `UndoAction.java` | 3 | 1.00 | `ecd78de`, `9634a13`, `3ee825d` |
| 51 | 2 | 1 | 1 | `AtomicFileOutputStream.java` – `AtomicFileWriter.java` | 3 | 1.00 | `aa3821a`, `99b4bae`, `e83680f` |
| 52 | 2 | 1 | 1 | `ConflictRules.java` – `FieldPatchComputer.java` | 3 | 1.00 | `c759eda`, `5a91a7f`, `24c55e7` |
| 53 | 2 | 1 | 1 | `FirstPage.java` – `LastPage.java` | 4 | 0.80 | `d687c08`, `e034c51`, `37c81b9` |
| 54 | 2 | 1 | 1 | `ZoteroCitationData.java` – `ZoteroCitationMarkParser.java` | 4 | 1.00 | `45f2b8a`, `9d77273`, `cbe82e2` |
| 55 | 2 | 1 | 1 | `DefinitionProvider.java` – `DefinitionProviderFactory.java` | 3 | 1.00 | `cbb4d1f`, `ea18473`, `a985422` |

