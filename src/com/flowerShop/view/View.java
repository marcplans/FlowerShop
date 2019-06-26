package com.flowerShop.view;

import java.util.Scanner;

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

				System.out.println(Tools.tableHeader("Bienvenido a franquicia de floristerias"));
				System.out.println("\n1- Crear floristería");
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

				exitFlag = true;
				System.out.println("Gracias por tu visita! Hasta pronto!");
				System.exit(0);

				break;
			}

		}

		sc.close();
		return "";

	}

	public void shopMenu(String shopName) {

		Scanner sc = new Scanner(System.in);

		int screen = 1;
		boolean exitFlag = false;
		String userInput;

		while (!exitFlag) {
			switch (screen) {
			case 1:
				// Main menu
				System.out.println();
				System.out.println(Tools.tableHeader("Bienvenido a floristeria " + shopName));
				System.out.println("\n1- Añadir producto");
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
				System.out.println();
				System.out.println(Tools.tableHeader("Elige tipo de producto a crear"));
				System.out.println("1- Añadir flor");
				System.out.println("2- Añadir arbol");
				System.out.println("3- Añadir decoración");
				System.out.println("4- Menú anterior");

				userInput = sc.nextLine();

				if (userInput.equals("1")) {
					addFlower(sc);

				} else if (userInput.equals("2")) {
					addTree(sc);

				} else if (userInput.equals("3")) {
					addDecoration(sc);

				} else if (userInput.equals("4")) {
					screen = 1; // goto shop menu
				} else {
					System.out.println("Valor no válido, entra de nuevo");
				}
				break;

			case 3:
				// stock list
				System.out.println(getProductController().listStock());
				screen = 1;

				break;
			case 4:
				// exit
				exitFlag = true;
				System.out.println("Gracias por tu visita! Hasta pronto!");

				break;
			}

		}
		sc.close();

	}

	private void addFlower(Scanner sc) {
		String color = "";
		do {
			System.out.println("Entra el color:");
			color = sc.nextLine();
		} while (color.isEmpty());
		double price = Tools.doubleScannerInput(sc, "Entra el precio:");
		getProductController().addFlower(price, color);
	}

	private void addTree(Scanner sc) {
		double height = Tools.doubleScannerInput(sc, "Entra el tamaño:");
		double price = Tools.doubleScannerInput(sc, "Entra el precio:");
		getProductController().addTree(price, height);
	}

	private void addDecoration(Scanner sc) {
		String material = "";
		do {
			System.out.println("Entra el material:");
			System.out.println("1- Madera");
			System.out.println("2- Plástico");
			material = sc.nextLine();
		} while (!(material.equals("1") || material.equals("2") || material.equalsIgnoreCase("madera")
				|| material.equalsIgnoreCase("plástico") || material.equalsIgnoreCase("plastico")));

		if (material.equals("1") || material.equalsIgnoreCase("madera")) {
			material = "madera";
		} else {
			material = "plastico";
		}

		double price = Tools.doubleScannerInput(sc, "Entra el precio:");
		getProductController().addDecoration(price, material);
	}

}
