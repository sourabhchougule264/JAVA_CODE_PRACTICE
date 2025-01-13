package com.practice.array.questions;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		findEqualityByIteration(arr1, arr2);
		findEqualityByArraysEqualsMethod(arr1,arr2);

	}

	private static void findEqualityByArraysEqualsMethod(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		boolean equalityCheck = false;

		// check length of both the arrays

		if (arr1.length == arr2.length) {
			equalityCheck = Arrays.equals(arr1, arr2);
		}

		if (equalityCheck) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both arrays are not equal");
		}
	}

	private static void findEqualityByIteration(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub

		boolean equalityCheck = false;

		// check length of both the arrays

		if (arr1.length == arr2.length) {
			equalityCheck = true;

			for (int i = 0; i <= arr1.length - 1; i++) {

				if (arr1[i] != arr2[i]) {
					equalityCheck = false;
					break;
				}
			}
		}

		if (equalityCheck) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both arrays are not equal");
		}

	}
}
