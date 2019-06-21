package com.flowerShop.tools;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	// Returns a given number as a string with trailing spaces
	// so that matches a desired string length
	public static String formatNum(Double numToFormat, int desiredLength) {
		int currentLength = numToFormat.toString().length();
		if (desiredLength <= currentLength) {
			return numToFormat.toString();
		}
		return repeatString(" ", desiredLength - currentLength) + numToFormat.toString();
	}

	// Returns a given number as a string with trailing spaces
	// so that matches a desired string length
	public static String formatNum(String numToFormat, int desiredLength) {
		int currentLength = numToFormat.length();
		if (desiredLength <= currentLength) {
			return numToFormat;
		}
		return repeatString(" ", desiredLength - currentLength) + numToFormat;
	}




	




	// Returns line of given strings space separated according
	// to given spacings array, underlined.
	public static String tableHeader(List<String> strings, List<Integer> stringSpacing) {
		String outputString = stringLine(strings, stringSpacing);
		return outputString + "\n" + repeatString("-", outputString.length());
	}

	// Returns line of given strings space separated according
	// to given spacings array. Negative spacing adds leading
	// spaces and positive ones adds trailing spaces.
	public static String stringLine(List<String> strings, List<Integer> stringSpacing) {
		String outputString = "";
		if (strings.size() != stringSpacing.size()) {
			return outputString;
		}
		for (int i = 0; i < strings.size(); i++) {
			if (stringSpacing.get(i) < 0) {
				outputString += leadingString(strings.get(i), Math.abs(stringSpacing.get(i)));
			} else {
				outputString += trailingString(strings.get(i), stringSpacing.get(i));
			}
		}
		return outputString;
	}

	// Returns two given strings concatenated with a number of
	// spaces between them to match a final string desired length.
	public static String sandwichString(String firstString, String secondString, int desiredLength) {
		int length1 = firstString.length();
		int length2 = secondString.length();

		if (desiredLength <= length1 + length2) {
			return firstString + secondString;
		}
		return firstString + repeatString(" ", desiredLength - length1 - length2) + secondString;
	}

	// Returns last word of given phrase string, separated by spaces
	public static String getLastWord(String fullString) {
		fullString = trimTrailingSpaces(fullString);
		String lastWord = "";
		int stringPos = fullString.length() - 1;
		while (stringPos >= 0 && !(fullString.substring(stringPos, stringPos + 1).equals(" "))) {
			lastWord = fullString.substring(stringPos, stringPos + 1) + lastWord;
			stringPos--;
		}
		return lastWord;
	}

	// Returns given string without trailing spaces
	public static String trimTrailingSpaces(String stringToTrim) {
		int stringPos = stringToTrim.length() - 1;
		while (stringPos >= 0 && stringToTrim.substring(stringPos, stringPos + 1).equals(" ")) {
			stringPos--;
		}
		return stringToTrim.substring(0, stringPos + 1);
	}

	// Returns given string reversed
	public static String reverseString(String toReverseString) {
		String outputString = "";
		for (int i = toReverseString.length() - 1; i >= 0; i--) {
			outputString += toReverseString.substring(i, i + 1);
		}
		return outputString;
	}

	// Checks if string is null or empty or contains only whitespace
	public static boolean isVoidString(String stringToCheck) {
		return (stringToCheck == null || stringToCheck.trim().isEmpty());
	}

	// Checks if any given string is null or empty
	// or contains only whitespace
	public static boolean isAnyStringVoid(String... stringsToCheck) {
		for (String currentString : stringsToCheck) {
			if (currentString == null || currentString.trim().isEmpty()) {
				return true;
			}
		}
		return false;
	}

}
