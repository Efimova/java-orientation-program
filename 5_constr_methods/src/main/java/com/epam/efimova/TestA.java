package com.epam.efimova;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * To recap: throw exception можно кинуть и в блоке инициализации и в конструкторе,
 * отличие в том что в блоке инициализации необходимо обработать исключение в try-catch,
 * в конструкторе можно передать исключение выше через throws
 */
public class TestA extends TestB {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestA.class);
    private String testStr;

    {
        try {
            throw new IOException("IOException is invoked in initializing block");
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    TestA() throws IOException {
        super();

        //super("str");
        //this("str"); - recursive constructor invocation
        LOGGER.info("Constructor without parameters is working.... ");
    }

    TestA(String str) throws IOException {
        // использовать super(); первой строкой в конструкторе,
        // где вызывается другой конструктор НЕправильно

        // Неправильно использовать вызов другого конструктора не первой строкой
        this();
        LOGGER.info("Constructor with parameter is starting.... ");
        this.testStr = str;
        LOGGER.info("Constructor is setting up the property testStr.... ");
        //throw new IOException("IOException is invoked in the constructor");
    }
}
