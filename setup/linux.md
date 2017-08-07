# Linux Installation Guide

This document will guide you through setup on Linux so you'll be ready to do the course exercises, and optionally, continue exploring Scala after you're done.

## Part 1: prerequisites for course exercises

### Install Java JDK

1. Use the `java -version` command from a shell prompt to see if java is installed. If you don't have version 1.8 or higher of the JDK installed on your system, use your package manager to install it or follow the directions at the [OpenJDK install page](http://openjdk.java.net/install/). 
2. To verify the JDK installation, open the Command Prompt and type `java -version`:

```
$ java -version
openjdk version "1.8.0_102"
OpenJDK Runtime Environment (build 1.8.0_102-b14)
OpenJDK 64-Bit Server VM (build 25.102-b14, mixed mode)
```
The package installation should have updated your `PATH` environment to add the `bin/` directory of the installed JDK, but if the above command didn't work you will need to update the `PATH` variable manually, as described [here](http://www.java.com/en/download/help/path.xml).

If you have problems installing the JDK, ask for help.

### Install Doodle

[Download the ZIP file here](https://github.com/scalabridge/doodle/archive/master.zip). Unzip the project, and from the command line (navigate inside the directory) make sure you can do the following (this will take a little while the first time you do it).

```
$ ./sbt.sh
Getting org.scala-sbt sbt 0.13.11 ...
.
.
. (you'll see some [info] logs here)
.
.
> console
.
.
. (you'll see some [info] logs here)
.
.

scala> Example.image.draw
```

An image of three circles should appear!

![Circle](https://github.com/scalabridge/curriculum/blob/master/setup/img/example-circles.png?raw=true)

## Part 2: optional Scala and SBT install for further learning

## Install Scala
1. Use your package manager OR go to the [Scala Download page](http://www.scala-lang.org/download/) and choose the first option to download the Scala binaries installation package to your computer. Then follow the instructions [here](http://www.scala-lang.org/download/install.html).
2. Verify installation by opening a command prompt window and entering `scala` at the prompt:

```
$ scala
Welcome to Scala 2.12.1 (OpenJDK 64-Bit Server VM, Java 1.8.0_102).
Type in expressions for evaluation. Or try :help.

scala> 
```
The `scala>` prompt indicates you are in the Scala REPL. For now, just type `:quit` at the prompt to exit the REPL.

## Install sbt

To install sbt, simply follow the instructions [here](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html)
