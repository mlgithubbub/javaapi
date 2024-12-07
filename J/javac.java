package com.sun.tools.javac.resources;

public final class javac extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "javac.description", "read Java class and interface definitions and compile them into bytecode and class files" },
            { "javac.fullVersion", "{0} full version \"{1}\"" },
            { "javac.msg.bug", "An exception has occurred in the compiler ({0}). Please file a bug against the Java compiler via the Java bug reporting page (https://bugreport.java.com) after checking the Bug Database (https://bugs.java.com) for duplicates. Include your program, the following diagnostic, and the parameters passed to the Java compiler in your report. Thank you." },
            { "javac.msg.io", "\n\nAn input/output error occurred.\nConsult the following stack trace for details.\n" },
            { "javac.msg.parameters.output", "printing javac parameters to: {0}" },
            { "javac.msg.parameters.output.error", "error while trying to print javac parameters to: {0}, parameters will follow:" },
            { "javac.msg.plugin.uncaught.exception", "\n\nA plugin threw an uncaught exception.\nConsult the following stack trace for details.\n" },
            { "javac.msg.proc.annotation.uncaught.exception", "\n\nAn annotation processor threw an uncaught exception.\nConsult the following stack trace for details.\n" },
            { "javac.msg.resource", "\n\nThe system is out of resources.\nConsult the following stack trace for details.\n" },
            { "javac.msg.usage", "Usage: {0} <options> <source files>\nuse --help for a list of possible options" },
            { "javac.msg.usage.header", "Usage: {0} <options> <source files>\nwhere possible options include:" },
            { "javac.msg.usage.nonstandard.footer", "These extra options are subject to change without notice." },
            { "javac.opt.A", "Options to pass to annotation processors" },
            { "javac.opt.AT", "Read options and filenames from file" },
            { "javac.opt.J", "Pass <flag> directly to the runtime system" },
            { "javac.opt.Werror", "Terminate compilation if warnings occur" },
            { "javac.opt.X", "Print help on extra options" },
            { "javac.opt.Xbootclasspath.a", "Append to the bootstrap class path" },
            { "javac.opt.Xbootclasspath.p", "Prepend to the bootstrap class path" },
            { "javac.opt.Xdoclint", "Enable recommended checks for problems in javadoc comments" },
            { "javac.opt.Xdoclint.custom", "Enable or disable specific checks for problems in javadoc comments,\nwhere <group> is one of accessibility, html, missing, reference, or syntax,\nand <access> is one of public, protected, package, or private." },
            { "javac.opt.Xdoclint.package.args", "[-]<packages>(,[-]<package>)*" },
            { "javac.opt.Xdoclint.package.desc", "Enable or disable checks in specific packages. Each <package> is either the\nqualified name of a package or a package name prefix followed by '.*', which\nexpands to all sub-packages of the given package. Each <package> can be prefixed\nwith '-' to disable checks for the specified package or packages." },
            { "javac.opt.Xdoclint.subopts", "(all|none|[-]<group>)[/<access>]" },
            { "javac.opt.Xlint", "Enable recommended warnings" },
            { "javac.opt.Xlint.all", "Enable all warnings" },
            { "javac.opt.Xlint.custom", "Warnings to enable or disable, separated by comma.\nPrecede a key by '-' to disable the specified warning.\nUse --help-lint to see the supported keys." },
            { "javac.opt.Xlint.desc.auxiliaryclass", "Warn about an auxiliary class that is hidden in a source file, and is used from other files." },
            { "javac.opt.Xlint.desc.cast", "Warn about use of unnecessary casts." },
            { "javac.opt.Xlint.desc.classfile", "Warn about issues related to classfile contents." },
            { "javac.opt.Xlint.desc.dep-ann", "Warn about items marked as deprecated in JavaDoc but not using the @Deprecated annotation." },
            { "javac.opt.Xlint.desc.deprecation", "Warn about use of deprecated items." },
            { "javac.opt.Xlint.desc.divzero", "Warn about division by constant integer 0." },
            { "javac.opt.Xlint.desc.empty", "Warn about empty statement after if." },
            { "javac.opt.Xlint.desc.exports", "Warn about issues regarding module exports." },
            { "javac.opt.Xlint.desc.fallthrough", "Warn about falling through from one case of a switch statement to the next." },
            { "javac.opt.Xlint.desc.finally", "Warn about finally clauses that do not terminate normally." },
            { "javac.opt.Xlint.desc.lossy-conversions", "Warn about possible lossy conversions in compound assignment." },
            { "javac.opt.Xlint.desc.missing-explicit-ctor", "Warn about missing explicit constructors in public and protected classes in exported packages." },
            { "javac.opt.Xlint.desc.module", "Warn about module system related issues." },
            { "javac.opt.Xlint.desc.opens", "Warn about issues regarding module opens." },
            { "javac.opt.Xlint.desc.options", "Warn about issues relating to use of command line options." },
            { "javac.opt.Xlint.desc.overloads", "Warn about issues regarding method overloads." },
            { "javac.opt.Xlint.desc.overrides", "Warn about issues regarding method overrides." },
            { "javac.opt.Xlint.desc.path", "Warn about invalid path elements on the command line." },
            { "javac.opt.Xlint.desc.preview", "Warn about use of preview language features." },
            { "javac.opt.Xlint.desc.processing", "Warn about issues regarding annotation processing." },
            { "javac.opt.Xlint.desc.rawtypes", "Warn about use of raw types." },
            { "javac.opt.Xlint.desc.removal", "Warn about use of API that has been marked for removal." },
            { "javac.opt.Xlint.desc.requires-automatic", "Warn about use of automatic modules in the requires clauses." },
            { "javac.opt.Xlint.desc.requires-transitive-automatic", "Warn about automatic modules in requires transitive." },
            { "javac.opt.Xlint.desc.serial", "Warn about Serializable classes that do not have a serialVersionUID field. \n                         Also warn about other suspect declarations in Serializable and Externalizable classes and interfaces." },
            { "javac.opt.Xlint.desc.static", "Warn about accessing a static member using an instance." },
            { "javac.opt.Xlint.desc.strictfp", "Warn about unnecessary use of the strictfp modifier." },
            { "javac.opt.Xlint.desc.synchronization", "Warn about synchronization attempts on instances of value-based classes." },
            { "javac.opt.Xlint.desc.text-blocks", "Warn about inconsistent white space characters in text block indentation." },
            { "javac.opt.Xlint.desc.try", "Warn about issues relating to use of try blocks (i.e. try-with-resources)." },
            { "javac.opt.Xlint.desc.unchecked", "Warn about unchecked operations." },
            { "javac.opt.Xlint.desc.varargs", "Warn about potentially unsafe vararg methods." },
            { "javac.opt.Xlint.none", "Disable all warnings" },
            { "javac.opt.Xstdout", "Redirect standard output" },
            { "javac.opt.addExports", "Specify a package to be considered as exported from its defining module\nto additional modules, or to all unnamed modules if <other-module> is ALL-UNNAMED." },
            { "javac.opt.addReads", "Specify additional modules to be considered as required by a given module.\n<other-module> may be ALL-UNNAMED to require the unnamed module." },
            { "javac.opt.addmods", "Root modules to resolve in addition to the initial modules, or all modules\non the module path if <module> is ALL-MODULE-PATH." },
            { "javac.opt.arg.Xlint", "<key>(,<key>)*" },
            { "javac.opt.arg.addExports", "<module>/<package>=<other-module>(,<other-module>)*" },
            { "javac.opt.arg.addReads", "<module>=<other-module>(,<other-module>)*" },
            { "javac.opt.arg.addmods", "<module>(,<module>)*" },
            { "javac.opt.arg.class", "<class>" },
            { "javac.opt.arg.class.list", "<class1>[,<class2>,<class3>...]" },
            { "javac.opt.arg.default.module.for.created.files", "<module-name>" },
            { "javac.opt.arg.directory", "<directory>" },
            { "javac.opt.arg.dirs", "<dirs>" },
            { "javac.opt.arg.encoding", "<encoding>" },
            { "javac.opt.arg.file", "<filename>" },
            { "javac.opt.arg.flag", "<flag>" },
            { "javac.opt.arg.jdk", "<jdk>|none" },
            { "javac.opt.arg.key.equals.value", "key[=value]" },
            { "javac.opt.arg.limitmods", "<module>(,<module>)*" },
            { "javac.opt.arg.m", "<module>(,<module>)*" },
            { "javac.opt.arg.module.version", "<version>" },
            { "javac.opt.arg.mspath", "<module-source-path>" },
            { "javac.opt.arg.multi-release", "<release>" },
            { "javac.opt.arg.number", "<number>" },
            { "javac.opt.arg.patch", "<module>=<file>(:<file>)*" },
            { "javac.opt.arg.path", "<path>" },
            { "javac.opt.arg.pathname", "<pathname>" },
            { "javac.opt.arg.plugin", "\"name args\"" },
            { "javac.opt.arg.profile", "<profile>" },
            { "javac.opt.arg.release", "<release>" },
            { "javac.opt.bootclasspath", "Override location of bootstrap class files" },
            { "javac.opt.classpath", "Specify where to find user class files and annotation processors" },
            { "javac.opt.d", "Specify where to place generated class files" },
            { "javac.opt.default.module.for.created.files", "Fallback target module for files created by annotation processors, if none specified or inferred." },
            { "javac.opt.deprecation", "Output source locations where deprecated APIs are used" },
            { "javac.opt.diags", "Select a diagnostic mode" },
            { "javac.opt.encoding", "Specify character encoding used by source files" },
            { "javac.opt.endorseddirs", "Override location of endorsed standards path" },
            { "javac.opt.extdirs", "Override location of installed extensions" },
            { "javac.opt.g", "Generate all debugging info" },
            { "javac.opt.g.lines.vars.source", "Generate only some debugging info" },
            { "javac.opt.g.none", "Generate no debugging info" },
            { "javac.opt.headerDest", "Specify where to place generated native header files" },
            { "javac.opt.help", "Print this help message" },
            { "javac.opt.help.lint", "Print the supported keys for -Xlint" },
            { "javac.opt.help.lint.header", "The supported keys for -Xlint are:" },
            { "javac.opt.implicit", "Specify whether or not to generate class files for implicitly referenced files" },
            { "javac.opt.inherit_runtime_environment", "Inherit module system configuration options from the runtime environment." },
            { "javac.opt.limitmods", "Limit the universe of observable modules" },
            { "javac.opt.m", "Compile only the specified module(s), check timestamps" },
            { "javac.opt.maxerrs", "Set the maximum number of errors to print" },
            { "javac.opt.maxwarns", "Set the maximum number of warnings to print" },
            { "javac.opt.module.version", "Specify version of modules that are being compiled" },
            { "javac.opt.modulepath", "Specify where to find application modules" },
            { "javac.opt.modulesourcepath", "Specify where to find input source files for multiple modules" },
            { "javac.opt.moreinfo", "Print extended information for type variables" },
            { "javac.opt.multi-release", "Specify which release to use in multi-release jars" },
            { "javac.opt.nogj", "Don't accept generics in the language" },
            { "javac.opt.nowarn", "Generate no warnings" },
            { "javac.opt.parameters", "Generate metadata for reflection on method parameters" },
            { "javac.opt.patch", "Override or augment a module with classes and resources\nin JAR files or directories" },
            { "javac.opt.pkginfo", "Specify handling of package-info files" },
            { "javac.opt.plugin", "Name and optional arguments for a plug-in to be run" },
            { "javac.opt.prefer", "Specify which file to read when both a source file and class file are found for an implicitly compiled class" },
            { "javac.opt.preview", "Enable preview language features. To be used in conjunction with either -source or --release." },
            { "javac.opt.print", "Print out a textual representation of specified types" },
            { "javac.opt.printProcessorInfo", "Print information about which annotations a processor is asked to process" },
            { "javac.opt.printRounds", "Print information about rounds of annotation processing" },
            { "javac.opt.printsearch", "Print information where classfiles are searched" },
            { "javac.opt.proc.none.only", "Control whether annotation processing and/or compilation is done." },
            { "javac.opt.processor", "Names of the annotation processors to run; bypasses default discovery process" },
            { "javac.opt.processormodulepath", "Specify a module path where to find annotation processors" },
            { "javac.opt.processorpath", "Specify where to find annotation processors" },
            { "javac.opt.profile", "Check that API used is available in the specified profile.\nThis option is deprecated and may be removed in a future release." },
            { "javac.opt.prompt", "Stop after each error" },
            { "javac.opt.release", "Compile for the specified Java SE release. Supported releases: {0}" },
            { "javac.opt.s", "Emit java sources instead of classfiles" },
            { "javac.opt.source", "Provide source compatibility with the specified Java SE release. Supported releases: {0}" },
            { "javac.opt.sourceDest", "Specify where to place generated source files" },
            { "javac.opt.sourcepath", "Specify where to find input source files" },
            { "javac.opt.system", "Override location of system modules" },
            { "javac.opt.target", "Generate class files suitable for the specified Java SE release. Supported releases: {0}" },
            { "javac.opt.upgrademodulepath", "Override location of upgradeable modules" },
            { "javac.opt.userpathsfirst", "Search classpath and sourcepath for classes before the bootclasspath instead of after" },
            { "javac.opt.verbose", "Output messages about what the compiler is doing" },
            { "javac.opt.version", "Version information" },
            { "javac.version", "{0} {1}" },
        };
    }
}
