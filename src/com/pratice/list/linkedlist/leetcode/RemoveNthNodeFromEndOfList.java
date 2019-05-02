package com.pratice.list.linkedlist.leetcode;

import java.util.Map;

import com.pratice.list.linkedlist.CTCI.Node;

/**
Given a linked list, remove the n-th node from the end of list and return its head.

Example:
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.




*/



public class RemoveNthNodeFromEndOfList {
	
	 public Node removeNthFromEnd(Node head, int n) {
	        
		 Node current = head;  
	        int length = 0;
	        while(current != null){
	            length ++;
	            current = current.nextNode;
	        }
	        
	        if(length == 1){
	            head = null;
	            return head;
	        }
	        
	        int valueIndexToDelete = length-n;
	        current = head;
	        
	        if(valueIndexToDelete == 0){
	            current = current.nextNode;
	            return current;
	        }
	        
	        
	        while(valueIndexToDelete > 1 && current != null){
	            current = current.nextNode;
	            valueIndexToDelete --;
	        }
	        
	 
	        if(current!= null && current.nextNode!=null)
	            current.nextNode = current.nextNode.nextNode;
	       
	        return head;
	    }

	 
	 public static void main(String args[]){
		 RemoveNthNodeFromEndOfList endOfList = new RemoveNthNodeFromEndOfList();
		 Node n = new Node(1);
		 n.nextNode = new Node(2);
		 Node result = (endOfList.removeNthFromEnd(n, 2));
		 System.out.println(result.data+" -- "+ result.nextNode.data);
	 }
}
