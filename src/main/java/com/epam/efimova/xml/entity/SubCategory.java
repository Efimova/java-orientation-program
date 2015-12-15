package com.epam.efimova.xml.entity;

import java.util.List;

public class SubCategory extends GenericAttributes {
	private List<Good> listGoods;

	public SubCategory() {
		// TODO Auto-generated constructor stub
	}

	public SubCategory(Integer id, String caption, List<Good> listGoods) {
		super(id, caption);
		this.listGoods = listGoods;
	}

	public SubCategory(List<Good> listGoods) {
		super();
		this.listGoods = listGoods;
	}

	public List<Good> getListGoods() {
		return listGoods;
	}

	public void setListGoods(List<Good> listGoods) {
		this.listGoods = listGoods;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((listGoods == null) ? 0 : listGoods.hashCode());
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
		SubCategory other = (SubCategory) obj;
		if (listGoods == null) {
			if (other.listGoods != null)
				return false;
		} else if (!listGoods.equals(other.listGoods))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubCategory [listGoods=" + listGoods + "]";
	}

}
