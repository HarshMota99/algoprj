package com.pratice.list.linkedlist.leetcode;
/*
 Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
 */
import com.pratice.list.linkedlist.CTCI.Node;

public class RemoveAllDuplicates {
	
	public Node deleteDuplicates(Node head){
		
		if(head == null){
			return head;
		}
		
		Node current = head, previous = head;
		
		while(current != null){
			
			if(current.nextNode != null && current.data == current.nextNode.data){
				while(current.nextNode != null && current.data == current.nextNode.data){
					current.nextNode = current.nextNode.nextNode;
				}
				if(previous.data != current.data){
					previous.nextNode = current.nextNode;
					if(previous.nextNode != null){
						current = previous.nextNode;
					}
				}else{
					head = current.nextNode;
					current = head;
					previous = head;
				}
			}else{
				previous = current;
				current = current.nextNode;
			}
		}
		return head;
	}
	
	
	public static void main(String agrs[]) {
		RemoveAllDuplicates list = new RemoveAllDuplicates();
		Node n = new Node(1);
		n.nextNode = new Node(2);
		n.nextNode.nextNode = new Node(3);
		n.nextNode.nextNode.nextNode = new Node(3);
		n.nextNode.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(5);
		Node result = list.deleteDuplicates(n);
		System.out.println(result.data);
		System.out.println(result.nextNode.data);
		System.out.println(result.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.nextNode.data);

	}
}
