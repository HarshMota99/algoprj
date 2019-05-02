package com.pratice.list.linkedlist.CTCI;


/**
Recursive Approach:

Recurse through the Linked list
When we reach to the end of the list, base case will return 0
Now with each passing back call through stack, add 1 and return.
When count hits k, print the value.

Iterative Approach:

Take two pointers approach
Move first pointer by k
now move both the pointers and when the first pointer reaches the end of the list the second pointer will be at the kth node from the end.
Return the kth node data.

example: 12 nodes and 4th element.
Loop firstcurrent till 4 times. So now current is at 8.
Start one more loop with another pointer to secondcurrent starting from head. Now loop the first current till null. the value of second current will be 4. 

 */



public class ReturnKthToLast {
	
	int count;
	
	public int recursiveApp(Node input, int k){
		
		if(input == null){
			return 0;
		}
		
		Node current = input;
		count = recursiveApp(current.nextNode, k)+1;
		
		if(count == k){
			System.out.println(current.data);
		}
		return count;
	}
	
	public void iterative(Node input, int k){
		
		Node currentfirst = input;
		
		while(k > 0){
			currentfirst = currentfirst.nextNode;
			k--;
		}
		
		Node currentSecond = input;
		
		while(currentfirst != null){
			currentfirst = currentfirst.nextNode;
			currentSecond = currentSecond.nextNode;
		}
		System.out.println(currentSecond.data);
		
	}
	
	
	
	public static void main(String args[]){
		Node n = new Node(1);
		n.nextNode = new Node(2);
		n.nextNode.nextNode = new Node(3);		
		n.nextNode.nextNode.nextNode = new Node(4);
		n.nextNode.nextNode.nextNode.nextNode = new Node(5);
		
		ReturnKthToLast kthToLast = new ReturnKthToLast();
		//kthToLast.recursiveApp(n, 1);
		kthToLast.iterative(n,3);
		
	}
	

}
