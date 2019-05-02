package com.pratice.stack.CTCI;

import java.util.Stack;

/**
 * 
 * Problem: Sort the stack
 * 
 * Simple: 
 * Pop all elements bigger than temp from resultStack to tempStack
 * Push temp varaible to resultStack
 * Now Pop all elements from tempStack back to resultStack
 */

public class SortStack {

	Stack<Integer> resultStack = new Stack<>();
	Stack<Integer> tempStack = new Stack<>();

	public void sort(int[] input) {

		for (int i=0; i<=input.length-1;i++) {
			int temp = input[i];
			while (!resultStack.isEmpty() && temp < resultStack.peek()) {
				tempStack.push(resultStack.pop());
			}
			resultStack.push(temp);
			while (!tempStack.isEmpty()) {
				resultStack.push(tempStack.pop());
			}
		}
	}
	
	public void display(){
		while (!resultStack.isEmpty()){
			System.out.println(resultStack.pop());
		}
	}
	
	public static void main(String args[]){
		SortStack ss = new SortStack();
		ss.sort(new int[]{21,7,10,20,4,2,1,3});
		ss.display();
	
	}
}
