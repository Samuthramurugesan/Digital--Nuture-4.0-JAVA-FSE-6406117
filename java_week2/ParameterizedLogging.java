package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "john_doe";
        int userId = 42;
        logger.info("User {} has logged in with ID {}", username, userId);
    }
}
