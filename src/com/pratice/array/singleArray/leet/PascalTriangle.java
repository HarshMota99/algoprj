package com.pratice.array.singleArray.leet;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/pascals-triangle-ii/
 
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
Note that the row index starts from 0.

 */

public class PascalTriangle {
	
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (rowIndex == 0) return res;
        int pre = 1;
        for (int j = 1; j <= rowIndex; j++) { // We start at 1 because we already added 1 element above manually.
        	pre = 1; 						  // For every level we are initialing the previous with 1.
            for (int i = 1; i < j; i++) {     // We do i<j, so to make sure every that every level, we iterate exact one less than above. So that last one we add 1 manaually.
                int cur = res.get(i);         // We are always starting at 1 of the arraylist and set that to cur and add the pre to it.
                res.set(i, pre + cur);
                pre = cur;
            }
            res.add(1); // Adding one manually at the end.
        }
        return res;
    }

	public static void main(String args[]){
		
		PascalTriangle pascalTriangle = new PascalTriangle();
		System.out.println(pascalTriangle.getRow(6));
		
	}
	
}
