import scala.collection.immutable.List
import scala.collection.mutable.ListBuffer

/** *********************************************************************************

the Scala LIST

- Just like your favorite Hoodie;
the Scala List is that data structure you'll reach for again and again.

- A foundational DATA STRUCTURE; or container for holding several units of data, which itself can be inserted/retrieved in certain ways.
ANALOGY:  Think of FURNITURE, eg how you might access books(or pieces of data) stacked on a BOOKSHELF/KINDLE vs stacked in a deep BOX
- Scala METHODS on this structure support working with data to support DATA SCIENCE applications as IoT Services, among others.
- typically of the same HOMOGENEOUS type (eg. all Strings, or all Integers)
- IMMUTABLE (cannot be modified after created)
- typically of finite length; but can be infinite
- can also support NESTED data types; eg where each data element is itself a COLLECTION of some sort
RELATED types:
- Tuple (HETEROGENEOUS data, e.g. some Strings, some Integers)
- ListBuffer (similar to list, but MUTABLE-modifiable)
http://www.tutorialspoint.com/scala/scala_tuples.htm

- PHYSICAL ANALOGY for a COLLECTION:
     - think DISHES vs CLOTHES; both can be stored in a DRAWER, but typically you put them in separate drawers in the kitchen
     vs guest room because you have different ways of using them.
     - say type T is a GENERIC TYPE of DATA ELEMENT (think CLOTHES, or BOOKS)
     - say containers or COLLECTIONS hold those data elements (think DRESSER or DISH CABINET)

1) PHYSICAL ANALOGY FOR A LIST:
- TODO:  Go find a fun GIF!!!
- think of a TRAIN with:
  - an Engine at the front
    or HEAD
  - several Cars in the middle
    or DATA ELEMENTS
  - a Caboose at the end
    or NIL
  - all Cars after the front Engine
    or TAIL
  - you have to walk the length of the train to find a Car in the middle or the end
    or SEQUENTIAL ACCESS
  - the cars don't necessarily have to be any order
    or UNORDERED
  - you can create a new list; but adding  Cars to the END of the list
    or APPEND

2) Each data structure has a certain set of characteristics in terms of:
   TIME to access the data stored in it via OPERATIONS (methods) permitted on it
   SPACE it requires

   Depending on the problem you're trying to solve; your SECRET SAUCE as a developer or engineer,
   is your capacity to choose the optimal data structure and associated algorithm, so solve that problem;
   FASTER, with MAINTAINABLE CODE, and with FEWER RESOURCES (memory or SPACE).

   A LIST provides (CONSTANT or IMMEDIATE) access to its HEAD and TAIL
   e.g. Dedicated Engineers standing ready at those locations on the train

   It also provides (SEQUENTIAL) access to ELEMENTS within its TAIL
   e.g. Other Engineers have to WALK to TAIL Cars to find specific ones

3) ESSENTIAL Operations:
   - create
   - equals
   - exists
   - contains
   - remove
   - length
   - print
   - prepend element operator
   - concatenation or (GLUE) list operator

http://stackoverflow.com/questions/9556579/finding-an-item-that-matches-predicate-in-scala
http://alvinalexander.com/scala/how-to-delete-elements-from-list-listbuffer-scala-cookbook

4) Data Science-related operations:
   - map
   - reduce
   - flatmap  (say input function creates a collection itself, so to avoid final result being NESTED collections, just use this)
   - min

5) Algo-related operations:

   - pattern-matching

****************************************************************************************/

/*
EXERCISES
 */

// EX1:  CREATE a new LIST, then print number of elements and contents
/*
INITIALIZING a LIST of data elements
TODO: - define TYPEs later incl
- Unit which is like VOID
- Inferred types
*/
val aFewComedians = List("Ellen DeGeneres", "John Stewart", "Tina Fey", "Amy Schumer", "George Carlin", "Amy Poehler", "Russell Peters")
val numDays = aFewComedians.length
aFewComedians.foreach(println)
println (aFewComedians mkString "\n")
// EX2:  NO SUCH THING AS IN-PLACE MODIFICATION:  INSTEAD CREATE a new LIST of elements; based on COPY of the old one
//       PREPENDS operator
// http://stackoverflow.com/questions/7794063/appending-an-element-to-the-end-of-a-list-in-scala
val allComedians = "Stephen Colbert" :: aFewComedians
val numDays2 = allComedians.length
// EX3: CREATE and examine an EMPTY list
val emptyWeek = Nil
emptyWeek.foreach(println)
// EX4:  test if lists are equal to each other
val aFewComediansValue = List("Ellen DeGeneres", "John Stewart", "Tina Fey", "George Carlin", "Amy Poehler", "Russell Peters")
val aFewComediansReference = aFewComedians
val isEqual1 = aFewComedians.equals(allComedians)
val isEqual2 = (aFewComedians == allComedians)
val isEqual3 = aFewComedians.equals(aFewComediansValue)
val isEqual4 = aFewComedians.equals(aFewComediansReference)
val isEqual5 = (aFewComedians == aFewComediansValue)
val isEqual6 = (aFewComedians == aFewComediansReference)
// EX5:  - using a List in a FUNCTION,
//       - where it is a container or COLLECTION for homogeneous data elements that is FLEXIBLE via type T
//       - where Scala makes it hard to do non-performant things (here anyway)
def append[T](lhs: List[T], rhs: T): List[T] =
  lhs match {
    case List() => List(rhs)  // ATTENTION:  this is SUPER-EXPENSIVE as it CREATES a NEW LIST for each iteration!
    case headElement :: tailElement => headElement :: append(tailElement, rhs)
  }
val colbertList = List("Stephen Colbert")
val colbertElement = "Stephen Colbert"
val allComedians2 = append(aFewComedians, colbertElement)
val fullWeek2 = aFewComedians ::: colbertList
// EX6: see if list contains certain elements, stops at finding first one
val hasSaturday1 = aFewComedians.contains("Stephen Colbert")
val hasSaturday2 = allComedians.exists(_ == "Stephen Colbert")
val foundSaturday1 = aFewComedians.find(_ == "Stephen Colbert")    // NOTE:  returns a LIST
val foundSaturday2 = allComedians.filter(_ == "Stephen Colbert")  // NOTE:  can return LIST if duplicates exist
// EX7:  transform elements in List, a 'functional' way by creating NEW RESULTS, and without modifying the old one!
val oneToTen = 1 to 10 toList
val timesTen = oneToTen.map( (anElement) => (10 * anElement))
val sum = oneToTen.reduce( (lhs, rhs) => (lhs + rhs))
val average = sum/oneToTen.length
// EX8:  deletion from a list weird, due to immutability.  if you need to modify element frequently, use a ListBuffer!
// http://alvinalexander.com/scala/how-to-delete-elements-from-list-listbuffer-scala-cookbook
// MUTABLE
// NOTE:  have to explicitly import, as not by default included in scala._
val modifiableNums = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
modifiableNums -= (2, 3)
modifiableNums.remove(0)
println(modifiableNums mkString)
// IMMUTABLE
val lessThan5 = oneToTen.filter(_ < 5)

// *******************************************************************************************
/*
REFERENCES for details on LIST:
http://www.scala-lang.org/api/current/#scala.collection.immutable.List
http://docs.scala-lang.org/overviews/collections/overview.html
http://booksites.artima.com/programming_in_scala_2ed/examples/html/ch16.html#sec7
http://docs.scala-lang.org/overviews/collections/performance-characteristics
*/
