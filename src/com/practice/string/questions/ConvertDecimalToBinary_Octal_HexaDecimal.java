package com.practice.string.questions;

import java.util.Scanner;

public class ConvertDecimalToBinary_Octal_HexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNum;
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextInt();
		scanner.close();

		convertDecimalToBinary(inputNum);
		convertDecimalToOctal(inputNum);
		convertDecimalToHexaDecimal(inputNum);
	}

	private static void convertDecimalToHexaDecimal(int inputNum) {
		// TODO Auto-generated method stub
		String hexaDecNum = "";
		char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (inputNum > 0) {
			int digit = inputNum % 16;
			hexaDecNum = hexaDecimals[digit] + hexaDecNum;
			inputNum = inputNum / 16;
		}

		System.out.println("The HexaDecimal is :" + hexaDecNum);
	}

	private static void convertDecimalToOctal(int inputNum) {
		// TODO Auto-generated method stub
		String octalNum = "";

		while (inputNum > 0) {
			int digit = inputNum % 8;
			octalNum = digit + octalNum;
			inputNum = inputNum / 8;
		}

		System.out.println("The Binary is :" + octalNum);
	}

	private static void convertDecimalToBinary(int inputNum) {
		// TODO Auto-generated method stub
		// To convert the decimal to binary, take each remainder of number by dividing 2
		String binaryNum = "";
		while (inputNum > 0) {
			int digit = inputNum % 2;
			binaryNum = digit + binaryNum;
			inputNum = inputNum / 2;

		}

		System.out.println("The Octal is :" + binaryNum);
	}

}
