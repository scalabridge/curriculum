# Windows Installation Guide

This document will guide you through setup on Windows so you'll be ready to do the course exercises, and optionally, continue exploring Scala after you're done.

## Part 1: prerequisites for course exercises

### Check your Java installation

**IMPORTANT:** *These instructions work only if you use the default Windows Command Prompt (they may work in PowerShell also, but this hasn't been tested). There is a known issue in which the doodle project will hang indefinitely if you use a different terminal such as Cygwin.*

You will need a command prompt window to complete the installation. In Windows 10, type `cmd` into the text box to the bottom left of your screen and hit `enter`. The command prompot window should then come up. It looks something like this:

![](img/command_prompt.PNG "command prompt in home directory")

If you're having trouble launching the command prompt or are on a different version of Windows, refer to [these instructions](http://www.wikihow.com/Open-the-Command-Prompt-in-Windows).

Now type: `java -version` at the prompt. If you have Java installed you should get a response like:

```
C:\Users\Tim>java -d64 -version
java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.101-b13, mixed mode)

C:\Users\Tim>
```

If your Java version is 1.8 or higher, then you can skip the Java JDK Installation section below. If you get an error or different looking output than above, you should continue with the Java JDK Installation.

### Java JDK Installation
1. Download the JDK installer for Windows from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html). Choose the 64-bit installation option, refered to as `x64`. The 32-bit installation (known as x86) will not work.
2. Run the installer
3. Add the `bin\` directory of the installed JDK to the PATH environment variable, as described [here](http://www.java.com/en/download/help/path.xml)
4. To verify the JDK installation, open the Command Prompt and type `java -d64 -version`. You should see output to the one in the previous section.

If you have problems installing the JDK, ask for help.                                                             

## Install Doodle

[Download the ZIP file here](https://github.com/scalabridge/doodle/archive/master.zip) and unzip it into a folder that you can find later. Then, navigate to the directory you unzipped from the Windows Command Prompt, using the `cd` command. Ask for help if you get stuck.

 Now, type `sbt.bat`. Make sure see output that looks like the following (this will take a little while the first time you do it).

```
C:\Users\Tim> sbt.bat
.
.
. (you'll see some [info] logs here)
.
.
```

Once that's done, you will see a prompt that looks like `>`. Type 

`console`. It should look something like this:

```
> console
.
.
. (you'll see some [info] logs here)
.
.
scala>
```

The `scala>` prompt means that you are ready to test your install. Try the following at the prompt:

```
scala> Circle(10)
res0: doodle.core.Circle = Circle(10.0)

scala> res0.draw
```

After the last command, verify that you see a window open that looks like this:

![Circle](https://github.com/scalabridge/curriculum/blob/master/setup/img/circle.png?raw=true)

## Part 2: optional Scala and SBT install for further learning

### Install Scala
1. Go to the [Scala Download page](http://www.scala-lang.org/download/) and choose the first option to download the Scala binaries installation package to your computer. The `download` button will automatically download the Windows installer for Scala version 2.12.
2. Use Windows Explorer to locate and run the installer. The Scala Programming Language Distribution Setup Wizard will appear.
3. Repeatedly use the `Next` button to choose all the installation defaults. Check the box on the license page to accept the license.

The installer will install the core Scala language, update the System path for the Scala executables, and privide a start menu link to Scala documentation.

Verify installation by opening a command prompt window and entering `scala` at the prompt:

```
C:\Users\Tim>scala                                                         
Welcome to Scala 2.12.1 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_74).
Type in expressions for evaluation. Or try :help.                          
                                                                           
scala>        
```

The `scala>` prompt indicates you are in the REPL. For now, just type `:quit` at the prompt to exit the REPL.

### Install sbt

Install sbt using the Windows msi installer (or by downloading the zip file) from [the sbt website](http://www.scala-sbt.org/download.html)

Once you have installed it you can run `sbt` at the command prompt. You will see something like this:
```
C:\Users\Tim>sbt
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
[info] Set current project to julie (in build file:/C:/Users/julie/)
>
```
The `>` is the sbt command prompt.
