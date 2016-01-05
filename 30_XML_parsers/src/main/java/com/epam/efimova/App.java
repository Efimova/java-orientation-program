package com.epam.efimova;

import com.epam.efimova.xml.handler.DomHandlerImpl;
import com.epam.efimova.xml.handler.SaxHandlerImpl;
import com.epam.efimova.xml.handler.StaxHandlerImpl;
import com.epam.efimova.xml.handler.XmlHandler;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String xsdPath = args[2];
        String xmlPath = args[1];
        String parserType = args[0];


        XmlHandler handler = null;
        switch (parserType) {
            case "dom":
                handler = new DomHandlerImpl();
                break;
            case "sax":
                handler = new SaxHandlerImpl();
                break;
            case "stax":
                handler = new StaxHandlerImpl();
                break;
            default:
                throw new UnsupportedOperationException("Such method " + parserType + " does not exist.");
        }
        handler.validate(xmlPath, xsdPath);
        handler.parse(xmlPath);
    }

}
