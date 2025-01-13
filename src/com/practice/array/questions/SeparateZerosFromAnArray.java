package com.practice.array.questions;

import java.util.Arrays;

public class SeparateZerosFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12, 0, 7, 0, 8, 0, 3
		moveZerosToRight(new int[] {12, 0, 7, 0, 8, 0, 3});
		System.out.println();
		moveZerosToRLeft(new int[] {12, 0, 7, 0, 8, 0, 3});
	}

	private static void moveZerosToRLeft(int[] arr) {
		// TODO Auto-generated method stub
		int counter = arr.length - 1;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			if(arr[i] != 0) {
				arr[counter] = arr[i];
				counter--;
			}
		}
		
		while(counter >= 0) {
			arr[counter] = 0;
			counter--;
		}
		
		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void moveZerosToRight(int[] arr) {
		// TODO Auto-generated method stub
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}
		}
		
		while(counter <= arr.length-1) {
			arr[counter] = 0;
			counter++;
		}
		
		Arrays.stream(arr).forEach(System.out::print);
	}

}
