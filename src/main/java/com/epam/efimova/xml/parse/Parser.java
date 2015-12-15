package com.epam.efimova.xml.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public abstract class Parser {
	private static final String pathXML = "e:/Anya/_Orientation Program/po/src/main/java/com/epam/efimova/xml/data/shop.xml";
	private static final String pathXSD = "e:/Anya/_Orientation Program/po/src/main/java/com/epam/efimova/xml/data/Shop.xsd";
	static final Logger logger = LoggerFactory.getLogger(Parser.class);
	public static void getElementsSAX() {
		Schema schema = null;
		try {
			String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			SchemaFactory factory = SchemaFactory.newInstance(language);
			schema = factory.newSchema(new File(pathXSD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setSchema(schema);

		try {
			InputStream xmlInput = new FileInputStream(pathXML);
			SAXParser saxParser = spf.newSAXParser();
			SaxHandler handler = new SaxHandler();
			saxParser.parse(xmlInput, handler);
		} catch (Throwable err) {
			err.printStackTrace();
		}
	}

	public static void getElementsDOM() {
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			// распознавание XML-документа
			Document document = db.parse(pathXML);
			// создание DOM-анализатора (Xerces)
			/*
			 * DOMParser parser = new DOMParser(); parser.parse("students.xml");
			 * Document document = parser.getDocument();
			 */
			Element root = document.getDocumentElement();
			DOMParser.listBuilder(root);
			logger.debug("Dom", DOMParser.getCredits());

		} catch (ParserConfigurationException|SAXException|IOException e) {
			logger.error("ошибка конфигурации");
		} 
	}

	public static void getElementsStAX() {
		StAXParser parser = new StAXParser();

		InputStream input;
		try {
			input = new FileInputStream(pathXML);
			parser.parse(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		 StatusPrinter.print(lc);
		getElementsDOM();
	}
}
