package com.practice.LinkedList;

/*
 * @author Sarang Sanjay Dagdu
 * Provides basic functionalities of LinkedList like inserting data at the end and displaying the entire LinkedList.
 */
public class LinkedList {
	
	//starting point of the list 
	Node head;
	
	public Node getHead() {
		return this.head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	//adds a node at the end of list if list is created already
	//If list does not exists then creates a node and makes it the first node(head).
	public void insert(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}
	
	//insert at first position of list
	public void insertAtBeginning(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	//inserts the data at specified position 
	public void insertAtSpecifiedPosition(int position, int data) {
		
		//Check if the position is 1. If yes call insertAtBeginning().
		if(position == 1) {
			insertAtBeginning(data);
			return;
		}
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		int count = 0;
		
		Node start = head;
		while(count == position - 1) {
			start = start.getNext();
		}
		node.setNext(start.getNext());
		start.setNext(node);
	}

	//Displays the entire list 
	public void displayLinkedList(Node node) {
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
	//reverses the LinkedList.
	public Node reverseList(Node node) {
		Node previousNode = null;
		Node nextNode = null;
		
		Node currentNode = node;
		
		while(currentNode != null) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		node = previousNode;
		return node;
	}
}
