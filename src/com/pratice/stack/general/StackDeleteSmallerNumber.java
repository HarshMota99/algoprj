package com.pratice.stack.general;

import java.util.Stack;

public class StackDeleteSmallerNumber {
	
	public void deleteSmall(int count, int[] input){
		
		Stack<Integer> result = new Stack<>();
		
		result.push(input[0]);
		
		for(int i =1 ; i<count; i++){
			if(result.peek()<input[i]){
				result.pop();
				result.push(input[i]);
			}else{
				result.push(input[i]);
			}
		}
		System.out.println(result);
	}
	public static void main(String args[]){
		
		StackDeleteSmallerNumber SDSN = new StackDeleteSmallerNumber();
		
		SDSN.deleteSmall(5,new int[]{3,6,2,9,1,5});
		
	}
}
