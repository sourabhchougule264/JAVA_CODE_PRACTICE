package com.practice.string.questions;

import java.util.Scanner;

public class FindLargestNumberNearerToGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int conditionNum;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		conditionNum = scanner.nextInt();

		System.out.println(findLargestNearerNumberByIteratingOverDigits(n, conditionNum));
		System.out.println(findLargestNearerNumberByUsingIndexOfString(n, conditionNum));
	}

	private static int findLargestNearerNumberByUsingIndexOfString(int n, int conditionNum) {
		// TODO Auto-generated method stub
		char conditionNumChar = String.valueOf(conditionNum).toCharArray()[0];
		for(int i = n - 1; i>=0; i--) {
			String iStr = String.valueOf(i);
			
			if(iStr.indexOf(conditionNumChar) == -1) {
				return i;
			}
		}
		return n;
	}

	private static int findLargestNearerNumberByIteratingOverDigits(int n, int conditionNum) {
		// TODO Auto-generated method stub
		for (int i = n - 1; i >= 0; i--) {
			boolean check = true;
			int iCopy = i;
			while (iCopy != 0) {
				int lastDigit = iCopy % 10;
				if (lastDigit == conditionNum) {
					check = false;
					break;
				}
				iCopy = iCopy / 10;
			}
			
			if (check) {
				return i;
			}

		}
		return n;

	}

}
