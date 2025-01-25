package com.practice.array.questions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeClass {

	public static void main(String[] args) {
		Integer[] arr = { 12, 0, 7, 0, 8, 0, 3, 4, 15, 18 };
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		rotateArrayToRight(arr, num);
		System.out.println();
		rotateArrayToLeft(arr, num);
	}

	private static void rotateArrayToLeft(Integer[] arr, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j >= 1; j--) {
				arr[j] = arr[j - 1];
			}
			
			arr[0] = temp;
		}
		
		Arrays.stream(arr).forEach(System.out::print);

	}

	private static void rotateArrayToRight(Integer[] arr, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}

			arr[arr.length - 1] = temp;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

}
