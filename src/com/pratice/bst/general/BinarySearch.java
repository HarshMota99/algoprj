package com.pratice.bst.general;

import java.util.Arrays;

/**
Binary Search: Binary search is an efficient algorithm for finding an item from a sorted list of items. 
It works by repeatedly dividing in half the portion of the list that could contain the item, 
until you've narrowed down the possible locations to just one.  

Hint:
- For binary search its important to have the array sorted first
- Start with 0 and length
- Formula for mid = x+(y-x/2)
- left recursive x mid
- right recursive mid+1 
- Also look at the if condition of target present in first half or second half
 */

public class BinarySearch {

	int mid;
	public void search(int[] input, int x, int y,int target) {
		
		if(input.length<-1){
			return;
		}
		Arrays.sort(input);
		mid = x+ (y-x)/2;
		
		if(target==input[mid]){
			System.out.println("Found taget @ position"+mid);
			return;
		}else if (target<input[mid]){
			search(input,0,mid-1,target);
		}else if(target>input[mid]){
			search(input,mid+1,input.length-1,target);
		}
		return;

	}

	public static void main(String args[]) {
		BinarySearch BS = new BinarySearch();
		BS.search(new int[] { 1,2},0,1, 2);
	}

}
