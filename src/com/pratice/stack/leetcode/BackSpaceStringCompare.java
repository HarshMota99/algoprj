package com.pratice.stack.leetcode;
/*
 Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".

Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */

import java.util.Stack;

public class BackSpaceStringCompare {
	 public static boolean backspaceCompare(String S, String T) {
	        
	        int maxLength = Math.max(S.length(),T.length());
	        Stack<Character> s1 = new Stack<>();
	        Stack<Character> s2 = new Stack<>();
	        
	        for(int i=0;i<=maxLength-1;i++){
	            
	            if(i<=S.length()-1){
	                if(S.charAt(i) == '#'){
	                    if(!s1.empty()){
	                        s1.pop();
	                    }                    
	                }else{
	                    s1.push(S.charAt(i));
	                }
	            }
	            
	            if(i<=T.length()-1){
	                if(T.charAt(i) == '#'){
	                    if(!s2.empty()){
	                        s2.pop();
	                    }                    
	                }else{
	                    s2.push(S.charAt(i));
	                }
	            }
	        }
	        
	        while(!s1.empty() && !s2.empty()){
	            if(s1.peek() == s2.peek()){
	                s1.pop();
	                s2.pop();
	            }
	            else{
	                break;
	            }            
	        }
	        if(!s1.empty() || !s2.empty()){
	            return false;
	        }else{
	            return true;
	        }
	    }
	 public static void main(String args[]) {
		 System.out.println(BackSpaceStringCompare.backspaceCompare("a#b", "a#b"));
	 }
}
