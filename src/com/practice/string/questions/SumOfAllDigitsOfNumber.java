package com.practice.string.questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		String str = String.valueOf(n);
		

		System.out.println("The Sum is : " + sumByIteration(n, sum));
		System.out.println("The Sum is : " + sumByRecursion(n, sum));
	}

	private static int sumByRecursion(int n, int sum) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return sum;
		} else {
			int lastDigit = n % 10;

			sum = sum + lastDigit;

			n = n / 10;

			return sumByRecursion(n, sum);

		}
	}

	private static int sumByIteration(int n, int sum) {
		// TODO Auto-generated method stub
		while (n != 0) {
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		return sum;
	}

}
