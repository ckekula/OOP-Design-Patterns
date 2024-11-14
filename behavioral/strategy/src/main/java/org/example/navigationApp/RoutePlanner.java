package org.example.navigationApp;

// Context Class
public class RoutePlanner {
    private RouteStrategy strategy;

    // Method to set the strategy at runtime
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to build the route using the current strategy
    public void buildRoute(String start, String destination) {
        if (strategy == null) {
            System.out.println("No strategy selected.");
            return;
        }
        strategy.buildRoute(start, destination);
    }
}