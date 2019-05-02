package com.test;

public class LinkedListt {

	Nodee head;
	

	public void insertNode(int data) {

		if (head == null) {
			head = new Nodee(data);
			current = head;
			return;
		}
		Nodee current = head;
		while (current.nextNodee != null) {
			current = current.nextNodee;
		}
		Nodee newNodee = new Nodee(data);
		current.nextNodee = newNodee;
		return;
	}

	public void deleteNodee(int data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = null;
		}
		Nodee current = head;
		while (current.nextNodee != null) {
			if (current.nextNodee.data == data) {
				current.nextNodee = current.nextNodee.nextNodee;
				break;
			}
			current = current.nextNodee;
		}
	}
	
	
	Nodee current;
	public void reverse(){
		
		
		Nodee previous;
		if(head == null){
			return;
		}

		if(current.nextNodee == null){
			head = current;
			return;
		}
		
		previous = new Nodee(current.data);
		
		if(current.nextNodee != null){
			current = current.nextNodee;
		}
		reverse();
		if(current.nextNodee == null){
			current.nextNodee = previous;
			current = current.nextNodee;
		}
		
	}
	
	
	public static void main(String args[]){
		
		LinkedListt linkedListt = new LinkedListt();
		linkedListt.insertNode(1);
		linkedListt.insertNode(2);
		linkedListt.insertNode(3);
		linkedListt.insertNode(4);
		
		//Nodee current = linkedListt.head;
		
		//linkedListt.deleteNodee(3);
		
//		while(current.nextNodee != null){
//			System.out.println(current.data);
//			current = current.nextNodee;
//		}
		//System.out.println(current.data);
		
		linkedListt.reverse();
		
		
		
		
	}
	
}
