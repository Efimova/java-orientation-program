package com.epam.efimova.xml.parse;

import java.io.ByteArrayInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class StAXXML {
	private static final String STATUS = "status";
	private static final String ADDRESS_ID = "address_id";
	private static final String CIVIC_ADDRESS = "civic_address";

	static String status = null;
	static String addressId = null;
	static String civicAddress = null;

	public static void parseAddressResponse(String response) {

		try {
			byte[] byteArray = response.getBytes("UTF-8");
			ByteArrayInputStream inputStream = new ByteArrayInputStream(
					byteArray);
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			XMLStreamReader reader = inputFactory
					.createXMLStreamReader(inputStream);

			while (reader.hasNext()) {
				int event = reader.next();

				if (event == XMLStreamConstants.START_ELEMENT) {
					String element = reader.getLocalName();

					if (element.equals(STATUS)) {
						status = reader.getElementText();
						continue;
					}

					if (element.equals(ADDRESS_ID)) {
						addressId = reader.getText();
						continue;
					}

					if (element.equals(CIVIC_ADDRESS)) {
						civicAddress = reader.getText();
						continue;
					}
				}
			}
		} catch (Exception e) {
			// log.error("Couldn't parse AddressResponse", e);
		}
	}
}
