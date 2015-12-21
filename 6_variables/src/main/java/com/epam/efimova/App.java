package com.epam.efimova;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        TestVariablesClass testVariablesClass = new TestVariablesClass("propertyA", 10, 11);
        LOGGER.info("Before changing: " + testVariablesClass.toString());

        changeValue(testVariablesClass);
        LOGGER.info("After changing value: " + testVariablesClass.toString());

        changeReference(testVariablesClass);
        LOGGER.info("After changing reference: " + testVariablesClass.toString());
    }

    static void changeValue(TestVariablesClass zzz) {
        zzz.setPropertyA("new propertyA");
    }

    static void changeReference(TestVariablesClass xxx) {
        xxx = new TestVariablesClass();
        xxx.setPropertyA("zzzz");
    }

}
