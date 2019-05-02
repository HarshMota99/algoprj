package com.pratice.string.leetcode;
/*
 Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class InMemoryReverse {
	public static String reverseString(char[] s) {

		if (s.length < 1) {
			return "";
		}

		char temp;
		int counter = s.length - 1;
		for (int i = 0; i <= (s.length - 1) / 2; i++) {
			temp = s[counter];
			s[counter] = s[i];
			s[i] = temp;
			counter--;
		}
		return String.valueOf(s);
	}

	public static void main(String args[]) {
		System.out.println(InMemoryReverse.reverseString(new char[] {'H','E','L','L','O'}));
	}
}
