# Linux Setup
The workshop requires the following:

1. Use of a `shell`, `bash` is shown in this document
2. Java JDK (Java Development Kit)
3. Scala

## Java JDK Installation
1. Use the `java -version` command from a shell prompt to see if java is installed. If you don't have version 1.6 or higher of the JDK installed on your system, use your package manager to install it or follow the directions at the [OpenJDK install page](http://openjdk.java.net/install/). 
2. To verify the JDK installation, open the Command Prompt and type `java -version`:

```
$ java -version
openjdk version "1.8.0_102"
OpenJDK Runtime Environment (build 1.8.0_102-b14)
OpenJDK 64-Bit Server VM (build 25.102-b14, mixed mode)
```
The package installation should have updated your `PATH` environment to add the `bin\` directory of the installed JDK, but if the above command didn't work you will need to update the `PATH` variable manually, as described [here](http://www.java.com/en/download/help/path.xml).

If you have problems installing the JDK, ask for help.

## Install Scala
1a. Use your package manager OR
1b. Go to the [Scala Download page](http://www.scala-lang.org/download/) and choose the first option to download the Scala binaries installation package to your computer. Then follow the instructions [here](http://www.scala-lang.org/download/install.html).
2. Verify installation by opening a command prompt window and entering `scala` at the prompt:

```
$ scala
Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_102).
Type in expressions for evaluation. Or try :help.

scala> 
```
The `scala>` prompt indicates you are in the Scala interpreter **R**ead-**E**valuate-**P**rint **L**oop or REPL. For now, just type `:quit` at the prompt to exit the REPL.

