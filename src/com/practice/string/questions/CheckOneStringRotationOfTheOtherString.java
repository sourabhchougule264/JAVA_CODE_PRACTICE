package com.practice.string.questions;

import java.util.Scanner;

public class CheckOneStringRotationOfTheOtherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String normalString, rotatedString;

		Scanner scanner = new Scanner(System.in);
		normalString = scanner.next();
		rotatedString = scanner.next();
		scanner.close();

		checkOneStringRotationOfTheOtherStringByContainsMethod(normalString, rotatedString);

	}

	private static void checkOneStringRotationOfTheOtherStringByContainsMethod(String normalString,
			String rotatedString) {
		// TODO Auto-generated method stub

		if (normalString.length() != rotatedString.length()) {
			System.out.println("It is not the rotated string");
		} else {
			String addedString = normalString + normalString;

			if (addedString.contains(rotatedString)) {
				System.out.println("It is the rotated string");
			} else {
				System.out.println("It is not the rotated string");
			}
		}

	}

}
