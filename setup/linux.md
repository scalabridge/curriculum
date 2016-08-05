# Linux Setup
## Java JDK Installation
1. If you don't have the JDK installed on your system, use your package manager to install it or follow the directions at the [OpenJDK install page](http://openjdk.java.net/install/). 
2. To verify the JDK installation, open the Command Prompt and type `java -version`:
```
[tim@rajas ~]$ java -version
openjdk version "1.8.0_102"
OpenJDK Runtime Environment (build 1.8.0_102-b14)
OpenJDK 64-Bit Server VM (build 25.102-b14, mixed mode)
[tim@rajas ~]$
```
The package installation should have updated your `PATH` environment to add the `bin\` directory of the installed JDK, but if the above command didn't work you will need to update the `PATH` variable manually, as described [here](http://www.java.com/en/download/help/path.xml).

If you have problems installing the JDK, ask for help.

## Install sbt
1. Follow the directions [here](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html) or use your package manager.
2. At a command prompt, type: `sbt about`
```
[tim@rajas curriculum]$ sbt about
[info] Set current project to curriculum (in build file:/home/tim/dev/scala/curriculum/)
[info] Updating {file:/home/tim/dev/scala/curriculum/}curriculum...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] This is sbt 0.13.11
[info] The current project is {file:/home/tim/dev/scala/curriculum/}curriculum 0.1-SNAPSHOT
[info] The current project is built against Scala 2.11.8
[info] Available Plugins: sbt.plugins.IvyPlugin, sbt.plugins.JvmPlugin, sbt.plugins.CorePlugin, sbt.plugins.JUnitXmlReportPlugin
[info] sbt, sbt plugins, and build definitions are using Scala 2.10.6
[tim@rajas curriculum]$ 
```
You should see: `[info] This is sbt 0.13.x` in the output.

## Install Scala
1a. Use your package manager OR
1b. Go to the [Scala Download page](http://www.scala-lang.org/download/) and choose the first option to download the Scala binaries installation package to your computer. Then follow the instructions [here](http://www.scala-lang.org/download/install.html).
2. Verify installation by opening a command prompt window and entering `scala` at the prompt:
```
[tim@rajas curriculum]$ scala
Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_102).
Type in expressions for evaluation. Or try :help.

scala> 
```
The `scala>` prompt indicates you are in the Scala interpreter **R**ead-**E**valuate-**P**rint **L**oop or REPL. For now, just type `:quit` at the prompt to exit the REPL.
## Next Steps
This completes the installation required for the Scalabridge workshop. You should now read and follow the *Using sbt and Scala Tutorial*.