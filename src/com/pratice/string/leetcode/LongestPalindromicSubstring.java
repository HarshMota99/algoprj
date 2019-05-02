package com.pratice.string.leetcode;

/**
 https://leetcode.com/problems/longest-palindromic-substring/
 
Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

 */

public class LongestPalindromicSubstring {
	
	String input;
	String result="";
	
	public LongestPalindromicSubstring(String input){
		this.input = input;
	}
	
	public void perform(){
		for(int i =0;i<=input.length();i++){
			for(int j=i+1; j<=input.length();j++){
				String temp = input.substring(i, j);
				if(temp!=null && isPalindrome(temp)){
					result = (result.length()>temp.length())?result:temp;
				}
			}
		}
		System.out.println(result);
	}

	private boolean isPalindrome(String temp) {
		return temp.equals(new StringBuilder(temp).reverse().toString());
	}
	
	public static void main(String args[]){
		LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring("cbbd");
		longestPalindromicSubstring.perform();
	}
}
