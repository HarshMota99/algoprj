package com.pratice.math.geeks;


/**
 *An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
 *For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
 *
 * Get the length of the input by divide by 10 till greater than 0
 * Now mod to get each digit and multiple it length times
 *
 */

public class ChkArmStrNum {
	
	int inputVal, result;
	
	public ChkArmStrNum(int input){
		this.inputVal = input;
	}
	
	public boolean process(){
		
		int tempInput = inputVal;
		
		while(tempInput> 0){
			int temp = tempInput % 10;
			result = result + (temp*temp*temp);
			tempInput = tempInput / 10;
		}
		
		if(result == inputVal){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String args[]){
		ChkArmStrNum armStrNum = new ChkArmStrNum(0);
		System.out.println(armStrNum.process());
		
	}
}
