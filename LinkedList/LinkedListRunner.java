package com.practice.LinkedList;

/*
 * @author Sarang Sanjay Dagdu
 * Class to create an instance of custom LinkedList and add elements to it.
 */
public class LinkedListRunner {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insertAtSpecifiedPosition(2, 12);
		linkedList.insertAtBeginning(5);
		linkedList.insertAtSpecifiedPosition(1, 33);
		linkedList.insert(46);
		linkedList.displayLinkedList(linkedList.head);
		
	    System.out.println("Reversed list is \n");
		linkedList.displayLinkedList(linkedList.reverseList(linkedList.getHead()));
	}

}
