package com.practice.array.questions;

import java.util.Arrays;

public class RotateAnArrayByGivenNumbersOfIndexs {

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
		int[] rotatedArr = new int[arr.length];
		int counter = 0;

		System.out.println("Before rotation!!!");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		
		for (int i = arr.length - n; i < arr.length; i++) {
				rotatedArr[counter] = arr[i];
				counter++;
		}
		
		for(int i = 0; i < arr.length - n; i++) {
			rotatedArr[counter] = arr[i];
			counter++;
		}
		
		System.out.println("After rotation!!!");
		Arrays.stream(rotatedArr).forEach(System.out::print);
	}

	private static void rotateAnArrayToLeft(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] rotatedArr = new int[arr.length];
		int counter = 0;

		System.out.println("Before rotating!!!");
		Arrays.stream(arr).forEach(System.out::print);

		for (int i = n; i < arr.length; i++) {
			rotatedArr[counter] = arr[i];
			counter++;
		}

		for (int i = 0; i < n; i++) {
			rotatedArr[counter] = arr[i];
			counter++;
		}

		System.out.println();
		System.out.println("After rotating!!!");
		Arrays.stream(rotatedArr).forEach(System.out::print);
	}

}
