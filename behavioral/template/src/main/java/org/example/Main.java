package org.example;

import org.example.dataMiningApp.CsvProcessor;
import org.example.dataMiningApp.DocProcessor;
import org.example.dataMiningApp.DocumentProcessor;
import org.example.dataMiningApp.PdfProcessor;

public class Main {
    public static void main(String[] args) {
        // Process a DOC file
        DocumentProcessor docProcessor = new DocProcessor();
        System.out.println("Processing DOC file:");
        docProcessor.processDocument();

        System.out.println();

        // Process a CSV file
        DocumentProcessor csvProcessor = new CsvProcessor();
        System.out.println("Processing CSV file:");
        csvProcessor.processDocument();

        System.out.println();

        // Process a PDF file
        DocumentProcessor pdfProcessor = new PdfProcessor();
        System.out.println("Processing PDF file:");
        pdfProcessor.processDocument();
    }
}