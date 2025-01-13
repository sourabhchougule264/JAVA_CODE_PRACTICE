package com.practice.array.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPrecticeClass {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };

		int num, sum;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			if (sum == num) {
				System.out.println(arr[i]);
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					sum = sum + arr[j];
					if (sum == num) {
						for (int k = i; k <= j; k++) {
							System.out.println(arr[k]);
						}

						sum = 0;
					}
				}
			}

		}

		findPairsWhoseSumEqualToGivenNumByLoop(arr, num);
		findPairsWhoseSumEqualToGivenNumByWhileLoop(arr, num);

	}

	private static void findPairsWhoseSumEqualToGivenNumByWhileLoop(int[] arr, int num) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);

		List<List<Integer>> pairList = new ArrayList<List<Integer>>();

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {

			if (arr[low] + arr[high] == num) {
				pairList.add(Arrays.asList(arr[low], arr[high]));
				low++;
				high--;
			} else if (arr[low] + arr[high] < num) {
				low++;
			} else if (arr[low] + arr[high] > num) {
				high--;
			}
		}

		pairList.forEach(System.out::println);

	}

	private static void findPairsWhoseSumEqualToGivenNumByLoop(int[] arr, int num) {
		// TODO Auto-generated method stub
		List<List<Integer>> pairList = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == num) {
					pairList.add(Arrays.asList(arr[i], arr[j]));
				}
			}
		}

		pairList.forEach(System.out::println);
	}

}
