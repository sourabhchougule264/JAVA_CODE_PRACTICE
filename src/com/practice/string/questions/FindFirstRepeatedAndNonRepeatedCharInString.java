package com.practice.string.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedAndNonRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		scanner.close();

		findFirstRepeatedNdNonRepeatedCharUsingMap(str);

	}

	private static void findFirstRepeatedNdNonRepeatedCharUsingMap(String str) {
		// TODO Auto-generated method stub

		Map<String, Long> charCountMap = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		// first repeating character
		for (Entry<String, Long> entry : charCountMap.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println("The First repeating character is : " + entry.getKey());
				break;
			}
		}

		// first non-repeating character
		for (Entry<String, Long> entry : charCountMap.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println("The First Non-repeting character is : " + entry.getKey());
				break;
			}
		}
	}

}
