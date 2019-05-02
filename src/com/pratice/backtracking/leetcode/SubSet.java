package com.pratice.backtracking.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*

Also got this question in my interview

Given a set of distinct integers, nums, return all possible subsets (the power set).
Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]


Very Important Note:
All the below problems can be solved with just same approach of backtracking

Subset
Subsets : https://leetcode.com/problems/subsets/
Permutations : https://leetcode.com/problems/permutations/
Combination Sum : https://leetcode.com/problems/combination-sum/
Palindrome Partitioning : https://leetcode.com/problems/palindrome-partitioning/

And the master of this is https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)



 */


public class SubSet {


	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		//System.out.println(tempList);
		for (int i = start; i < nums.length; i++) {
			//if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}



	/* Important read
	 * Solution written during interview
	 * Solution works perfect for most of the values, however one value gets missed that 1,3.  
	 * Hence above is best for back track and get that value


	public static Set<Set<Integer>> generatePowerSet(int[] nums) {

		Set<Set<Integer>> result = new HashSet<Set<Integer>>();

		result.add(new HashSet<Integer>());
		// result.add(new ArrayList<Integer>()); // Place holder for empty power set

		for (int i = 1; i <= nums.length; i++) {

			generateSets(nums, i, result);

		}

		return result;
	}

	public static void generateSets(int[] nums, int target, Set<Set<Integer>> result) {

		for (int i = 0; i <= nums.length - 1; i++) {

			int counter = i;
			Set<Integer> temp = new HashSet<Integer>();

			for (int j = 0; j < target; j++) {

				if (counter > nums.length - 1) {
					counter = 0;
				}
				temp.add(nums[counter]);
				counter++;

			}
			result.add(temp);

		}

		return;
	}

*/
	public static void main(String args[]) {

		System.out.println(SubSet.subsets(new int[] { 1, 2, 3 }));
		//System.out.println(SubSet.subsets(new int[] { 1,1, 2, 3 }));

	}

}
