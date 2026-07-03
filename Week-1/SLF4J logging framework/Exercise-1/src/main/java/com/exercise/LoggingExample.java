package com.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    
    // Initialize the logger for this specific class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    
    public static void main(String[] args) {
        // Logging an error message (usually means something failed)
        logger.error("This is an error message");
        
        // Logging a warning message (usually means something unexpected happened, but the app can continue)
        logger.warn("This is a warning message");
    }
}