package com.practice.string.questions;

import java.util.Scanner;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		System.out.println(str.replaceAll("\\s+", ""));
		System.out.println(RemoveWhiteSpacesFromString(str));

	}

	private static String RemoveWhiteSpacesFromString(String str) {
		// TODO Auto-generated method stub
	    	char[] charArr = str.toCharArray();
	    	String withoutSpacStr = "";
	    	
	    	for(int i = 0; i <= charArr.length - 1; i++) {
	    		
	    		if(charArr[i] != ' ') {
	    			withoutSpacStr = withoutSpacStr + charArr[i];
	    		}
	    	}
		return withoutSpacStr;
	}

}
