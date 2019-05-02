package com.test;

import java.util.Stack;

public class SortStackWithOnlyOneStack {

	static Stack<Integer> input = new Stack<>();

	public static void popout() {
		if (input.isEmpty()) {
			return;
		}
		int x = input.peek();
		input.pop();
		popout();
		sort(x);
	}

	public static void sort(int x) {

		if (input.isEmpty() || input.peek() > x) {
			input.push(x);
		} else {
			if (x > input.peek()) {
				int a = input.peek();
				input.pop();
				sort(x);
				input.push(a);
			}
		}
	}
	
	public static void main(String args[]){
		
		input.push(10);
		input.push(2);
		input.push(8);
		input.push(80);
		input.push(18);
		input.push(1);
		
		System.out.println(input);
		
		popout();
		
		System.out.println(input);
		
	}
}
