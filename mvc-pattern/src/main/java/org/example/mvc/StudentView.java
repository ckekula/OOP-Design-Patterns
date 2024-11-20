package org.example.mvc;

// View (responsible for displaying the data)
public class StudentView {
    public void displayStudentDetails(String studentName, String regNumber) {
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Register Number: " + regNumber);
    }
}
