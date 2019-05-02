package com.pratice.array.multidimensional.CTCI;

/**
 * Problem: Given a m * n matrix, if an element is 0, set its entire row and column to 0
 *  
 */


public class ZeroMatrix {
	
	boolean[][] changedValue;
	int[][] inputMatrix;
	
	public ZeroMatrix(int[][] inputMatrix){
		this.changedValue = new boolean[inputMatrix.length][inputMatrix[0].length];
		this.inputMatrix = inputMatrix;
	}
	
	public void processMatrix() {
		for (int ir = 0; ir <= inputMatrix.length - 1; ir++) {
			for (int ic = 0; ic <= inputMatrix[ir].length - 1; ic++) {
				if (inputMatrix[ir][ic] == 0 && changedValue[ir][ic] != true) {
					changeMatrixZero(ir, ic);
				}
			}
		}
	}
	
	private void changeMatrixZero(int ir, int ic) {
		for (int jc = 0; jc <= inputMatrix.length - 1; jc++) {
			if(inputMatrix[ir][jc] != 0){
				inputMatrix[ir][jc] = 0;
				changedValue[ir][jc] =true;
			}
		}
		for (int jr = 0; jr <= inputMatrix.length - 1; jr++) {
			if(inputMatrix[jr][ic] != 0){
				inputMatrix[jr][ic] = 0;
				changedValue[jr][ic] =true;
			}
		}
	}
		
	private void display(){
		for (int ir = 0; ir <= inputMatrix.length - 1; ir++) {
			for (int ic = 0; ic <= inputMatrix[ir].length - 1; ic++) {
				System.out.print(inputMatrix[ir][ic]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		ZeroMatrix matrix = new ZeroMatrix(new int[][]{{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,1,0}});
		matrix.display();
		matrix.processMatrix();
		matrix.display();
	}
}
