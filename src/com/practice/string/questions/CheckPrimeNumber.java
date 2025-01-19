package com.practice.string.questions;

import java.util.Iterator;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner =  new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		
		checkPrimeNumberByIteration(num);
		
	}

	private static void checkPrimeNumberByIteration(int num) {
		// TODO Auto-generated method stub
		boolean isPrime;
		if (num < 1) {
			isPrime = false;
		}else {
			isPrime = true;
			for(int i = 2; i < num; i++) {
				
				if(num % 1 == 0 && num % num == 0 && num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("The number is Prime Number");
		}else {
			System.out.println("The number is not Prime number");
		}
	}

}
