package com.practice.patternprinting.questions;

import java.util.Scanner;

public class PatternPrintingPractice {

	public static void main(String[] args) {
		
		int n;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		
		printFlyoidsTriangle(n);
	}

	private static void printFlyoidsTriangle(int n) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; i <= n; i++) {

			// print numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			
			System.out.println();
		}
		
	}

}
