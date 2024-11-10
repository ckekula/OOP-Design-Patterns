# Project Structure

```
org.example
    ├── Main.java
    ├── vehicle
    │   ├── Vehicle.java
    │   ├── Car.java
    │   ├── Truck.java
    │   ├── Motorcycle.java
    │   ├── Engine.java
    │   ├── Operable.java
    │   └── MathUtils.java
    ├── person
    │   ├── Person.java
    │   ├── Driver.java
    └── services
        ├── GarageService.java
        ├── Mechanic.java
```

* Abstraction: Vehicle is abstract, enforcing start() and stop() implementation in subclasses.
* Encapsulation: Private fields and public getters/setters in Person ensure data hiding.
* Polymorphism: Car and Motorcycle provide unique implementations of start() and stop().
* Concrete vs Abstract classes: 
  * Abstract Class (Vehicle.java):
    * Cannot be instantiated.
    * Provides a base for other classes.
    * Contains abstract methods that must be implemented by any subclass.
  * Concrete Class (Car.java, Motorcycle.java):
    * Can be instantiated.
    * Must implement all abstract methods from the abstract class or interfaces they extend/implement.
    * May include additional methods and properties unique to themselves.
* Inheritance: Car and Motorcycle extend Vehicle.
* Interface Implementation: Operable interface is implemented by Vehicle.
* Composition: Car has an Engine.
* Association: Driver class uses a Vehicle.
* Aggregation: Mechanic is associated with, but independent of, Vehicle.
* Dependency Injection: GarageService accepts a Vehicle object through its constructor.
* Method Overloading: Shown in Driver class.
* Static Methods/Fields: MathUtils class provides a utility method.
* Final Class: Motorcycle is marked final, preventing subclassing.
* Exception Handling: Used in GarageService with try-catch.