package com.epam.efimova.xml.parse;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAXParser {

	// реализация абстрактного метода из суперкласса для разбора потока
	private static HashMap<String, ArrayList<String>> creditMap = new HashMap<String, ArrayList<String>>();
	private static ArrayList<String> param = new ArrayList<String>();
	private String bankName;
	private String name;

	public void parse(InputStream input) {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			XMLStreamReader reader = inputFactory.createXMLStreamReader(input);
			process(reader);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}

	// метод, управляющий разбором потока
	public void process(XMLStreamReader reader) throws XMLStreamException {

		while (reader.hasNext()) {

			int type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_DOCUMENT:
				setCreditMap(new HashMap<String, ArrayList<String>>());
				break;
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				if ("bankName".equals(name)) {
					bankName = reader.getAttributeValue(0);
				}
				if ("credit".equals(name)) {
					param.add(reader.getAttributeValue(0));
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if ("bankName".equals(name)) {
					if (!param.isEmpty()) {
						getCreditMap().put(bankName, param);
						param = new ArrayList<String>();
					}
				}
				name = "";
				// Iterator<Map.Entry<String, ArrayList<String>>> it =
				// getCreditMap()
				// .entrySet().iterator();
				// for (; it.hasNext();) {
				// Map.Entry<String, ArrayList<String>> map = (Map.Entry<String,
				// ArrayList<String>>) it
				// .next();
				// System.out.println(map.getKey() + " " + map.getValue());
				// }
				break;
			case XMLStreamConstants.CHARACTERS:
				if ("description".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("isRepayment".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("isVoucher".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("initialSum".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("finiteSum".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("interestRate".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("countMonth".equals(name)) {
					param.add(new String(reader.getText()));
				}
				if ("comission".equals(name)) {
					param.add(new String(reader.getText()));
				}
				break;
			case XMLStreamConstants.END_DOCUMENT:
				//
				// Iterator<Map.Entry<String, ArrayList<String>>> it =
				// getCreditMap()
				// .entrySet().iterator();
				// for (; it.hasNext();) {
				// Map.Entry<String, ArrayList<String>> map = (Map.Entry<String,
				// ArrayList<String>>) it
				// .next();
				// System.out.println(map.getKey() + " " + map.getValue());
				// }
				break;
			default:

				// Iterator<Map.Entry<String, ArrayList<String>>> it =
				// getCreditMap()
				// .entrySet().iterator();
				// for (; it.hasNext();) {
				// Map.Entry<String, ArrayList<String>> map = (Map.Entry<String,
				// ArrayList<String>>) it
				// .next();
				// System.out.println(map.getKey() + " " + map.getValue());
				// }
				break;
			}

		}
	}

	public static void setCreditMap(HashMap<String, ArrayList<String>> creditMap) {
		StAXParser.creditMap = creditMap;
	}

	public static HashMap<String, ArrayList<String>> getCreditMap() {
		return creditMap;
	}
}
