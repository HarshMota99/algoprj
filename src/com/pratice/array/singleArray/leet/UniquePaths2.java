package com.pratice.array.singleArray.leet;

/*
https://leetcode.com/problems/unique-paths-ii/
 
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and empty space is marked as 1 and 0 respectively in the grid.
Note: m and n will be at most 100.

Example 1:
Input:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
Output: 2
Explanation:
There is one obstacle in the middle of the 3x3 grid above.
Therefore are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

Hint: 
https://www.youtube.com/watch?v=Z9XWbqxyn3E
https://www.youtube.com/watch?v=AmRvCR6B5no
https://www.youtube.com/watch?v=Dv7Pn3umnSA


Main Hint:

N(Cell) = Number of ways to reach a cell
N(Cell) = N(Left Cell) + N(Upper cell)

Using the above formula, the final gird's number will be the total valid path. I.e memo[rowlenth-1][coumnlength-1].
 
*/

public class UniquePaths2 {
	
	//** Every Important to remember
	//** result [rows] [columns] the first represents rows and second one represents column
	
	public int check(int[][] obstacleGrid) {

		if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0){
			return 0;
		}
		
        if(obstacleGrid[0][0] == 1){ // if first gird itself is blocked return
            return 0;
        }
		
		int result = 0;
		
		int rows = obstacleGrid.length; 
		int columns = obstacleGrid[0].length; // Thats rows from start to nth element will the number of column. Hence gives column length.
		
		
		int[][] memo = new int[rows][columns]; // This is our new grid we create to count the paths. Every valid gird will now have a non zero number.
		
		memo[0][0] = 1; // Make the first row and first column 1 where its 0. This will be starting point.
		
		// first row make 1
		for(int i=1; i<columns; i++) {
				if(obstacleGrid[0][i] != 0)
					break;
					memo[0][i] = 1;
		}
		
		// first column make 1
		for(int i=1; i<rows;i++) {
			if(obstacleGrid[i][0] != 0) 
				break;
				memo[i][0] = 1;
			
		}
		
		for(int i=1; i<rows; i++) { 
			for(int j=1; j<columns;j++) {
				if(obstacleGrid[i][j] != 1 ){
					memo[i][j] = memo[i-1][j] + memo[i][j-1]; // N(Cell) = N(Left Cell) + N(Upper cell)
				}else {
					memo[i][j] = 0;
				}
			}
			
		}
		
		result = memo[memo.length-1][memo[memo.length-1].length-1]; // Last element of the gird will have the total count
		return result;
		
	}
	
	public static void main(String args[]){
		
		int[][] inputMatrix = new int[3][3];
		
		inputMatrix[0][0] = 0;
		inputMatrix[0][1] = 0;
		inputMatrix[0][2] = 0;
		
		inputMatrix[1][0] = 0;
		inputMatrix[1][1] = 1;
		inputMatrix[1][2] = 0;
		
		inputMatrix[2][0] = 0;
		inputMatrix[2][1] = 0;
		inputMatrix[2][2] = 0;
		
		UniquePaths2 paths2 = new UniquePaths2();
		
		System.out.println(paths2.check(inputMatrix));
		
	}

}
