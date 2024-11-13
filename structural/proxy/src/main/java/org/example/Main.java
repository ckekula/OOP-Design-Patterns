package org.example;

import org.example.loadImages.ProxyImage;
import org.example.loadImages.Image;

public class Main {
    public static void main(String[] args) {
        // Create ProxyImage objects for various image files
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Display images - images will be loaded only when display() is called
        System.out.println("Calling display() on image1:");
        image1.display(); // Loads and displays "photo1.jpg"

        System.out.println("\nCalling display() on image1 again:");
        image1.display(); // Already loaded, just displays

        System.out.println("\nCalling display() on image2:");
        image2.display(); // Loads and displays "photo2.jpg"
    }
}