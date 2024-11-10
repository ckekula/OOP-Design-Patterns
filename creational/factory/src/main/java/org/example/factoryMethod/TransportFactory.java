package org.example.factoryMethod;

// Abstract Creator Class
public abstract class TransportFactory {
    // Factory method to be implemented by concrete factories
    public abstract Transport createTransport();

    // Common method that uses the product created by the factory method
    public void planDelivery() {
        // Create the transport
        Transport transport = createTransport();
        // Call the deliver method
        transport.deliver();
    }
}