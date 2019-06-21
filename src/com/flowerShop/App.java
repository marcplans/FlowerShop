package com.flowerShop;

import java.util.Arrays;

import com.flowerShop.controler.ProductController;
import com.flowerShop.model.Decoration;
import com.flowerShop.model.Flower;

public class App {

	public static final int TAB_LONG1 = 20;
	public static final int TAB_LONG2 = 40;
	
	public static void main(String[] args) {
		
		
		ProductController myController = new ProductController();
		
		myController.addDecoration(100d, "madera");
		myController.addDecoration(100d, "acero");
		myController.addFlower(100d, "rojo");
		myController.addTree(100d, 2d);
		
		System.out.println(myController.listStock());
		

		

		
////		FlowerShop myFlowerShop = new FlowerShop("Flower Power");
//		
//		
//		
//		Product myDecoration = new Decoration(50, Material.WOOD);
//		Product myFlower = new Flower(50, "blue");
//		Product myTree = new Tree(50, 100);
//		
////		myFlowerShop.addProduct(myDecoration);
//		
//		System.out.println(myDecoration.getClass().getSimpleName());
//		System.out.println(myFlower.getClass().getSimpleName());
//		System.out.println(myTree.getClass().getSimpleName());
////		
//		
//		ArrayList<Product> myProducts = new ArrayList<>();
//			myProducts.add(myDecoration);
//			myProducts.add(myTree);
		
		//scanner nombre tienda
		//Bienvenido a franquicia de floristerias
		
		// menu
		// 1 - Crear floristeria ---> Crea objecte x
		// 2- Salir -- fin
		
		// submenu // Bienvenidio a la floristeria x
		//1-añadir producto
		//	1.1 Elige producto
		//2-lista de estoc
		

	}

}
