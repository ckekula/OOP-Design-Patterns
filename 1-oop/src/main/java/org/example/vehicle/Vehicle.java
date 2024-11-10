package org.example.vehicle;

// Abstraction: Abstract class and implements Operable implementation
public abstract class Vehicle implements Operable {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract methods inherited from Operable must be implemented by subclasses
}