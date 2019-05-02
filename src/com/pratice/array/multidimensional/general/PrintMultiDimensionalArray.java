package com.pratice.array.multidimensional.general;



/**
Notes:
1. input[][], here the first [] indicates row and second [] indicates column
2. input.length-1, will give length of the row
3. input[row].length-1, will give length of the column
4. So here new int[][] {{1,2,3,4},{5,6},{7}}
	First row has 4 column with value 1,2,3,4
	e.t.c
	
 *
 */



public class PrintMultiDimensionalArray {
	
	public void print (int[][] input){
		
		for(int row=0;row<=input.length-1;row++){
			
			for(int column=0 ; column<=input[row].length-1;column++){
				System.out.print("row-->"+row+" colum-->"+column);
				System.out.println("value -->"+input[row][column]);
			}
			
			System.out.println();
		}
	}
	public static void main(String args[]){
		PrintMultiDimensionalArray dimensionalArray = new PrintMultiDimensionalArray();
		dimensionalArray.print(new int[][] {{1,2,3,4},{5,6},{7}});
	}

}
