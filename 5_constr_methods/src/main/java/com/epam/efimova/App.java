package com.epam.efimova;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {
            TestA testA = new TestA("Hello World!");
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
