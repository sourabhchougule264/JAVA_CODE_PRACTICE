package com.practice.patternprinting.questions;

import java.util.Scanner;

public class PyramidOfNumbersInSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			//print spaces
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			
			//print numbers
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}

}
