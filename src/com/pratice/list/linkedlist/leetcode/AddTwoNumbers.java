package com.pratice.list.linkedlist.leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

Output: 7 -> 0 -> 8


 */
import com.pratice.list.linkedlist.CTCI.Node;

public class AddTwoNumbers {
	public static Node addTwoNumbers(Node l1, Node l2) {
		Node result = null;
		if(l1==null && l2==null) {
			return result;
		}
		
		Node prev = null;
		Node cur1 = l1;
		Node cur2 = l2;
		
		
		int cur1Data = 0;
		int cur2Data = 0;
		int reminder =0;
		int carryFwd =0;
		
		while(cur1!=null || cur2!=null || carryFwd!=0) { // Loop even if any of the value is present
			if(cur1==null) {
				cur1Data =0;
			}else {
				cur1Data = cur1.data;
			}
			if(cur2==null) {
				cur2Data =0;
			}else {
				cur2Data = cur2.data;
			}
			int temp = cur1Data+cur2Data+carryFwd;
			carryFwd = 0; // We set this to zero, just to make sure that if this is not set below again, the same value should not carry over again.
			
			if(temp>9) {
				reminder = temp %10;
				carryFwd = temp /10;
				if(result==null) {
					result = new Node(reminder);
					prev = result;
				}else {
					prev.nextNode = new Node(reminder);
					prev = prev.nextNode;
				}
			}else {
				if(result == null) {
					result = new Node(temp);
					prev = result;
				}else {
					prev.nextNode = new Node(temp);
					prev = prev.nextNode;
				}
			}
			if(cur1 != null) {
				cur1 = cur1.nextNode;
			}
			if(cur2 != null){
				cur2 = cur2.nextNode;
			}
		}
		
		
		return result;
	    }

	public static void main(String args[]) {

		Node n1 = new Node(9);
		n1.nextNode = new Node(9);
		n1.nextNode.nextNode = new Node(9);
		

		Node n2 = new Node(9);
		n2.nextNode = new Node(9);
		n2.nextNode.nextNode = new Node(9);
		
		
		AddTwoNumbers.addTwoNumbers(n1, n2);

	}
}
