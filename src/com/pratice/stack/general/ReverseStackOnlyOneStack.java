package com.pratice.stack.general;

import java.util.Stack;

/**
 * Problem: Without using any other collections or data structures, reverse a stack.
 * 
 * Hint:
 * Recursively call first time to pop the element and store in temp
 * Call another method to push the temp element
 * Recursively call the the second method to empty it and push the new value first and put the temps which were emptied
 *
 */

public class ReverseStackOnlyOneStack {

	Stack<Character> charStack;

	public ReverseStackOnlyOneStack(Stack<Character> charStack) {
		this.charStack = charStack;
	}

	public void reverseStack(Stack<Character> charStack) {
		if (charStack.isEmpty()) {
			return;
		}
		Character temp = charStack.peek();
		charStack.pop();
		reverseStack(charStack);
		pushtoBottom(temp);
	}

	public void pushtoBottom(Character input) {
		if (charStack.isEmpty()) {
			charStack.push(input);
			return;
		}
		Character temp = charStack.peek();
		charStack.pop();
		pushtoBottom(input);
		charStack.push(temp);
	}

	public static void main(String args[]) {
		Stack<Character> input = new Stack<>();
		input.add((Character) 'H');
		input.add((Character) 'A');
		input.add((Character) 'R');
		input.add((Character) 'S');
		input.add((Character) 'H');
		System.out.println(input);
		
		ReverseStackOnlyOneStack oneStack = new ReverseStackOnlyOneStack(input);
		oneStack.reverseStack(input);
		System.out.println(input);
	}

}
