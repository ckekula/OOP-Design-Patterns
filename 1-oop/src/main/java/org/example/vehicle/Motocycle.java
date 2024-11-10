package org.example.vehicle;

// Final class (cannot be subclassed), Polymorphism
public final class Motorcycle extends Vehicle {
    private VehicleType type;

    public Motorcycle(String name, VehicleType type) {
        super(name);
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + getName() + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + getName() + " is stopping.");
    }
}