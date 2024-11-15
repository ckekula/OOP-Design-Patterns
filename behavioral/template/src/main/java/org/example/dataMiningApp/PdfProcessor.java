package org.example.dataMiningApp;

// Concrete Class: Implements processing steps for PDF files
public class PdfProcessor extends DocumentProcessor{
    @Override
    protected void loadDocument() {
        System.out.println("Loading PDF file...");
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from PDF file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from PDF file...");
    }
}
