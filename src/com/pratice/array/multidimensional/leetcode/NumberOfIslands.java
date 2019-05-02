package com.pratice.array.multidimensional.leetcode;

/*
 Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1

Example 2:

Input:
11000
11000
00100
00011

Output: 3


Hint:
Okay, so here in this approach I am iterating throughout the matrix of '0's and '1's and finding out '1' in the matrix. 
Once I hit '1' I am increasing the islandCount by 1, also I am checking horizontal and vertical neighbouring cells for '1's 
and if I find, I am changing them to water i.e '0'. 
I am doing this becasue we want to count the number of islands and not number of '1's in the matrix, 
as given in the problem that the adjust '1's will be counted as 1 island.


 */

public class NumberOfIslands {
	
	public static int countIslands(int[][] grid) {
		int isLandCount =0;
		
		if(grid.length<1){
			return isLandCount;
		}
		
		for(int i=0; i<=grid.length-1; i++) {
			
			for(int j=0; j<=grid[0].length-1;j++){
				
				if(grid[i][j]==1){
                    // increase the island count
                    ++isLandCount;
                    // change any land connected to it to zero
                    changeToWater(grid,i,j);
                }
				
			}
			
		}
		return isLandCount;
	}

	private static void changeToWater(int[][] grid, int i, int j) {

	/*Base Cases
        1. row less than 0
        2. row greater than or equal to grid.length.
        3. column less than 0
        4. column greater than or equal to grid[0].length
        5. If position is a 0
	 */

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
			return;

		grid[i][j] = 0; // make it water
		changeToWater(grid, i - 1, j); // up
		changeToWater(grid, i + 1, j); // bottom
		changeToWater(grid, i, j - 1); // left
		changeToWater(grid, i, j + 1); // right

	}
	
	public static void main(String args[]) {
		
		int[][] grid = new int[5][5];
		grid[0]= new int[] {1,1,1,1,1};
		grid[1]= new int[] {1,1,1,0,0};
		grid[2]= new int[] {1,0,0,0,0};
		grid[3]= new int[] {0,1,1,1,1};
		grid[4]= new int[] {1,1,1,1,1};
		
		System.out.println(NumberOfIslands.countIslands(grid));
	}

}
