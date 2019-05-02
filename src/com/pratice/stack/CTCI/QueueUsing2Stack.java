package com.pratice.stack.CTCI;

import java.util.Stack;

/**
 * Problem: Implement queue using 2 stack
 *
 */

public class QueueUsing2Stack {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(Integer input){
		s1.push(input);
	}
	
	public int pop(){
		int temp = 0;
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		temp = s2.pop();
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return temp;
	}
	
	public static void main(String args[]){
		QueueUsing2Stack queueUsing2Stack = new QueueUsing2Stack();
		queueUsing2Stack.push(1);
		queueUsing2Stack.push(2);
		queueUsing2Stack.push(3);
		System.out.println(queueUsing2Stack.pop());
		System.out.println(queueUsing2Stack.pop());
		System.out.println(queueUsing2Stack.pop());
		
		
	}
	
}
