package com.practice.patternprinting.questions;

import java.util.Scanner;

public class InvertedHalfPyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = n ; i>=1; i--) {
			
			for(int j = 1; j<=i; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
