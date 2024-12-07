package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar_de extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "Kennzeichen \"c\" erfordert Angabe von Manifest oder Eingabedateien." },
            { "error.bad.dflag", "F\u00FCr die Option \"-d, --describe-module\" m\u00FCssen keine Eingabedateien angegeben werden" },
            { "error.bad.eflag", "Kennzeichen \"e\" und Manifest mit dem Attribut \"Main-Class\" k\u00F6nnen nicht zusammen angegeben\nwerden." },
            { "error.bad.file.arg", "Fehler beim Parsen der Dateiargumente" },
            { "error.bad.option", "Eine der Optionen -{ctxuid} oder --validate muss angegeben werden." },
            { "error.bad.reason", "Schlechter Grund: {0}, Grund muss entweder \"deprecated\", \"deprecated-for-removal\" oder \"incubating\" sein" },
            { "error.bad.uflag", "Kennzeichen \"u\" erfordert Angabe von Manifest, Kennzeichen \"e\" oder Eingabedateien." },
            { "error.cant.open", "\u00D6ffnen nicht m\u00F6glich: {0}" },
            { "error.create.dir", "{0}: Verzeichnis konnte nicht erstellt werden" },
            { "error.create.tempfile", "Es konnte keine tempor\u00E4re Datei erstellt werden" },
            { "error.date.notvalid", "Datum {0} ist keine g\u00FCltige erweiterte Datums-/Uhrzeitangabe mit Zeitunterschied und optionaler Zeitzone nach ISO-8601" },
            { "error.date.out.of.range", "Datum {0} liegt nicht im g\u00FCltigen Bereich 1980-01-01T00:00:02Z bis 2099-12-31T23:59:59Z" },
            { "error.hash.dep", "Abh\u00E4ngigkeiten bei Hashing-Modul {0}. Modul {1} kann nicht im Modulpfad gefunden werden" },
            { "error.illegal.option", "Unzul\u00E4ssige Option: {0}" },
            { "error.incorrect.length", "Falsche L\u00E4nge bei der Verarbeitung: {0}" },
            { "error.invalid.versioned.module.attribute", "Ung\u00FCltiges Moduldeskriptorattribut {0}" },
            { "error.missing.arg", "F\u00FCr die Option {0} ist ein Argument erforderlich" },
            { "error.missing.provider", "Serviceprovider nicht gefunden: {0}" },
            { "error.module.descriptor.not.found", "Moduldeskriptor nicht gefunden" },
            { "error.module.options.without.info", "--module-version oder --hash-modules ohne module-info.class" },
            { "error.multiple.main.operations", "Es ist nicht m\u00F6glich, mehrere \"-cuxtid\"-Optionen anzugeben" },
            { "error.no.operative.descriptor", "Kein operativer Deskriptor f\u00FCr Release: {0}" },
            { "error.no.root.descriptor", "Kein Root-Moduldeskriptor. Geben Sie --release an" },
            { "error.nosuch.fileordir", "{0}: Datei oder Verzeichnis nicht vorhanden" },
            { "error.release.unexpected.versioned.entry", "Unerwarteter versionierte Eintrag {0} f\u00FCr Release {1}" },
            { "error.release.value.notnumber", "Release {0} nicht g\u00FCltig" },
            { "error.release.value.toosmall", "Release {0} nicht g\u00FCltig, muss >= 9 sein" },
            { "error.unable.derive.automodule", "Moduldeskriptor kann nicht abgeleitet werden f\u00FCr: {0}" },
            { "error.unexpected.module-info", "Unerwarteter Moduldeskriptor {0}" },
            { "error.unrecognized.option", "Unbekannte Option: {0}" },
            { "error.validator.bad.entry.name", "Eintragsname hat das falsche Format, {0}" },
            { "error.validator.different.api", "Eintrag {0} enth\u00E4lt eine Klasse mit einer anderen API als in der fr\u00FCheren Version" },
            { "error.validator.entryname.tooshort", "Eintragsname {0} zu kurz, kein Verzeichnis" },
            { "error.validator.incompatible.class.version", "Eintrag {0} weist eine Klassenversion auf, die mit einer fr\u00FCheren Version inkompatibel ist" },
            { "error.validator.info.exports.notequal", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt unterschiedliche \"exports\"" },
            { "error.validator.info.manclass.notequal", "{0}: module-info.class in einem versionierten Verzeichnis enth\u00E4lt unterschiedlichen \"main-class\"-Wert" },
            { "error.validator.info.name.notequal", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt falschen Namen" },
            { "error.validator.info.opens.notequal", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt unterschiedliche \"opens\"" },
            { "error.validator.info.provides.notequal", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt unterschiedliche \"provides\"" },
            { "error.validator.info.requires.added", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt zus\u00E4tzlichen \"requires\"" },
            { "error.validator.info.requires.dropped", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt fehlenden \"requires\"" },
            { "error.validator.info.requires.transitive", "module-info.class in einem versionierten Verzeichnis enth\u00E4lt zus\u00E4tzlichen \"requires transitive\"" },
            { "error.validator.info.version.notequal", "{0}: module-info.class in einem versionierten Verzeichnis enth\u00E4lt unterschiedlichen \"version\"-Wert" },
            { "error.validator.isolated.nested.class", "Eintrag {0} ist eine isolierte verschachtelte Klasse" },
            { "error.validator.jarfile.exception", "{0} kann nicht validiert werden: {1}" },
            { "error.validator.jarfile.invalid", "ung\u00FCltige Multi-Release-JAR-Datei {0} gel\u00F6scht" },
            { "error.validator.names.mismatch", "Eintrag {0} enth\u00E4lt eine Klasse mit dem internen Namen {1}, Namen stimmen nicht \u00FCberein" },
            { "error.validator.new.public.class", "Eintrag {0} enth\u00E4lt eine neue \u00F6ffentliche Klasse, die in Basiseintr\u00E4gen nicht gefunden wird" },
            { "error.validator.version.notnumber", "Eintragsname {0} hat keine Versionsnummer" },
            { "error.write.file", "Fehler beim Schreiben in vorhandener JAR-Datei" },
            { "jar.description", "Archiv f\u00FCr Klassen und Ressourcen erstellen und individuelle Klassen oder Ressourcen aus einem Archiv \u00E4ndern oder wiederherstellen" },
            { "main.help.opt.any", " In jedem Modus g\u00FCltige Vorgangsmodifikatoren:\n\n  -C DIR                     Zum angegebenen Verzeichnis wechseln und die folgende\n                             Datei aufnehmen" },
            { "main.help.opt.any.file", "  -f, --file=FILE            Der Name der Archivdatei. Wenn Sie dies auslassen, wird entweder stdin oder\n                             stdout verwendet, je nach Vorgang\n      --release VERSION      Speichert alle der folgenden Dateien in einem versionierten Verzeichnis\n                             der JAR-Datei (d.h. META-INF/versions/VERSION/)" },
            { "main.help.opt.any.verbose", "  -v, --verbose              Verbose-Ausgabe bei Standardausgabe generieren" },
            { "main.help.opt.create", " Vorgangsmodifikatoren, die nur im Erstellungsmodus g\u00FCltig sind:\n" },
            { "main.help.opt.create.normalize", "  -n, --normalize            Normalisiert Informationen im neuen JAR-Archiv\n                             nach der Erstellung. Diese Option ist veraltet, und ihre\n                             Entfernung in einem k\u00FCnftigen JDK-Release ist geplant" },
            { "main.help.opt.create.update", " Vorgangsmodifikatoren, die nur im Erstellungs- und Aktualisierungsmodus g\u00FCltig sind:\n" },
            { "main.help.opt.create.update.do-not-resolve-by-default", "      --do-not-resolve-by-default  Wird aus der Standard-Root-Gruppe von Modulen ausgeschlossen" },
            { "main.help.opt.create.update.hash-modules", "      --hash-modules=PATTERN Berechnet und zeichnet die Hashes von Modulen auf, \n                             die mit einem bestimmten Muster \u00FCbereinstimmen, und direkt oder\n                             indirekt von einem modularen JAR-Archiv abh\u00E4ngen, das erstellt\n                             wird, oder einem nicht-modularen JAR-Archiv, das aktualisiert wird" },
            { "main.help.opt.create.update.index", " Vorgangsmodifikatoren, die nur im Erstellungs-, Aktualisierungs- und Indexgenerierungsmodus g\u00FCltig sind:\n" },
            { "main.help.opt.create.update.index.date", "      --date=TIMESTAMP        Zeitstempel im erweiterten Datums-/Uhrzeitformat mit Zeitunterschied\n                             und optionaler Zeitzone nach ISO-8601, zur Verwendung f\u00FCr die Zeitstempel von\n                             Eintr\u00E4gen, z.B. \"2022-02-12T12:30:00-05:00\"" },
            { "main.help.opt.create.update.index.no-compress", "  -0, --no-compress          Nur speichern, keine ZIP-Komprimierung verwenden" },
            { "main.help.opt.create.update.main-class", "  -e, --main-class=CLASSNAME Der Anwendungseinstiegspunkt f\u00FCr Standalone-\n                             Anwendungen, die in einem modularen oder ausf\u00FChrbaren\n                             JAR-Archiv geb\u00FCndelt sind" },
            { "main.help.opt.create.update.manifest", "  -m, --manifest=FILE        Die Manifestinformationen aus der angegebenen\n                             Manifestdatei aufnehmen" },
            { "main.help.opt.create.update.module-path", "  -p, --module-path         Speicherort von Modulabh\u00E4ngigkeit zur Generierung\n                             von Hash" },
            { "main.help.opt.create.update.module-version", "      --module-version=VERSION    Die Modulversion beim Erstellen eines modularen\n                             JAR-Archivs oder Aktualisieren eines nicht modularen JAR-Archivs" },
            { "main.help.opt.create.update.no-manifest", "  -M, --no-manifest          Keine Manifestdatei f\u00FCr die Eintr\u00E4ge erstellen" },
            { "main.help.opt.create.update.warn-if-resolved", "      --warn-if-resolved     Hinweis f\u00FCr ein Tool, eine Warnung auszugeben,\n                             wenn das Modul aufgel\u00F6st wird, entweder \"deprecated\", \"deprecated-for-removal\"\n                             oder \"incubating\"" },
            { "main.help.opt.main", " Hauptvorgangsmodus:\n" },
            { "main.help.opt.main.create", "  -c, --create               Erstellt das Archiv. Wenn der mit\n                             -f oder --file angegebene Archivdateiname einen Pfad enth\u00E4lt, werden auch fehlende\n                             \u00FCbergeordnete Verzeichnisse erstellt" },
            { "main.help.opt.main.describe-module", "  -d, --describe-module      Gibt die Modulbeschreibung oder den automatischen Modulnamen aus" },
            { "main.help.opt.main.extract", "  -x, --extract              Benannte (oder alle) Dateien aus dem Archiv extrahieren" },
            { "main.help.opt.main.generate-index", "  -i, --generate-index=FILE  Indexinformationen f\u00FCr die angegebenen JAR-\n                             Archive generieren" },
            { "main.help.opt.main.list", "  -t, --list                 Das Inhaltsverzeichnis f\u00FCr das Archiv auflisten" },
            { "main.help.opt.main.update", "  -u, --update               Ein vorhandenes JAR-Archiv aktualisieren" },
            { "main.help.opt.main.validate", "      --validate             Validiert den Inhalt des JAR-Archivs. Diese Option\n                             validiert, dass die von einem Multi-Release-JAR-Archiv\n                             exportierte API \u00FCber die verschiedenen Releaseversionen\n                             hinweg konsistent ist." },
            { "main.help.opt.other", " Weitere Optionen:\n" },
            { "main.help.opt.other.help", "  -?, -h, --help[:compat]    Gibt diese Meldung oder optional die Kompatibilit\u00E4t, Hilfe an" },
            { "main.help.opt.other.help-extra", "      --help-extra           Hilfe zu zus\u00E4tzlichen Optionen" },
            { "main.help.opt.other.version", "      --version              Programmversion ausgeben" },
            { "main.help.postopt", " Ein Archiv ist ein modulares JAR-Archiv, wenn der Moduldeskriptor \"module-info.class\"\n in der Root der angegebenen Verzeichnisse oder in der Root des JAR-Archivs selbst\n vorhanden ist. Die folgenden Vorg\u00E4nge sind nur g\u00FCltig, wenn Sie ein modulares JAR-Archiv\n erstellen oder ein vorhandenes nicht modulares JAR-Archiv aktualisieren: \"--module-version\",\n \"--hash-modules\" und \"--modulepath\".\n\n Obligatorische oder optionale Argumente zu langen Optionen sind auch f\u00FCr die jeweils\n zugeh\u00F6rigen kurzen Optionen obligatorisch oder optional." },
            { "main.help.preopt", "Verwendung: jar [OPTION...] [ [--release VERSION] [-C dir] files] ...\njar erstellt ein Archiv f\u00FCr Klassen und Ressourcen und kann individuelle\nKlassen oder Ressourcen aus einem Archiv bearbeiten oder wiederherstellen.\n\n Beispiele:\n # Ein Archiv namens classes.jar mit zwei Klassendateien erstellen:\n jar --create --file classes.jar Foo.class Bar.class\n # Ein Archiv mit einem vorhandenen Manifest mit allen Dateien in foo/ erstellen:\n jar --create --file classes.jar --manifest mymanifest -C foo/ .\n # Ein modulares JAR-Archiv erstellen, dessen Moduldeskriptor sich in\n # classes/module-info.class befindet:\n jar --create --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ classes resources\n # Ein vorhandenes nicht modulares JAR-Archiv in ein modulares JAR-Archiv aktualisieren:\n jar --update --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ module-info.class\n # Multi-Release-JAR-Datei erstellen, wobei einige Dateien im Verzeichnis META-INF/versions/9 gespeichert werden:\n jar --create --file mr.jar -C foo classes --release 9 -C foo9 classes\n\nUm den \"jar\"-Befehl zu k\u00FCrzen oder zu vereinfachen, k\u00F6nnen Sie Argumente in einer separaten\nTextdatei angeben und diese mit dem @-Zeichen als Pr\u00E4fix an den \"jar\"-Befehl \u00FCbergeben.\n\n Beispiele:\n # Zus\u00E4tzliche Optionen und Liste der Klassendateien aus der Datei classes.list lesen\n jar --create --file my.jar @classes.list\n" },
            { "main.usage.summary", "Verwendung: jar [OPTION...] [ [--release VERSION] [-C dir] Dateien] ..." },
            { "main.usage.summary.try", "Verwenden Sie \"jar --help\", um weitere Informationen anzuzeigen." },
            { "out.added.manifest", "Manifest wurde hinzugef\u00FCgt" },
            { "out.added.module-info", "module-info hinzugef\u00FCgt: {0}" },
            { "out.adding", "{0} wird hinzugef\u00FCgt" },
            { "out.automodule", "Kein Moduldeskriptor gefunden. Automatisches Modul wurde abgeleitet." },
            { "out.create", "  erstellt: {0}" },
            { "out.deflated", "({0} % verkleinert)" },
            { "out.extracted", "extrahiert: {0}" },
            { "out.ignore.entry", "Eintrag {0} wird ignoriert" },
            { "out.inflated", " vergr\u00F6\u00DFert: {0}" },
            { "out.size", "(ein = {0}) (aus = {1})" },
            { "out.stored", "(0 % gespeichert)" },
            { "out.update.manifest", "Manifest wurde aktualisiert" },
            { "out.update.module-info", "module-info aktualisiert: {0}" },
            { "usage.compat", "Kompatibilit\u00E4tsschnittstelle\nVerwendung: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files] ...\nOptionen:\n    -c  erstellt ein neues Archiv (einschlie\u00DFlich fehlender \u00FCbergeordneter Verzeichnisse)\n    -t  listet das Inhaltsverzeichnis f\u00FCr das Archiv auf\n    -x  extrahiert die benannten (oder alle) Dateien aus dem Archiv\n    -u  aktualisiert ein vorhandenes Archiv\n    -v  generiert Verbose-Ausgabe zur Standardausgabe\n    -f  gibt den Archivdateinamen an\n    -m  schlie\u00DFt Manifestinformationen aus der angegebenen Manifestdatei ein\n    -e  gibt den Anwendungseinstiegspunkt f\u00FCr Standalone-Anwendungen an,\n        die in einer ausf\u00FChrbaren JAR-Datei geb\u00FCndelt sind\n    -0  speichert nur, keine ZIP-Komprimierung\n    -P  beh\u00E4lt die vorangestellten Komponenten \"/\" (absoluter Pfad) und \"..\" (\u00FCbergeordnetes Verzeichnis) aus Dateinamen bei\n    -M  generiert keine Manifestdatei f\u00FCr die Eintr\u00E4ge\n    -i  generiert Indexinformationen f\u00FCr die angegebenen JAR-Dateien\n    -C  wechselt zum angegebenen Verzeichnis und schlie\u00DFt die folgende Datei ein\nDateien, die Verzeichnisse sind, werden rekursiv verarbeitet.\nDie Namen der Manifestdatei, der Archivdatei und des Einstiegspunkts werden\nin der gleichen Reihenfolge wie die Flags \"m\", \"f\" und \"e\" angegeben.\n\nBeispiel 1: Zwei Klassendateien in einem Archiv namens classes.jar archivieren: \n       jar cvf classes.jar Foo.class Bar.class \nBeispiel 2: Die vorhandene Manifestdatei \"mymanifest\" verwenden und alle\n           Dateien im Verzeichnis \"foo/\" in \"classes.jar\" archivieren: \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
            { "warn.flag.is.deprecated", "Warnung: Die Option {0} ist veraltet, und ihre Entfernung in einem k\u00FCnftigen JDK-Release ist geplant\n" },
            { "warn.release.unexpected.versioned.entry", "Unerwarteter versionierter Eintrag {0}" },
            { "warn.validator.concealed.public.class", "Warnung: Eintrag {0} ist eine \u00F6ffentliche Klasse\nin einem verdeckten Package. Wenn Sie diese JAR-Datei in den Classpath einf\u00FCgen, kommt es\nzu nicht kompatiblen \u00F6ffentlichen Schnittstellen" },
            { "warn.validator.identical.entry", "Warnung: Eintrag {0} enth\u00E4lt eine Klasse, die mit\neinem bereits in der JAR-Datei enthaltenen Eintrag identisch ist" },
            { "warn.validator.resources.with.same.name", "Warnung: Eintrag {0}, mehrere Ressourcen mit demselben Namen" },
        };
    }
}
