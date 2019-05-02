package com.pratice.string.leetcode;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        
	       int i = s.length()-1;
	       int count = 0;
	        
	       while(i>=0 && s.charAt(i) == " ".charAt(0))
	           i--;
	        
	       while(i>=0 && s.charAt(i) != " ".charAt(0)) {
	        i--;
	    	   count++;
	       }
	        return count;
	}
	
	public static void main(String args[]){
		LengthOfLastWord lastWord = new LengthOfLastWord();
		System.out.println(lastWord.lengthOfLastWord("hello world"));
	}
}
