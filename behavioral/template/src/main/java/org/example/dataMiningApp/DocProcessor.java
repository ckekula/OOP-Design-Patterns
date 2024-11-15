package org.example.dataMiningApp;

// Concrete Class: Implements processing steps for Doc files
public class DocProcessor extends DocumentProcessor{
    @Override
    protected void loadDocument() {
        System.out.println("Loading DOC file...");
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from DOC file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from DOC file...");
    }
}
