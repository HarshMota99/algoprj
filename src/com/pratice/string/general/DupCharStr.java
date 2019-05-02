package com.pratice.string.general;

/**
 * Problem: Print the dup chars
 */

import java.util.HashMap;
import java.util.Map;

public class DupCharStr {

	Map<Character, Integer> charMap = new HashMap<>();
	public void printDupChars(String input) {
		for(int i = 0; i<=input.length()-1; i++){
			
			if(charMap.containsKey(input.charAt(i))){
				charMap.put(input.charAt(i), charMap.get(input.charAt(i))+1);
			}else{
				charMap.put(input.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character, Integer> i : charMap.entrySet()){
			System.out.println(i.getKey()+"::"+i.getValue());
		}
	}
	
	public static void main(String args[]){
		DupCharStr charStr = new  DupCharStr();
		charStr.printDupChars("HarsH");
	}
}
