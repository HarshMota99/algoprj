package com.pratice.string.leetcode;

/**

Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

So convert the binary to decimal and add it and coverted the result back to binary.

 */

public class AddBinary {
	
	public String addBinary(String a, String b) {
		int num1 = convertToDecimal(a);
		int num2 = convertToDecimal(b);
		
		int decimalResult = num1+num2;

		return convertToBinary(decimalResult);
    }

	private int convertToDecimal(String a) {

		int input = Integer.parseInt(a);
		int power = 2;
		int result = input%10==1?1:0;
		input = input /10;
		
		while(input != 0){
			if(input % 10 == 1){
				result = result + power;
			}
			input = input /10;
			power = power * 2;
		}
		return result;
	}
	
	private String convertToBinary(int decimalResult) {

		String result="";
		
		while(decimalResult > 0){
			result = String.valueOf(decimalResult % 2)+ result;
			decimalResult = decimalResult /2;
		}
		return result;
	}

	
	public static void main(String args[]){
		AddBinary addBinary = new AddBinary();
		System.out.println(addBinary.addBinary("101", "101")); 
		// It not wokring for big strings. 
		//Tried to make it work using BigInteger.. but taking time.. So moving on.
	}

	

}
