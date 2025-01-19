package com.practice.string.questions;

public class SwapTwoStringsWithoutUsingTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JAVA";
		String str2 = "J2EE";

		System.out.println("Before Swapping");
		System.out.println(str1);
		System.out.println(str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("After Swapping");
		System.out.println(str1);
		System.out.println(str2);

	}

}
