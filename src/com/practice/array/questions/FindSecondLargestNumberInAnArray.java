package com.practice.array.questions;

import java.util.Arrays;
import java.util.Optional;

public class FindSecondLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,4,5,2,3};
		int firstLargest, secondLargest;

		//Using the java 8 streams
		Optional<Integer> secondLargestNum = Arrays.stream(arr).boxed().sorted((o1, o2) -> o2 - o1).skip(1).findFirst();
		secondLargestNum.ifPresent(number -> System.out.println("The second larges	t number is: " + number));
		
		//Using the loop
		// check 1st and 2nd element for greater accordingly assign those values to first and second largest
		if(arr[0] > arr[1]) {
			firstLargest = arr[0];
			secondLargest = arr[1];
		}else {
			firstLargest = arr[1];
			secondLargest = arr[0];
		}
		
	 /*now check for other elements whether they fit in between the first and second largest, 
	  * accordingly change the values of first and second largest*/
		
		for (int i = 2; i < arr.length; i++) {

			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] < firstLargest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest Numbers in an array is : "+secondLargest);
	}

}
