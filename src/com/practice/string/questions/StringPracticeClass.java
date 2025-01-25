package com.practice.string.questions;

public class StringPracticeClass {

	public static void main(String[] args) {

		String str1 = "Amy",str2 = "Suresh";
		
		 str1 = str2 + str1;
		 
		 str2 = str1.substring(str2.length(),str1.length());
		 str1 = str1.substring(0,str1.length() - str2.length());
		 
		 System.err.println(str1);
		 System.out.println(str2);
	}

}
