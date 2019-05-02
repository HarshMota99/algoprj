package com.pratice.list.linkedlist.leetcode;
/*
 Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example:

Input: head = 1->4->3->2->5->2, x = 3
Output: 1->2->2->4->3->5

Example:

Input: head = [6,10,7,11,9,5,4], x = 9
Output: 6,7,5,4,10,11,9

 */
import com.pratice.list.linkedlist.CTCI.Node;

public class PartitionList {
	
	public Node partition(Node head, int x){
		Node less = new Node(-1);
		Node more = new Node(-1);
		Node lessP = less;
		Node moreP = more;
		Node cur = head;
		
		while(cur != null){
			if(cur.data < x){
				less.nextNode=cur;
				less = less.nextNode;
			}else{
				more.nextNode = cur;
				more = more.nextNode;
			}
			cur = cur.nextNode;
		}
		more.nextNode = null;
		less.nextNode = moreP.nextNode;
		return lessP.nextNode;
	}
	
	public static void main(String agrs[]) {
		
	//	[6,10,7,11,9,5,4,9]
		
		PartitionList list = new PartitionList();
		Node n = new Node(6);
		n.nextNode = new Node(10);
		n.nextNode.nextNode = new Node(7);
		n.nextNode.nextNode.nextNode = new Node(11);
		n.nextNode.nextNode.nextNode.nextNode = new Node(9);
		n.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(5);
		n.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(4);
		Node result = list.partition(n, 9);
		System.out.println(result.data);
		System.out.println(result.nextNode.data);
		System.out.println(result.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.nextNode.data);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.data);
	}

}
