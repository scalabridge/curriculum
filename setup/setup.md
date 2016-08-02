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

###Install Homebrew
[Homebrew](http://brew.sh/) is a software package manager for Mac OS. To install Homebrew, paste the following line at your terminal prompt:

```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

and follow the instructions in the installation script.

You will see output like this in your terminal:

```
yourmac:~ user$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
==> This script will install:
/usr/local/bin/brew
/usr/local/Library/...
/usr/local/share/doc/homebrew
/usr/local/share/man/man1/brew.1
...
/usr/local/share/man
/usr/local/share/man/man1

Press RETURN to continue or any other key to abort
...
==> Installation successful!
==> Next steps
Run `brew help` to get started
Further documentation: https://git.io/brew-docs
==> Homebrew has enabled anonymous aggregate user behaviour analytics
Read the analytics documentation (and how to opt-out) here:
  https://git.io/brew-analytics
yourmac:~ user
```

Verify that Homebrew is installed by typing 
```
brew help
```

```
yourmac:~ user$ brew help
Example usage:
  brew search [TEXT|/REGEX/]
  brew (info|home|options) [FORMULA...]
  brew install FORMULA...
  brew update
  brew upgrade [FORMULA...]
  brew uninstall FORMULA...
  brew list [FORMULA...]
...
```

###Install Scala

Go to the [Scala Download](http://www.scala-lang.org/download/) page and choose the first option to download the Scala binaries installation package to your computer. For this installation guide, we will assume you are installing Scala version 2.11.8.

![Download Binaries](http://skarlson.com/scalabridge/images/download_binaries.png)

In your terminal window, change into your Downloads directory and move the Scala package to the installation area by typing
```
cd ~/Downloads
```
and then 
```
sudo mv scala-2.11.8.tgz /usr/local/share/
```
(enter your password when prompted at the `Password:` prompt)

In your terminal window, move into the installation area and unpack the installation package by typing
```
cd /usr/local/share
```
and then
```
sudo tar xvf scala-2.11.8.tgz
```

You will see output like this in your terminal:

```
yourmac:~ user$ cd Downloads/
yourmac:Downloads user$ sudo mv scala-2.11.8.tgz /usr/local/share/
yourmac:Downloads user$ cd /usr/local/share/
yourmac:share user$ sudo tar xvf scala-2.11.8.tgz 
x scala-2.11.8/
x scala-2.11.8/man/
x scala-2.11.8/man/man1/
x scala-2.11.8/man/man1/scala.1
x scala-2.11.8/man/man1/scalap.1
...
x scala-2.11.8/lib/scala-swing_2.11-1.0.2.jar
x scala-2.11.8/lib/scala-actors-2.11.0.jar
```

Change into the Scala application directory and then start the Scala interpreter (a.k.a the "REPL") by typing
```
cd scala-2.11.8
```
and then
```
scala
```

You will see the Scala REPL prompt in your terminal:

```
yourmac:share user$ cd scala-2.11.8
yourmac:scala-2.11.8 user$ scala
Welcome to Scala 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_65).
Type in expressions for evaluation. Or try :help.

scala> 
```

Type 
```
:help
```
at the `scala>` prompt to see instructions for using the REPL.

```
scala> :help
All commands can be abbreviated, e.g., :he instead of :help.
:edit <id>|<line>        edit history
:help [command]          print this summary or command-specific help
:history [num]           show the history (optional num is commands to show)
:h? <string>             search the history
...
```

Type 
```
:quit
```
at the `scala>` prompt to exit the REPL and return to the terminal prompt.

###Install SBT
Use Homebrew to install the [Scala Build Tool](http://www.scala-sbt.org/index.html) (SBT). In your terminal window, type
```
brew install sbt
```

You will see output like this in your terminal:

```
yourmac:~ user$ brew install sbt
==> Downloading https://dl.bintray.com/sbt/native-packages/sbt/0.13.12/sbt-0.13.12.tgz
######################################################################## 100.0%
==> Caveats
You can use $SBT_OPTS to pass additional JVM options to SBT:
   SBT_OPTS="-XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"

This formula is now using the standard typesafe sbt launcher script.
Project specific options should be placed in .sbtopts in the root of your project.
Global settings should be placed in /usr/local/etc/sbtopts
==> Summary
🍺  /usr/local/Cellar/sbt/0.13.12: 5 files, 1.2M, built in 1 second
```

In your terminal window, start SBT by typing
```
sbt
```

The first time SBT starts up it will download additional packages for setup. This process may take a few minutes. You will see output in your termainal like:

```
Getting org.scala-sbt sbt 0.13.12 ...
downloading http://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt/0.13.12/jars/sbt.jar ...
	[SUCCESSFUL ] org.scala-sbt#sbt;0.13.12!sbt.jar (1235ms)
downloading http://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/main/0.13.12/jars/main.jar ...
	[SUCCESSFUL ] org.scala-sbt#main;0.13.12!main.jar (2387ms)
downloading http://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/compiler-interface/0.13.12/jars/compiler-interface.jar ...
	[SUCCESSFUL ] org.scala-sbt#compiler-interface;0.13.12!compiler-interface.jar (1230ms)
	...
[info] Done updating.
[info] Set current project to user (in build file:/Users/user/)
> 
```

At the SBT prompt, type
```
exit
```
to exit SBT and return to the terminal prompt.


###Configure Your User
Finally, configure your user account so that you can use Scala from any terminal session on your computer.

In your terminal window, open your user profile in TextEdit by typing
```
open ~/.bash_profile
```

Add these two lines to end of your user profile:
```
export SCALA_HOME=/usr/local/share/scala-2.11.18
export PATH=$SCALA_HOME/bin:$PATH
```

Save your profile and exit the TextEdit application.

In your terminal window, reload your user profile by typing
```
source ~/.bash_profile
```

Congratulations! You have successfully installed Scala.
