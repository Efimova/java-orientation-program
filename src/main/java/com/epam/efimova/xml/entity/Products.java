package com.epam.efimova.xml.entity;

import java.util.List;

public class Products {
	private List<Category> listCategory;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(List<Category> listCategory) {
		setListCategory(listCategory);
	}

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((listCategory == null) ? 0 : listCategory.hashCode());
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
		Products other = (Products) obj;
		if (listCategory == null) {
			if (other.listCategory != null)
				return false;
		} else if (!listCategory.equals(other.listCategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Products [listCategory=" + listCategory + "]";
	}

}
