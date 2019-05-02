package com.pratice.array.singleArray.leet;

/*
 
Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.
 
 */


public class JumpGame {

    public boolean canJump(int[] nums) {
            int end = nums.length-1;
            if (end < 1) return true;
            
            int max = Integer.MIN_VALUE;
            int next = 0;
            int cur = 0;
            
            while(cur < end) {
                int steps = nums[cur];
                max = cur + steps;
                if (max >= end) return true;
                
                for (int j = 1; j <= steps; j++) {
                    int nextSteps = cur + j;
                    if (nextSteps + nums[nextSteps] >= max) {
                        max = nextSteps + nums[nextSteps];
                        next = j;
                    }
                }
                
                if (next == 0) return false;
                cur += next;
                next = 0;
            }
            
            return cur >= end;
    }
    
    public static void main(String args[]){
    	JumpGame canJump = new JumpGame();
    	System.out.println(canJump.canJump(new int[]{ 4,0,4,2,1,0,1,3,3,0,3}));
    	
    	// 1,1,2,2,0,1,1 true
    	// 1,1,0,1 false
    	// 1,1,1,0 true
    	// 1,3,0,0 true
    	// [5,9,3,2,1,0,2,3,3,1,0,0] true
    	// [4,0,4,2,2,0,1,3,3,0,3] true
    	
    }
}
