package com.flowerShop.model;

import com.flowerShop.App;
import com.flowerShop.tools.Tools;

public class Decoration extends Product {

	public enum Material {
		WOOD, PLASTIC
	}

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

	public String getMaterialString() {
		if (material == Material.WOOD) {
			return "madera";
		}
		return "plastico";

	}

	@Override
	public String toString() {
		return Tools.leadingString(getMaterialString(), App.TAB_LONG1) + Tools.leadingString(Tools.formatCurrency(getPrice()), App.TAB_LONG1);
	}

}
