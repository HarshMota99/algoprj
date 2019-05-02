package com.pratice.sort;

/**

https://en.wikipedia.org/wiki/Selection_sort#/media/File:Selection-Sort-Animation.gif

64 25 12 22 11

11 64 25 12 22

11 12 64 25 22

11 12 22 64 25

11 12 22 25 64
====

 */


public class SelectionSort {

	public void sort(int[] arrayInput) {

		int leastCounter=0;
		for (int i = 0; i <= arrayInput.length - 1; i++) {
			leastCounter = i;
			for(int j=i;j<=arrayInput.length-1;j++){
				if(arrayInput[j] < arrayInput[leastCounter]){
					leastCounter = j;
				}
			}
			if(i!=leastCounter){
				while(leastCounter!=i){
					int temp = arrayInput[leastCounter];
					arrayInput[leastCounter] = arrayInput[leastCounter-1];
					arrayInput[leastCounter-1] = temp;
					leastCounter--;
				}
			}
		}

		for (int i = 0; i <= arrayInput.length - 1; i++) {
			System.out.println(arrayInput[i]);
		}
	}

	public static void main(String args[]) {
		SelectionSort insertionSort = new SelectionSort();
		insertionSort.sort(new int[] { 64, 25, 12, 22, 11 });
	}
}
