package com.pratice.array.singleArray.leet;

import java.util.Arrays;

/*

Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:

Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:

n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].

Hint: https://www.youtube.com/watch?v=ok6kZNyPVeU

Read this:
In order to understand this approach, let us look at the problem from a different perspective. 
We need to form the pairings of the array's elements such that the overall sum of the minimum 
out of such pairings is maximum. Thus, we can look at the operation of choosing the minimum out of the pairing, 
say (a,b)(a,b) as incurring a loss of a−b a−b(if a>b a>b), in the maximum sum possible.

The total sum will now be maximum if the overall loss incurred from such pairings is minimized. 
This minimization of loss in every pairing is possible only if the numbers chosen for the pairings 
lie closer to each other than to the other elements of the array.

Taking this into consideration, we can sort the elements of the given array and form the pairings 
of the elements directly in the sorted order. This will lead to the pairings of elements with minimum 
difference between them leading to the maximization of the required sum.

*/

public class ArrayPartitionI {
	
	public static int largerSumOfMinimumValue(int[] inputArray) {
		
		int sum = 0;
		Arrays.sort(inputArray);

		for(int i=0; i<=inputArray.length-1; i=i+2) {
			sum += inputArray[i];
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		System.out.println(ArrayPartitionI.largerSumOfMinimumValue(new int[] {1,3,2,4}));
	}

}
