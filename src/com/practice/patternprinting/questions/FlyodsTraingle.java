package com.practice.patternprinting.questions;

import java.util.Scanner;

public class FlyodsTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int rowCOunt = 1;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(rowCOunt++);
			}
			System.out.println();
		}
	}

}
