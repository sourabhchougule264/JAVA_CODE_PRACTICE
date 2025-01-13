package com.practice.array.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumberInAnArrayForRange {

	public static void main(String[] args) {

		int range;
		Integer[] arr = { 1, 2, 4, 5, 3, 9, 8, 10, 12, 15, 14 };// 1 2 3 4 5 8 9 10 12

		Scanner scanner = new Scanner(System.in);
		range = scanner.nextInt();
		scanner.close();

		findAllMissingNumbersInAnArrayForRangeLimitUsingArrayOnly(arr, range);

		findAllMissingNumbersInAnArrayForRangeLimitUsingCollections(arr, range);

	}

	private static void findAllMissingNumbersInAnArrayForRangeLimitUsingCollections(Integer[] arr, int range) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> missingIntegers = new ArrayList<Integer>();

		for (int num : arr) {
			set.add(num);
		}

		for (int i = 1; i <= range; i++) {

			if (!set.contains(i)) {
				missingIntegers.add(i);
			}
		}

		missingIntegers.forEach(System.out::println);

	}

	private static void findAllMissingNumbersInAnArrayForRangeLimitUsingArrayOnly(Integer[] arr, int range) {
		// TODO Auto-generated method stub

		// Take one boolean array to store the number presence in true or false mode.

		boolean[] numberStatusArr = new boolean[range + 1];

		// iterate over all number from 0 to range and check whether it is present in
		// the given array or not and store its status in boolean array

		for (int eachNum : arr) {

			if (eachNum >= 1 && eachNum <= range) {
				numberStatusArr[eachNum] = true;
			}
		}

		// now iterate over boolean status array and print the index which are storing
		// the status as false

		for (int i = 1; i < numberStatusArr.length; i++) {
			if (!numberStatusArr[i]) {
				System.out.println("The Missing number is : " + i);
			}
		}
	}

}
