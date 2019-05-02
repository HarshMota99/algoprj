package com.pratice.bst.CTCI;

import com.pratice.bst.general.BinarySearchTree;

/**

Objective: Given a sorted array with unique elements, 
Create a binary search tree with minimal height.

Why minimal height is important :

We can do the linear scan to the array and make the first element as root and 
insert all other elements into the tree but in that case tree will be skewed , 
which means all the nodes of the tree will be on the one side of the root 
so the height of the tree will be equal to the number of elements in the array. 
So here our objective is to keep the tree balanced as much as possible.

For image : https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit

Hint: 
Add the middle element as root of BST.
Call the left half recursively. Which will again add the middle of the left half array to the binary tree. and so on.
Call the right half recursively. Which will again add the middle of the right half array to the binary tree. and so on.
 
Binary Search Hint:

- Start with 0 and length
- Formula for mid = x+(x+y/2)
- left recursive x mid
- right recursive mid+1 y
- Most important is breaking the recurrision condition y<=x
 */

public class BinaryTreeWithMinimumHeight {
	
	static BinarySearchTree BST = new BinarySearchTree();
	
	public void createMinimumHeightBST(int[] input, int x, int y){
		
		if(y<=x){
			return;
		}
		
		int mid = x+((y-x)/2);
		
		BST.insert(input[mid]);
		createMinimumHeightBST(input, x, mid);
		createMinimumHeightBST(input, mid+1, y);
	}
	public static void main(String args[]){
		BinaryTreeWithMinimumHeight BTWH = new BinaryTreeWithMinimumHeight();
		BTWH.createMinimumHeightBST(new int[]{1,2,3,4,5,6,7},0,7);
		BST.inOrder(BST.root);
	}

}
