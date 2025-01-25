package com.practice.string.questions;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIndLongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		
		Scanner scanner =  new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();
		
		String longestWord = Stream.of(str.split(" ")).collect(Collectors.toMap(Function.identity(), ob -> ob.length()))
		.entrySet().stream().sorted((o1,o2) -> o2.getValue() - o1.getValue()).findFirst().get().getKey();
		
		System.out.println(longestWord);
		
	}

}
