package com.practice.array.questions;

import java.util.HashSet;
import java.util.Set;

public class ArrayPrecticeClass {

	public static void main(String[] args) {
		int range = 12;
		Integer[] arr = { 1, 2, 4, 5, 3, 9, 8, 10, 12, 15, 14 };

		findMissingNumbersFromAnArrayByUsingArrayOnly(arr, range);
		System.out.println();
		findMissingNumbersFromAnArrayByUsingSet(arr, range);
	}

	private static void findMissingNumbersFromAnArrayByUsingSet(Integer[] arr, int range) {
		// TODO Auto-generated method stub
		Set<Integer> inSet = new HashSet<Integer>();
		// Set<Integer> resSet = new HashSet<Integer>();

		for (int num : arr) {
			inSet.add(num);
		}

		for (int i = 1; i <= range; i++) {

			if (!inSet.contains(i)) {

				System.out.println("Missing Number is : " + i);
			}
		}

	}

	private static void findMissingNumbersFromAnArrayByUsingArrayOnly(Integer[] arr, int range) {
		// TODO Auto-generated method stub
		boolean[] resArr = new boolean[range + 1];

		for (int num : arr) {

			if (num >= 1 && num <= range) {
				resArr[num] = true;
			}
		}

		for (int i = 1; i < resArr.length; i++) {

			if (!resArr[i]) {
				System.out.println("Missing Number : " + i);
			}
		}

	}
}
