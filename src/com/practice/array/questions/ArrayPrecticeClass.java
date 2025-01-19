package com.practice.array.questions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayPrecticeClass {

	public static void main(String[] args) {

		int[] arr = { 12, 9, 12, 9, 10, 9, 10, 11 };

		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}

}
