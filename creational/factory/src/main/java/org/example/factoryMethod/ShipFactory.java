package org.example.factoryMethod;

// Concrete Factory for Ship
public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship(); // Create a Car object
    }
}
