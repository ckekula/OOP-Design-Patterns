package org.example.stockMarketApp;

// Client Interface: Expects data in JSON format
public interface StockDataAnalyzer {
    void analyzeData(String jsonData);
}