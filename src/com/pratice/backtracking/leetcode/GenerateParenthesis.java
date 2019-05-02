package com.pratice.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

Hint:

https://www.youtube.com/watch?v=sz1qaKt0KGQ

Back tracking logic 3 things to keep in mind:

1. Our choice : So here its "(" or ")" 
	backtrack(list, str+"(", open+1, close, max);
	backtrack(list, str+")", open, close+1, max);

2. Our constrants: Here we have 2 constraints 
	2.1 max should not more n *2 
	
	    if(str.length() == max*2){
            list.add(str);
            return;
        }
        
     2.2 Cannot close before Open
     
     	Calling open < max will open only 3 ((( and those will open first

3. Our goal

	N*2 placement. That is total combinations of list should have n*2

 */

public class GenerateParenthesis {

	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack( "", 0, 0, n, list);
        return list;
    }
    
    public static void backtrack(String str, int openOffset, int closeOffset, int max, List<String> list){
        
        if(str.length() == max*2){
            list.add(str);
        }else {
        
	        if(openOffset < max)
	            backtrack(str+"(", openOffset+1, closeOffset, max,list);
	        if(closeOffset < openOffset)
	            backtrack(str+")", openOffset, closeOffset+1, max,list);
	        
        }
    }
	
    public static void main(String args[]) {
    	
    	System.out.println(GenerateParenthesis.generateParenthesis(3));
    	
    }
}
