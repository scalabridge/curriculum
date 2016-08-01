

MOAR REFERENCES on WHY SCALA:

- uniquely supports MODERN APPLICATIONS THAT NEED TO PROCESS LARGE AMOUNTS OF DATA very FAST

- language foundation for what could arguably be considered the "Killer App" of the decade:   SPARK
  which supports machine learning/data science for BIG and FAST data processing so that businesses can ADAPT to
  changing conditions very FAST

- BROAD industry applications include:
  - Movie and Music recommendations
  - Election Polls voter segmentation and sentiment
  - Utility usage patterns based on smart thermostat or water faucet sensor feedback
  - Cancer genomics
  - Olympic Training
  - Neuroscience and Nuerofeedback for training the brain within 2 sigma 'healthy' patterns
  - triggering people to buy more stuff on Amazon

// TODO: go over SCALABILITY vs PERFORMANCE
- "The terms PERFORMANCE and SCALABILITY are commonly used interchangeably,
but the two are distinct: performance measures the speed with which a single request can be executed,
while scalability measures the ability of a request to maintain its performance under increasing load.
For example, the performance of a request may be reported as generating a valid response within three seconds,
but the scalability of the request measures the request’s ability to maintain that three-second response time as
the user load increases."

Quoting Werner Vogels from this post "Why is scalability so hard? Because scalability cannot be an after-thought.

- TODO:  go over how HORIZONTAL SCALABILITY trumps VERTICAL SCALABILITY due to HARDWARE COSTS for CPU, MEMORY, DISK
plagiarize diagrams from UC Berkeley Apache Spark course detailing this
- TODO:  how functional programming with MONADs enables scalability  (SIMPLE example with + and *; parallelizable)
http://stackoverflow.com/questions/25158780/difference-between-reduce-and-foldleft-fold-in-functional-programming-particula
- TODO:  go over IMMUTABILITY, as an aid to avoiding LOCK-CONTENTION in a multi-threaded application, supporting SCALABILITY
http://stackoverflow.com/questions/214714/mutable-vs-immutable-objects
- TODO:  go over how Scala runs on the JVM - which is like a UNIVERSAL ADAPTER across diverse OPERATING SYSTEMS;
         and which in turn uses proven and speedy JIT compilation
http://stackoverflow.com/questions/3265357/compiled-vs-interpreted-languages
- TODO:  go over COMPILER-time Type checking vs RUNTIME SURPRISES (compiler vs interpreter)
https://gist.github.com/non/ec48b0a7343db8291b92
- TODO:  go over TYPES for production-strength, code maintenance, as well as API communication
http://www.artima.com/pins1ed/scalas-hierarchy.html
https://sanaulla.info/2009/07/12/nothingness-2/
http://alvinalexander.com/scala/scala-null-values-option-uninitialized-variables
http://stackoverflow.com/questions/6908252/in-scala-why-is-nan-not-being-picked-up-by-pattern-matching
- TODO:  go over REFERENCE vs VALUE both in type and in function parameter-passing!
http://stackoverflow.com/questions/13337338/call-by-name-vs-call-by-value-in-scala-clarification-needed
- TODO:  go over EQUALITY vs weird types above
http://stackoverflow.com/questions/7681161/whats-the-difference-between-and-equals-in-scala
- TODO:  go over COMMUTATIVE-ASSOCIATIVE like + and * to permit partitioned, distributed, parallel concurrent, computation supporting SCALABILITY
(eg MONADIC operations)
- TODO:  go over FUNCTIONAL-PIPELINING without having a "sticky server" to hold  MUTABLE state, enabling FAULT-TOLERANCE in spinning up new instances
- TODO:  go over LAZY evaluation
https://www.quora.com/What-are-some-good-uses-for-Scala-lazy-evaluation-and-Streams
- TODO:  go over RECURSIVE ALGOs later, and TAIL RECURSION - loop optimization
- TODO:  WRITING PERFORMANT SCALA
https://www.sumologic.com/blog-technology/3-tips-for-writing-performant-scala/

