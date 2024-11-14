package org.example;
import org.example.navigationApp.*;

public class Main {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        // Set the strategy to CarRoute and build a route
        planner.setStrategy(new CarRoute());
        planner.buildRoute("Central Park", "Times Square");

        // Change the strategy to WalkingRoute and build a route
        planner.setStrategy(new WalkingRoute());
        planner.buildRoute("Central Park", "Times Square");

        // Change the strategy to TouristAttractionsRoute and build a route
        planner.setStrategy(new TouristRoute());
        planner.buildRoute("Central Park", "Times Square");
    }
}