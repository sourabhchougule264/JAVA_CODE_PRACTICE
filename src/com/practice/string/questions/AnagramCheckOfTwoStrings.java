package com.practice.string.questions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckOfTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "";
		String str2 = "";
		
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.nextLine();
		str2 = scanner.nextLine();
		
		checkAnagramByUsingArraysUtilityMethods(str1,str2);
		checkAnagramByIterationMethod(str1,str2);
		
	}

	private static void checkAnagramByIterationMethod(String str1, String str2) {
		// TODO Auto-generated method stub
		boolean isAnagram = true ;
		// remove the spaces from the strings
		str1 = str1.replaceAll("\\s+", "");
		str2 = str2.replaceAll("\\s+", "");
		
		// make both the string to same case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
				
		// first check length of both the string 
		if(str1.length() != str2.length()) {
			isAnagram = false;
		}else {
			
			//convert 1st string to char array
			char[] charArr = str1.toCharArray();
			
			/*
			 * iterate over each char in the array and check whether that char present in
			 * other string and remove it for other string it present or else set boolean to
			 * false and break the loop
			 */
			
			for(char c : charArr) {
				
				int index = str2.indexOf(c);
				
				//check index to confirm character availability
				if(index != -1) {
					str2 = str2.substring(0,index) + str2.substring(index + 1, str2.length());
				} else {
					isAnagram = false;
					break;
				}
			}
			
		}
		
		if (isAnagram) {
			System.out.println("Both Strings are Anagram");
		}else {
			System.out.println("Both Strings are not Anagram");
		}
	}

	private static void checkAnagramByUsingArraysUtilityMethods(String str1, String str2) {
		// TODO Auto-generated method stub
		boolean isAnagram;
		// remove the spaces from the strings
		str1 = str1.replaceAll("\\s+", "");
		str2 = str2.replaceAll("\\s+", "");
		
		// make both the string to same case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
				
		// first check length of both the string 
		if(str1.length() != str2.length()) {
			isAnagram = false;
		}else {
			// convert both strings array
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			
			// Sort the both arrays
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			// Compare the equality of both arrays
			 isAnagram = Arrays.equals(charArr1, charArr2);
		}
		
		if (isAnagram) {
			System.out.println("Both Strings are Anagram");
		}else {
			System.out.println("Both Strings are not Anagram");
		}
	}

}
