# Strategy Design Pattern

Strategy is a behavioral design pattern that lets you define a family of algorithms, 
put each of them into a separate class, and make their objects interchangeable.

## Problem

You decided to create a maps application for travelers. A user should be able to enter an address and
see the fastest route to that destination displayed on the map. The first version of the app could only
build the routes over roads. So with the next update, you added an option to build walking
routes. However, that was only the beginning. Right after that, you planned to add another option to 
let people use public transport in their routes. Later you planned to add route building for cyclists.

## Solution

The Strategy pattern suggests that you take a class that does something specific in a lot of 
different ways and extract all of these algorithms into separate classes called **strategies**.
The original class, called **context**, must have a field for storing a reference to one of the strategies. 
The context delegates the work to a linked strategy object instead of executing it on its own.

The context doesn’t know much about strategies. It works with all strategies through the same 
generic interface, which only exposes a single method for triggering the algorithm encapsulated 
within the selected strategy. Instead, the client passes the desired strategy to the context

This way the context becomes independent of concrete strategies, so you can add new algorithms or 
modify existing ones without changing the code of the context or other strategies

## Structure

1. The **Context** maintains a reference to one of the concrete strategies and communicates with this
object only via the strategy interface.
2. The **Strategy interface** is common to all concrete strategies. It declares a method the context uses 
to execute a strategy.
3. **Concrete Strategies** implement different variations of an algorithm the context uses.
4. The context calls the execution method on the linked strategy object each time it needs to run the
algorithm. The context doesn’t know what type of strategy it works with or how the algorithm is executed.
5. The **Client** creates a specific strategy object and passes it to the context. The context exposes a 
setter which lets clients replace the strategy associated with the context at runtime.
