package com.practice.string.questions;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMostRepeatedWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;

		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		String mostRepeatedWord = Stream.of(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().sorted((o1,o2) -> (int)(o2.getValue() - o1.getValue()))
				.findFirst().get().getKey();

		System.out.println(mostRepeatedWord);
	}

}
