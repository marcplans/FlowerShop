package com.flowerShop;

import java.util.Arrays;

import com.flowerShop.controler.ProductController;
import com.flowerShop.controler.ShopController;
import com.flowerShop.model.Decoration;
import com.flowerShop.model.Flower;
import com.flowerShop.view.View;

public class App {

	public static void main(String[] args) {

		ShopController shopController = new ShopController();
		ProductController productController = new ProductController();
		View myView = new View(shopController, productController);

		System.out.println(myView.mainMenu());
		System.out.println(shopController.getShopList().size());
		System.out.println(shopController.getShopList().get(0));
		
		//TODO: VIEW: revisar
		//TODO: Product View (crear productos  y lista de estoc)
		
		
		

	

		// submenu // Bienvenidio a la floristeria x
		// 1-añadir producto
			// 1.1 Elige producto
		// 2-lista de estoc
		//3- menu anterior

	}

}
