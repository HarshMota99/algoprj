package com.pratice.list.linkedlist.leetcode;

/*
 Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

import com.pratice.list.linkedlist.CTCI.Node;

public class RemoveLinkedListElements {

	 public Node removeElements(Node head, int val) {
	        if(head == null){
	            return head;
	        }
	        Node cur=head, prev=null;
	        
	        while(cur!=null){
	            if(cur.data==val){
	                if(prev == null){
	                    head = cur.nextNode;
	                    prev = null;
	                    cur = cur.nextNode;
	                }else{
	                    prev.nextNode = cur.nextNode;
	                    cur = cur.nextNode;
	                }
	            }else{
	                prev = cur;    
	                cur = cur.nextNode;
	            }
	        }
	        return head;
	    }
	public static void main(String args[]){
		RemoveLinkedListElements list = new RemoveLinkedListElements();
		Node n = new Node(1);
		n.nextNode = new Node(2);
		n.nextNode.nextNode = new Node(3);
		n.nextNode.nextNode.nextNode = new Node(3);
		n.nextNode.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(5);
		Node result = list.removeElements(n,3);
		System.out.println(result.data);
		System.out.println(result.nextNode.data);
		System.out.println(result.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.data);
		//System.out.println(result.nextNode.nextNode.nextNode.nextNode.nextNode.data);
	}
}
