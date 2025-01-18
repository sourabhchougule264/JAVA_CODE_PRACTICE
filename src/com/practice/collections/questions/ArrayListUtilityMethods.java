package com.practice.collections.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListUtilityMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting the capacity of arraylist. By default the capacity is 10
		setArrayListCapacity();

		// Reduce the capacity to available number of element in the list
		reduceCapacityToAvailableElements();

		// Replace the elements at perticular index;
		replaceElementAtGivenIndex();

		// Insert the element at given index;
		insertElementAtGivenIndex();

		// Remove element from a given index
		removeElementFromGivenIndex();

		// fetch the sublist from a given list
		fetchSubListFromList();
	}

	private static void setArrayListCapacity() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(100);// Capacity set to 100
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// now only 4 elements added and remaining 96 locations are empty, so waste of
		// memory

		list.ensureCapacity(8); // capacity set to 8

	}

	private static void reduceCapacityToAvailableElements() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(100); // Capacity set to 100
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// only 5 element spaces used and remaining 95 are empty , so waste of memory

		list.trimToSize();// trimToSize() method reduces the capacity to the number elements available in
							// the list so the capacity now is 5
	}

	private static void replaceElementAtGivenIndex() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// replace element at 2rd index
		list.set(2, 8);

		list.forEach(System.out::println);
	}

	private static void insertElementAtGivenIndex() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);

		// add element at 2nd index
		list.add(2, 3);

		list.forEach(System.out::println);

	}

	private static void removeElementFromGivenIndex() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// Remove element from the 1st index
		list.remove(1);

		list.forEach(System.out::println);
	}

	private static void fetchSubListFromList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		List<Integer> subList = list.subList(3, 5);

		subList.forEach(System.out::println);
	}
}
