package com.pratice.bst.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.pratice.bst.general.BinarySearchTree;
import com.pratice.bst.general.BinaryTreeNode;

/**
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.
And hasNext() will return true or false.

 

Example:



BSTIterator iterator = new BSTIterator(root);
iterator.next();    // return 3
iterator.next();    // return 7
iterator.hasNext(); // return true
iterator.next();    // return 9
iterator.hasNext(); // return true
iterator.next();    // return 15
iterator.hasNext(); // return true
iterator.next();    // return 20
iterator.hasNext(); // return false
 

Note:

next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.
 */

public class BinarySearchTreeIterator {
	
	/*
	
	
	BinaryTreeNode root;
	BinaryTreeNode prev;
    Stack<BinaryTreeNode> current = new Stack<>();
    public BinarySearchTreeIterator(BinaryTreeNode root) {
        this.root = root;
    }
    
    public int next() {
        int smallestNumber;
        
        if(root.leftnode!=null){
            BinaryTreeNode current = root;
            while(current.leftnode!=null){
            	prev = current;
            	current = current.leftnode;
            }
            smallestNumber = current.data;
            prev.leftnode = null;
            return smallestNumber;
        }else{
            //inOrderRightTraverse(root);
        	 smallestNumber = root.data;
        	root = root.rightnode;
            return smallestNumber;
        }
    }
    
    @return whether we have a next smallest number 
    public boolean hasNext() {
        if(root != null){
           return true;
        }else{
            return false;
        }
    }
   
    */
	
	/* Best Solution is using Queue */
	
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	
	public BinarySearchTreeIterator(BinaryTreeNode root) {
		
		inOrderTreversalQueue(root);
		
	}
	
    private void inOrderTreversalQueue(BinaryTreeNode root) {
		// TODO Auto-generated method stub
    	if(root == null) {
    		return;
    	}
    	inOrderTreversalQueue(root.leftnode);
    	q.add(root);
    	inOrderTreversalQueue(root.rightnode);
	}

    public int next(){
    	
    	int smallestVal = q.peek().data;
    	q.remove();
    	return smallestVal;
    	
    }

    public boolean hasNext() {
    	
    	return q.isEmpty();
    }

	public static void main(String args[]) {
    	
    	
    	BinarySearchTree binarySerachTree = new BinarySearchTree();
		binarySerachTree.insert(7);
		binarySerachTree.insert(3);
		binarySerachTree.insert(15);
		binarySerachTree.insert(9);
		binarySerachTree.insert(20);
		
    	
    	BinarySearchTreeIterator binarySearchTreeIterator = new BinarySearchTreeIterator(binarySerachTree.root);
    	System.out.println(binarySearchTreeIterator.next());
    	System.out.println(binarySearchTreeIterator.next());
    	System.out.println(binarySearchTreeIterator.hasNext());
    	System.out.println(binarySearchTreeIterator.next());
    	System.out.println(binarySearchTreeIterator.hasNext());
    	System.out.println(binarySearchTreeIterator.next());
    	System.out.println(binarySearchTreeIterator.next());
    	System.out.println(binarySearchTreeIterator.hasNext());
    	
    }

}
