package com.practice.array.questions;

public class FindAllLeadersInAnIntegerArray {

	public static void main(String[] args) {
		// leaders in an integer array means those numbers which are greater that all
		// the numbers on right side of it

		int[] arr = { 14, 9, 11, 7, 8, 5, 3 };

		findAllLeadersByUsingDoubleForLoop(arr);
		System.out.println();
		findAllLeadersByUsingSingleForLoop(arr);
	}

	private static void findAllLeadersByUsingSingleForLoop(int[] arr) {
		// TODO Auto-generated method stub
		// The last element of array will be always leader since no items after that
		// element
		int max = arr[arr.length - 1];
		System.out.print(max + " ");

		for (int i = arr.length - 2; i >= 0; i--) {

			if (max < arr[i]) {
				max = arr[i];
				System.out.print(max + " ");
			}
		}
	}

	private static void findAllLeadersByUsingDoubleForLoop(int[] arr) {
		// TODO Auto-generated method stub

		boolean isLeader;

		for (int i = 0; i < arr.length; i++) {
			isLeader = true;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					isLeader = false;
					break;
				}
			}

			if (isLeader) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
