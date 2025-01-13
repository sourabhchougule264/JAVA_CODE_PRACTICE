package com.practice.string.questions;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		int len;
		int nCopy;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		nCopy = n;
		len = String.valueOf(n).length();

		while (nCopy != 0) {

			int lastDigit = nCopy % 10;
			int addingNum = 1;

			for (int i = 0; i < len; i++) {
				addingNum = addingNum * lastDigit;
			}

			sum = sum + addingNum;
			nCopy = nCopy / 10;
		}

		if (sum == n) {
			System.out.println("The number is Armstrong ");
		} else {
			System.out.println("The number is not an Armstrong");
		}

	}

}
