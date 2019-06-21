package com.flowerShop.model;

import com.flowerShop.App;
import com.flowerShop.tools.Tools;

public class Tree extends Product {

	private Double height;

	public Tree(double price, double height) {

		setPrice(price);
		this.height = height;

	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return Tools.leadingString(Tools.formatHeight(getHeight()), App.TAB_LONG1) + Tools.leadingString(Tools.formatCurrency(getPrice()), App.TAB_LONG1);
	}
}
