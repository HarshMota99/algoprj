package com.pratice.array.singleArray.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

Hint:https://www.youtube.com/watch?v=3u59zv-c7go&t=1368s

This is always a follow up question for 2Sum

- So you can use the 2Sum approach as helper
- Always ask question on how this should be unquie triplet.. does the numbers in triplet needs to be unquie or the triplet formed should be unique
- Always sort
- Rest look below commnets



 */

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length<3){
            return result;
        }
        Arrays.sort(nums); // If not sorted.. this will not work
        for(int i=0;i<=nums.length-3;i++){ 
            if(i>0 && nums[i] == nums[i-1]){ // this is main check to see if target is unique for the 2Sum
                continue;
            }
            
            int target = -nums[i]; // We do this to make sure that when we add the rest 2 numbers to this one.. the result becomes zero
            int left = i+1;
            int right = nums.length-1;

            twoSumHelper(nums, left, right, target, result);
        }
    return result;
    }
    
    public static void twoSumHelper(int[] nums,int left,int right,int target,List<List<Integer>> result){
        while(left<right){
            if(target == nums[left]+nums[right]){
                List<Integer> triplets = new ArrayList<>();
                triplets.add(-target);
                triplets.add(nums[left]);
                triplets.add(nums[right]);
                result.add(triplets);
                
                left++;
                right--;

                while(left<right && nums[left] == nums[left-1]){ // this makes sure that there are anymore duplicates inside the sub array
                    left++;
                }
                while(left<right && nums[right] == nums[right+1]){ // this makes sure that there are anymore duplicates inside the sub array
                    right--;
                }
            }else if(target > nums[left]+nums[right]){
                left++;
            }else if(target < nums[left]+nums[right]){
                right--;
            }
        }
    }
	 
	 public static void main(String args[]) {
		 ThreeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
	 }
}
