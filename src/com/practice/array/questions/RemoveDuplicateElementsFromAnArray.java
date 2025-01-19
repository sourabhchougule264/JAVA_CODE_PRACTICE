package com.practice.array.questions;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 4, 9, 2 };

		removeDuplicateElementsFromAnArrayByUsingStreams(arr);
		System.out.println();
		removeDuplicateElementsFromAnArrayByUsingIteration(arr);

	}

	private static void removeDuplicateElementsFromAnArrayByUsingIteration(int[] arr) {
		// TODO Auto-generated method stub

		int[] resultArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] != arr[j]) {
					
				}
			}
		}

		Arrays.stream(resultArr).forEach(System.out::println);
	}

	private static void removeDuplicateElementsFromAnArrayByUsingStreams(int[] arr) {
		// TODO Auto-generated method stub

		int[] resulArr = Arrays.stream(arr).boxed().mapToInt(ob -> ob).distinct().toArray();

		Arrays.stream(resulArr).forEach(System.out::println);
	}

}
