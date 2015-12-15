package com.epam.efimova.xml.entity;

import java.math.BigDecimal;

public class Good {
	private String name;
	private String model;
	private String provider;
	private String dateOfIssue;
	private String color;
	private String price;

	public Good() {
		// TODO Auto-generated constructor stub
	}

	public Good(String name, String model, String provider,
			String dateOfIssue, String color, String price) {
		super();
		this.name = name;
		this.model = model;
		this.provider = provider;
		this.dateOfIssue = dateOfIssue;
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public String getProvider() {
		return provider;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((dateOfIssue == null) ? 0 : dateOfIssue.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result
				+ ((provider == null) ? 0 : provider.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Good other = (Good) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (dateOfIssue == null) {
			if (other.dateOfIssue != null)
				return false;
		} else if (!dateOfIssue.equals(other.dateOfIssue))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (provider == null) {
			if (other.provider != null)
				return false;
		} else if (!provider.equals(other.provider))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", model=" + model + ", provider="
				+ provider + ", dateOfIssue=" + dateOfIssue + ", color="
				+ color + ", price=" + price + "]";
	}

}
