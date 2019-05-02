package com.pratice.string.CTCI;


/** 
URLify a given string (Replace spaces is %20)

Write a method to replace all the spaces in a string with ‘%20’. 
You may assume that the string has sufficient space at the end to 
hold the additional characters, and that you are given the “true” length of the string.

Examples:

Input : "Mr John Smith", 13
Output : Mr%20John%20Smith

Input : "Mr John Smith   ", 13
Output : Mr%20John%20Smith
 * 
 * 
 * Hint:
 * 
 * Convert anything to String ==> String.valueOf
 * 
 * Comparing single char to string ==> " ".charAt(0) 
 * 
 * 
 */

public class URLify {
	public String replace(String input){
		String result = ""; 
		char[] inputCharArr = input.toCharArray();
		for(int i = 0; i<= inputCharArr.length-1; i++){
			if(inputCharArr[i] == " ".charAt(0)){
				result = result + "%20";
			}else{
				result = result + String.valueOf(inputCharArr[i]);
			}
		}
		return result;
	}
	public static void main(String args[]){
		URLify replace = new URLify();
		System.out.println(replace.replace("1 2 asdasd 22 c  "));
	}
}
