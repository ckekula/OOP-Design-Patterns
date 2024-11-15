package org.example.dataMiningApp;

// Concrete Class: Implements processing steps for Csv files
public class CsvProcessor extends DocumentProcessor {
    @Override
    protected void loadDocument() {
        System.out.println("Loading CSV file...");
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from CSV file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from CSV file...");
    }
}
