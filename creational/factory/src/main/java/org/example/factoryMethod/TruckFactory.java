package org.example.factoryMethod;

// Concrete Factory for Truck
public class TruckFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck(); // Create a Truck object
    }
}