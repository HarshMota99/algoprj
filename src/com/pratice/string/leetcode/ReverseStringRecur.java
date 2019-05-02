package com.pratice.string.leetcode;

	
public class ReverseStringRecur {
	String result ="";
	public void rev(String inputStr){
		if(inputStr.length()<1){
			System.out.println(result);
			return;
		}
		int size = inputStr.length()-1;
		result = result + inputStr.charAt(size);
		rev(inputStr.substring(0, size));
	}

	public static void main(String args[]){
		ReverseStringRecur recur = new ReverseStringRecur();
		recur.rev("harsh");
	}
}
