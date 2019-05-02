package com.pratice.array.multidimensional.CTCI;


/**

Hint:
https://docs.google.com/document/d/1x2EvB42mw9kfmXyCKXs5hUh9_3wAzRcp6hyrDth2j0I/edit

Find below 3 things
1. Matrix size : We can get this from row and column length 

2*2 matrix size =2
3*3 matrix size =3
4*4 matrix size =4

2. Total number of levels - i.e depth
This is the swap levels. 
For example 
2*2 we just swap the outer layer: so the level is 1
3*3 we just swap the outer layer, because there is only one in middle: so the level is 1
4*4 we swap the outer layer and one inner layer: so the level is 2
5*5 we swap the outer layer and one inner layer: so the level is 2

As every 2 consequte numbers level is coming as same. We can use divide by 2 formula.

3. Last element location: till where we need to rotate for every level
2*2 is 1
3*3 is 2
4*4 is 3
 */

public class RotateMatrix {

	private int matrixSize;
	private int totalLevel;
	private int matrixLastLocation; // till where we need to rotate for every level
	private int[][] inputMatrix;
	
	RotateMatrix(int[][] inputMatrix){
		this.inputMatrix = inputMatrix;
		this.matrixSize = inputMatrix.length;
		this.totalLevel = matrixSize/2;
		this.matrixLastLocation = matrixSize -1; 
	}

	public void displayMatrix(){
		for(int ir=0; ir<=inputMatrix.length-1;ir++){
			for(int ic=0; ic<=inputMatrix[ir].length-1; ic++){
				System.out.print(inputMatrix[ir][ic]);
			}
			System.out.println();
		}
	}
	
	public void rotate(){
		System.out.println("Before rotation");
		displayMatrix();
		int curentLevel = 0;
			while(curentLevel<totalLevel){ // Depth loop
				for(int i =0; i<matrixLastLocation;i++){// rotation loop
					//swap(inputMatrix[curentLevel][i],inputMatrix[i][matrixLastLocation]);
					//swap(inputMatrix[curentLevel][i],inputMatrix[matrixLastLocation][matrixLastLocation-i]);
					//swap(inputMatrix[curentLevel][i],inputMatrix[matrixLastLocation-i][curentLevel]);
					
					swap1(curentLevel, i);
					swap2(curentLevel, i);
					swap3(curentLevel, i);
				}
				curentLevel = curentLevel + 1;
			}
		System.out.println("After rotation");
		displayMatrix();
	}

	void swap1(int curentLevel, int i){
		int temp = inputMatrix[curentLevel][i];
		inputMatrix[curentLevel][i] = inputMatrix[i][matrixLastLocation];
		inputMatrix[i][matrixLastLocation] = temp;
	}
		
	void swap2(int curentLevel, int i){
		int temp = inputMatrix[curentLevel][i];
		inputMatrix[curentLevel][i] = inputMatrix[matrixLastLocation][matrixLastLocation-i];
		inputMatrix[matrixLastLocation][matrixLastLocation-i] = temp;
	}
	
	void swap3(int curentLevel, int i){
		int temp = inputMatrix[curentLevel][i];
		inputMatrix[curentLevel][i] = inputMatrix[matrixLastLocation-i][curentLevel];
		inputMatrix[matrixLastLocation-i][curentLevel] = temp;
	}
	public static void main(String args[]){
		RotateMatrix matrix = new RotateMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		matrix.rotate();
	}
	
	
}
