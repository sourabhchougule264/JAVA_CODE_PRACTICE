package com.practice.array.questions;

import java.util.Arrays;

public class ReverseAnArrayWithoutUsingAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 9, 21, 17, 33, 7 };

		reverseAnArrayWithoutUsingAnotherArrayByIteration(arr);

	}

	private static void reverseAnArrayWithoutUsingAnotherArrayByIteration(int[] arr) {
		// TODO Auto-generated method stub
		int forwardIndex = 0, backwardIndex = arr.length - 1;

		System.out.println("Before reversal");
		Arrays.stream(arr).forEach(System.out::print);

		for (int i = 0; i < arr.length / 2; i++) {
			forwardIndex = i;

			int temp = arr[forwardIndex];
			arr[forwardIndex] = arr[backwardIndex];
			arr[backwardIndex] = temp;
			backwardIndex--;
		}

		System.out.println();
		System.out.println("After reversal");
		Arrays.stream(arr).forEach(System.out::print);
	}

}
