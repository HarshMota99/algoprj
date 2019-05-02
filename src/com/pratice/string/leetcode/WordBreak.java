package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, 
determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
             Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false
 */


public class WordBreak {

public static boolean wordBreak(String s, List<String> dict) {
        
        boolean[] f = new boolean[s.length() + 1]; 					// All the default values are true 
        
        f[0] = true; 												// We are making the 0th value true always to help with jth 0 and ith exact valeu. See below
        
        //Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){      // Everytime we start with j=0 and i= exact value. Only if the exact value is present and that time jth value 0 is true. It will proceed.
                    f[i] = true;								  // at that instance we are making the boolean ith value ture. So next time when j reaches here and ith value is end.. it will be true and if that word is in dict.. it will be true
                    break;
                }
            }
        }
        
        return f[s.length()];
    }
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		//Set<String> set = new HashSet<String>();
		list.add("leet");
		list.add("code");
		System.out.println(WordBreak.wordBreak("leetcode",list ));
	}
	
	
}
