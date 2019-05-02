package com.pratice.bst.leetcode;

import java.util.Stack;

import com.pratice.bst.general.BinarySearchTree;
import com.pratice.bst.general.BinaryTreeNode;

/**

Given a tree, rearrange the tree in in-order so that the leftmost node 
in the tree is now the root of the tree, and every node has no left child and only 1 right child.

Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9 



 * Hint:Use the Stack
 * 
 * 1. Push all the left nodes of the root to stack
 * 
 * 2. Pop
 * 
 * 2.1 If the popped node has right - push the right node and right nodes all
 * left child. 2.2 If it doesnt have - Pop again
 * 
 * 3. Use the popped nodes to create the result tree
 * 
 */

public class IncreasingOrderSearchTree {

	Stack<BinaryTreeNode> tempStack = new Stack<>();
	BinaryTreeNode resultTree;

	public BinaryTreeNode performIncreasingOrder(BinaryTreeNode root) {

		if (root == null)
			return null;

		BinaryTreeNode current = root;

		// Push all leftnode into stack
		while (current != null) {
			tempStack.push(current);
			current = current.leftnode;
		}
		// Pop stack
		
		while (!tempStack.isEmpty()) {
			BinaryTreeNode currentPopped = tempStack.peek();
			tempStack.pop();
			if (resultTree == null) {
				resultTree = new BinaryTreeNode(currentPopped.data); // Create result tree
			} else {
				// Below code is to add all the elements popped to result trees right node only and keep left node null. To get the above desired output.
				BinaryTreeNode current2 = resultTree;
				while (current2.rightnode != null) {
					current2 = current2.rightnode;
				}
				current2.rightnode = new BinaryTreeNode(currentPopped.data);
				current2.leftnode = null;
			}

			// If Popped has right node. Push the right node and all its left node.
			if ((currentPopped.rightnode) != null) {
				tempStack.push(currentPopped.rightnode);
				BinaryTreeNode current3 = currentPopped.rightnode;
				while (current3.leftnode != null) {
					tempStack.push(current3.leftnode);
					current3 = current3.leftnode;
				}
			}
			

		}
		return resultTree;

	}
	
public static void main(String args[]){

		BinaryTreeNode root = new BinaryTreeNode(5);
		root.leftnode = new BinaryTreeNode(3);
		root.rightnode = new BinaryTreeNode(6);
		root.leftnode.leftnode = new BinaryTreeNode(2);
		root.leftnode.rightnode = new BinaryTreeNode(4);
		root.rightnode.rightnode = new BinaryTreeNode(8);
		root.leftnode.leftnode.leftnode = new BinaryTreeNode(1);
		root.rightnode.rightnode.leftnode = new BinaryTreeNode(7);	
		root.rightnode.rightnode.rightnode = new BinaryTreeNode(9);
		
		BinarySearchTree display = new BinarySearchTree();
		System.out.println("Input");
		display.levelOrder(root);
		System.out.println();
		System.out.println();
		IncreasingOrderSearchTree iost = new IncreasingOrderSearchTree();
		BinaryTreeNode resultTree  = iost.performIncreasingOrder(root);
		System.out.println("OutPut");
		display.levelOrder(resultTree);
		
}

}
