package com.flowerShop.model;

import com.flowerShop.tools.Tools;
import com.flowerShop.view.View;

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
		return Tools.leadingString(getMaterialString(), View.TAB_LONG1)
				+ Tools.leadingString(Tools.formatCurrency(getPrice()), View.TAB_LONG1);
	}

}
