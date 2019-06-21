package com.flowerShop.model;

import java.util.ArrayList;

import com.flowerShop.model.Decoration.Material;

public class FlowerShop {

	private String flowerShopName;
	private ArrayList<Product> stock;

	public FlowerShop(String flowerShopName) {
		this.flowerShopName = flowerShopName;
		stock = new ArrayList<>();
	}

	public String getFlowerShopName() {
		return flowerShopName;
	}

	public void setFlowerShopName(String flowerShopName) {
		this.flowerShopName = flowerShopName;
	}

	public ArrayList<Product> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Product> stock) {
		this.stock = stock;
	}

	public void addProduct(Product productToAdd) {
		getStock().add(productToAdd);
	}

}
