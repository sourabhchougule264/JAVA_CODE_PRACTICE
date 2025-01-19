package com.practice.collections.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(9, 5, 6, 4, 2, 4, 6, 7, 8));

		removeDuplicatesByUsingHashSet(list);
		System.out.println(list);
		removeDuplicatesByUsingLinkedHasSet(list);
		System.out.println(list);
		removeDuplicatesByUsingDistinctMethod(list);
		System.out.println(list);
	}

	private static void removeDuplicatesByUsingDistinctMethod(List<Integer> list) {
		// TODO Auto-generated method stub
		list = list.stream().distinct().collect(Collectors.toList());
	}

	private static void removeDuplicatesByUsingLinkedHasSet(List<Integer> list) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> linkedUniqueSet = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(linkedUniqueSet);

	}

	private static void removeDuplicatesByUsingHashSet(List<Integer> list) {
		// TODO Auto-generated method stub
		HashSet<Integer> uniqueSet = new HashSet<Integer>(list);
		list.clear();
		list.addAll(uniqueSet);
	}

}
