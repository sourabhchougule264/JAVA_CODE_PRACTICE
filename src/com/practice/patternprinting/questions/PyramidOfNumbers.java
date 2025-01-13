package com.practice.patternprinting.questions;

import java.util.Scanner;

public class PyramidOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int rowCount = 1;
		
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		 
		 for(int i = n ; i >= 1 ; i--) {
			 
			 //printing the spaces 
			 for(int j = 1 ; j <= i; j++) {
				 System.out.print(" ");
			 }
			 
			 //printing the numbers
			 for(int j = 1; j <= rowCount; j++) {
				 System.out.print(rowCount+" ");
			 }
			 
			 System.out.println();
			 
			 rowCount++;
		 }
		 
		 
	}

}
