package com.flowerShop.model;

import com.flowerShop.App;
import com.flowerShop.controler.ProductController;
import com.flowerShop.tools.Tools;
import com.flowerShop.view.View;

public class Flower extends Product {

	private String color;

	public Flower(double price, String color) {

		setPrice(price);
		this.color = color;

	}

	public String getColor() {
		return color;
	}
	
	

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return Tools.leadingString(getColor(), View.TAB_LONG1) + Tools.leadingString(Tools.formatCurrency(getPrice()), View.TAB_LONG1);
	}



}
