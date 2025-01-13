package com.practice.string.questions;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str, reverseStr = "";
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		reverseEachWordInStringByLoop(str, reverseStr);
		reverseEachWordInStringByJava8Stream(str, reverseStr);

	}

	private static void reverseEachWordInStringByJava8Stream(String str, String reverseStr) {
		// TODO Auto-generated method stub
		reverseStr = Stream.of(str.split(" ")).map(ob -> new StringBuilder(ob).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println(reverseStr);
	}

	private static void reverseEachWordInStringByLoop(String str, String reverseStr) {
		// TODO Auto-generated method stub
		String[] wordArray = str.split(" ");

		for (String eachWord : wordArray) {

			reverseStr = reverseStr.concat(ReverseString(eachWord)).concat(" ");

		}

		System.out.println(reverseStr);

	}

	private static String ReverseString(String eachWord) {
		// TODO Auto-generated method stub
		return new StringBuilder(eachWord).reverse().toString();
	}

}
