package com.pratice.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlipAnImage {

	public int[][] fi(int[][] input) {

		int[][] result = new int[input.length][];

		for (int i = 0; i <= input.length-1; i++) {

			int[] tempArray = input[i];
			List<Integer> tempList = Arrays.stream(tempArray).boxed().collect(Collectors.toList());
			Collections.reverse(tempList);
			tempArray = tempList.stream().mapToInt(Integer::intValue).toArray();

			for (int j = 0; j <= tempArray.length-1; j++) {

				if (tempArray[j] == 0) {
					tempArray[j] = 1;
				} else if (tempArray[j] == 1){
					tempArray[j] = 0;
				}
			}
			result[i] = tempArray;
		}
		return result;
	}
	
	public static void main(String args[]){
		
		FlipAnImage anImage = new FlipAnImage();
		int[][] resultanImage = anImage.fi(new int[][]{{1,1,1},{0,0,0},{1,1,1}});
		for(int i =0 ; i<=resultanImage.length-1;i++){
			for(int j =0 ; j<=resultanImage[i].length-1;j++ )
				System.out.println(resultanImage[i][j]);
		}
		
	}

}
