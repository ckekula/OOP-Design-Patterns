package org.example;

import org.example.stockMarketApp.AnalyticsLibrary;
import org.example.stockMarketApp.StockDataAnalyzer;
import org.example.stockMarketApp.XmlToJsonAdapter;

public class Main {
    public static void main(String[] args) {
        // Mock XML data representing stock information
        String xmlStockData = "<stock><name>ABC Corp</name><price>123.45</price></stock>";
        System.out.println("XML data: ");
        System.out.println(xmlStockData);

        // Instantiate the 3rd-party analytics library
        AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();

        // Use the adapter to allow the client to use the library with XML data
        StockDataAnalyzer analyzer = new XmlToJsonAdapter(analyticsLibrary);

        // Analyze the data (XML data is converted to JSON format by the adapter)
        analyzer.analyzeData(xmlStockData);
    }
}