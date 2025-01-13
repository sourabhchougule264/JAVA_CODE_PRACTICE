package com.practice.string.questions;

import java.util.Scanner;

public class CheckGivenNumberIsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		checkNumberIsBinaryByWhileLoop(num);

	}

	private static void checkNumberIsBinaryByWhileLoop(int num) {
		// TODO Auto-generated method stub
		boolean isBinary = false;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 1 || digit == 0) {
				isBinary = true;
			} else {
				isBinary = false;
				break;
			}

			num = num / 10;
		}
		System.out.println("The number is binary = " + isBinary);
	}

}
