package com.pratice.array.singleArray.leet;

/**
 
 Given a positive integer n, generate a square matrix filled with elements from 1 to n in spiral order.

Example:

Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 
Input: 4
Output:
[
[1,2,3,4],
[12,13,14,5],
[11,16,15,6],
[10,9,8,7]
]

Hint: https://www.youtube.com/watch?v=TmweBVEL0I0
 
 */

public class SpiralMatrix {
	
	int k,l,lastrow,lastcol; // k is first row & l is first column
	
	//** Every Important to remember
	//** result [rows] [columns] the first represents rows and second one represents column
	
	public int[][] spitalMatrix(int input){
		
		int[][] result = new int [input][input];
		
		k = 0;
		l = 0;
		lastrow = input -1;
		lastcol = input -1;
		int counter = 1;
		
		while(k<=lastrow && l<=lastcol){
			
			for(int i=l;i<=lastcol;i++){ // first row
				result[k][i] = counter;
				counter++;
			}
			k++; // This counters specify that, that particular row is complete. Similarly all the below specify row / column completion.
			
			for(int i = k; i <=lastrow ; i++){ // last column
				result[i][lastcol] = counter;
				counter++;
			}
			lastcol--;
			
			for(int i = lastcol; i>=l;i--){ // last row
				result[lastrow][i] = counter;
				counter++;
			}
			lastrow --;
			
			for(int i = lastrow; i>=k ; i-- ){// first col
				result[i][l] = counter;
				counter++;
			}
			l++;
		}
		return result;
	}

	public static void main(String args[]){
		SpiralMatrix matrix = new SpiralMatrix();
		int[][] result = matrix.spitalMatrix(5);
		for(int i=0; i<= result.length-1; i++){
			for(int j = 0 ; j<=result[i].length-1; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		 
	}
}
