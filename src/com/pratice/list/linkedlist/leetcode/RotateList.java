package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

/**
 Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL 

 */
public class RotateList {
public Node rotateRight(Node head, int k) {
        
	Node current = head;
        int temp = current.data;
        while(current != null){
            temp = current.data;
            current = current.nextNode;
            
        }
        
        for(int i=0; i<k;i++){
        	Node newCurrent = head;
        while(newCurrent != null){
            int temp2 = newCurrent.data; // 
            newCurrent.data = temp; 
            temp = temp2;  
            if(newCurrent.nextNode == null){
            	temp = newCurrent.data;
            }
            newCurrent = newCurrent.nextNode;
            
        }
        
        }
   return head;
    }

public static void main(String agrs[]){
	RotateList list = new RotateList();
	Node n = new Node(1);
	n.nextNode = new Node(2);
	n.nextNode.nextNode = new Node(3);
	Node result = list.rotateRight(n, 2);
	System.out.println(result.data);
	System.out.println(result.nextNode.data);
	System.out.println(result.nextNode.nextNode.data);
}
}
