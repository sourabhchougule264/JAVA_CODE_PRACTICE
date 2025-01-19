package com.practice.string.questions;

import java.util.Scanner;

public class FindAllPermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		scanner.close();

		findPermutation(str);
	}

	private static void findPermutation(String str) {
		// TODO Auto-generated method stub

		findPermutation("", str);
	}

	private static void findPermutation(String permutedStr, String inputStr) {
		// TODO Auto-generated method stub

		if (inputStr.length() == 0) {
			System.out.println(permutedStr);
		} else {
			for (int i = 0; i < inputStr.length(); i++) {

				findPermutation(permutedStr + inputStr.charAt(i),
						inputStr.substring(0, i) + inputStr.substring(i + 1, inputStr.length()));
			}
		}
	}

}
