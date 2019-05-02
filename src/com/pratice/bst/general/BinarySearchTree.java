package com.pratice.bst.general;

import java.util.LinkedList;
import java.util.Queue;
import com.pratice.bst.general.BinaryTreeNode;


/** 
 * 
 * BinarySearchTree's basic concept is all the smaller to root get inserted in left and all bigger to right of the root.
 * For pre, post, inorder and levelorder traversal - look at https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit
 * 
 * Most important - In a binary search tree - InOrder traversal will always give sorted output 
 *
 */

public class BinarySearchTree {
	
	static public BinaryTreeNode root;
	
	public void insert(int data) {

		if (root == null) {
			root = new BinaryTreeNode(data);
			return;
		}

		BinaryTreeNode current;
		current = root;
		if (data <= root.data) {
			
			if (root.leftnode == null) {
				root.leftnode = new BinaryTreeNode(data);
				return;
			} else {
				root = root.leftnode;
				insert(data);
			}
		} else if (data > root.data) {
			current = root;
			if(root.rightnode == null){
				root.rightnode = new BinaryTreeNode(data);
				return;
			}else{
				root = root.rightnode;
				insert(data);
			}
		}
		root = current;
		return;
	}
		

	
	public void printBinaryTree(BinaryTreeNode root){
		
		if(root == null)
		{
			return;
		}
		
		System.out.print("Preorder traversal==>");
		System.out.print("{");
		preorder(root);
		System.out.print("}");
		System.out.println();
		System.out.println();
		
		System.out.print("InOrder traversal==>");
		System.out.print("{");
		inOrder(root);
		System.out.print("}");
		System.out.println();
		System.out.println();
		
		System.out.print("PostOrder traversal==>");
		System.out.print("{");
		postOrder(root);
		System.out.print("}");
		System.out.println();
		System.out.println();
		
		System.out.print("LevelOrder traversal==>");
		System.out.print("{");
		levelOrder(root);
		System.out.println("}");
		
	}
	
	private void preorder(BinaryTreeNode root2) {
		if(root2 == null){
			return;
		}
		System.out.print(root2.data+" , ");
		preorder(root2.leftnode);
		preorder(root2.rightnode);
	}
	
	public void inOrder(BinaryTreeNode root2) {
		if(root2 == null){
			return;
		}
		inOrder(root2.leftnode);
		System.out.print(root2.data+" , ");
		inOrder(root2.rightnode);
	}
	
	private void postOrder(BinaryTreeNode root2) {
		if(root2 == null){
			return;
		}
		postOrder(root2.leftnode);
		postOrder(root2.rightnode);
		System.out.print(root2.data+" , ");
	}

	public void levelOrder(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		int size = 0;
		
		if(root != null){
			queue.add(root);
			size = queue.size();
		}
	
		while(size != 0){
			size --;
			System.out.print(queue.peek().data+" , ");
			queue.remove();
			if(root.leftnode != null){
				queue.add(root.leftnode);
			}
			if(root.rightnode != null){
				queue.add(root.rightnode);
			}
			if(size == 0){
				size = queue.size();
			}
			root = queue.peek();
		}
		
	}

	public static void main(String args[]){
		BinarySearchTree binarySerachTree = new BinarySearchTree();
		binarySerachTree.insert(10);
		binarySerachTree.insert(6);
		binarySerachTree.insert(4);
		binarySerachTree.insert(15);
		binarySerachTree.insert(21);
		binarySerachTree.insert(17);
		binarySerachTree.insert(1);
		binarySerachTree.insert(14);
		binarySerachTree.printBinaryTree(root);

}
}