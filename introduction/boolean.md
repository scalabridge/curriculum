## Boolean

Boolean means True or False. Would it surprise you to find out that the fundamentals of computation are built entirely out of True and False? We often call this concept "binary" -- meaning two choices. You'll often hear these two names, "binary" and "boolean" used to describe the same concept.

This is only the beginning of the rabbit hole of what is called "Boolean Logic". One of the most exciting parts of programming is that the things you use and learn have deep roots in rich concepts that apply to so much more than you might imagine. The fun part is that we have this REPL that we get to play with and explore these things. So let's play!

In Scala, the `Boolean` type has two concrete values: `true` and `false`.

```
scala> true
res1: Boolean = true

scala> false
res2: Boolean = false
```

There are several operations that can be run with Booleans, but let's focus on two:

- `&&` pronounced: "and"
- `||` pronounced: "or"

Try typing a series of `true` and `false` values separated by those operations, e.g. `true && true || false`. What do you think these operations are doing?

One of the fun things about your REPL is you can play around with things that you may not already understand!

Given what you think those operations do, what do you expect the values to be for the following:

```
scala> false || false || false || true
res0: Boolean = ???

scala> true && true && false
res1: Boolean = ???

scala> true || false
res2: Boolean = ???
```

Anything that eventually becomes a Boolean can use these `&&` and `or` operations.

Let's take our example from the [Variables](variables.md) section and play around with Booleans.

```
scala> val apples = 2
apples: Int = 2

scala> val oranges = 2
oranges: Int = 3

scala> val thereAreMoreApplesThanOranges = apples > oranges
thereAreMoreApplesThanOranges: Boolean = false
```

Notice the `>` (greater-than) operation? This makes intuitive sense that two numbers can be compared this way. We also have other operations on numbers that end up with a Boolean value.

- `>` greater-than
- `<` less-than
- `==` equal
- `!=` not-equal

Notice that `thereAreMoreApplesThanOranges` is a `Boolean`? That means it is either `true` or `false` (in this case, it's `false`) and we can use it like any other `Boolean`.

```
scala> (oranges > apples) && (apples != oranges)
res3: Boolean = true

scala> val moreOrangesThanApples = oranges > apples
moreOrangesThanApples: Boolean = true

scala> val numOfApplesIsNotSameAsNumOfOranges = apples != oranges
numOfApplesIsNotSameAsNumOfOranges: Boolean = true

scala> moreOrangesThanApples && numOfApplesIsNotSameAsNumOfOranges
res4: Boolean = true
```

One of the primary things a programmer does everyday is figuring out how to take a human concept and turn it into something that the computer can run. Being such a fundamental building block of programming means that really complex processes can be broken down into chunks of what we can call "boolean logic".

Guess what? Our REPL uses boolean logic!

The *Read* phase is boolean: "has the user hit Enter/Return yet"? If the answer is yes/true, then it takes whatever text was input before and sends that input to the *Eval* phase.

The *Eval* phase is boolean: the outcome of the evaluation can do two things: success or failure. This is a binary choice. It will send either a successful value or an error to the *Print* phase.

The *Print* phase is boolean: either it prints an error message or the value that was passed to it from the evaluation phase.

The *Loop* phase is also boolean: if the evaluation was successful it will remember the evaluated input so that it can be used during the next Read phase, otherwise it will forget what was input.

Let's try a thinking exercise...

How does sending a tweet work using boolean logic?

How can you describe opening a door, drinking coffee, driving a car in terms of boolean logic?
