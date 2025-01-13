package com.practice.patternprinting.questions;

import java.util.Scanner;

public class PatternPrintingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++) {
			
			//print spaces
			for(int j = 1; j <= n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j >= 1; j--) {
				System.out.print(j+"");
			}
			
			for(int j = 2; j <= i; j++) {
				
				System.out.print(j);
			}
			
		
			
			System.out.println();
		}
		
//		for (int i = n; i >= 1; i--) {
//
//			// print spaces
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//
//			// print stars
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//
//			System.out.println();
//		}
	}

}
