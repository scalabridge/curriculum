## Variables


We are humans and we love to give names to things - we name our pets, the planets and stars, give names like "walk", "see", and "talk" to the complex mechanical and chemical processes our bodies and minds perform. We give these names because it's a lot easier to say "fluffy sleeps on my bed" than "the quadrapedal organism that goes through rapid eye movement whilst relaxing its musculatory system atop a rectangular object."

In programming, we have the ability to name things and processes. We call it a "variable".

Let's take the example from our REPL section:

```
scala> 2 + 3
res3: Int = 5
```

What does `2 + 3` refer to? It could mean anything! The number `2` is useful for so many things: it might be the number of eyes you have, or the loneliest number since the number `3`.

In the same way that you would write a grocery list of a dozen apples and half-dozen oranges, we want to do the same thing in programming, and here is how we do it:

```
scala> val apples = 2
apples: Int = 2

scala> val oranges = 3
oranges: Int = 3
```

We use the special word `val` to declare that we are naming something (it's short for value), and we provide a name (like `apples`), and an `=` sign, and then the value we are naming.

Now the numbers `2` and `3` are named, it's easier to understand - as a human - what your intention for those numbers are.

Further, we can refer to these named things now and when we use the names we can better understand the intention of what we are doing.

We can also name more complex things than a value, we can also name processes.

What do you think the following processes are doing and what would you name them?

Adding apples and oranges:
```
apples + oranges
```

Comparing the number of apples to the number of oranges:
```
apples > oranges
```

How many more oranges do we have than apples:
```
oranges - apples
```

Here are some of the names I came up with for what these processes mean:

```
scala> val fruit = apples + oranges
fruit: Int = 5

scala> val thereAreMoreApplesThanOranges = apples > oranges
thereAreMoreApplesThanOranges: Boolean = false

scala> val numberOfMoreOrangesThanApples = oranges - apples
numberOfMoreOrangesThanApples: Int = 1

```

Follow ups:

Did you notice this line?

```
thereAreMoreApplesThanOranges: Boolean = false
```
Want to know what `Boolean` means? Go straight to our [Boolean](boolean.md) section.
