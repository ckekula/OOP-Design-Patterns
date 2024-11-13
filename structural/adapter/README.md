# Adapter Design Pattern

Adapter is a **structural** design pattern that allows objects with incompatible interfaces to collaborate.

## Problem

Imagine that you’re creating a stock market monitoring app. The app downloads the stock data from multiple 
sources in XML format and then displays nice-looking charts and diagrams for the user. At some point, 
you decide to improve the app by integrating a smart 3rd-party analytics library. 
But there’s a catch: the analytics library only works with data in JSON format.

## Solution

You can create an adapter. This is a special object that **converts the interface of one object** so that
another object can understand it. An adapter wraps one of the objects to hide the complexity of conversion 
happening behind the scenes. The wrapped object isn’t even aware of the adapter. Adapters can not only 
convert data into various formats but can also help objects with different interfaces collaborate. 

## How it works

1. The adapter gets an interface, compatible with one of the existing objects.
2. Using this interface, the existing object can safely call the adapter’s methods.
3. Upon receiving a call, the adapter passes the request to the second object, 
but in a format and order that the second object expects

To solve the problem of incompatible formats, you can create XML-to-JSON adapters
for every class of the analytics library that your code works with directly. 
Then you adjust your code to communicate with the library only via these adapters. 
When an adapter receives a call, it translates the incoming XML data into a JSON structure
and passes the call to the appropriate methods of a wrapped analytics object.

## Structure

This implementation uses the composition principle: the adapter implements 
the interface of one object and wraps the other one

1. The **Client** is a class that contains the existing business logic    of the program.
2. The **Client Interface** describes a protocol that other classes 
   must follow to be able to collaborate with the client code.
3. The **Service** is some useful class (usually 3rd-party or legacy).
   The client can’t use this class directly because it has an incompatible interface.
4. The **Adapter** is a class that’s able to work with both the client and the service: 
it implements the client interface, while wrapping the service object. 
The adapter receives calls from the client via the adapter interface and translates them
into calls to the wrapped service object in a format it can understand. 

The client code doesn’t get coupled to the concrete adapter class as long as it 
works with the adapter via the client interface. Thanks to this, you can introduce 
new types of adapters into the program without breaking the existing client code.

