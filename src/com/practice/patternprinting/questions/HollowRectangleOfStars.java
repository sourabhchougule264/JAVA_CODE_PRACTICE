package com.practice.patternprinting.questions;

import java.util.Scanner;

public class HollowRectangleOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int m;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j<= m; j++) {
				
				if(i == 1 || j == 1 || i == n || j == m) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
