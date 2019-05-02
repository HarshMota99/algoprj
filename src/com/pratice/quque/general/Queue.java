package com.pratice.quque.general;

import java.util.Stack;

/**
 * Problem: Create a Queue using Stack 
 *
 */

public class Queue {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	public void push(int ele) {
		while (!s2.empty()) {
			s1.push(s2.pop());
		}
		s1.push(ele);
	}
	
	public void pop() {
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		System.out.println(s2.peek());
		s2.pop();
	}

public static void main(String args[]){
	Queue q = new Queue();
	q.push(1);
	q.push(2);
	q.push(3);
	
	q.pop();
	q.pop();
	q.pop();
	
	
}
}
