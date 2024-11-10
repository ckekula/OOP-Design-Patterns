# FACTORY METHOD

Factory Method is a **Creational** design pattern that provides an interface for creating objects in a superclass, 
but allows subclasses to alter the type of objects that will be created.

The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) 
with calls to a special factory method. 
The objects are still created via the new operator, but it’s being called from within the factory method. 
Objects returned by a factory method are often referred to as _products_.”

#### Now you can override the factory method in a subclass and change the class of products being created by the method.

Both Truck and Ship classes should implement the Transport interface, which declares a method called _deliver_.
Each class implements this method differently: trucks deliver cargo by land, ships deliver cargo by sea.

The code that uses the factory method (often called the client code),
doesn’t see a difference between the actual _products_ returned by various subclasses. 
The client treats all the products as abstract _Transport_ .

The client knows that all transport objects are supposed to have the _deliver_ method,
but exactly how it works isn’t important to the client.

```
            +---------------------+
            |   TransportFactory  |  <--- Creator
            +---------------------+
              /         ^        \
             /          |         \
+--------------------+  |   +--------------------+
|     CarFactory     |  |   |    TruckFactory    |
+--------------------+  |   +--------------------+
                        |
                        |
            +---------------------+
            |       Transport      |  <--- Product (interface)
            +---------------------+
                     /         \
                    /           \
         +------------+       +------------+
         |    Car     |       |   Truck    |  <--- Concrete Products
         +------------+       +------------+
```


1. The Product declares the interface, which is common to all 
   objects that can be produced by the creator and its subclasses.
2. Concrete Products are different implementations of the product interface.
3. The Creator class declares the factory method that returns new product objects. 
It’s important that the return type of this method matches the product interface. 
You can declare the factory method as abstract to force all subclasses to implement their own versions of the method. 
As an alternative, the base factory method can return some default product type.
