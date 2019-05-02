package com.pratice.array.singleArray.CTCI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anagram: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 * Problem: Given a set of words, find which are anagram.
 * Convert String to charArray and sort it. Compare the sorted string. 
 *
 */

public class Anagram {

	Map<String, List<String>> resultMap = new HashMap<String, List<String>>();

	public Map<String, List<String>> getAnagrams(List<String> inputList) {

		for (String key : inputList) {
			char[] tempCharArray = key.toCharArray();
			Arrays.sort(tempCharArray);
			String tempString = String.valueOf(tempCharArray.length);
			if(resultMap.containsKey(tempString)){
				List<String> valueList = resultMap.get(tempString);
				valueList.add(key);
				resultMap.put(tempString, valueList);
			}else{
				List<String> valueList = new ArrayList<>();
				valueList.add(tempString);
				resultMap.put(tempString, valueList);
			}
		}
		return resultMap;
	}

	public static void main(String args[]) {

		ArrayList<String> input = new ArrayList<String>();
		input.add("eat");
		input.add("ate");
		input.add("tea");
		input.add("cup");
		input.add("puc");
		input.add("tet");
		
		Anagram anag = new Anagram();
		System.out.println(anag.getAnagrams(input).toString());

	}
}
