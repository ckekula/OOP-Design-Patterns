package org.example.furniture;

// Concrete Product: Victorian Sofa
public class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true; // Victorian sofas have legs
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian sofa.");
    }
}