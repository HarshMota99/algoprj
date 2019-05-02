package com.pratice.string.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
             
Input: "dvdf"
Output: 3
Explanation: The answer is "vdf", with the length of 3. 
                         
             
             
 */

public class LongestSubstringWithoutReaptingCharacters {
	
	/**

	public static int checklength(String s) {
		int maxSubstringLen = Integer.MIN_VALUE;
		
		if(s==null || s =="") {
			return 0;
		}
		
		char[] charArr = s.toCharArray();
		String temp ="";
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<=charArr.length-1;i++) {
			if (hm.containsKey(charArr[i])) {
				maxSubstringLen = Math.max(maxSubstringLen, temp.length());
				hm.clear();
				hm.put(charArr[i], 1);
				temp = "";
				temp = temp + charArr[i];
				int j= i-1;
				while(j>0){ // This while loops is done for this kind of value "dvdf" where we need to go back to check till where we can inculde in our new substring
					if(hm.containsKey(charArr[j])) {
						break;
					}else {
						hm.put(charArr[j], 1);
						temp = charArr[j] + temp;
						j--;
					}
				}
				
			}else {
				temp = temp+charArr[i];
				hm.put(charArr[i], 1);
				maxSubstringLen = Math.max(maxSubstringLen, temp.length());
			}
		}
		
		return maxSubstringLen;
	}
	*/
	
	// With set its is much easier
	
	public static int checklengthSet(String s) {
		int result = Integer.MIN_VALUE;
		
		if(s==null || s.length()<1) {
			return 0;
		}
		
		Set<Character> set = new HashSet<Character>();
		
		char[] charArr = s.toCharArray();
		
		for(int i=0; i<=charArr.length-1;i++){
			if(set.add(charArr[i]) == false) {
				result = Math.max(result, set.size());
				set.clear();
				int j = i;
				while(j>=0 && set.add(charArr[j])) { // We do this to go back till the place where duplicate is present. So we can start our substring from the next of that duplicate.
					j--;
				}
				result = Math.max(result, set.size());
			}
			result = Math.max(result, set.size());
		}
		result = Math.max(result, set.size());
		return result;
	}
	
	
	public static void main(String args[]) {
		System.out.println(LongestSubstringWithoutReaptingCharacters.checklengthSet("abcabcbb"));
	}
	
}
