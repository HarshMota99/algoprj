package com.pratice.sort;

/**

Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. 
Every repetition of insertion sort removes an element from the input data, 
inserting it into the correct position in the already-sorted list, until no input elements remain. 

Graphical explanation
http://en.wikipedia.org/wiki/Insertion_sort#/media/File:Insertion-sort-example-300px.gif
 
*/

public class InsertionSort2 {

	public void sort(int[] inputArr) {

		for(int i = 0; i<=inputArr.length-1;i++){
			int temp = i-1; 
			int j = i;
			while(temp != -1){
				if(inputArr[j] < inputArr[temp]){
					int temp2 = inputArr[j];
					inputArr[j] = inputArr[temp];
					inputArr[temp] = temp2;
					j = temp;
				}
				temp--;
			}
		}
		
		for(int i = 0; i<=inputArr.length-1;i++){
			System.out.println(inputArr[i]);
		}
	}

	public static void main(String args[]) {
		InsertionSort2 insertionSort = new InsertionSort2();
		insertionSort.sort(new int[] { 4, 6, 5,2,10,16,12,1,3 });
	}
}
