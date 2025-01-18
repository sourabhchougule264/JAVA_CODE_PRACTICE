package com.practice.collections.questions;

import java.util.Arrays;

public class DeepToStringMethodOfArraysUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays.deepToString is used to create the string representation of the any
		// multi-dimensional array.

		String[] OneDArr = { "Sourabh", "Amol", "Sanket", "Mahesh", "Prabhu", "Aniket", "Rohit" };

		System.out.println("The String representaiton of 1D Array is : " + Arrays.deepToString(OneDArr));

		String[][] twoDArr = { { "Sourabh", "Amol", "Sanket", "Mahesh", "Prabhu", "Aniket", "Rohit" },
				{ "Chougule", "Mundhe", "Mohalkar", "Dhole", "Dutta", "Agrawal", "Kumbhojkar" } };

		System.out.println("The String represeation of 2D array is : " + Arrays.deepToString(twoDArr));

		String[][][] threeDArr = { { { "Sourabh", "Amol", "Sanket", "Mahesh", "Prabhu", "Aniket", "Rohit" } },
				{ { "Chougule", "Mundhe", "Mohalkar", "Dhole", "Dutta", "Agrawal", "Kumbhojkar" } },
				{ { "Dev", "Dev", "Dev", "Dev", "Dev", "Dev", "Tester" } } };

		System.out.println("The String representation of 3D array is : " + Arrays.deepToString(threeDArr));

	}

}
