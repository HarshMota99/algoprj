package com.pratice.string.general;

/**
 
 Calculate sum of all numbers present in a string

Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.

Examples:

Input:  1abc23
Output: 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100

Input:  123abc
Output: 123
 
 * Hint:
 * Use Character.isDigit(c)
 */

public class SumOfRandomString {

	static int result;

	public static int sum(String input) {
	
		char[] charArr = input.toCharArray();
		String temp="";
		for(int i=0;i<=charArr.length-1;i++){
			if(Character.isDigit(charArr[i])){
				temp = temp +charArr[i];
			}else{
				result = result + Integer.parseInt(temp);
				temp="";
			}
		}
		if(temp !=""){
			result = result + Integer.parseInt(temp);
		}
		return result;
	}

	public static void main(String args[]){
		System.out.println(sum("11a2b11c4g1"));
	}
}
