package com.pratice.string.leetcode;

/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

	 public static String longestCommonPrefix(String[] strs) {
	        if(strs.length<1){
	            return "";
	        }
	        if(strs.length ==1){
	            return strs[0];
	        }
	        
	        String commonPref = "";
	        
	        int minStrLen = Integer.MAX_VALUE;
	        
	        for(int i=0;i<=strs.length-1;i++){
	            minStrLen = Math.min(minStrLen,strs[i].length());
	        }

	        boolean com = false;
	        outerloop:
	        for(int i=0;i<=minStrLen-1;i++){
	            char temp = strs[0].charAt(i);
	            for(int j=1;j<=strs.length-1;j++){
	                if(strs[j].charAt(i) == temp){
	                    continue;
	                }else{
	                    break outerloop;
	                }
	            }
	                commonPref = commonPref + temp;
	        }        
	    return commonPref.toString();
	    }
	 
	 public static void main(String args[]) {
		 
		 System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
		 
	 }
}
