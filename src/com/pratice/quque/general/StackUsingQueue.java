package com.pratice.quque.general;

/**
 * Problem: Create stack using queue data structure.
 */

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	
	public static void makeStack(Queue<Integer> inputQueue){
		
		Queue<Integer> tempQueue = new LinkedList<>();
		
		if(inputQueue.isEmpty()){
			return;
		}
		
		int tempSize = inputQueue.size()-1;
				
		while(tempSize!=0){
			
			tempQueue.add(inputQueue.peek());
			tempSize--;
			inputQueue.remove();
		}
		System.out.println(inputQueue.peek());
		inputQueue.remove();
		makeStack(tempQueue);
		
	}
	
public static void main(String args[]){
	
	Queue<Integer> inputQueue = new LinkedList<>();
	inputQueue.add(1);
	inputQueue.add(2);
	inputQueue.add(3);
	
	System.out.println(inputQueue);
	makeStack(inputQueue);
	
}

}
