package com.pratice.array.singleArray.leet;

/*
 Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        
        for(int i=0; i<=strs.length-1; i++){
            String key = sortString(strs[i]);
            if(hm.containsKey(key)){
            	List<String> temp = hm.get(key);
            	temp.add(strs[i]);
                hm.put(key, temp);                
            }else{
            	List<String> temp = new ArrayList<String>();
            	temp.add(strs[i]);
                hm.put(key, temp);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>(hm.values());
        return result;
    }
    
    public static String sortString(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }

    public static void main(String args[]) {
    	
    	System.out.println(GroupAnagrams.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    
    
}
