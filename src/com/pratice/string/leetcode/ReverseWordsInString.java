package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**

Input: "the sky is blue",
Output: "blue is sky the".

 */

public class ReverseWordsInString {
	
	// Brute force

	public String reverseWords1(String s) {

		String result = "";
		String temp = "";

		char[] charArr = s.toCharArray();

		for (int i = charArr.length - 1; i >= 0; i--) {

			if (charArr[i] != " ".charAt(0)) {
				if (i - 1 >= 0 && charArr[i - 1] != " ".charAt(0)) {
					temp = charArr[i] + temp;
				} else {
					temp = charArr[i] + temp;
					result = result + temp;
					temp = "";
				}
			} else if (charArr[i] == " ".charAt(0) && i - 1 >= 0 && charArr[i - 1] == " ".charAt(0)) {
				continue;
			} else if (charArr[i] == " ".charAt(0) && i - 1 >= 0 && charArr[i - 1] != " ".charAt(0) && result == "") {
				continue;
			} else if (charArr[i] == " ".charAt(0) && i - 1 == 0) {
				continue;
			} else if (charArr[i] == " ".charAt(0) && i - 1 >= 0 && charArr[i - 1] != " ".charAt(0)) {
				result = result + charArr[i];
			}
		}
		return result;
	}
	
	
	// Simple and efficient

	public String reverseWords2(String s) {
		String[] words = s.trim().split(" +");       // + here is like multiple space or at least one space. so we trimmed the spaces 
		Collections.reverse(Arrays.asList(words));
		return String.join(" ", words);
	}
	
	 public String reverseWords3(String s) {
	       	String[] splitString = s.trim().split(" +");
			StringBuilder result = new StringBuilder();
			
			for(int i = splitString.length-1;i>=0;i--){
				result.append(splitString[i] + " ");
			}
			
			return result.toString();
	    }

	public static void main(String args[]) {
		ReverseWordsInString inString = new ReverseWordsInString();
		// System.out.println(inString.reverseWords1(" the sky is blue"));
		System.out.println(inString.reverseWords2("  hello world!  "));
	}
}
