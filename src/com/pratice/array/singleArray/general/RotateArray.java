package com.pratice.array.singleArray.general;

/*
 Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

public class RotateArray {

	public void rotateArray(int[] input, int rotateBy) {

		for(int i=0;i<rotateBy; i++){
			
			int temp1 = input[0];
			int temp2;
			for(int j=1;j<=input.length-1;j++){
				 temp2 = input[j];
				 input[j]= temp1;
				 temp1 = temp2;
			}
			input[0] = temp1;
		}
		
		for (int i = 0; i <= input.length - 1; i++) {
			System.out.println(input[i]);
		}
	}
	public static void main(String args[]){
		RotateArray array = new RotateArray();
		array.rotateArray(new int[]{1,2,3},2);
	}
}
