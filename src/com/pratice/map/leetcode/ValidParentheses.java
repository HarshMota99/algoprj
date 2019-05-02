package com.pratice.map.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */

public class ValidParentheses {
	public boolean isValid(String s) {

		char[] charArr = s.toCharArray();

		Stack<Character> mainStack = new Stack<>();

		Map<Character, Character> regex = new HashMap<>();
		
		regex.put('}', '{'); // Difference from earlier code is here 
		regex.put(')', '(');
		regex.put(']', '[');
		regex.put('>', '<');
		
		for(int i=0;i<=charArr.length-1;i++) {
			
			if(mainStack.isEmpty()) {
				if(regex.containsKey(charArr[i])){ // Difference from earlier code is here
					return false;
				}else{
					mainStack.push(charArr[i]);
				}
			}else {
				if(regex.get(charArr[i])==mainStack.peek()) { // Difference from earlier code is here
					mainStack.pop();
				}else {
					mainStack.push(charArr[i]);
				}
			}
		}
		if(mainStack.isEmpty()){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String args[]){
		ValidParentheses parentheses = new ValidParentheses();
		System.out.println(parentheses.isValid("()"));
	}

	
	/*
	 
	 Earlier code:
	 
	  public boolean isValid(String s) {

		char[] charArr = s.toCharArray();

		Stack<Character> mainStack = new Stack<>();

		Map<Character, Character> regex = new HashMap<>();
		regex.put("(".charAt(0), ")".charAt(0));
		regex.put("{".charAt(0), "}".charAt(0));
		regex.put("[".charAt(0), "]".charAt(0));
		regex.put("<".charAt(0), ">".charAt(0));

		for (int i = 0; i <= charArr.length - 1; i++) {

			char t = charArr[i];
			
			if (mainStack.isEmpty()){
				if(!regex.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), t)).iterator()
						.hasNext()){
					mainStack.push(charArr[i]);
				}else{
					return false;
				}
			}

			else if (regex.get(mainStack.peek()) != null && charArr[i] == regex.get(mainStack.peek())) {
				mainStack.pop();
			} else {
				mainStack.push(charArr[i]);
			}

		}

		if (mainStack.empty())

		{
			return true;
		} else {
			return false;
		}

	}
	 
	 
	 
	 */
	
	
	
}
