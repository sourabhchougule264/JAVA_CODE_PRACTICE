package com.practice.patternprinting.questions;

import java.util.Scanner;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		 Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		 
		 for(int i = 1; i <= n; i++) {
			 
			 for(int j = 1; j <= i ; j++) {
				 
				 if((i + j) % 2 == 0) {
					 System.out.print(1);
				 }else {
					System.out.print(0);
				}
			 }
			 
			 System.out.println();
		 }
	}

}
