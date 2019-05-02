package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

/*
 Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
 */

public class ReverseLinkedList2 {
	
    public Node reverseBetween(Node head, int m, int n) {
        
        if(head == null || head.nextNode == null){
            return head;
        }
  
        // Move the two pointers until they reach the proper starting point
        // in the list.
        int counter = 1;
        Node current = head, prev = null;
        
        while(m > counter){
        	prev = current;
        	current = current.nextNode;
        	counter++;
        }

        // Reverse until the nth nth node
        
        Node con = prev; // holder for the connection
        Node tail = current; // holder for the connection
        
        Node temp;
        while(counter <= n){
        	temp = current.nextNode; // assign the next node to temp
        	current.nextNode = prev;
        	prev = current;
        	current = temp;
        	counter++;
        }
        
        con.nextNode = prev;
        tail.nextNode = current;
        return head;
    }

    public static void main(String agrs[]){
    	ReverseLinkedList2 list = new ReverseLinkedList2();
    	Node n = new Node(1);
    	n.nextNode = new Node(2);
    	n.nextNode.nextNode = new Node(3);
    	n.nextNode.nextNode.nextNode = new Node(4);
    	n.nextNode.nextNode.nextNode.nextNode = new Node(5);
    	Node result = list.reverseBetween(n, 2, 4);
    	System.out.println(result.data);
    	System.out.println(result.nextNode.data);
    	System.out.println(result.nextNode.nextNode.data);
    	System.out.println(result.nextNode.nextNode.nextNode.data);
    	System.out.println(result.nextNode.nextNode.nextNode.nextNode.data);
    }
    
}
