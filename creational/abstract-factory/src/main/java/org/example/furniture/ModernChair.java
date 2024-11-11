package org.example.furniture;

// Concrete Product: Modern Chair
public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true; // Modern chairs also have legs
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern chair.");
    }
}