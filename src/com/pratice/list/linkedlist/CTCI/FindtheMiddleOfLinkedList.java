package com.pratice.list.linkedlist.CTCI;

/**
2 variants:
	- Head/root node is passed
	- Only the node to be deleted is given and we don't have access to head/root node


Head/root node is passed:
Simple way is to traverse first time and get count and than divide by 2. Here its n2.
Best way is to keep 2 pointer. Increment first with 2 node and 2nd pointer only once. 

Only the node to be deleted is given:
	// Find next node using next pointer
    struct Node *temp  = node_ptr->next;

    // Copy data of next node to this node
    node_ptr->data  = temp->data;

    // Unlink next node
    node_ptr->next  = temp->next;

    // Delete next node
    free(temp);

*/

public class FindtheMiddleOfLinkedList {

	static public void findMiddleWithRoot(Node root){
		
		if(root == null){
			return;
		}
		
		if(root.nextNode == null){
			root.nextNode = null;
			return;
		}
		
		Node fastpt = root;
		Node slowpt = root;
		
		Node prev = null;
		while(fastpt != null && fastpt.nextNode != null){
			fastpt = fastpt.nextNode.nextNode;
			prev = slowpt;
			slowpt = slowpt.nextNode;
		}
		prev.nextNode = slowpt.nextNode;
		slowpt = null;
		return;
	}
	
	static public void findMiddleWithOutRoot(Node n){
		
		Node next = n.nextNode;
		n.data = next.data;
		n.nextNode = next.nextNode;
		next = null;
		return;
		
	}
	
	public static void main(String args[]){
		Node n = new Node(1);
		n.nextNode = new Node(2);
		n.nextNode.nextNode = new Node(3);		
		n.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode = new Node(5);
		
		//findMiddleWithRoot(n);
		findMiddleWithOutRoot(n.nextNode.nextNode);
		
	}
}
