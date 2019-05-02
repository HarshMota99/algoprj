package com.pratice.sort;

/**

Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. 
Every repetition of insertion sort removes an element from the input data, 
inserting it into the correct position in the already-sorted list, until no input elements remain. 

Graphical explanation
http://en.wikipedia.org/wiki/Insertion_sort#/media/File:Insertion-sort-example-300px.gif
 
*/
public class InsertionSort {

	public void sort(int[] array) {

		for (int j = 1; j < array.length; j++) { 

			int key = array[j];
			int i = j-1;
			while((i>-1) &&array[i]>key){
				
				array[i+1] = array[i]; 
				i--;
			}
			array[i+1]= key;
			System.out.println("out of while" + array[i + 1]);

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String args[]) {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(new int[] { 4, 6, 5,2 });
	}
}
