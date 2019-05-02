package com.pratice.string.CTCI;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string.
 *
 *
 */

public class StringCompress {

	public static void performCompression(String inputStr) {
		
		String result = ""+inputStr.charAt(0);
		int temp = 1;
		char[] charArr = inputStr.toCharArray();
		
		for(int i = 1; i<=charArr.length-1; i++){
			if(result.charAt(result.length()-1) == charArr[i]){
				temp++;
			}else{
				result = result +temp+ charArr[i];
				temp = 1;
			}
		}
		result = result +temp;
		System.out.println(result);
	}

	public static void main(String args[]) {

		performCompression("ashaa");

	}

}