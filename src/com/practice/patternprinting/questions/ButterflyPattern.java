package com.practice.patternprinting.questions;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		// Upper part
		for (int i = 1; i <= n; i++) {

			//print stars
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			
			//print spaces
			for(int j = 1; j <= 2*(n-i);j++) {
				System.out.print(" ");
			}
			
			//print stars
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		// lower part
		for (int i = n; i >= 1; i--) {

			//print stars
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			
			//print spaces
			for(int j = 1; j <= 2*(n-i);j++) {
				System.out.print(" ");
			}
			
			//print stars
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
