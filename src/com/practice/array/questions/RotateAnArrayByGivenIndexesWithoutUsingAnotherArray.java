package com.practice.array.questions;

import java.util.Arrays;

public class RotateAnArrayByGivenIndexesWithoutUsingAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 2;

		rotateAnArrayToLeft(arr, n);
		System.out.println();
		rotateAnArrayToRight(arr, n);
	}

	private static void rotateAnArrayToRight(int[] arr, int n) {
		// TODO Auto-generated method stub
		System.out.println("Before Rotation!!!!");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();

		for (int i = 0; i < n; i++) {
			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j >= 1; j--) {

				arr[j] = arr[j - 1];
			}

			arr[0] = temp;
		}
		
		System.out.println("After Rotation!!!!");
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void rotateAnArrayToLeft(int[] arr, int n) {
		// TODO Auto-generated method stub

		System.out.println("Before Rotation!!!");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();

		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("After Rotation!!!");
		Arrays.stream(arr).forEach(System.out::print);
	}

}
