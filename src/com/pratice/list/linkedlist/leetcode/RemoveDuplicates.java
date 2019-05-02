package com.pratice.list.linkedlist.leetcode;
/**
 Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
import com.pratice.list.linkedlist.CTCI.Node;

public class RemoveDuplicates {
	
	public Node deleteDuplicates(Node head) {
        if(head == null){
           return head;
       }
       
        Node current = head;
       int diffVal = current.data;
       
       while(current != null){
           
           if(current.nextNode!=null && diffVal != current.nextNode.data){
               diffVal = current.data;
           }
           
           if(current.nextNode != null && current.data == current.nextNode.data){
               current.nextNode = current.nextNode.nextNode;
           }else{
               current = current.nextNode;
           }


       }
       return head;
   }

}
