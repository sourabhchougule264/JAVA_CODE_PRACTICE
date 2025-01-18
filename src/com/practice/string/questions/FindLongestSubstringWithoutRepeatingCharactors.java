package com.practice.string.questions;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindLongestSubstringWithoutRepeatingCharactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;

		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		scanner.close();

		findLongestSubstringWithoutRepeatingCharInGivenStringByUsingLinkedHashMap(str);

	}

	private static void findLongestSubstringWithoutRepeatingCharInGivenStringByUsingLinkedHashMap(String str) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer> charPosnMap = new LinkedHashMap<Character, Integer>();
		String longestSubString = "";
		int longestSubStringLength = 0;

		for (int i = 0; i < str.length(); i++) {

			if (!charPosnMap.containsKey(str.charAt(i))) {

				charPosnMap.put(str.charAt(i), i);
			} else {
				i = charPosnMap.get(str.charAt(i)); /*
													 * Note : Here we are setting the i to the previous index of
													 * repeating character, so, after the loop completion i becomes i+1,
													 * since we are using post increment i++ in for loop condition
													 */
				charPosnMap.clear();
			}

			if (longestSubStringLength < charPosnMap.size()) {
				longestSubStringLength = charPosnMap.size();
				longestSubString = charPosnMap.keySet().toString();
			}
		}

		System.out.println("The Longest Substring without repeating character is : " + longestSubString
				+ " with length : " + longestSubStringLength);
	}

}
