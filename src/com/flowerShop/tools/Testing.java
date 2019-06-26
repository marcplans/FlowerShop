package com.flowerShop.tools;

import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String material = "";
		do {
			System.out.println("Entra el material:");
			System.out.println("1- Madera");
			System.out.println("2- Plástico");
			material = sc.nextLine();

		} while (!(material.equals("1") || material.equals("2") || material.equalsIgnoreCase("madera")
				|| material.equalsIgnoreCase("plástico") || material.equalsIgnoreCase("plastico")));

		System.out.println("ok");

		sc.close();

	}

}
