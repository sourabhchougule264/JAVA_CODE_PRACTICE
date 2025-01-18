package com.practice.string.questions;

public class StringPracticeClass {

	public static void main(String[] args) {

		int inputNum = 1647598574;

		findBinaryOfNumber(inputNum);
		findoctalOfNumber(inputNum);
		findHexaDecimalOfNumber(inputNum);
	}

	private static void findHexaDecimalOfNumber(int inputNum) {
		// TODO Auto-generated method stub
		String[] hexElements = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String hexaDecimal = "";

		while (inputNum > 0) {
			int digit = inputNum % 16;
			hexaDecimal = hexElements[digit] + hexaDecimal;
			inputNum = inputNum / 16;
		}

		System.out.println("The HexaDecimal is : " + hexaDecimal);
	}

	private static void findoctalOfNumber(int inputNum) {
		// TODO Auto-generated method stub
		String octal = "";

		while (inputNum > 0) {
			int digit = inputNum % 8;
			octal = digit + octal;
			inputNum = inputNum / 8;
		}

		System.out.println("The Octal is : " + octal);
	}

	private static void findBinaryOfNumber(int inputNum) {
		// TODO Auto-generated method stub
		String binary = "";

		while (inputNum > 0) {

			int digit = inputNum % 2;
			binary = digit + binary;
			inputNum = inputNum / 2;
		}

		System.out.println("The binary is : " + binary);
	}

}
