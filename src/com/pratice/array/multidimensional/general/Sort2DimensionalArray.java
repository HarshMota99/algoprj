package com.pratice.array.multidimensional.general;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DimensionalArray {
	
	public void sortArrayByColumb(int[][] input, int col){

		Arrays.sort(input, (int[] o1, int[] o2) -> {
			if (o1[col] > o2[col])
				return 1;
			else
				return -1;
		}
		);
		print(input);
		
//		Arrays.sort(input, new Comparator<int[]>() { // here we are using single dimension array, because the comparision is between rows
//
//			@Override
//			public int compare(int[] o1, int[] o2) { // comparing one row to another
//				if (o1[col] > o2[col])
//					return 1;
//				else
//					return -1;
//			}
//		});
//		print(input);
//	}
	}
	public void print(int[][] input) {
		for (int row = 0; row <= input.length - 1; row++) {
			for (int column = 0; column <= input[row].length - 1; column++) {
				System.out.print(input[row][column]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Sort2DimensionalArray dimensionalArray = new Sort2DimensionalArray();
		dimensionalArray.sortArrayByColumb(new int[][] { { 1, 20, 3, 4 }, { 5, 10 }, { 7, 5 } }, 1);
	}
}
