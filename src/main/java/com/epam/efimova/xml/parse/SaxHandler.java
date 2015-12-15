package com.epam.efimova.xml.parse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.efimova.xml.entity.Category;
import com.epam.efimova.xml.entity.Good;
import com.epam.efimova.xml.entity.SubCategory;



public class SaxHandler extends DefaultHandler {

	private List<Category> shopProducts;
	private List<SubCategory> listSubCategory;
	private List<Good> listGoods;

	private Category category = new Category();
	private SubCategory subCategory = new SubCategory();
	private Good good = new Good();

	private String qName;

	public void setListGoods(List<Good> listGood) {
		this.listGoods = listGood;
	}

	public List<Good> getListGoods() {
		return listGoods;
	}

	public void setListSubCategory(List<SubCategory> listSubCategory) {
		this.listSubCategory = listSubCategory;
	}

	public List<SubCategory> getListSubCategory() {
		return listSubCategory;
	}

	public List<Category> getShopProducts() {
		return shopProducts;
	}

	public void setShopProducts(List<Category> shopProducts) {
		this.shopProducts = shopProducts;
	}

	public void startDocument() throws SAXException {
		setShopProducts(new ArrayList<Category>());
		setListSubCategory(new ArrayList<SubCategory>());
		setListGoods(new ArrayList<Good>());
	}

	public void endDocument() throws SAXException {
		System.out.println("blabla");
		for (Category cat : shopProducts) {
			System.out.println(cat.getCaption());
			System.out.println("----------------");
			for (SubCategory sub : cat.getListSubCategory()) {
				System.out.println("\t" + sub.getCaption());
				System.out.println("-----------------");
				for (Good good : sub.getListGoods()) {
					System.out.println("\t\t" + good.getName());
					System.out.println("\t\t" + good.getModel());
					System.out.println("\t\t" + good.getProvider());
					System.out.println("\t\t" + good.getDateOfIssue());
					System.out.println("\t\t" + good.getColor());
					System.out.println("\t\t" + good.getPrice());
					System.out.println("-----------------");
				}
			}

		}
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		this.qName = qName;
		if ("categry".equals(qName)) {
			category.setId(Integer.parseInt(attributes.getValue(0)));
			category.setCaption(attributes.getValue(1));
		}
		if ("subcategry".equals(qName)) {
			subCategory.setId(Integer.parseInt(attributes.getValue(0)));
			subCategory.setCaption(attributes.getValue(1));
		}
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		this.qName = "";
		if ("categry".equals(qName)) {
			category.setListSubCategory(listSubCategory);
			shopProducts.add(category);
			listSubCategory = new ArrayList<SubCategory>();
			category = new Category();
		}
		if ("subcategry".equals(qName)) {
			subCategory.setListGoods(listGoods);
			listSubCategory.add(subCategory);
			listGoods = new ArrayList<Good>();
			subCategory = new SubCategory();
		}
		if ("good".equals(qName)) {
			listGoods.add(good);
			good = new Good();
		}
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		if ("name".equals(qName)) {
			good.setName(new String(ch, start, length));
		}
		if ("model".equals(qName)) {
			good.setModel(new String(ch, start, length));
		}
		if ("provider".equals(qName)) {
			good.setProvider(new String(ch, start, length));
		}
		if ("dateofissue".equals(qName)) {
			good.setDateOfIssue(new String(ch, start, length));
		}
		if ("color".equals(qName)) {
			good.setColor(new String(ch, start, length));
		}
		if ("price".equals(qName)) {
			good.setPrice(new String(ch, start, length));
		}

	}
}