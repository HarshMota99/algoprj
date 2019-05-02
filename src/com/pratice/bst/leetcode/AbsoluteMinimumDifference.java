package com.pratice.bst.leetcode;

import com.pratice.bst.CTCI.BinaryTreeSepreator;
import com.pratice.bst.general.BinarySearchTree;
import com.pratice.bst.general.BinaryTreeNode;

/*
 Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 
 https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 
 
 Hint:
 
 BinaryTreeSearch when taversed inOrdered gives a proper sorted elements.
 With sorted elements if we substract each one with next value we will get minimum.
 For example below input value 
 
 When value 10,6,4,8,16,14 are inserted in BST and when traveresed in Order they will be
 4,6,8,10,14,16 because InOrder will give sorted list. 
 Now 6-4 = 2, 8-2=2, 10-8=2 only consecutive needs to be checked because only they will have mim diffrence. And the mim of that wil be answer.
 
 
 */
public class AbsoluteMinimumDifference {
	  private int res = Integer.MAX_VALUE;
	    private BinaryTreeNode prev = null;
	    public int getMinimumDifference(BinaryTreeNode root) {
	        inorder(root);
	        return res;
	    }
	    
	    public void inorder(BinaryTreeNode root) {
	    	if(root == null) {
	    		return;
	    	}
	    	inorder(root.leftnode); // this will go till the end of the left node. After that in every iteration of right it will again check for left and go till end.
	    	if(prev!=null){
	    		res = Math.min(res, root.data-prev.data); // Here we are doing the mim as well together. We can also do it separately like.. add the values in int[] and than traverse for getting mim by substracting.
	    	}
	    	prev = root;
	    	inorder(root.rightnode);
	    }
	    
		public static void main(String args[]) {

			BinarySearchTree binarySerachTree = new BinarySearchTree();
			binarySerachTree.insert(10);
			binarySerachTree.insert(6);
			binarySerachTree.insert(4);
			binarySerachTree.insert(16);
			binarySerachTree.insert(8);
			binarySerachTree.insert(14);

			
			AbsoluteMinimumDifference absoluteMinimumDifference = new AbsoluteMinimumDifference();
			binarySerachTree.levelOrder(binarySerachTree.root);
			System.out.println();
			System.out.println(absoluteMinimumDifference.getMinimumDifference(binarySerachTree.root));

		}

}
