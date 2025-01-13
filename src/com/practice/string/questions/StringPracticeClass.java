package com.practice.string.questions;

import java.util.Scanner;

public class StringPracticeClass {

	public static void main(String[] args) {

		int num, conditionNum;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		conditionNum = scanner.nextInt();
		scanner.close();

		while (num > 0) {

			if (!isConditionNumPresent(num, conditionNum)) {
				break;
			}
			num--;
		}

		System.out.println(num);
	}

	private static boolean isConditionNumPresent(int num, int conditionNum) {
		// TODO Auto-generated method stub
		int nCopy = num;

		while (nCopy > 0) {
			int digit = nCopy % 10;

			if (digit == conditionNum) {
				return true;
			}

			nCopy = nCopy / 10;
		}

		return false;
	}

}
