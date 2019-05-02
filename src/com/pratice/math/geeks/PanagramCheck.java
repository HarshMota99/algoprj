package com.pratice.general;

/**
 * Pangram: is a sentence or verse that contains all the letters of the alphabet.
 */

import java.util.HashMap;
import java.util.Map;

public class PanagramCheck {
	
	public boolean checkPanagram(String input){
		boolean result = true;
		
		char[] charInputArray = input.toCharArray();
		
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();
		
		char[] checkerCharArr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<=charInputArray.length-1;i++){
			if(!resultMap.containsKey(charInputArray[i])){
				resultMap.put(charInputArray[i],1);
			}
		}
		
		System.out.println(resultMap.size());
		for(int i=0;i<=checkerCharArr.length-1;i++){
			if(!resultMap.containsKey(checkerCharArr[i])){
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String args[]){
		PanagramCheck check = new PanagramCheck();
		System.out.println(check.checkPanagram("eqbuickrownfxjumpsverhelazydgt"));
	}
}
