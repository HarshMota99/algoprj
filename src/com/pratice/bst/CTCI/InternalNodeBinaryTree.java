package com.pratice.bst.CTCI;

/**
 * Print the internal node. Internal node is a node which is not on the exterior side and has atleast one child.
 * https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit
 */
import java.util.LinkedList;
import java.util.Queue;

import com.pratice.bst.general.BinaryTreeNode;

public class InternalNodeBinaryTree {
	
	Queue<BinaryTreeNode> binaryQueue = new LinkedList<>();
	int qSize;
	
	public void findInternalNode(BinaryTreeNode root){
		
		binaryQueue.add(root);
		qSize = binaryQueue.size();
		
		while(qSize!=0){
			printInternalNode();
		}
		
	}

	private void printInternalNode() {

		boolean first = false;

		while (qSize != 0) {
			BinaryTreeNode temp = binaryQueue.peek();
			binaryQueue.remove();
			if (first && qSize != 1) {
				if (temp.leftnode != null || temp.rightnode != null) {
					System.out.println("Internal node : " + temp.data);
				}
			}
			if (temp.leftnode != null) {
				binaryQueue.add(temp.leftnode);
			}
			if (temp.rightnode != null) {
				binaryQueue.add(temp.rightnode);
			}
			qSize--;
			first = true;
		}
		qSize = binaryQueue.size();
	}




	public static void main(String args[]) {

		BinaryTreeNode root = new BinaryTreeNode(1);
		root.leftnode = new BinaryTreeNode(2);
		root.rightnode = new BinaryTreeNode(3);
		root.leftnode.leftnode = new BinaryTreeNode(4);
		root.leftnode.rightnode = new BinaryTreeNode(5);
		root.rightnode.leftnode = new BinaryTreeNode(6);
		root.rightnode.rightnode = new BinaryTreeNode(7);
		root.leftnode.leftnode.leftnode = new BinaryTreeNode(8);
		root.leftnode.leftnode.rightnode = new BinaryTreeNode(9); // But it should print this one.. because its inside and as one child 16
		root.leftnode.rightnode.leftnode = new BinaryTreeNode(10);
		root.leftnode.rightnode.rightnode  = new BinaryTreeNode(11);
		root.rightnode.leftnode.leftnode = new BinaryTreeNode(12);
		root.rightnode.leftnode.rightnode  = new BinaryTreeNode(13);
		root.rightnode.rightnode.leftnode = new BinaryTreeNode(14);
		root.rightnode.rightnode.rightnode  = new BinaryTreeNode(15);
		root.rightnode.rightnode.rightnode.leftnode  = new BinaryTreeNode(30); // it should not print this one as its outside
		root.leftnode.leftnode.leftnode = new BinaryTreeNode(20); // it should not print this one as its outside
		
		root.leftnode.leftnode.rightnode.leftnode = new BinaryTreeNode(16); 
		
		InternalNodeBinaryTree binaryTreeSepreator = new InternalNodeBinaryTree();
		binaryTreeSepreator.findInternalNode(root);

	}
}
