package com.flowerShop.tools;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Tools {

	// Returns a given string repeated a number of times.
	public static String repeatString(String toRepeat, int repetitions) {
		String output = "";
		for (int i = 0; i < repetitions; i++) {
			output += toRepeat;
		}
		return output;
	}

	//
	public static String formatCurrency(double numToFormat) {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.');
		DecimalFormat myFormat = new DecimalFormat("###,##0.00 €", otherSymbols);
		return String.valueOf(myFormat.format(numToFormat));
	}

	//
	public static String formatHeight(double numToFormat) {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.');
		DecimalFormat myFormat = new DecimalFormat("###,##0.00 m", otherSymbols);
		return String.valueOf(myFormat.format(numToFormat));
	}

	// Returns a given string with trailing spaces
	// so that matches a desired string length.
	public static String trailingString(String inputString, int desiredLength) {
		int currentLength = inputString.length();
		if (desiredLength <= currentLength) {
			return inputString;
		}
		return inputString + repeatString(" ", desiredLength - currentLength);
	}

	// Returns a given a string with leading spaces
	// so that matches a desired string length.
	public static String leadingString(String inputString, int desiredLength) {
		int currentLength = inputString.length();
		if (desiredLength <= currentLength) {
			return inputString;
		}
		return repeatString(" ", desiredLength - currentLength) + inputString;
	}

	// Returns line of given strings space separated according
	// to given spacings array, underlined.
	public static String tableHeader(String title) {
		return title + "\n" + repeatString("-", title.length());
	}

	// Checks if string content can be converted to Double type.
	public static boolean isNumeric(String stringToCheck) {
		try {
			Double.parseDouble(stringToCheck);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// Checks if string content can be converted to Double type.
	public static double parseDouble(String stringToCheck) {
		try {
			return Double.parseDouble(stringToCheck);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static double doubleScannerInput(Scanner sc, String message) {
		double output = -1;
		do {
			System.out.println(message);
			String stringPrice = sc.nextLine();
			output = Tools.parseDouble(stringPrice);
		} while (output == -1);// if price -1 = is not a double input
		return output;
	}
}
