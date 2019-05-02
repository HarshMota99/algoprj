package com.pratice.array.singleArray.leet;

import java.util.Arrays;

/**
 * Problem: Find the smallest letter greater than the target
 * 
 * 
 * Linear solution: 
 * - Loop array to check which is greater than target
 * - Once found greater than target, now do one more loop over to check if (its greater than target && smaller than others)
 * 
 * 	 fs.checkLinear(new char[] { 'c', 'd', 'h', 'x','y','e', 'f' }, 'd');
 * 	 Result = e
 * 
 * 
 * Binary solution:
 * - Find the mid
 * - Check if mid is smaller or equal to target. If yes go the right side of it futher.
 * - else go the left side of mid
 * 
 *  fs.checkBinary(new char[] {'c', 'd', 'h', 'x','y','e', 'f','z' }, 'y');
	Result = z
 * 
 * 
 */

public class FindSmallestLetterGreaterThanTarget {
	public void checkLinear(char[] input, char target) {
		char tempResult = target;
		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i] > target) {
				tempResult = input[i];
				for (int j = i + 1; j <= input.length - 1; j++) {
					if (input[j] > target && input[j] < tempResult) {
						tempResult = input[j];
					}
				}
				break;
			}
		}
		System.out.println(tempResult);
	}

	public void checkBinary(char[] input, char target) {

		Arrays.sort(input);

		int x = 0, y = input.length;

		while (x < y) {
			int mid = x + ((y - x) / 2);
			if (input[mid] == target) {
				System.out.println(input[mid + 1]);
				return;
			} else if (input[mid] < target) {
				x = mid+1;
			} else {
				y = mid-1;
			}
		}
		//System.out.println(input[x]);
		return;
	}

	public static void main(String args[]) {
		FindSmallestLetterGreaterThanTarget fs = new FindSmallestLetterGreaterThanTarget();
		//fs.checkBinary(new char[] { 'c', 'd', 'h', 'x', 'y', 'e', 'f', 'z' }, 'z');
		fs.checkLinear(new char[] { 'c', 'd', 'h', 'x', 'y', 'e', 'f' }, 'd');

	}
}
