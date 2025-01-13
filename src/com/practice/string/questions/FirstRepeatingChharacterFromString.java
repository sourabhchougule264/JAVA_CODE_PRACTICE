package com.practice.string.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingChharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;

		Scanner scanner = new Scanner(System.in);
		str = scanner.next().toLowerCase();
		scanner.close();

		Set<String> set = new HashSet<String>();

		String fs = Arrays.stream(str.split("")).filter(s -> str.indexOf(s) != str.lastIndexOf(s)).findFirst().get();

		System.out.print(fs);

	}

}
