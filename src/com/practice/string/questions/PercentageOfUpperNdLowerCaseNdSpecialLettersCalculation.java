package com.practice.string.questions;

import java.text.DecimalFormat;

public class PercentageOfUpperNdLowerCaseNdSpecialLettersCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Tiger Runs @ The Speed Of 100 km/hour.";
		int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, specialCharCount = 0, len = str.length();

		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		System.out.println("The upper case percentage : " + decimalFormat.format((double) (upperCaseCount * 100) / len) + "%");
		System.out.println("The upper case percentage : " + decimalFormat.format((double) (lowerCaseCount * 100) / len) + "%");
		System.out.println("The upper case percentage : " + decimalFormat.format((double) (digitCount * 100) / len) + "%");
		System.out.println("The upper case percentage : " + decimalFormat.format((double) (specialCharCount * 100) / len) + "%");
	}

}
