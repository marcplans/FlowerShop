package com.flowerShop.view;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.text.AttributeSet.CharacterAttribute;

import com.flowerShop.controler.ProductController;
import com.flowerShop.controler.ShopController;
import com.flowerShop.tools.Tools;

public class View {

	public static final int TAB_LONG1 = 20;
	public static final int TAB_LONG2 = 40;

	private ShopController shopController;
	private ProductController productController;

	public View(ShopController shopController, ProductController productController) {
		this.shopController = shopController;
		this.productController = productController;
	}

	public ShopController getShopController() {
		return shopController;
	}

	public ProductController getProductController() {
		return productController;
	}

	public String mainMenu() {
		Scanner sc = new Scanner(System.in);
		int screen = 1;
		boolean exitFlag = false;
		String userInput;

		while (!exitFlag) {
			switch (screen) {
			case 1:
				System.out.println("pantalla 1");

				System.out.println("Bienvenido a franquicia de floristerias");
				Tools.repeatString("-", 39);
				System.out.println("1- Crear floristería");
				System.out.println("2- Salir");
				System.out.println("Elige la opción y pulsa enter");

				userInput = sc.nextLine();

				if (userInput.equals("1")) {
					screen = 2; // goto create shop screen
				} else if (userInput.equals("2")) {
					screen = 3; // goto exit screen
				} else {
					System.out.println("Valor no válido, entra de nuevo");
				}
				break;

			case 2:
				System.out.println("pantalla 2");
				// to exit
				System.out.println("Entra nombre tienda");
				userInput = sc.nextLine();
				if (!userInput.isEmpty()) {
					getShopController().createNewShop(userInput);
					return userInput;
				} else {
					System.out.println("Nombre de tienda no válido, entra de nuevo");
				}

				break;

			case 3:
				System.out.println("pantalla 3");
				exitFlag = true;

				break;
			}

		}

		return "";
	}

	public String shopMenu(String shopName) {

		Scanner sc = new Scanner(System.in);

		int screen = 1;
		boolean exitFlag = false;
		String userInput;

		while (!exitFlag) {
			switch (screen) {
			case 1:
				// Main menu
				System.out.println("pantalla 1");
				System.out.println(Tools.tableHeader("Bienvenido a floristeria " + shopName));
				System.out.println("1- Añadir producto");
				System.out.println("2- Lista de estoc");
				System.out.println("3- Salir");
				System.out.println("Elige la opción y pulsa enter");

				userInput = sc.nextLine();

				if (userInput.equals("1")) {
					screen = 2; // goto create product
				} else if (userInput.equals("2")) {
					screen = 3; // goto stock list
				} else if (userInput.equals("3")) {
					screen = 4; // goto exit
				} else {
					System.out.println("Valor no válido, entra de nuevo");
				}
				break;

			case 2:
				// add product
				System.out.println(Tools.tableHeader("Elige tipo de producto a crear"));
				System.out.println("1- Añadir flor");
				System.out.println("2- Añadir arbol");
				System.out.println("3- Añadir decoración");
				System.out.println("4- Menú anterior");

				userInput = sc.nextLine();

				if (userInput.equals("1")) {
					// getShopController().

					screen = 2; // add flower

				} else if (userInput.equals("2")) {
					screen = 3; // add tree
				} else if (userInput.equals("3")) {
					screen = 4; // add decoration
				} else if (userInput.equals("4")) {
					screen = 4; // goto shop menu
				} else {
					System.out.println("Valor no válido, entra de nuevo");
				}
				break;

			case 3:
				// stock list

				break;
			case 4:
				// exit
				System.out.println("pantalla 3");
				exitFlag = true;

				break;
			}

		}

		return "";
	}

	private void addFlower(Scanner sc, String shopName) {

		System.out.println("Entra el color:");
		String color = sc.nextLine();

		System.out.println("Entra el precio:");
		String price = sc.nextLine();

		getProductController().addProductToShop(getShopController(), shopName,
				getProductController().addFlower(1d, color));

	}

}
