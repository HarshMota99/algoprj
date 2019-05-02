package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

public class MergeList {

		 public static Node mergeTwoLists(Node l1, Node l2) {
		        
			 Node ML = new Node(-1);
			 Node mergedList = ML;
		        
		        while(l1!=null || l2!=null){
		           if(l1==null){
		               mergedList.nextNode = new Node(l2.data);
		               mergedList = mergedList.nextNode;
		               l2 = l2.nextNode;
		           }else if(l2==null){
		               mergedList.nextNode = new Node(l1.data);
		               mergedList = mergedList.nextNode;
		               l1 = l1.nextNode;
		           }else{
		               if(l1.data<l2.data){
		                   mergedList.nextNode = new Node(l1.data);
		                   mergedList = mergedList.nextNode;
		                   l1 = l1.nextNode;
		               }else{
		                   mergedList.nextNode = new Node(l2.data);
		                   mergedList = mergedList.nextNode;
		                   l2 = l2.nextNode;
		               }
		           }       
		            
		        }
		        
		 
		        return ML.nextNode;
		    }
	 public static void main(String args[]) {

			Node n2 = new Node(-10);
			n2.nextNode = new Node(-10);
			n2.nextNode.nextNode = new Node(-9);
			n2.nextNode.nextNode.nextNode = new Node(-4);
			n2.nextNode.nextNode.nextNode.nextNode = new Node(1);
			n2.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(6);
			n2.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(6);

			Node n1 = new Node(-7);
			n1.nextNode = new Node(5);
			
			MergeList.mergeTwoLists(n1, n2);
			
		}
}
