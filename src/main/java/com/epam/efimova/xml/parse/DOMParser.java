package com.epam.efimova.xml.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class DOMParser {

	private static HashMap<String, ArrayList<String>> creditMap = new HashMap<String, ArrayList<String>>();
	private static ArrayList<String> credits = new ArrayList<String>();

	public static ArrayList<String> getCredits() {
		return credits;
	}

	public static void setCredits(ArrayList<String> credits) {
		DOMParser.credits = credits;
	}

	public static HashMap<String, ArrayList<String>> getCreditMap() {
		return creditMap;
	}

	public static void setCreditMap(HashMap<String, ArrayList<String>> creditMap) {
		DOMParser.creditMap = creditMap;
	}

	public static void listBuilder(Element root) {
		NodeList banksNodes = root.getElementsByTagName("bankName");
		for (int i = 0; i < banksNodes.getLength(); i++) {

			Element creditElement = (Element) banksNodes.item(i);
			NodeList cr = creditElement.getElementsByTagName("credit");

			for (int j = 0; j < cr.getLength(); j++) {
				Element elem = (Element) cr.item(j);
				getCredits().add(elem.getAttribute("type"));
				getCredits().add(getBabyValue(elem, "description"));
				getCredits().add(getBabyValue(elem, "isRepayment"));
				getCredits().add(getBabyValue(elem, "isVoucher"));
				getCredits().add(getBabyValue(elem, "initialSum"));
				getCredits().add(getBabyValue(elem, "finiteSum"));
				getCredits().add(getBabyValue(elem, "interestRate"));
				getCredits().add(getBabyValue(elem, "countMonth"));
				getCredits().add(getBabyValue(elem, "comission"));
				getCreditMap().put(
						banksNodes.item(i).getAttributes().item(1)
								.getTextContent(), getCredits());
			}
		}
		Iterator<Map.Entry<String, ArrayList<String>>> it = getCreditMap()
				.entrySet().iterator();
		for (; it.hasNext();) {
			Map.Entry<String, ArrayList<String>> map = (Map.Entry<String, ArrayList<String>>) it
					.next();
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}

	// возвращает дочерний элемент по его имени и родительскому элементу
	private static Element getBaby(Element parent, String childName) {
		NodeList nlist = parent.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
	}

	// возвращает текст, содержащийся в элементе
	private static String getBabyValue(Element parent, String childName) {
		Element child = getBaby(parent, childName);
		Node node = child.getFirstChild();

		String value = node.getNodeValue();
		return value;
	}

}
