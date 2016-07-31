
# Windows Setup
## Java JDK Installation
1. Download the JDK installer for Windows from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html):
2. Run the installer
3. Add the `bin\` directory of the installed JDK to the PATH environment variable, as described [here](http://www.java.com/en/download/help/path.xml)
4. To verify the JDK installation, open the Command Prompt and type `java -version`:
```
C:\Users\Tim\dev\scala\curriculum>java -version
java version "1.8.0_91"
Java(TM) SE Runtime Environment (build 1.8.0_91-b60)
Java HotSpot(TM) 64-Bit Server VM (build 25.91-b60, mixed mode)
```
If you have problems installing the JDK, ask for help.
## Install sbt
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
```
