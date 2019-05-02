package com.pratice.array.singleArray.CTCI;

/**
Create a data structure twoStacks that represents two stacks. 
Implementation of twoStacks should use only one array, i.e., both stacks should use the same array for storing elements. 
Following functions must be supported by twoStacks.

push1(int x) –> pushes x to first stack
push2(int x) –> pushes x to second stack

pop1() –> pops an element from first stack and return the popped element
pop2() –> pops an element from second stack and return the popped element
 * 
 */


/**
 * For 2 stack 
 * 	- First stack from 0th & increment the counter s1Top
 *  - Second stack from nth & decrement the counter s2Top
 *	- Pop first at the s1Top and decrement s1Top
 *	- Pop Second at the s2Top and increment s2Top 
  */

/**
 * For 4 stack 
 * 	- Divide the array at half
 * 	- Do the below for first half --> which will give 2 stacks
 * 	- Do the below for second half --> which will give 2 stacks
 * 	- First stack from 0th & increment the counter s1Top
 *  - Second stack from nth & decrement the counter s2Top
 *	- Pop first at the s1Top and decrement s1Top
 *	- Pop Second at the s2Top and increment s2Top 
  */

/**
 * For 3 stack 
 * 	- Predefine the all the 3 stack size
 * 	- Do the below for first half --> which will give 2 stacks
 * 	- Do the below for second half --> which will give 2 stacks
 * 	- First stack from 0th & increment the counter s1Top
 *  - Second stack from nth & decrement the counter s2Top
 *	- Pop first at the s1Top and decrement s1Top
 *	- Pop Second at the s2Top and increment s2Top 
  */

public class TwoStackWithIN1Array {
	
	int s1Top;
	int s2Top;
	int temp;
	int[] internalArray;
	
	public TwoStackWithIN1Array(int n){
		internalArray = new int[n];
		s1Top = -1;
		s2Top = internalArray.length;
	}
	
	public String pushS1(int n){
		if((s2Top-s1Top) != -1){
			s1Top = s1Top+1;
			internalArray[s1Top] = n;
			return "Success";
		}
		return "StackOverFlow - Can't add";
	}
	
	public String pushS2(int n){
		
		if((s2Top-s1Top) != -1){
			s2Top = s2Top-1;
			internalArray[s2Top] = n;
			return "Success";
		}
		return "StackOverFlow - Can't add";
	}

	public int popS1(){
		if(s1Top != -1){
			temp = internalArray[s1Top];
			internalArray[s1Top] = 0;
			s1Top--;
			return temp;
		}else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
		return 0;
	}
	
	public int popS2(){
		if(s2Top != internalArray.length){
			temp = internalArray[s2Top];
			internalArray[s2Top] = 0;
			s2Top++;
			return temp;
		}else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
		return 0;
	}
	
	public static void main (String args[]){
		TwoStackWithIN1Array array = new TwoStackWithIN1Array(7);
		array.pushS1(1);
		array.pushS1(2);
		array.pushS1(3);
		array.pushS2(4);
		array.pushS2(5);
		array.pushS1(10);
		System.out.println(array.popS1());
		System.out.println(array.popS2());
		array.pushS1(6);
		System.out.println(array.popS1());

		
		
	}
}
