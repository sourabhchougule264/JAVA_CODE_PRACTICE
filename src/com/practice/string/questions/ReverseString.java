package com.practice.string.questions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scanner = new Scanner(System.in);

		str = scanner.next();
		scanner.close();

		System.out.println(reverseStringByStringBuilder(str));
		System.out.println(reverseStringByIteratingOver(str));
		System.err.println(reverseStringByRecursion(str));

	}

	private static String reverseStringByRecursion(String str) {
		// TODO Auto-generated method stub
		if (null == str || str.length() == 1) {
			
			return str;
		}
		return reverseStringByRecursion(str.substring(1)) + str.charAt(0);
	}

	private static String reverseStringByIteratingOver(String str) {
		// TODO Auto-generated method stub
		char[] charArray = str.toCharArray();
		String reverseString = "";
		
		for (int i = charArray.length - 1; i>=0 ; i--) {

			reverseString = reverseString + charArray[i];
		}
		return reverseString;
	}

	private static String reverseStringByStringBuilder(String str) {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder(str);
		return sBuilder.reverse().toString();
	}

}
