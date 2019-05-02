package com.pratice.bst.CTCI;

/*

1
--
23
--
4567
--

Hint:
Keep a queueSize variable which will hold the level wise leafs count in the queue. 
In the while loop print the leafs of the queue till the size becomes zero. 
Than call recursive to print the rest in the queue by making the first as root and defining the remaining in the queue as queue size.
https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit

 */
import java.util.LinkedList;
import java.util.Queue;

import com.pratice.bst.general.BinaryTreeNode;

public class BinaryTreeSepreator {
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	int qSize;
	public void printWitSep(BinaryTreeNode root) {
		if(root==null){
			return;
		}
		
		q.add(root);
		
		qSize = q.size();
		
		while(qSize > 0){
			printNodes();
			
		}
	}
	
	public void printNodes(){
		
		while(qSize>0){
			BinaryTreeNode tempNode = q.peek();
			System.out.print(tempNode.data);
			q.remove();
			if(tempNode.leftnode != null){
				q.add(tempNode.leftnode);
			}
			if(tempNode.rightnode != null){
				q.add(tempNode.rightnode);
			}
			qSize--;
		}
		qSize = q.size();
		System.out.println();
		System.out.println("--");
		return;		
	}
	
	public static void main(String args[]) {

		BinaryTreeNode root = new BinaryTreeNode(1);
		root.leftnode = new BinaryTreeNode(2);
		root.rightnode = new BinaryTreeNode(3);
		root.leftnode.leftnode = new BinaryTreeNode(4);
		root.leftnode.rightnode = new BinaryTreeNode(5);
		root.rightnode.leftnode = new BinaryTreeNode(6);
		root.rightnode.rightnode = new BinaryTreeNode(7);
		root.leftnode.rightnode.leftnode = new BinaryTreeNode(8);
		BinaryTreeSepreator binaryTreeSepreator = new BinaryTreeSepreator();

		binaryTreeSepreator.printWitSep(root);

	}
}
