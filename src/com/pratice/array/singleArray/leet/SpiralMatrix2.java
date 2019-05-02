package com.pratice.array.singleArray.leet;

/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> result = new ArrayList<Integer>();
		int k = 0; // first row
		int l = 0; // first column
		int lastrow = matrix.length - 1;
		int lastColumn = matrix[0].length - 1;

		while(k<=lastrow && l<=lastColumn) {
			
			for(int i=l; i<=lastColumn; i++) {
				result.add(matrix[k][i]);
			}
			k++;
			
			for(int i=k; i<=lastrow; i++) {
				result.add(matrix[i][lastColumn]);
			}
			lastColumn--;
			
			for(int i=lastColumn; i>=l; i--) {
				result.add(matrix[lastrow][i]);
			}
			lastrow--;
			
			for(int i=lastrow; i>=k; i--) {
				result.add(matrix[i][l]);
			}
			l++;
		}
		return result;
	}
	
	public static void main(String args[]) {
		//System.out.println(SpiralMatrix2.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
		//System.out.println(SpiralMatrix2.spiralOrder(new int[][] {{3},{2}}));
		System.out.println(SpiralMatrix2.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
	}
}
