package com.practice.array.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPairsWhoseSumMatchGivenNumInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int sum;

		Scanner scanner = new Scanner(System.in);
		sum = scanner.nextInt();

		findPairsByIeratingTwoTimes(arr, sum);
		System.out.println();
		findPairsByWhileLoop(arr, sum);

	}

	private static void findPairsByWhileLoop(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		List<List<Integer>> pairsList = new ArrayList<List<Integer>>();
		
		while (low < high) {

			if (arr[low] + arr[high] == sum) {
				pairsList.add(Arrays.asList(arr[low], arr[high]));
				low++;
				high--;
			} else if (arr[low] + arr[high] < sum) {
				low++;
			} else if (arr[low] + arr[high] > sum) {
				high--;
			}
		}
		
		pairsList.forEach(System.out::println);
	}

	private static void findPairsByIeratingTwoTimes(int[] arr, int sum) {
		// TODO Auto-generated method stub
		List<List<Integer>> pairsList = new ArrayList<List<Integer>>();
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] + arr[j] == sum) {
					pairsList.add(Arrays.asList(arr[i], arr[j]));
				}
			}
		}
		pairsList.forEach(System.out::println);
	}

}
