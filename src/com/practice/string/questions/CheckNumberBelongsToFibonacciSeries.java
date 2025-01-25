package com.practice.string.questions;

import java.util.Iterator;
import java.util.Scanner;

public class CheckNumberBelongsToFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();

		checkNumberBelongsToFibonacciSeriesByRecursion(num);
	}

	private static void checkNumberBelongsToFibonacciSeriesByRecursion(int num) {
		// TODO Auto-generated method stub
		boolean isBelong = false;
		for(int i = 0; i <= num+1; i++) {
			if (fibonacciSeriesByRecursion(i) == num) {
				isBelong = true;
				break;
				
			} 
		}
		
		if (isBelong) {
			System.out.println("The Numbers belongs to fibonacci series");
		}else {
			System.out.println("The Numbers does not belong to fibonacci series");
		}

	}

	private static int fibonacciSeriesByRecursion(int num) {
		// TODO Auto-generated method stub
		if (num <= 1) {
			return num;
		}
		return fibonacciSeriesByRecursion(num - 1) + fibonacciSeriesByRecursion(num - 2);
	}

}
