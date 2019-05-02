package com.pratice.list.linkedlist.leetcode;

/*

https://leetcode.com/problems/copy-list-with-random-pointer/


A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
Return a deep copy of the list.

Input:
{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

Explanation:
Node 1's value is 1, both of its next and random pointer points to Node 2.
Node 2's value is 2, its next pointer points to null and its random pointer points to itself.

 */


class Node {

	int val;
	Node next;
	Node random;
	
	public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
}
}


public class CopyListWithRandomPointers {
	
	 public Node copyRandomList(Node head) {
	        if(head == null){
	            return head;
	        }
	        
	    Node cur = head;
	       
	    
	    // First Weave current node with new Node in fashion like cur1 -> new1 -> cur2 -> new2
	      while(cur != null){
	          
	          Node cloned = new Node();
	          cloned.val = cur.val;
	          cloned.next = cur.next;
	          cur.next = cloned;
	          cur = cur.next.next;
	          
	      } 
	        
	      // Pointing to random
	      cur = head;  
	      while(cur !=null){
	         if(cur.random !=null){
	             cur.next.random = cur.random.next;
	         } 
	         cur = cur.next.next;
	          
	      }
	        
	      // UnWeave cloned from the head
	      Node newHead = head.next;   
	      Node newCurr = newHead;   
	      Node oldCur = head;
	        
	      while(oldCur!=null){
	    	  oldCur.next = newCurr.next;
	        if (oldCur.next != null) {
	            newCurr.next = oldCur.next.next;
	        }
	        oldCur = oldCur.next;
	        newCurr = newCurr.next;
	          
	      }
	    
	        
	        return newHead;
	    }

}
