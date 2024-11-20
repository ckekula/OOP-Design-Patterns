package org.example;

import org.example.mvc.Student;
import org.example.mvc.StudentController;
import org.example.mvc.StudentView;

// The Client demonstrates how the MVC components interact.
public class Main {
    public static void main(String[] args) {
        // Create a new Student (Model)
        Student model = new Student("John Doe", "S12345");

        // Create a View for displaying Student details
        StudentView view = new StudentView();

        // Create a Controller to manage the Model and View
        StudentController controller = new StudentController(model, view);

        // Display initial Student details
        controller.updateView();

        // Update the Model data via the Controller
        controller.setStudentName("Jane Smith");
        controller.setStudentRollNumber("S67890");

        // Display updated Student details
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
