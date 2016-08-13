# Install sbt
## Windows
1. Follow the directions [here](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Windows.html)
2. At a command prompt, type: `sbt about`
3. You should see: `[info] This is sbt 0.13.x` in the output:
```
C:\Users\Tim\dev\scala\curriculum>sbt about
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=256m; suppor
t was removed in 8.0
[info] Loading global plugins from C:\Users\Tim\.sbt\0.13\plugins
[info] Set current project to curriculum (in build file:/C:/Users/Tim/dev/scala/cur
riculum/)
[info] Updating {file:/C:/Users/Tim/dev/scala/curriculum/}curriculum...
[info] Resolving org.scala-lang#scalap;2.11.8 ...
[info] Done updating.
[info] This is sbt 0.13.8
[info] The current project is {file:/C:/Users/Tim/dev/scala/curriculum/}curriculum
0.1-SNAPSHOT
[info] The current project is built against Scala 2.11.8
[info] Available Plugins: sbt.plugins.IvyPlugin, sbt.plugins.JvmPlugin, sbt.plugins
.CorePlugin, sbt.plugins.JUnitXmlReportPlugin, org.ensime.EnsimePlugin
[info] sbt, sbt plugins, and build definitions are using Scala 2.10.4
>
```
Type `exit` at the prompt to exit `sbt`.

## Linux
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

## Mac OS
### Install Homebrew
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
### Install SBT
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
