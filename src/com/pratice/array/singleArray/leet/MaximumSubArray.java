package com.pratice.array.singleArray.leet;

/*
Given an integer array nums, find the continuous sub-array (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] is the continuous sub-array with largest sum = 6.

Input: [-2,1,-3,4,-1,2,1,-5,7],
Output: 6
Explanation: [4,-1,2,1,-5,7] is the continuous sub-array with largest sum = 8.
*/

public class MaximumSubArray {
	    public int maxSubArray(int[] nums) {
	        
	        int higestSum=Integer.MIN_VALUE, tempSum = Integer.MIN_VALUE;
	        
	        for(int i=0; i<=nums.length-1;i++){
	        	tempSum = nums[i] ;
	            if(tempSum > higestSum){
	               higestSum = nums[i]; 
	            }
	            for(int j=i+1; j<=nums.length-1;j++){
	            	tempSum = tempSum  + nums[j];
	                if(tempSum > higestSum ){
	                    higestSum = tempSum;
	                }
	            }
	        }
	        
	       return  higestSum;
	}
	    public static void main(String args[]) {
	    	MaximumSubArray array = new MaximumSubArray();
	    	System.out.println(array.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,7})); 
	    
	    }
}
