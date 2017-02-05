# Why Learn Scala?

Scala has been around for about 15 years, and in that time has taken off in a variety of applications. You'll see people using Scala to write everything from web applications to distributed systems and more. It is a language that is suitable for many tasks, and its flexibility and expressiveness makes it a joy to work with.

In the [words of Martin Odersky](https://www.lightbend.com/blog/why-scala), the creator of Scala:

> "The central drive behind Scala is to make life easier and more productive for the developer...It cuts down on boilerplate, so programmers can concentrate on the logic of their problems."

Whether you're new to Scala or new to programming, the ScalaBridge curriculum will help you discover how to write concise and expressive code in Scala.

## Writing software is... 
 
**Creative.** Software is designed, and design is a way to express yourself. You can be creative within the confines of what is practical. Like the golden gate bridge was designed to be beautiful, but serve a practical purpose.

**Social.** Software is built by teams working together, so you have comraderie and can make friends. But on the other hand you must deal with personalities and prejudice.

## Writing Scala is... 
       
**Fun.** Scala is enjoyable to use. It is a concise way to express ideas. You can get quick feedback in the REPL. You can build something then see it work (or not), which is satisfying.

**Rewarding.** Although Scala is easy to get into, it is also deep and offers opportunities for continuous intellectual exploration, growth, and learning. 

**Empowering.** A lot of opportunity exists today to get a job as a Scala programmer, and the market for Scala programmers is growing strongly. A [2016 IT skills report](http://www.infoworld.com/article/3071623/salary/want-to-boost-your-salary-learn-scala-golang-or-python.html) calculated that learning Scala could earn you a 22.2% pay bump! 

## Functional programming is...

**Predictable.**
In Scala, a function always returns the same value for a given input. Functions will read the values of its arguments and call out to other functions. This quality of the language is called **purity** — no matter what context, a function will do the same thing every time.

Once a value is declared, it can never change. It's not possible, for instance, for a function to accidentally change its inputs, or for something to become `undefined`. If you need to add an element to a list, there is no way to do so destructively — instead, you have to create a new list with all the elements you specify. Values like these are called **immutable**.

**Safe.**
Everything in Scala has a type. Nothing can ever break that contract. For instance, it is not possible for a function to return a string in some cases and a number in other cases — the type contract of a function can never be violated. Those same constraints operate on everything in the language, including variables and complex data structures. That is why Scala is called a `statically typed` language.

Because of these rules, entire categories of bugs are impossible in Scala, like:

* "I expected this function to return a number, but it returned nil instead."
* "Sometimes when I call this function it fails, even though I gave it the exact same input."
* "Something is changing the value of my variable, and I'm not sure where it's happening."

That strictness can come with real downsides, though. If you are coming from an object-oriented, dynamically typed language like Ruby or JavaScript, Scala can feel like a straightjacket at first. You wouldn't use a for loop in Scala — instead, you have to use higher-order functions like map, filter, and fold. The += operator has no place in the language either, since it would mutate the variable on its left-hand side. If you need to change a value deep inside a nested data structure, you can't simply read the value and mutate it, as you could in other languages.

You may wonder how Scala developers can survive with all these restrictions. The strictness of the language opens up other doors, however. Because Scala requires all programs to follow its rules, **the Scala compiler will tell you exactly what's wrong with your program if you make a mistake.** It will tell you if you made an `if/else` expression return two different kinds of values, if you are calling a function with too many arguments, or if you are referencing a variable that does not exist.

Developing with Scala often feels like an ongoing conversation with the compiler, gently pushing you toward writing better code. Often, you don't even need to look at your application in the browser while implementing a feature — you can trust the compiler to tell you if you are going in the right direction.

You may be asking yourself why you should choose to learn a language that's so different from other tools you're used to. **We'd argue that the experience of working in an alien environment, even if it's just for a little while, can be fruitful.** You are probably not used to dealing with the constraints of purity, immutability, and static typing, which together make up the basic tenets of functional programming. These constraints will push you to solve problems in creative ways, and hopefully you will learn strategies that you can employ in other languages.

We make no claim that functional programming is _better_ than other types of programming, but it definitely is _different_. We strongly believe that learning a new way to think about programming will make you a better developer, in the same way that learning a foreign language makes you appreciate the architecture and beauty of the languages you already know.

## ScalaBridge is...

**A safe space to learn.** Trying to get into the world of tech can be intimidating. We want ScalaBridge to be a safe space in which newcomers to programming or newcomers to the language can explore and learn.
