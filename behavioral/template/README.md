# Template Method

Template Method is a **behavioral** design pattern that defines the skeleton of an algorithm in the superclass 
but lets subclasses override specific steps of the algorithm without changing its structure.

## Problem

Imagine that you’re creating a data mining application that analyzes corporate documents. Users feed the app 
documents in various formats (PDF, DOC, CSV), and it tries to extract meaningful data from these docs. The 
first version of the app could work only with DOC files. In the following version, it was
able to support CSV files. A month later, it could extract data from PDF files.

You noticed that all three classes have a lot of similar code. While the code for dealing with various data 
formats was entirely different in all classes, the code for data processing and analysis is almost identical.
The client code also had lots of conditionals that picked a proper course of action depending on the class of
the processing object. If all three processing classes had a common interface or a base class, you’d be able 
to eliminate these conditionals.

## Solution

The Template Method pattern suggests that you break down an algorithm into a series of steps, 
turn these steps into methods, and put a series of calls to these methods inside a single **template method**. 
The steps may either be abstract, or have some default implementation. To use the algorithm, the
client is supposed to provide its own subclass, implement all abstract steps, and override some of the 
optional ones if needed (but not the template method itself).

## Structure

1. The Abstract Class declares methods that act as steps of an algorithm, as well as the actual template 
method which calls these methods in a specific order. The steps may either be declared abstract or have
some default implementation.
2. Concrete Classes can override all of the steps, but not the template method itself
