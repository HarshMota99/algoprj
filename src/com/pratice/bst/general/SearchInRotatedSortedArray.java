package com.pratice.bst.general;


/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1


Hint:
Based on logic - https://www.youtube.com/watch?v=5BI0Rdm9Yhk

1. Find the pivot
   This is done by finding the point from where the number started to decrease in the array.
   So the number which is less the previous is the pivot
   
2. Now check the number to be found is in left of the pivot or right

3. Binary search on that part of the array as its sorted


 */


public class SearchInRotatedSortedArray {
	
	
	/*
	
	Based on logic - https://www.youtube.com/watch?v=5BI0Rdm9Yhk
	
	
	static int pivot = 0;
	static int result = 0;

	public static int search(int[] nums, int target) {

		if (nums == null || nums.length <= 1) {
			return -1;
		}

		int s = 0;
		int e = nums.length - 1;
		

		if (nums[e] > nums[s]) {
			pivot = 0;
		} else {
			findPivot(nums, s, e);
		}

		if (target == nums[pivot]) {
			return pivot;
		} else if (target > nums[pivot] && target > nums[e]) {
			e = pivot - 1;
		} else {
			s = pivot + 1;
		}

		findResult(nums, s, e, target);

		return result;

	}

	public static void findPivot(int[] nums, int s, int e) {
		
		if(s>e) {
			pivot = 0+(nums.length-0) / 2;
			return;
		}

		int middle = s + (e - s) / 2;

		if (nums[middle] > nums[middle + 1]) {
			pivot =middle + 1; 
			return ;
		} else if (nums[s] < nums[middle]) {
			s = middle + 1;
			findPivot(nums, s, e);
		} else {
			e = middle - 1;
			findPivot(nums, s, e);
		}

		return;
	}

	public static void findResult(int[] nums, int s, int e, int target) {
		
		if(s>e) {
			result = -1;
			return;
		}

		int middle = s + (e - s) / 2;

		if (target == nums[middle]) {
			result = middle;
			return ;
		} else if (target < nums[middle]) {
			findResult(nums, s, middle - 1, target);
		} else {
			findResult(nums, middle + 1, e, target);
		}

		return ;
	}


*/
	
	// Better solution
	
	// So the whole idea is to get that portion of array where the target exists and than binary search on it. 
	// And the array is always divided at the pivot where the number sequence starts decreasing.
	
	
	
	public static int search(int[] nums, int target) {
	       int start = 0;
	        int end = nums.length - 1;
	        while (start <= end){                                    // This is to loop till both end meets. 
	            int mid = (start + end) / 2;						 // First we are getting the mid
	            if (nums[mid] == target)
	                return mid;
	        
	            if (nums[start] <= nums[mid]){						// This is just for iterating the array left side/
	                 if (target < nums[mid] && target >= nums[start])  // This is the actual place which decides which side the target exists and sets the next start and end.
	                    end = mid - 1;
	                 else
	                    start = mid + 1;
	            } 
	        
	            if (nums[mid] <= nums[end]){
	                if (target > nums[mid] && target <= nums[end])
	                    start = mid + 1;
	                 else
	                    end = mid - 1;
	            }
	        }
	        return -1;
	}
	public static void main(String args[]) {
		//System.out.println(SearchInRotatedSortedArray.search(new int[] {5,6,7,8,9,10,11,1,2,3,4}, 15));
		System.out.println(SearchInRotatedSortedArray.search(new int[] {4,5,1,2,3,4}, 3));
	}

}
