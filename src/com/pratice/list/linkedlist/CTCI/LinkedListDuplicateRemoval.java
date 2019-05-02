package com.pratice.list.linkedlist.CTCI;

public class LinkedListDuplicateRemoval{

	Node root;
	int temp;
	
	private void addNode(int data){
		
		if(root == null){
			root = new Node(data);
			return;
		}
		
		Node current = root;
		
		while(current.nextNode != null){
			current = current.nextNode;
		}
		current.nextNode = new Node(data);
	}
	
	private void deleteDup(){
	
		Node current = root;
		
		while(current.nextNode != null){
			Node temp = current;
			
			while(temp.nextNode != null){
				if(temp.nextNode.data == current.data){
					temp.nextNode = temp.nextNode.nextNode;
				}{
					temp = temp.nextNode;
				}
			}
			current = current.nextNode;
		}
	}
	
	private void print(){
		
		if(root == null){
			return;
		}
		
		Node current = root;
		
		while(current.nextNode != null){
			System.out.println(current.data);
			current = current.nextNode;
		}
		System.out.println(current.data);
	}
	public static void main(String args[]){
		
		LinkedListDuplicateRemoval dupRemoval = new LinkedListDuplicateRemoval();
		
		dupRemoval.addNode(4);
		dupRemoval.addNode(1);
		dupRemoval.addNode(2);
		dupRemoval.addNode(1);
		dupRemoval.addNode(4);
		dupRemoval.addNode(3);
		dupRemoval.addNode(2);
		dupRemoval.addNode(4);
		dupRemoval.addNode(5);
		
		dupRemoval.print();
		dupRemoval.deleteDup();
		System.out.println("--");
		dupRemoval.print();
		
		
	}
	
	
}
