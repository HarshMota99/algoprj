package com.pratice.math.geeks;

/**
* Problem: Convert Binary to Decimal
 * 
 * 0 0 
 * 1 1 
 * 2 10 
 * 3 11 
 * 4 100 
 * 5 101 
 * 6 110 
 * 7 111
 *  
 */

public class Decimal2Binary {

	String result = "";
	public String binConvert(int input){
		
		while(input > 0){

			int temp = input % 2 ;
			result =  String.valueOf(temp) + result;
			input = input / 2;
		}
		return result;
	}
	
	
	public static void main(String args[]){
		Decimal2Binary bin = new Decimal2Binary();
		System.out.println(bin.binConvert(2));
	}

}
