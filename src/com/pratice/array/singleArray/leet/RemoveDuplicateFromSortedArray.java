package com.pratice.array.singleArray.leet;

/**
 
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.

Example 2:
Given nums = [0,0,1,1,1,2,2,3,3,4],
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.


Hint:

Slow Runner Faster Runner way




 */

public class RemoveDuplicateFromSortedArray {

	public static int[] removeDuplicate(int[] input) {
		if(input == null || input.length<1) {
			return input;
		}
		
		int i=0;
		for(int j=1; j<=input.length-1; j++) {
			if(input[i] != input[j]) {
				i++;
				input[i]=input[j];
			}
		}
		
		return input;
		
		// In case we want to return the length of the new array, we iterate once again till the next numner is smaller the current and that will be the length
		/*
		 * int lengthCounter = 0;
		for(int j=0; j<=input.length-1;j++) {
			lengthCounter++;
			if(j<=input.length-2 && j<j+1){
				break;
			}
			
		}
		return lengthCounter;
		*/
		
		
	}
	public static void main(String args[]) {
		int[] result = RemoveDuplicateFromSortedArray.removeDuplicate(new int[] {0,0,0,1,2,3,4,4});
		for(int i: result) {
			System.out.println(i); // Notice as we are doing a inmemory change to array without creating a new array... the remaining items in the array will still appear. 
		}
	}
}
