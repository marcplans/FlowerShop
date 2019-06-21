package com.flowerShop.controler;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.flowerShop.App;
import com.flowerShop.model.Decoration;
import com.flowerShop.model.Decoration.Material;
import com.flowerShop.model.Flower;
import com.flowerShop.model.Product;
import com.flowerShop.model.Tree;
import com.flowerShop.tools.Tools;
import com.flowerShop.view.View;

public class ProductController {
	


	private ArrayList<Product> productList = new ArrayList<>();

	// Add product / Flower

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public String addFlower(Double price, String color) {
		productList.add(new Flower(price, color));

		return "Producto flor añadido. Precio: " + price + " Color: " + color;
	}

	// Add product / Tree

	public String addTree(Double price, Double height) {
		productList.add(new Tree(price, height));

		return "Producto arbol añadido. Precio: " + price + " altura: " + height;
	}

	// Add product / Decoration
	public String addDecoration(Double price, String material) {

		switch (material) {
		case "madera":

			productList.add(new Decoration(price, Material.WOOD));

			break;

		case "plastico":

			productList.add(new Decoration(price, Material.PLASTIC));

			break;

		default:

			return "El material " + material + " es incorrecto.";

		}

		return "Producto de decoración añadido. Precio: " + price + " material: " + material;
	}

	// List product

	public String listStock() {

		String flowerStock = "";
		String treeStock = "";
		String decorationStock = "";

		for (Product product : productList) {

			switch (product.getClass().getSimpleName()) {
			case "Flower":
				flowerStock += product.toString() + "\n";
				break;

			case "Tree":
				treeStock += product.toString() + "\n";
				break;

			case "Decoration":
				decorationStock += product.toString() + "\n";
				break;
			}

		}

		String output = "LISTA DE PRODUCTOS\n" + Tools.repeatString("-", View.TAB_LONG2) + "\n" + "FLORES\n"
				+ Tools.leadingString("Color", View.TAB_LONG1) + Tools.leadingString("Precio", View.TAB_LONG1) + "\n"
				+ Tools.repeatString("-", View.TAB_LONG2) + "\n" + flowerStock + "ÁRBOLES\n"
				+ Tools.leadingString("Altura", View.TAB_LONG1) + Tools.leadingString("Precio", View.TAB_LONG1) + "\n"
				+ Tools.repeatString("-", View.TAB_LONG2) + "\n" + treeStock + "DECORACIÓN\n"
				+ Tools.leadingString("Material", View.TAB_LONG1) + Tools.leadingString("Precio", View.TAB_LONG1) + "\n"
				+ Tools.repeatString("-", View.TAB_LONG2) + "\n" + decorationStock;

		return output;
	}

}
