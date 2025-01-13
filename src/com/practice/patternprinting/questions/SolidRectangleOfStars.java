package com.practice.patternprinting.questions;

import java.util.Scanner;

public class SolidRectangleOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int m;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		for(int i = 1 ; i <=n ; i++) {
			
			for(int j = 1; j <= m; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
