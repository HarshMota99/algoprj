package com.pratice.stack.leetcode;

import java.util.Stack;

/*

Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Read below to understand what is RPN.

Note:
Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.

Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation: 
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
https://www.youtube.com/watch?v=AVSzwzCMvyQ

=========================================

What is RPN? --> http://www-stone.ch.cam.ac.uk/documentation/rrf/rpn.html

Reverse Polish Notation is a way of expressing arithmetic expressions that avoids the use of brackets to define priorities 
for evaluation of operators. In ordinary notation, one might write

(3 + 5) * (7 – 2)

and the brackets tell us that we have to add 3 to 5, then subtract 2 from 7, and multiply the two results together. 

In RPN, the numbers and operators are listed one after another, and an operator always acts on the most recent numbers in the list. 
The numbers can be thought of as forming a stack, like a pile of plates. The most recent number goes on the top of the stack. 
An operator takes the appropriate number of arguments from the top of the stack and replaces them by the result of the operation.

In this notation the above expression would be

3 5 + 7 2 – *

Reading from left to right, this is interpreted as follows:

Push 3 onto the stack.
Push 5 onto the stack. Reading from the top, the stack now contains (5, 3).
Apply the + operation: take the top two numbers off the stack, add them together, and put the result back on the stack. The stack now contains just the number 8.
Push 7 onto the stack.
Push 2 onto the stack. It now contains (2, 7, 8).
Apply the – operation: take the top two numbers off the stack, subtract the top one from the one below, and put the result back on the stack. The stack now contains (5, 8).
Apply the * operation: take the top two numbers off the stack, multiply them together, and put the result back on the stack. The stack now contains just the number 40.
 */

public class EvaluateReversePolishNotation {
	
	public static int evalRPN(String[] s){
		int result = 0;
		if(s==null || s.length<1){
			return result;
		}
		
		Stack<Integer> stk = new Stack<Integer>();
				
		for(int i=0; i<=s.length-1;i++){
			if(s[i].equals("+")){
				stk.push( stk.pop() + stk.pop() );
			}else if(s[i].equals("-")){
				int a = stk.pop();
				int b = stk.pop();
				stk.push(b-a);
			}else if(s[i].equals("*")){
				stk.push( stk.pop() * stk.pop() );
			}else if(s[i].equals("/")){
				int a = stk.pop();
				int b = stk.pop();
				stk.push(b/a);
			}else {
				stk.push(Integer.parseInt(s[i]));
			}
		}
		
		result = stk.pop();
		return result;
	}
	
	public static void main (String args[]) {
		System.out.println(EvaluateReversePolishNotation.evalRPN(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
	}

}
