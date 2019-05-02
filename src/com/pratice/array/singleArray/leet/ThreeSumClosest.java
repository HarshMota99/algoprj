package com.pratice.array.singleArray.leet;

/**
 * Given an array nums of n integers and an integer target, find three integers
 * in nums such that the sum is closest to target. Return the sum of the three
 * integers. You may assume that each input would have exactly one solution.
 * Example: Given array nums = [-1, 2, 1, -4], and target = 1. The sum that is
 * closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class ThreeSumClosest {

	public int sumClosestTOTarget(int[] inputArr, int target) {

		int result = 0;
		int targetIndex = 0;
		int targetIndexSmaller = 0;
		int targetIndexLarger = 0;

		for (int i = 0; i <= inputArr.length - 1; i++) {

			if (inputArr[i] == target) {
				targetIndex = i;
			}
		}

		for (int i = 0; i <= inputArr.length - 1; i++) {
			for (int j = i + 1; j <= inputArr.length - 1; j++) {
				for (int k = j + 1; k <= inputArr.length - 1; k++) {
					// System.out.println(inputArr[i]+" "+inputArr[j]+"
					// "+inputArr[k]);
					result = inputArr[i] + inputArr[j] + inputArr[k];
//					if (targetIndex > 0) {
//						targetIndexSmaller = targetIndex--;
//						while (targetIndexSmaller >= 0) {
//							if (result == inputArr[targetIndexSmaller]) {
//								return result;
//							}
//							targetIndexSmaller--;
//						}
//					}
				}
			}
		}
		return result;
	}

	public static void main(String args[]) {
		ThreeSumClosest closest = new ThreeSumClosest();
		closest.sumClosestTOTarget(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 4);
	}

}
