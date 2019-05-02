package com.test;

public class LinkedListPalidormCheck {
	Node head;
	int length = 0;
	
	public void addNode(int data){

		if (head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		
		while(current.nextNode !=null){
			current = current.nextNode;
		}
		current.nextNode = new Node(data);
		length++;
	}
	
	public void remove(){
		if(head == null){
			return;
		}
		if(head.nextNode != null){
			System.out.println(head.data);
			head = head.nextNode;
		}else if(head.nextNode == null){
			System.out.println(head.data);
			head = null;
		}
		return;
	}
	
	
	public void palindromeChk(Node n){
		if(n == null){
			return;
		}
		
		
		
	}
	
	public static void main(String args[]){
		LinkedListPalidormCheck L1 = new LinkedListPalidormCheck();
		L1.addNode(1);
		L1.addNode(2);
		L1.addNode(3);
		L1.addNode(4);
		L1.addNode(5);

		
		
	}
}
