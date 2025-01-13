package com.practice.string.questions;

import java.util.Scanner;

public class ReverseAndAddUntillPalindromeFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		 int palindromeNum = reverseNdAddUntillPalindromeFoundByRecursion(num);
		 System.out.println("The Palindrome number is : "+palindromeNum);
	}

	private static int reverseNdAddUntillPalindromeFoundByRecursion(int num) {
		// TODO Auto-generated method stub
		if (isPalindrome(num)) {
			return num;
		}
		return reverseNdAddUntillPalindromeFoundByRecursion(num + reverseNumber(num));
	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		return reverseNumber(num) == num ? true : false;
	}

	private static int reverseNumber(int num) {
		// TODO Auto-generated method stub
		String reversedNum = new StringBuilder(String.valueOf(num)).reverse().toString();
		return Integer.valueOf(reversedNum);

	}

}
