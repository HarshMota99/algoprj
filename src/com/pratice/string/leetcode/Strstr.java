package com.pratice.string.leetcode;

/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2


Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() 
and Java's indexOf().

 */

public class Strstr {
	
	// More simpler solution strStr2 below
	
	public static int strStr(String haystack, String needle) {
        int result=-1;
        
        if(needle == null || needle.length()<1){
            return 0;
        }
        
        char[] hayStackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        outer:
        for(int i=0;i<=hayStackArray.length-1;i++){
            if(needle.charAt(0) == hayStackArray[i]){
                if(needleArray.length==1){
                    return i;
                }else{
                	int k=i;
                    for(int j=1;j<=needleArray.length-1;j++){
                        k++;
                        if(k>hayStackArray.length-1){
                            continue outer;
                        }
                        if(needleArray[j] != hayStackArray[k]){
                        	continue outer;
                        }
                        
                    }                    
                    return i;
                }
            }
        }
        
        return result;
    }
	
	// More simpler soultion below
	
	 public static int strStr2(String haystack, String needle) {
	        for(int i = 0; i <= haystack.length()-needle.length(); i++){
	            if(haystack.substring(i, i+needle.length()).equals(needle))
	               return i;
	        }
	        return -1;
	    }
	
	public static void main(String args[]) {
		
		System.out.println(Strstr.strStr2("mississippi", "issip"));
	}
}
