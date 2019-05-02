package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

public class Test {

	public void test(){

			
}
	public static void main(String args[]){
		
		Node less = new Node(-1);
		Node lessP = less;
		
		less.nextNode = new Node(2);
		less = less.nextNode;
		
		System.out.println();
		
		less.nextNode = new Node(3);
		less = less.nextNode;
		
	}
}
