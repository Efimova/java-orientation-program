package com.epam.efimova.xml.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Created by Anna_Efimova on 1/5/2016.
 */
public abstract class XmlHandler {
    private static Logger logger = LoggerFactory.getLogger(XmlHandler.class);

    public abstract void parse(String xmlPath);

    public void validate(String xmlPath, String xsdPath) {

        DocumentBuilder parser = null;
        try {
            parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            logger.error(e.getMessage());
        }
        Document document = null;
        try {
            document = parser.parse(new File(xmlPath));
        } catch (SAXException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        Source schemaFile = new StreamSource(new File(xsdPath));
        Schema schema = null;
        try {
            schema = factory.newSchema(schemaFile);
        } catch (SAXException e) {
            logger.error(e.getMessage());
        }

        Validator validator = schema.newValidator();

        // validate the DOM tree
        try {
            validator.validate(new DOMSource(document));
            logger.debug(xmlPath + " is valid!");
        } catch (SAXException | IOException e) {
            logger.error(e.getMessage());
        }
    }

}
