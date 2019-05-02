package com.pratice.list.linkedlist.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.pratice.list.linkedlist.CTCI.Node;

public class MergeTwoSortedList {
	
	/**
	 * 
	The below solution came to mind first. It works perfect. But the problem happens in the below case

	Input
	[5]
	[1,2,4]

	Output with below is 
	[1,5,2,4]
	
	Expected was
	[1,2,4,5]
	
	public static Node mergeList(Node l1, Node l2){
		
		Node result = null;
		Node prev = null;
		Node cur1 = l1;
		Node cur2 = l2;
		
		
		while(cur1 != null && cur2 !=null) {
			
			if(cur1.data < cur2.data) {
				if(result == null) {
					result = new Node(cur1.data);
					result.nextNode = new Node(cur2.data);
					prev = result.nextNode; 
				}else {
					prev.nextNode = new Node(cur1.data);
					prev.nextNode.nextNode = new Node(cur2.data);
					prev = prev.nextNode.nextNode; 
				}
			}else{
				if(result == null) {
					result = new Node(cur2.data);
					result.nextNode = new Node(cur1.data);
					prev = result.nextNode;  
				}else {
					prev.nextNode = new Node(cur2.data);
					prev.nextNode.nextNode = new Node(cur1.data);
					prev = prev.nextNode.nextNode; 
				}
			}
			cur1 = cur1.nextNode;
			cur2 = cur2.nextNode;
		}
		
		if(cur1 == null){
			prev.nextNode = cur2;
		}else if(cur2 == null) {
			prev.nextNode = cur1;
		}
		
		return result;
	}
	
	*/
	
	
	public static Node mergeList(Node l1, Node l2) {

		Node ML = new Node(-1); // Rather than making is null and check for null and start as above. Just start as -1 and when return the ML.next
		Node mergedList = ML;

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				mergedList.nextNode = l2;
				break;
			} else if (l2 == null) {
				mergedList.nextNode = l1;
				break;
			} else {
				if (l1.data < l2.data) {
					mergedList.nextNode = new Node(l1.data);
					mergedList = mergedList.nextNode; // Only added one node and Only increment the added node to next, instead of both as above
					l1 = l1.nextNode; 
				} else {
					mergedList.nextNode = new Node(l2.data);
					mergedList = mergedList.nextNode; // Only added one node and Only increment the added node to next, instead of both as above
					l2 = l2.nextNode; 
				}
			}
		}
		return ML.nextNode;
	}


	
	
	
	
	public static void main (String args[]) {
		
		
		Node n1 = new Node(1);
		n1.nextNode = new Node(2);
		n1.nextNode.nextNode = new Node(3);
		

		Node n2 = new Node(2);
		n2.nextNode = new Node(3);
		n2.nextNode.nextNode = new Node(5);
		MergeTwoSortedList.mergeList(n1, n2);
		
	}
	

}
