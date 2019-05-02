package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 https://leetcode.com/problems/zigzag-conversion/
 
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R



And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 
 
 */
public class ZigZagConversion {


	public String covert(String input, int rows){
		
		char[] inputCharArr = input.toCharArray();
		
		List<StringBuilder> SBList = new ArrayList<>();
		
		for(int i=0; i<rows; i++){
			SBList.add(new StringBuilder());
		}
		
		for(int i = 0; i<=inputCharArr.length-1;){
			
			for(int j = 0; j<=rows-1;j++){
				if(i<=inputCharArr.length-1){
					SBList.get(j).append(inputCharArr[i]);
					i++;
				}
			}
			
			for(int j = rows-1; j>0; j--){
				if(i<=inputCharArr.length-1){
					SBList.get(j).append(inputCharArr[i]);
					i++;
				}
			}
		}

		StringBuilder result = new StringBuilder();
		for(int i=0; i<=SBList.size()-1; i++){
			result.append(SBList.get(i));
		}
		
		return result.toString();
	}
	
	public static void main(String args[]){
		
		ZigZagConversion conversion = new ZigZagConversion();
		System.out.println(conversion.covert("A", 1));
	}
	
	
	
	
}
