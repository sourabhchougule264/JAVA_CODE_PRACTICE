package com.practice.string.questions;

import java.util.Scanner;

public class CheckUserInputIsNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Integer num;
		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		scanner.close();

		try {
			num = Integer.parseInt(str);
			System.out.println("It is the number : " + num);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("It is not the number");
		}
	}

}
