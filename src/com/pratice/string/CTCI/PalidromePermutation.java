package com.pratice.string.CTCI;

/**
 
 Print all palindrome permutations of a string

Given a string, we need to print all possible palindromes that can be generated using letters of that string.

Examples:

Input:  str = "aabcb"
Output: abcba bacab

nput:  str = "aabbcadad"
Output: aabdcdbaa aadbcbdaa abadcdaba
        abdacadba adabcbada adbacabda
        baadcdaab badacadab bdaacaadb
        daabcbaad dabacabad dbaacaabd
 
 */
import java.util.ArrayList;

/**
 * Hint:
 * 1. Check if palidrome string. Formula = Count of unique string chars should have only one odd count.
 * 2. create all premutations
 * 3. Check which all premutations are palidrome using the string reverse method.
 */

import java.util.HashMap;
import java.util.Map;

public class PalidromePermutation {

	static Map<Character, Integer> charMap = new HashMap<>();
	static java.util.List<String> permuList = new ArrayList<>();

	public static void perform(String input) {
		if (isPalidromeAllowed(input)) {
			stringPermutation(input, 0, input.length() - 1);
			printPalidromesOfString();
		}
	}

	private static void printPalidromesOfString() {
		for (int i = 0; i <= permuList.size() - 1; i++) {
			if (isPalidrome(permuList.get(i))) {
				System.out.println(permuList.get(i));
			}
		}
	}

	private static boolean isPalidrome(String input) {

		StringBuilder sb = new StringBuilder(input);
		if (sb == sb.reverse()) {
			return true;
		}
		return false;
	}

	public static boolean isPalidromeAllowed(String input) {
		char[] charArr = input.toCharArray();
		int oddCounter = 0, temp = 0;
		for (int i = 0; i <= charArr.length - 1; i++) {
			if (charMap.containsKey(charArr[i])) {
				charMap.put(charArr[i], charMap.get(charArr[i]) + 1);
			} else {
				charMap.put(charArr[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> m : charMap.entrySet()) {
			if (m.getValue() % 2 != 0) {
				oddCounter++;
			}
		}
		if (oddCounter > 1)
			return false;
		return true;
	}

	public static void stringPermutation(String input, int x, int y) {

		if (x == y) {
			permuList.add(input);
		} else {
			for (int i = x; i <= y; i++) {

				input = swap(input, i, x);
				stringPermutation(input, x + 1, y);
			}
		}
	}

	private static String swap(String input, int i, int j) {
		char[] charArr = input.toCharArray();

		char temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;

		return String.valueOf(charArr);
	}

	public static void main(String args[]) {
		// System.out.println(isPalidromeString("hatyah"));
		perform("aabcb");
	}

}
