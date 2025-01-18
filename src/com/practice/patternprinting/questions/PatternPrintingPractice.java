package com.practice.patternprinting.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PatternPrintingPractice {

	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5);

	    // Write your code here
	        Collections.sort(arr);
	        
	        long min = arr.stream().limit(4).mapToInt(ob -> ob.intValue()).summaryStatistics().getSum();
	        
	        long max = arr.stream().skip(arr.size() - 4).mapToInt(ob -> ob.intValue()).summaryStatistics().getSum();
	        
	        System.out.println(min);
	        System.out.println(max);
	}

}
