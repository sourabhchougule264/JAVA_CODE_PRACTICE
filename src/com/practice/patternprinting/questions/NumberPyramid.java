package com.practice.patternprinting.questions;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int rowCount = 1;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1 ; j <= n - i; j++  ) {
				
				System.out.print(" ");
			}
			
			for(int j = i ; j >= 1; j-- ) {
				
				System.out.print(j+"");
			}
			
			for(int j = 2 ; j <= i; j++) {
				
				System.out.print(j+"");
			}

			System.out.println();
			rowCount++;
		}
	}

}
