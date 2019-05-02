package com.pratice.sort;

/**
 *
Bubble sort:
Starting from the beginning of the list,
 compare every adjacent pair, 
 swap their position if they are not in the right order (the latter one is smaller than the former one). 
 After each iteration, one less element (the last one) is needed to be compared until there are no more elements left to be compared.

Look for the below UI for quick understanding:
http://en.wikipedia.org/wiki/Bubble_sort#/media/File:Bubble-sort-example-300px.gif

 */

public class BubbleSort {
	
	public void bubblest(int[] inputlist){

		int size = inputlist.length;
		int counter = 2;
		while(size!=0){
			for(int i = 0 ; i<=inputlist.length-counter; i++){
				if(inputlist[i]>inputlist[i+1]){
					int temp = inputlist[i];
					inputlist[i] = inputlist[i+1];
					inputlist[i+1] = temp;
				}
			}
			size--;
			counter++;
		}
		for(int i = 0 ; i<= inputlist.length-1;i++){
			System.out.println(inputlist[i]);
		}
	}

	public static void main(String args[]){
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubblest(new int[]{1000,200,300,2,1,4,6,23,12,4});
	}
}
