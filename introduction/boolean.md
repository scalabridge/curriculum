## Boolean

Boolean means True or False. Would it surprise you to find out that the fundamentals of computation are built entirely out of True and False? We often call this concept "binary" -- meaning two choices. You'll often here these two names, "binary" and "boolean" used to describe the same concept.

One of the primary things a programmer does everyday is figuring out how to take a human concept and turn it into something that the computer can run. Being such a fundamental building block of programming means that really complex processes can be broken down into chunks of what we can call "boolean logic".

Our REPL uses boolean logic.

The Read phase is boolean: "has the user hit Enter/Return yet"? If the answer is yes/true, then it takes whatever text was input before and sends that input to the Evaluate phase.

The Evaluation phase is boolean: the outcome of the evaluation can do two things: success or failure. This is a binary choice. It will send either a successful value or an error to the Print phase.

The Print phase is boolean: either it prints an error message or the value that was passed to it from the evaluation phase.

The Loop phase is also boolean: if the evaluation was successful it will remember the evaluated input so that it can be used during the next Read phase, otherwise it will forget what was input.

Let's try a thinking exercise...

How does sending a tweet work using boolean logic?

How can you describe opening a door, drinking coffee, driving a car in terms of boolean logic?
