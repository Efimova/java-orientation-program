package com.epam.efimova.xml.handler;

import com.epam.efimova.xml.parser.EpamPositionParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Anna_Efimova on 1/5/2016.
 */
public class DomHandlerImpl extends XmlHandler {

    @Override
    public void parse(String xmlPath) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            document = builder.parse(xmlPath);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element root = document.getDocumentElement();
        switch (root.getNodeName()) {
            case "epam":
                EpamPositionParser parser = new EpamPositionParser();
                parser.parse(root);
        }


    }




}
