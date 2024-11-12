package org.example.stockMarketApp;

// Adapter: Converts XML data to JSON format
public class XmlToJsonAdapter implements StockDataAnalyzer {
    private final AnalyticsLibrary analyticsLibrary;

    // Constructor for dependency injection
    public XmlToJsonAdapter(AnalyticsLibrary analyticsLibrary) {
        this.analyticsLibrary = analyticsLibrary;
    }

    // Converts XML to JSON and delegates the analysis to the analytics library
    @Override
    public void analyzeData(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        analyticsLibrary.analyzeJsonData(jsonData);
    }

    // Simulates conversion from XML to JSON
    private String convertXmlToJson(String xmlData) {
        // Simple mock-up of converting XML to JSON for demonstration purposes
        return "{ \"convertedData\": \"" + xmlData.replace("<", "").replace(">", "").replace("/", "") + "\" }";
    }
}