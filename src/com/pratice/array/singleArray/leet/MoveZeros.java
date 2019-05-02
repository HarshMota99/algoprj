	package com.pratice.array.singleArray.leet;

/*
 * 
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class MoveZeros {

	public static int[] moveZeroes(int[] nums) {
		int flag = 0;
		for (int i = 0; i < nums.length; i++) { // Put all non zero to the front
			if (nums[i] != 0) {
				nums[flag] = nums[i];
				flag++;
			}
		}
		for (int i = flag; i < nums.length; i++) { // Make all the remaining to 0
			nums[i] = 0;
		}
		
		return nums;
	}

	/**
	 
	 Second solution. The above one is much faster. The below one is the one which I thought first. 
	 
	 public void moveZeroes(int[] nums) {
     
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] == 0){
                for(int j=i+1;j<=nums.length-1;j++){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] =0;
                        break;
                    }
                }    
            }
            
        }
	 
	 
	 */
	
	
	public static void main(String args[]) {
		MoveZeros.moveZeroes(new int[] {0,1,0,3,12});
	}
	
}
