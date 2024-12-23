package com.sun.tools.jdi.resources;

import java.util.ListResourceBundle;

public final class jdi_de extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "false", "false" },
            { "generic_attaching.address", "Adresse zum Anh\u00E4ngen f\u00FCr VM-Verbindungen" },
            { "generic_attaching.address.label", "Adresse" },
            { "generic_attaching.timeout", "Timeout beim Warten auf das Anh\u00E4ngen" },
            { "generic_attaching.timeout.label", "Timeout" },
            { "generic_listening.address", "Adresse f\u00FCr das Horchen nach VM-Verbindungen" },
            { "generic_listening.address.label", "Adresse" },
            { "generic_listening.timeout", "Timeout beim Warten auf Verbindung" },
            { "generic_listening.timeout.label", "Timeout" },
            { "memory_attaching.description", "Wird \u00FCber gemeinsamen Speicher an andere VMs angeh\u00E4ngt" },
            { "memory_attaching.name", "Name des gemeinsamen Speicherbereichs zum Anh\u00E4ngen f\u00FCr VM-Verbindungen" },
            { "memory_attaching.name.label", "Name" },
            { "memory_listening.description", "Akzeptiert gemeinsame Speicherverbindungen, die von anderen VMs initiiert werden" },
            { "memory_listening.name", "Name des gemeinsamen Speicherbereichs f\u00FCr das Horchen nach VM-Verbindungen" },
            { "memory_listening.name.label", "Name" },
            { "memory_transportservice.description", "Verbindet Debugger und zu debuggendes Programm \u00FCber eine Shared-Memory-Verbindung" },
            { "process_attaching.description", "Wird \u00FCber die Prozess-ID (pid) an das zu debuggende Programm angeh\u00E4ngt" },
            { "process_attaching.pid", "pid" },
            { "process_attaching.pid.label", "Prozess-ID (pid) des zu debuggenden Programms" },
            { "raw.address", "Adresse, von der aus nach einer Verbindung gehorcht wird, wenn der Raw-Befehl ausgef\u00FChrt wurde" },
            { "raw.address.label", "Adresse" },
            { "raw.command", "Raw-Befehl zum Starten der Anwendungs-VM nach dem Debuggen" },
            { "raw.command.label", "Befehl" },
            { "raw.description", "Startet das Ziel mit einer vom Benutzer angegebenen Befehlszeile und wird daran angeh\u00E4ngt" },
            { "raw.quote", "Zeichen, das verwendet wird, um leerzeichengetrennten Text zu einem einzigen Befehlszeilenargument zu kombinieren" },
            { "raw.quote.label", "Anf\u00FChrungszeichen" },
            { "socket_attaching.description", "Wird \u00FCber das Socket an andere VMs angeh\u00E4ngt" },
            { "socket_attaching.host", "Rechnername zum Anh\u00E4ngen f\u00FCr VM-Verbindungen" },
            { "socket_attaching.host.label", "Host" },
            { "socket_attaching.port", "Portnummer zum Anh\u00E4ngen f\u00FCr VM-Verbindungen" },
            { "socket_attaching.port.label", "Port" },
            { "socket_listening.description", "Akzeptiert Socket-Verbindungen, die von anderen VMs initiiert werden" },
            { "socket_listening.localaddr", "Lokale Adresse, an die der Listener gebunden wird" },
            { "socket_listening.localaddr.label", "Lokale Adresse" },
            { "socket_listening.port", "Portnummer f\u00FCr das Horchen nach VM-Verbindungen" },
            { "socket_listening.port.label", "Port" },
            { "socket_transportservice.description", "Verbindet Debugger und zu debuggendes Programm \u00FCber eine TCP-Verbindung" },
            { "sun.description", "Startet das Ziel mit einer Sun Java VM-Befehlszeile und wird daran angeh\u00E4ngt" },
            { "sun.home", "Home-Verzeichnis des SDK oder der Laufzeitumgebung, die zum Starten der Anwendung verwendet wird" },
            { "sun.home.label", "Home" },
            { "sun.include_virtualthreads", "Die Liste aller Threads schlie\u00DFt virtuelle Threads und Plattformthreads ein. Virtuelle Threads sind ein Vorschaufeature der Java-Plattform." },
            { "sun.include_virtualthreads.label", "Virtuelle Threads einschlie\u00DFen" },
            { "sun.init_suspend", "Alle Threads werden vor der Ausf\u00FChrung von \"main\" unterbrochen" },
            { "sun.init_suspend.label", "Unterbrechen" },
            { "sun.main", "Hauptklasse und Argumente, oder, wenn -jar eine Option ist, die Haupt-JAR-Datei und Argumente" },
            { "sun.main.label", "Haupt" },
            { "sun.options", "Gestartete VM-Optionen" },
            { "sun.options.label", "Optionen" },
            { "sun.quote", "Zeichen, das verwendet wird, um leerzeichengetrennten Text zu einem einzigen Befehlszeilenargument zu kombinieren" },
            { "sun.quote.label", "Anf\u00FChrungszeichen" },
            { "sun.vm_exec", "Name des Java-VM-Launchers" },
            { "sun.vm_exec.label", "Launcher" },
            { "true", "true" },
            { "version_format", "Java Debug Interface (Referenzimplementierung) Version {0}.{1} \n{2}" },
        };
    }
}
