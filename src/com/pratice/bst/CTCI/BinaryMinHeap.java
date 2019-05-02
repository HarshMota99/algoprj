package com.pratice.bst.CTCI;

/**
 * https://www.youtube.com/watch?v=WCm3TqScBM8&list=RDWCm3TqScBM8&start_radio=1
 *  A binary heap has only 2 conditions
 *  	- Binary heap tree is a complete tree with non-leaf node has exactly 2 children 
 *  	- It can happen that the last level can be in-complete
 *  There are 2 types of binary heap
 *  - Min-heap: All the elements in the child (both left and right) should be greater than the root value.
 *  - Max-heap: All the elements in the child (both left and right) should be smaller than the root value.

Example of Min Heap:

- Input values are 12, 7, 6, 10, 8. For image : https://docs.google.com/document/d/1j7H6IihKgplc2ubbpKrsHHhToztkwkvhRkJ6WjY9Ajw/edit

Here is how the binary min heap is build with the above input values

First in 12 is root
Now 7 is put in its left child. As 7 is smaller 7 is swapped with 12
Now 6 is inserted in the 7 right child, the next spot to make it a complete tree. As 6 is smaller its now swapped with child.
Now 10 is put in the next spot, i.e 12 left child. As 10 is smaller than 12 its swapped. 10 is bigger than 6 its not swapped
Now 8 is put in the next available spot, that is 10 right child. 8 is smaller than 10 its swapped with 10. 8 is bigger than 6, so its not swapped

Algorithm Hint:
https://www.youtube.com/watch?v=fJORlbOGm9Y
1. Formula for finding a children of a node in the array is 2n+1 (gives left child), 2n+2 (gives right child). Here n is the index of the parent in the array.
2. Formula for finding a parent of a child node is n-1/2. Here n is the index of the child node.   

 */


public class BinaryMinHeap {
	int childIndex = -1;
	int[] nodeArray;

	BinaryMinHeap(int totalNodes) {
		nodeArray = new int[totalNodes];
	}

	public void insert(int data) {

		if (nodeArray[0] == 0) {
			nodeArray[0] = data;
			childIndex++;
			return;
		}

		childIndex++;
		nodeArray[childIndex] = data;
		int tempChildIndex = childIndex;
		int parentIndex = findParent(childIndex);
		swap(parentIndex,tempChildIndex);
		
	}
	int findParent(int childIndex) {
		int parentIndex = (childIndex-1) / 2;
		return parentIndex;
	}
	
	public void swap(int parentIndex, int tempChildIndex){
		while (nodeArray[parentIndex] > nodeArray[tempChildIndex] ) {
			int temp;
			
			// Swap the current child and parent
			temp = nodeArray[tempChildIndex];
			nodeArray[tempChildIndex] = nodeArray[parentIndex];
			nodeArray[parentIndex] = temp;
			
			// Once swapped above, now we need to check if the current parent's parent is smaller or not
			tempChildIndex = parentIndex; 
			parentIndex = findParent(parentIndex);
		}
		return;
	}
	
	public void display(){
		for(int i =0; i<=nodeArray.length-1;i++){
			System.out.println(nodeArray[i]);
		}
	}
	public static void main(String args[]){
		BinaryMinHeap binaryMinHeap = new BinaryMinHeap(8);
		binaryMinHeap.insert(12);
		binaryMinHeap.insert(7);
		binaryMinHeap.insert(6);
		binaryMinHeap.insert(10);
		binaryMinHeap.insert(8);
		binaryMinHeap.insert(2);
		binaryMinHeap.insert(18);
		binaryMinHeap.insert(5);
		binaryMinHeap.display();
	}
}
