package com.pratice.string.leetcode;

public class ReverseString {
	
	public void revStr(String input){
		
		String result="";
		char[] charArr = input.toCharArray();
		
		int size = charArr.length-1;
		while(size!=-1){
			result = result+ charArr[size];
			size--;
		}
		System.out.println(result);

	}
	
	public static void main(String args[]){
		ReverseString reverseString = new ReverseString();
		reverseString.revStr("harsh");
	}
	

}
