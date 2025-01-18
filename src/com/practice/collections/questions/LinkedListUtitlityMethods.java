package com.practice.collections.questions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListUtitlityMethods {

	public static void main(String[] args) {

		// Traverse through linked list in reverse order
		traverseLinkedListInReverseOrder();

		// Make linked list to work as queue
		makeLinkedListBehaveAsQueue();

		// Make linked list to work as stack
		makeLinkedListBehaveAsStack();

		// Insert the elements at first and last
		insertElementsAtFirstNdLast();

		// Retrieve the elements from first or last index
		retrieveElementFromFirstNdLast();

		// remove the first and last occurrence of given element
		removeFirstNdLastOccurrenceOfElement();

	}

	private static void traverseLinkedListInReverseOrder() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		Iterator<Integer> descendingIterator = linkedList.descendingIterator();

		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
	}

	private static void makeLinkedListBehaveAsQueue() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// to make the linked list behave like queue, we need to implement the FIFO
		// approach for that we need to use offer() method to add elements and poll()
		// method to remove the elements

		linkedList.offer(1);
		linkedList.offer(2);
		linkedList.offer(3);
		linkedList.offer(4);

		linkedList.forEach(System.out::print);

		linkedList.poll();
		linkedList.poll();

		System.out.println();
		linkedList.forEach(System.out::print);
	}
	
	private static void makeLinkedListBehaveAsStack() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		/*
		 * To make linked list work as a Stack, them we need to use LIFO approach. To do
		 * this, we need to use the push() for adding elements and pop() for removing
		 * the elements
		 */	
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		linkedList.push(5);
		
		System.out.println();
		linkedList.forEach(System.out::print);
		
		linkedList.pop();
		linkedList.pop();
		
		System.out.println();
		linkedList.forEach(System.out::print);
	}

	private static void insertElementsAtFirstNdLast() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		/*
		 * 1. To add the elements at first linked list, we can use either addFirst() or
		 * offerFirst() methods 
		 * 2. To add elements at last in linked list, we can use either addLast() or offerLast() methods
		 * 3. Same we can do in case of removal of the elements.
		 */
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		linkedList.addFirst(0);
		linkedList.addLast(4);
		
		linkedList.offerFirst(-1);
		linkedList.offerLast(5);

		System.out.println();
		linkedList.forEach(System.out::print);
	}
	
	private static void retrieveElementFromFirstNdLast() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		// To retrieve the element from first, we can use element(), getFirst(), peek(), peekFirst() methods
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		System.out.println();
		System.out.println("Fetching firts element ......");
		System.out.println(linkedList.element());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekFirst());
		
		System.out.println("Fetching last element ......");
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.peekLast());
		
	}

	private static void removeFirstNdLastOccurrenceOfElement() {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// To remove the elements first and last occurrence , we can use
		// removeFirstOccurrence() and removeLastOccurrence() methods

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(1);
		linkedList.add(5);
		
		linkedList.removeFirstOccurrence(1);
		linkedList.removeLastOccurrence(1);
		
		System.out.println();
		linkedList.forEach(System.out::println);

	}

}
