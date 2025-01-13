package com.practice.array.questions;

import java.util.Arrays;
import java.util.HashSet;

public class FindTheIntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] i1 = { 1, 2, 3, 4, 5, 4 };

		Integer[] i2 = { 3, 4, 5, 6, 7, 4 };

		findIersectionByLoops(i1, i2);
		System.out.println();
		findIntersectionByHashsetRetainAllMethod(i1, i2);
	}

	private static void findIntersectionByHashsetRetainAllMethod(Integer[] i1, Integer[] i2) {
		// TODO Auto-generated method stub

		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(i1));
		HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(i2));

		set1.retainAll(set2);

		set1.forEach(System.out::print);
	}

	private static void findIersectionByLoops(Integer[] i1, Integer[] i2) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < i1.length; i++) {
			for (int j = 0; j < i1.length; j++) {
				if (i1[i] == i2[j]) {
					set.add(i1[i]);
				}
			}
		}

		set.forEach(System.out::print);

	}

}
