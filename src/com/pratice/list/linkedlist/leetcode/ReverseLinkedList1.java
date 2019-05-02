package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

/*
 Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

https://leetcode.com/problems/reverse-linked-list/
 */

public class ReverseLinkedList1 {
	 public Node reverseList(Node head) {
	        if(head == null){
	            return head;
	        }
	        
	        Node current = head, prev = null;
	        
	        while(current!=null){
	        	Node temp = current.nextNode; // 2,3
	        	current.nextNode = prev; // 1->null, 2->1->null,
	            prev = current; // 1, 2
	            current = temp; // 2, 3
	        }
	        
	    return prev;        
	    }
}
