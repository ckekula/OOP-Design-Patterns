package org.example.furniture;

// Concrete Product: Modern Sofa
public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return false; // Modern sofas may not have visible legs
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern sofa.");
    }
}