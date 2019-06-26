package com.flowerShop;

import com.flowerShop.controler.ProductController;
import com.flowerShop.controler.ShopController;
import com.flowerShop.view.View;

public class App {

	public static void main(String[] args) {

		ShopController shopController = new ShopController();
		ProductController productController = new ProductController();
		View myView = new View(shopController, productController);

		String myShop = myView.mainMenu();
		myView.shopMenu(myShop);

	}

}
