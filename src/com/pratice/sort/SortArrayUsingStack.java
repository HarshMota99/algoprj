package com.test;

import java.util.Stack;

public class SortArrayUsingStack {
	
	public Stack<Integer> sortArray(int[] input){
		
		Stack<Integer> result = new Stack<>();
		result.push(input[0]);
		Stack<Integer> temp = new Stack<>();
		
		for(int i =1; i<=input.length-1;i++){
			while(!result.isEmpty() && result.peek()<input[i]){
				temp.push(result.pop());
			}
			result.push(input[i]);
			while(!temp.isEmpty()){
				result.push(temp.pop());
			}
		}
		return result;
	}

	public static void main(String args[]){
		SortArrayUsingStack arrayUsingStack = new SortArrayUsingStack();
		System.out.println(arrayUsingStack.sortArray(new int[]{11,2,8,100,32,200,42,33,21,56}));
		
		
	}
	
	
}
