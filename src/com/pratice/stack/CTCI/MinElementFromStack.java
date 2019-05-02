package com.pratice.stack.CTCI;

import java.util.Stack;

/**
 * Problem: Minimum element from the stack in O(1) time. That is constant time.
 * 
 * hint:
 * Keep 2 stacks main and support stack
 * 
 * Push Operation:
 * If first element push on both stack
 * All future pushes if the element is smaller push on both or just push on main stack
 * 
 * Pop
 * Pop from main stack and if the element being popped is same in support stack, pop from both
 * 
 * Fetch smallest
 * Always peek from the support stack as it has the smallest always on the top
 * 
 * https://www.youtube.com/watch?v=ufwPuyxkNVE
 */

public class MinElementFromStack {

	Stack<Integer> mainStack = new Stack<>();
	Stack<Integer> supportStack = new Stack<>();
	
	public void push(int input){
		if(mainStack.isEmpty() && supportStack.isEmpty()){
			mainStack.push(input);
			supportStack.push(input);
			return;
		}
		
		if(input<=supportStack.peek()){
			mainStack.push(input);
			supportStack.push(input);
		}else{
			mainStack.push(input);
		}
		return;
	}

	public void pop(){
		
		int val = mainStack.pop();
		
		if(val == supportStack.peek()){
			supportStack.pop();
		}
		return;
	}
		
	public void minElement(){
		System.out.println(supportStack.peek());
		return;
	}
	public static void main(String args[]){
		
		MinElementFromStack elementFromStack = new MinElementFromStack();
		
		elementFromStack.push(512);
		elementFromStack.push(-1024);
		elementFromStack.push(-1024);
		elementFromStack.push(512);
		elementFromStack.pop();
		elementFromStack.minElement();	
		elementFromStack.pop();
		elementFromStack.minElement();	
		elementFromStack.pop();
		elementFromStack.minElement();	
		elementFromStack.pop();
		
//		["MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"]
//				[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]
	}
}
