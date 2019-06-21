package com.flowerShop.model;

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

	
}
