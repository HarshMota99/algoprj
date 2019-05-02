package com.pratice.stack.general;

/**
 * Problem: Without using size method of stack, delete the middle element
 * 
 */

import java.util.Stack;

public class StackDeleteMiddleElement {
	
	static Stack<Integer> input = new Stack<>();
	static int counter;
	static int middleElm;
	
	public static void findMiddleElement(){
		
		if(input.isEmpty()){
			middleElm = counter/2;
			return;
		}
		
		counter++;
		int x = input.peek();
		input.pop();
		findMiddleElement();
		
		if(counter != middleElm){
			input.push(x);
		}
		counter--;
	}
	public static void main(String args[]){
		
		input.push(1);
		input.push(2);
		input.push(3);
		input.push(4);
		input.push(5);
		
		System.out.println(input);
		findMiddleElement();
		System.out.println(input);
	}
}
