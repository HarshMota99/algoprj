package com.pratice.string.general;

public class StringRemoveSpace {
	
	public static void performSpaceRemoval(String input){
		
		String result = input.replace(" ", "");
		System.out.println(result);
		
	}
	public static void main(String args[]){
		performSpaceRemoval("H ars    1232  wd3 23rf wsdf h");
	}

}
