package com.practice.array.questions;

import java.util.Scanner;

public class ContineouseSubArraySumMatchingGivenNum {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 31, 9, 21, 15, 8 };
		int num, sum;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i];
			for (int j = i + 1; j < arr.length - 1; j++) {
				sum = sum + arr[j];

				if (sum == num) {
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + " ");

					}
					System.out.println();
					sum = 0;
				}
			}
		}

	}

}
