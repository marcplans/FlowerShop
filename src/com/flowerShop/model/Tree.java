package com.flowerShop.model;

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

}
