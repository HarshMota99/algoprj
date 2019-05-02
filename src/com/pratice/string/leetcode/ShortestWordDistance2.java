package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 
https://leetcode.com/problems/shortest-word-distance-ii/submissions/
 
Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 
and return the shortest distance between these two words in the list. Your method will be called repeatedly many times with different parameters. 

Example:
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Input: word1 = “coding”, word2 = “practice”
Output: 3
Input: word1 = "makes", word2 = "coding"
Output: 1
Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.


 */

public class ShortestWordDistance2 {
	
	    
	    Map<String,List<Integer>> hm = new HashMap<String,List<Integer>>();
	    
	    public void WordDistance(String[] words) {
	        for(int i=0; i<=words.length-1;i++){
	            List<Integer> nums = hm.getOrDefault(words[i], new ArrayList<Integer>());
	            nums.add(i);
	            hm.put(words[i], nums);
	        }
	        
	    }
	    
	    public int shortest(String word1, String word2) {
	        
	        int min = Integer.MAX_VALUE;
	        
	        List<Integer> nums1 = hm.get(word1);
	        List<Integer> nums2 = hm.get(word2);
	        
	        for(int i=0; i<=nums1.size()-1; i++){
	            for(int j=0; j<=nums2.size()-1; j++){
	                int diff = Math.abs(nums1.get(i) - nums2.get(j));
	                if(diff<min){
	                    min = diff;
	                }
	            }
	        }
	        return min;
	    }
	}


