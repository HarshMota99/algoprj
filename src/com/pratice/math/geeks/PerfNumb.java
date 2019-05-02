package com.pratice.math.geeks;

/**
 * In number theory, a perfect number is a positive integer that 
 * is equal to the sum of its proper positive divisors, that is, 
 * the sum of its positive divisors excluding the number itself (also known as its aliquot sum). 
 * 
 *eg: 
 * 6 is perfect number as its sum of all positive divisors (1,2,3,6) excluding itself is 6.
 * 28 is perfect number as its sum of all positive divisors (1,2,4,7,14,28) excluding itself is 28.
 *
 */

public class PerfNumb {
	
	public boolean chekPerfNum(int input){
		
		int result = 0;
		for(int i =1; i<input;i++){
			if(input % i == 0){
				result = result + i;
			}
		}
		if(result == input){
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		PerfNumb numb = new PerfNumb();
		System.out.println(numb.chekPerfNum(28));
	}
	
}
