package com.practice.collections.questions;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  PriorityQueue always works with the elements based on the priority set to the elements. High Priority element will be handled first
		 *  If we don't set priority condition then it will take default i.e ascending order.
		 *  if we need to put the priority condition then we need to provide the supplier into the PriorityQueue
		 *  To put the elements in PriorityQueue, Use offer() method 
		 *  To remove the element from the PriorityQueue, Use poll() method.
		 */
		
		priorityQueueImplementationForSimpleObjects();
		System.out.println("========================");
		priorityQueueImplementationForCustomObjects();
	}

	private static void priorityQueueImplementationForCustomObjects() {
		// TODO Auto-generated method stub
		PriorityQueue<Employee> priorityQueue = new PriorityQueue<Employee>(4,new EmployeeComparator());
		
		priorityQueue.offer(new Employee(4, "Amol", 55000));
		priorityQueue.offer(new Employee(3, "Sanket", 85000));
		priorityQueue.offer(new Employee(1, "Mahesh", 45000));
		priorityQueue.offer(new Employee(2, "Sourabh", 78000));
		
		System.out.println(priorityQueue.poll()); // Sanket,85000
		System.out.println(priorityQueue.poll()); // Sourabh,78000
		
	}

	private static void priorityQueueImplementationForSimpleObjects() {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(7, (e1, e2) -> e2 - e1);
		priorityQueue.offer(5);
		priorityQueue.offer(3);
		priorityQueue.offer(8);
		priorityQueue.offer(2);
		priorityQueue.offer(9);
		priorityQueue.offer(4);
		priorityQueue.offer(1);

		System.out.println(priorityQueue.poll()); // 9
		System.out.println(priorityQueue.poll()); // 8


	}

}
