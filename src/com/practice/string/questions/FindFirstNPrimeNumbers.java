package com.practice.string.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFirstNPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();

		List<Integer> primeNumbersList = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {

			if (isPrimeNumber(i)) {
				primeNumbersList.add(i);
			}
		}

		primeNumbersList.forEach(System.out::println);
	}

	private static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub
		boolean isPrime;
		if (num < 1) {
			isPrime = false;
			return isPrime;
		} else {
			isPrime = true;

			for (int i = 2; i < num; i++) {

				if (num % 1 == 0 && num % num == 0 && num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		return isPrime;
	}

}
