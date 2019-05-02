package com.pratice.bst.company.LinkedIn;

import java.util.LinkedList;
import java.util.Queue;

import com.pratice.bst.general.BinaryTreeNode;
import com.pratice.bst.general.BinaryTreeSepreator;

/**
 * 
 * Find all leaves of Binary Tree. 
 * 
 * http://rainykat.blogspot.com/2016/12/leetcodelinkedin-366-find-leaves-of.html
 * [3, 4, 5], [2], [1].
 * 
 * Hint: Go with DFS / Depth First Search (Preorder only) to find the leave nodes For deleting
 * keep track of the parent and using the parent delete its child.
 * https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit
 */

public class FindLeavesOfBinaryTree {

	BinaryTreeNode root;
	BinaryTreeNode parent;
	
	private FindLeavesOfBinaryTree(BinaryTreeNode root) { // Constructor to set root node
		this.root = root;
	}
	
	public void perform(BinaryTreeNode root){
		while(root != null && (root.leftnode!=null || root.rightnode != null)){ // this loop is going to help us again come back to start once that iterations set of leaves are deleted. Because pre-order travelsal will complete in short. But we want to keep doing pre-order till all the level of leafs are deleted.
			System.out.print("{");
			leaveSearch(root, parent);
			System.out.print("}");
			System.out.println();
		}
		System.out.println("{"+root.data+"}");
	}
	
	public void leaveSearch(BinaryTreeNode current, BinaryTreeNode parent){
		
		if(current == null){ // this helps to move from left to right once leaveSearch(current.leftnode, current) becomes null in recurssion, so move to leaveSearch(current.rightnode, current). And once leaveSearch(current.rightnode, current) becomes null, now move to parent right which is in this case 2 -> 3 once 4 & 5 are deleted. 
			return;
		}
		deleteChild(current,parent); // As this works with pre-order treversal.. hence the logic of deletechild first
		leaveSearch(current.leftnode, current);
		leaveSearch(current.rightnode, current);
		// Print the found leaf and keep track of parent
	}
		
	private void deleteChild(BinaryTreeNode current, BinaryTreeNode parent) {
		if (current == null) {
			return;
		}
		if (current.leftnode == null && current.rightnode == null) { // check if this is last node 
			if (current == parent.leftnode) { // check if current is parents left node
				System.out.print(parent.leftnode.data);
				parent.leftnode = null; // delete
			} else if (current == parent.rightnode) { // check if current is parents right node
				System.out.print(parent.rightnode.data);
				parent.rightnode = null; // delete
			}
		}
	}

	public static void main(String args[]) {

		BinaryTreeNode root = new BinaryTreeNode(1);
		root.leftnode = new BinaryTreeNode(2);
		root.rightnode = new BinaryTreeNode(3);
		root.leftnode.leftnode = new BinaryTreeNode(4);
		root.leftnode.rightnode = new BinaryTreeNode(5);
		root.rightnode.leftnode = new BinaryTreeNode(6);
		root.rightnode.rightnode = new BinaryTreeNode(8);
		root.rightnode.leftnode.leftnode = new BinaryTreeNode(7);
		//root.leftnode.rightnode.leftnode = new BinaryTreeNode(8);
		FindLeavesOfBinaryTree binaryTreeSepreator = new FindLeavesOfBinaryTree(root);

		binaryTreeSepreator.perform(root);
	}
}
