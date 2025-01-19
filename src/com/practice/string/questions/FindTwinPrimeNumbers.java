package com.practice.string.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTwinPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,counter = 1,firstNum,secondNum,inputNum = 2;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();

		List<List<Integer>> twinPrimesList = new ArrayList<List<Integer>>();

		while(counter <= n) {
			firstNum = inputNum;
			secondNum = inputNum + 2;
			
			if (checkPrimeNumber(firstNum) && checkPrimeNumber(secondNum)) {
				twinPrimesList.add(Arrays.asList(firstNum,secondNum));
				counter++;
			}
			
			inputNum++;
		}
		
		twinPrimesList.forEach(System.out::println);
	}

	private static boolean checkPrimeNumber(int num) {
		// TODO Auto-generated method stub
		boolean isPrime;
		if (num <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			isPrime = true;
			for (int i = 2; i < num; i++) {

				if (num % 1 == 0 && num % num == 0 && num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
