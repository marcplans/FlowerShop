package com.flowerShop.model;

public class Decoration extends Product {

	private Material material;

	public Decoration(double price, Material material) {
		setPrice(price);
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public enum Material {
		WOOD, PLASTIC
	}

}
