package com.pratice.bst.leetcode;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class IsValidBinaryTree {
	
	// Brute force
	
	Stack<Integer> tempStack = new Stack<Integer>();
    public boolean isValidBST(TreeNode root) {
        
        if(root == null){
            return true;
        }
        if(root.left == null && root.right==null){
            return true;
        }
        
        inOrderTraversal(root);
        
        while(!tempStack.isEmpty()){
            int temp = tempStack.pop();
            if(!tempStack.isEmpty() && temp<=tempStack.peek()){
                return false;
            }
        }
        
        
        return true;
    }
    
    public void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
       
        inOrderTraversal(root.left);
        tempStack.push(root.val);
        inOrderTraversal(root.right);
    }
	
    // Best Solution
    
    public boolean isValidBST2(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
    
    
	public static void main(String args[]) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		IsValidBinaryTree binaryTree = new IsValidBinaryTree();
		
		System.out.println(binaryTree.isValidBST(root));
	}
}
