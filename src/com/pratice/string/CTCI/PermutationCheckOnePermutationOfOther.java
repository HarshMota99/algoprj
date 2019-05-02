package com.pratice.string.CTCI;

import java.util.Arrays;


/*
 * Hints:
 * 
 * Arrays.sort
 * Arrays.equals
 */

public class PermutationCheckOnePermutationOfOther {
	
	public static boolean isPermutation(String input1, String input2){
		
		char[] charArr1 =input1.toLowerCase().toCharArray(); 
		char[] charArr2 =input2.toLowerCase().toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1,charArr2);
	}

	public static void main(String args[]){
		System.out.println(isPermutation("Harsh","arshh"));
	}

}
