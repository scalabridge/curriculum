# Linux Setup
The workshop requires the following:

1. Use of a `shell`, `bash` is shown in this document
2. Java JDK (Java Development Kit)
3. The Scala example project (doodle)

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

## Install Doodle

To install Doodle, type these commands (except the dollar sign $). You will see text scrolling by after some of these commands:

```
$ cd
$ mkdir ScalaBridge
$ wget https://github.com/scalabridge/curriculum/raw/master/doodle.zip
$ unzip doodle.zip
$ cd doodle/
```

Now, test your installation by typing `./sbt.sh` at the command prompt. You should see something like this:

```
$ ./sbt.sh
Getting org.scala-sbt sbt 0.13.13 ...
.
.
.
doodle> console
.
.
.
scala> Circle(10)
res0: doodle.core.Circle = Circle(10.0)

scala> res0.draw
```

After the last command, verify that you see a window open that looks like this:

![Circle](https://github.com/scalabridge/curriculum/blob/master/setup/img/circle.png?raw=true)

