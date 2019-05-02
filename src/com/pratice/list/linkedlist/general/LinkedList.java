package com.pratice.list.linkedlist.general;

import com.pratice.list.linkedlist.CTCI.Node;

public class LinkedList {

	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.nextNode != null) {
			current = current.nextNode;
		}
		current.nextNode = new Node(data);
	}

	public void delete(int data) {

		if (head == null)
			return;

		if (head.data == data) {
			head = head.nextNode;
		}

		Node current = head;
		while (current.nextNode != null) {

			if (current.nextNode.data == data) {
				current.nextNode = current.nextNode.nextNode;
			}
			current = current.nextNode;
		}
	}
	
	public void prepend(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		head = new Node(data);
		head.nextNode = current;
	}
}
