package com.pratice.string.CTCI;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=KBHFyg2AcZ4&t=248s
 * https://www.youtube.com/watch?time_continue=139&v=AfxHGNRtFac
 * 
 * Hint: Use Tree
 * 
 * ABC (ABC BAC CBA) Swap First char in first level ABC->(ABC ACB) BAC->(BAC
 * BCA) CBA->(CBA CAB) Swap second char in second level
 * 
 * 
 */

public class PremutationOfString {

	static int totalPermute = 0;
	String[] result;
	
	public void permute(String input, int x, int y){
		
		if (x == y) {
			System.out.println(input);
			totalPermute++;
		} else {
			for (int i = x; i <= y; i++) {
				input = swap(input, i, x);
				permute(input, x + 1, y);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		PremutationOfString premutationOfString = new PremutationOfString();
		premutationOfString.permute("ABC", 0, 2);
		System.out.println("totalPermute="+totalPermute);
	}

}
