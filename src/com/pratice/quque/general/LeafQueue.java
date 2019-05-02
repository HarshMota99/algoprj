package com.pratice.quque.general;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeafQueue {
	Stack<Integer> temp = new Stack<>();

	public Queue<Integer> leaf(Queue<Integer> input){
	
		for(int i = 0 ; i<=1 ; i++){
			toStack(input);
			if(i<1){
				toQueue(input,temp);
			}else{
				Weave(input,temp);
			}
		}
		return input;
	}
	
	private void Weave(Queue<Integer> input, Stack<Integer> temp2) {

		if(temp2.isEmpty()){
			return;
		}
		input.add(temp2.peek());
		temp2.pop();
		input.add(input.peek());
		input.remove();
		Weave(input, temp2);
		return;
	}

	public void toStack(Queue<Integer> input){
		if(input.size()==5){
			return;
		}
		temp.push(input.peek());
		input.remove();
		toStack(input);
		return ;
	}
	
	public void toQueue(Queue<Integer> input,Stack<Integer> tempStack){
		
		if(tempStack.isEmpty()){
			return;
		}
		input.add(tempStack.peek());
		tempStack.pop();
		toQueue(input, tempStack);
		return;
	}
	
	public static void main(String args[]){
		
		Queue<Integer> input = new LinkedList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		
		LeafQueue leafQueue = new LeafQueue();
		leafQueue.leaf(input);
		
	}
}
