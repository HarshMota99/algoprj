package com.pratice.string.leetcode;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

 Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class VaildPalindrome {

    public boolean isPalindrome(String s) {

    	boolean result = true;
    	
    	boolean counterCheck = true;
    	
    	char[] charArr = s.toCharArray();
    	
    	int backCounter = charArr.length;
    	
    	for(int i = 0; i< charArr.length/2; i++){
    		
    		if(Character.isLetterOrDigit(charArr[i])){
    			while(counterCheck){
    				backCounter = backCounter -1;
    				if(Character.isLetterOrDigit(charArr[backCounter])){
    					if(Character.toLowerCase(charArr[i]) != Character.toLowerCase(charArr[backCounter])){
    						return false;
    					}
    					counterCheck = false;
    				}
    			}
    		}
    		counterCheck = true;
    	}
    	return result;
    }
	
    public static void main(String args[]){
    	VaildPalindrome palindrome = new VaildPalindrome();
    	System.out.println(palindrome.isPalindrome(
    			"0P"));
    	
    }
}
