package com.pratice.quque.general;

/**
 * Problem: Reverse Queue without using any other DS
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    static Queue<Integer> input = new LinkedList<Integer>();

	public static void reverseQueue(){
		
		if(input.isEmpty()){
			return;
		}
		
		int x = input.peek();
		input.remove();
		reverseQueue();
		input.add(x);
	}

	public static void main(String args[]){
		input.add(2);
		input.add(3);
		input.add(4);
		System.out.println(input);
		reverseQueue();
		System.out.println(input);
	}
}
