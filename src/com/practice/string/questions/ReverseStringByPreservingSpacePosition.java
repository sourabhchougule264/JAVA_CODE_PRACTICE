package com.practice.string.questions;

import java.util.Scanner;

public class ReverseStringByPreservingSpacePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		reverseStringByPreservingSPacePositionUsigForLoops(str);
	}

	private static void reverseStringByPreservingSPacePositionUsigForLoops(String str) {

		char[] inputChrArr = str.toCharArray();
		char[] outputChrArr = new char[inputChrArr.length];

		// insert the spaces at correct index in the output array
		for (int i = 0; i < inputChrArr.length; i++) {

			if (inputChrArr[i] == ' ') {
				outputChrArr[i] = ' ';
			}
		}
		
		// now put the characters in reverse order at remaining empty index in output array
		int j = outputChrArr.length - 1;
		
		for(int i = 0; i < inputChrArr.length; i++) {
			
			if (inputChrArr[i] != ' ') {
				
				if (outputChrArr[j] == ' ') {
					j--;
				}
				
				outputChrArr[j] = inputChrArr[i];
				j--;
			}
		}
		
		System.out.println("The reversed string with preserved space position is : "+String.valueOf(outputChrArr));
	}

}
