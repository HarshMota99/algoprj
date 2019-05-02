package com.pratice.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/letter-combinations-of-a-phone-number/

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].


Hint: 
Read the ReadMe file - /AlgoPrj/src/com/pratice/backtracking/leetcode/Readme

 */




public class LetterCombinationsofaPhoneNumber {
	
	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	
	public List<String> letterCombinationofPhone(String digit){
		List<String> res = new ArrayList<String>();
		combination("", digit, 0, res);
		return res;
	}

	private void combination(String prefix, String digit, int offset, List<String> res) {
		
																// Constraint
		if(offset >= digit.length()) {
			res.add(prefix); 									// Target goal
			return;
		}
		
																// Choice to choose single element in every recusrive loop
		String letters = KEYS[digit.charAt(offset) - '0']; 		// -'0' is to make that char to correct integer
		
														  		// Recursive call inside the loop
		for(int i=0; i<=letters.length()-1; i++) {
			combination(prefix+letters.charAt(i), digit, offset+1, res);
		}
		
	}
	public static void main(String args[]) {
		LetterCombinationsofaPhoneNumber combinationsofaPhoneNumber = new LetterCombinationsofaPhoneNumber();
		System.out.println(combinationsofaPhoneNumber.letterCombinationofPhone("23"));
	}
	
	
	
	

}
