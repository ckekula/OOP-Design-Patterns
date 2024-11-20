package org.example.mvc;

// The Controller manages the interaction between Model and View.
public class StudentController {
    private final Student model;  // The Model
    private final StudentView view;  // The View

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Updates the student's name in the Model
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Fetches the student's name from the Model
    public String getStudentName() {
        return model.getName();
    }

    // Updates the student's roll number in the Model
    public void setStudentRollNumber(String rollNumber) {
        model.setRollNumber(rollNumber);
    }

    // Fetches the student's roll number from the Model
    public String getStudentRollNumber() {
        return model.getRollNumber();
    }

    // Updates the View with the current Model data
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getRollNumber());
    }
}
