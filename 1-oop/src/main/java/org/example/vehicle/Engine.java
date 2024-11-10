package org.example.vehicle;

// Composition
public class Engine {
    private String type; // private field demonstrating encapsulation

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}