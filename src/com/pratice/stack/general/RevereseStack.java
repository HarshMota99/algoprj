package com.pratice.stack.general;

/**
 * Problem: Reverse the stack
 * 
 * 
 */

import java.util.Stack;

public class RevereseStack {
	
	Stack<Character> result = new Stack<>();
	
	public Stack<Character> reverse(Stack<Character> input){
		
		if(input.isEmpty()){
			return result;
		}
		result.push(input.pop());
		reverse(input);
		
		return result;
	}

	public static void main(String args[]){
		RevereseStack revereseStack = new RevereseStack();
		
		Stack<Character> input = new Stack<>();
		input.add((Character)'H');
		input.add((Character)'A');
		input.add((Character)'R');
		
		System.out.println(input);
		System.out.println(revereseStack.reverse(input));
	}
}
