#Setting Up Your Environment

##Mac OS Installation Guide

###Start a Terminal 
Open Spotlight by clicking the magnifying glass icon on the upper right corner of your screen

Type `terminal` in the search box 

Click the Terminal application entry to launch your terminal session:
![Terminal in Spotlight](http://skarlson.com/scalabridge/images/launching_terminal.png)

You will see a window that looks like this:
![Terminal Window](http://skarlson.com/scalabridge/images/terminal_window.png)

You'll use this terminal window to complete the rest of this installation guide.

###Install Java
Recent versions of Mac OS come with Java already installed.  Confirm that your computer has Java installed by typing
```
java -version
```
at the command prompt in your terminal window. You should see a response similar to
```
yourmac:~ user$ java -version
java version "1.7.0_65"
Java(TM) SE Runtime Environment (build 1.7.0_65-b17)
Java HotSpot(TM) 64-Bit Server VM (build 24.65-b04, mixed mode)
```
You need Java version 1.6 or higher in order to run Scala. If the version of Java installed on your computer is older than 1.6, use your Mac's Software Update utility to upgrade to the current version before continuing.

## Install Doodle

Go to the terminal that you opened earlier and type these commands (except the dollar sign $). You will see text scrolling by after some of these commands:

```
$ cd
$ mkdir ScalaBridge
$ wget https://github.com/scalabridge/curriculum/raw/master/doodle.zip
$ unzip doodle.zip
$ cd doodle/
```

Now make sure it works by doing the following (this will take a little while the first time you do it):

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
