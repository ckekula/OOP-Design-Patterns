package org.example.dataMiningApp;

// Abstract Class: Defines the template method and basic structure for processing documents
public abstract class DocumentProcessor {

    // Template method: Defines the algorithm skeleton
    public final void processDocument() {
        loadDocument();
        extractData();
        parseData();
        saveData();
    }

    // Abstract methods to be implemented by concrete subclassesfuel
    protected abstract void loadDocument();
    protected abstract void extractData();
    protected abstract void parseData();

    // Concrete method: Saving the parsed data (common to all subclasses)
    protected void saveData() {
        System.out.println("Saving data to the database.");
    }
}