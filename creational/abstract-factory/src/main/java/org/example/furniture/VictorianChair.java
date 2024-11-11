package org.example.furniture;

// Concrete Product: Victorian Chair
public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true; // Victorian chairs have legs
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}