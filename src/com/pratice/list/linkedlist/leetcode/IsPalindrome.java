package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

public class IsPalindrome {
	
	public boolean isPalindrome(Node head) {
		boolean result = false;
		if(head == null) {
			return result;
		}
		
		if(head.nextNode == null) {
			return true; 
		}
		
		Node mid = findMid(head);
		Node second = mid.nextNode;
		mid.nextNode = null;
		second = reverse(second);
		
		while(head != null || second !=null){
			
			
		}
		
		return result;
	}

	private Node reverse(Node second) {

		Node current = second;
		Node prev = null;
		Node temp = null;
		while(current != null) {
			temp = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = temp;
		}
		
		return prev;
	}

	private Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast.nextNode !=null && fast.nextNode.nextNode!=null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
		}
		return slow;
	}
	
	public static void main(String args[]) {
		IsPalindrome isPalindrome = new IsPalindrome();
		
		
		Node n = new Node(1);
		n.nextNode = new Node(2);
		n.nextNode.nextNode = new Node(3);
		n.nextNode.nextNode.nextNode = new Node(2);
		n.nextNode.nextNode.nextNode.nextNode = new Node(1);
		isPalindrome.isPalindrome(n);
	}

}
