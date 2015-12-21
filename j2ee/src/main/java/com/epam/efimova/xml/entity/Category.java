package com.epam.efimova.xml.entity;

import java.util.List;

public class Category extends GenericAttributes {
	private List<SubCategory> listSubCategory;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(Integer id, String caption,
			List<SubCategory> listSubCategory) {
		super(id, caption);
		this.listSubCategory = listSubCategory;
	}

	public Category(List<SubCategory> listSubCategory) {
		super();
		this.listSubCategory = listSubCategory;
	}

	public List<SubCategory> getListSubCategory() {
		return listSubCategory;
	}

	public void setListSubCategory(List<SubCategory> listSubCategory) {
		this.listSubCategory = listSubCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((listSubCategory == null) ? 0 : listSubCategory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (listSubCategory == null) {
			if (other.listSubCategory != null)
				return false;
		} else if (!listSubCategory.equals(other.listSubCategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [listSubCategory=" + listSubCategory + "]";
	}

}
