package com.pratice.array.singleArray.leet;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9, HENCE INDECIES TO return [0, 1].


Hint:
Better way to code this in log(n) is https://www.youtube.com/watch?v=3u59zv-c7go
The above one has 3Sum .. but he explanins 2Sum

Sort array 
i = nums[0] Starting point
j = end of array

if(target == i+j)
return;

else if (target > i+j)
j--
 
else if (target < i+j)
i++  



 */
public class TwoSum {

	/**
	 * 
	 This is the solution comes to mind first. The best is below. 
	 
	 public static int[] twoSum(int[] nums, int target) {
	     
	       int[] resultArr=new int[2];

	       for(int i=0;i<=nums.length-1;i++) {
	    	   int temp1 = nums[i];
	    	   for(int j=nums.length-1;j>i;j--) {
	    		   if(temp1+nums[j]==target){
	    			   resultArr[0]=i;
	    			   resultArr[1]=j;
	    		   }
	    	   }
	       }
	        return resultArr;
	    }
	*/
	
	
	 public static int[] twoSum(int[] nums, int target) {
	     
	       int[] resultArr=new int[2];

	       int left = 0;
	       int right = nums.length-1;
	       
	       while(left<right){
	    	   if(nums[left]+nums[right] == target) {
	    		   resultArr[0] =left;
	    		   resultArr[1] =right;
	    		   return resultArr;
	    	   }
	    	   
	    	   if(target > nums[left]+nums[right]){
	    		   left++;
	    	   }
	    	   
	    	   if(target < nums[left]+nums[right]){
	    		   right--;
	    	   }
	    	   
	       }
	       
	       resultArr[0] =left;
		   resultArr[1] =right;
		   return resultArr;
	    }
	public static void main(String args[]) {
		int[] result = TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
		for(Integer i : result) {
			System.out.println(result[i]);
		}
	}
}
