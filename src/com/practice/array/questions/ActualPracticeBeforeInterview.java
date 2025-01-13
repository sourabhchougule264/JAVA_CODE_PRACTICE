package com.practice.array.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActualPracticeBeforeInterview {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 4, 9, -1, 12, 25 };
		int sum = 8;

		List<List<Integer>> pairList = new ArrayList<List<Integer>>();
		
		findPairsMatchingSumFromArrayByIterating(arr, pairList,sum);
		
		findPairsMatchingSumFromArrayByWhileLoop(arr, pairList,sum);

	}

	private static void findPairsMatchingSumFromArrayByWhileLoop(int[] arr, List<List<Integer>> pairList, int sum) {
		// TODO Auto-generated method stub
		//sort the arrays first
		Arrays.sort(arr);
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			
			if(arr[low] + arr[high] == sum) {
				pairList.add(Arrays.asList(arr[low],arr[high]));
				low++;
				high--;
			}else if (arr[low] + arr[high] < sum) {
				low++;
			}else if (arr[low] + arr[high] > sum) {
				high--;
			}
		}
		
		pairList.forEach(System.out::println);
		
	}

	private static void findPairsMatchingSumFromArrayByIterating(int[] arr, List<List<Integer>> pairList, int sum) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length ; j++) {
				
				if(arr[i] + arr[j] == sum) {
					
					pairList.add(Arrays.asList(arr[i],arr[j]));
				}
			}
		}
		
		pairList.forEach(System.out::println);
		
	}

}
