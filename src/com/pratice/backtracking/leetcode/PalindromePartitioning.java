package com.pratice.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

Example:

Input: "aabb"
Output: See the way it backtracked... s
[
	[a, a, b, b], 
	[a, a, bb], 
	[aa, b, b], 
	[aa, bb]
]

Subset
Subsets : https://leetcode.com/problems/subsets/
Permutations : https://leetcode.com/problems/permutations/
Combination Sum : https://leetcode.com/problems/combination-sum/
Palindrome Partitioning : https://leetcode.com/problems/palindrome-partitioning/

And the master of this is https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)

 */


public class PalindromePartitioning {

	public static List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), s, 0);
		return list;
	}

	public static void backtrack(List<List<String>> list, List<String> tempList, String s, int start) {
		if (start == s.length())
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < s.length(); i++) {
				if (isPalindrome(s, start, i)) {
					tempList.add(s.substring(start, i + 1));
					backtrack(list, tempList, s, i + 1);
					tempList.remove(tempList.size() - 1);
				}
			}
		}
	}

	public static boolean isPalindrome(String s, int low, int high) {
		while (low < high)
			if (s.charAt(low++) != s.charAt(high--))
				return false;
		return true;
	}

	public static void main(String args[]) {

		System.out.println(PalindromePartitioning.partition("aabb"));

	}

}
