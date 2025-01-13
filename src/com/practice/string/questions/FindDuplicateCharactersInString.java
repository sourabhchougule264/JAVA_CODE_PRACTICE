package com.practice.string.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "";

		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
				
		Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(ob -> ob.getValue() > 1)
				.forEach(ob -> System.out.println(ob.getKey() + " : " + ob.getValue()));

		findDuplicatesUsingHashmap(str);
		System.out.println();
		findDuplicatesUsingHashSet(str);
		System.out.println();
		findDuplcatesUsingIndexOf(str);

	}

	private static void findDuplcatesUsingIndexOf(String str) {
		// TODO Auto-generated method stub
		
		List<Character> duplicates = new ArrayList<Character>();
		
		for( char ch : str.toCharArray()) {
			
			if(str.indexOf(ch) != str.lastIndexOf(ch)) {
				duplicates.add(ch);
			}
		}
		
		duplicates.stream().distinct().forEach(System.out::print);
		
	}

	private static void findDuplicatesUsingHashSet(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> characterSet = new HashSet<Character>();

		List<Character> list = str.chars().mapToObj(chr -> (char) chr).collect(Collectors.toList());

		str.chars().mapToObj(chr -> (char) chr).filter(chr -> !characterSet.add(chr)).collect(Collectors.toList())
				.stream().distinct().forEach(System.out::print);

		// using frquency

		list.stream().filter(chr -> Collections.frequency(list, chr) > 1).distinct().forEach(System.out::println);

	}

	private static void findDuplicatesUsingHashmap(String str) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> characterCountMap = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {

			if (characterCountMap.containsKey(c)) {
				characterCountMap.put(c, characterCountMap.get(c) + 1);
			} else {
				characterCountMap.put(c, 1);
			}
		}

		for (Entry<Character, Integer> entrySet : characterCountMap.entrySet()) {
			if (entrySet.getValue() > 1) {
				System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
			}
		}
	}

}
