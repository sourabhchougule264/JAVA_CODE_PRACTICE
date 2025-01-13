package com.practice.patternprinting.questions;

import java.util.Scanner;

public class HollowRhombusWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			// print spaces
			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");
			}

			// print stars for hollow rhombus
			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
