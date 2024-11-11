package org.example;

import org.example.furniture.*;


public class Main {
    public static void main(String[] args) {
        // Create a Victorian furniture set
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Test Victorian furniture methods
        victorianChair.sitOn();
        victorianSofa.sitOn();

        // Create a Modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Test Modern furniture methods
        modernChair.sitOn();
        modernSofa.sitOn();
    }
}