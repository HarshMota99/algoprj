package com.pratice.array.singleArray.leet;


/*
Check if there is any set of consecutive numbers which can sum to the target 

Example:
{99,99,4,5,5,5, 4}
Target = 15

Result = true. 

Explanation 5+5+5 = 15. 

Asked in my interview
 */


public class ConsecutiveSetOfNumbersTOSum {
	
	public static boolean isSubArray1(int[] nums, int target) {
		boolean result = false;
		if(nums == null || nums.length<1) {
			return result;
		}
		
		int sum = nums[0];
		int start = 0;
		
		if(sum == target) {
			return true;
		}
		
		for(int i=1; i<=nums.length-1; i++) {
			
			sum = sum + nums[i];
			
			if(sum == target) {
				return true;
			}else if (sum > target) {
				
				sum = sum - nums[start];
				start = start +1;
				
			}else {
				continue;
			}
			
			
		}
		

		return result;
	}
	
	public static boolean isSubArray2(int[] inputArray, int target) {
		boolean result = false;
		if(inputArray == null || inputArray.length<1) {
			return result;
		}
		
		int sum = 0;
		int startIndex = 0;
		
		for(int i=0; i<=inputArray.length-1; i++) {
			while(sum > target) {                     // I think this is mostly same as above.. because here it will move only one point
				sum = sum - inputArray[startIndex];
				startIndex++;
			}
			
			if(sum == target) {
				return true;
			}
			
			sum = sum + inputArray[i];
		}
		return result;
	}
	
	
	
	public static void main(String args[]) {
		System.out.println(ConsecutiveSetOfNumbersTOSum.isSubArray2(new int[]{99,99,4,5,5,5, 4}, 15));
	}
	

}
