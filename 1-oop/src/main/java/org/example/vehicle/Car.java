package org.example.vehicle;

// Inheritance: Car extends Vehicle and implements Operable methods
public class Car extends Vehicle {
    private Engine engine; // Composition: Car has an Engine
    private VehicleType type;

    public Car(String name, Engine engine, VehicleType type) {
        super(name);
        this.engine = engine;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println(type + " " + getName() + " with " + engine.getType() + " engine is starting.");
    }
    @Override
    public void stop() {
        System.out.println(type + " " + getName() + " is stopping.");
    }

    // Inner class representing a component
    public class Tire {
        private int size;

        public Tire(int size) {
            this.size = size;
        }

        public void displayTireInfo() {
            System.out.println("Tire size: " + size);
        }
    }
}