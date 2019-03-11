package com.practice.LinkedList;

/*
 * @author Sarang Sanjay Dagdu 
 * Generates a node structure that stores data and also a reference to the next node.
 * Contains getters and setters for the data and next fields.
 */
public class Node {

	private int data;
	private	Node next;
	
    public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
