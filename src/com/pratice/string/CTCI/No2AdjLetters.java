package com.pratice.string.CTCI;

import java.util.Arrays;

public class No2AdjLetters {
	boolean mixed;

	public void transformString(String input) {
		if (input == null) {
			return;
		}
		char[] charArr = input.toCharArray();
		boolean mixed = true;
		int size = 0;
		while(size < charArr.length-1){
			
			if(charArr[size] == charArr[size+1]){
				mixed = false;
				for(int i= charArr.length-1; i>=size;i-- ){
					if(charArr[size+1] != charArr[i] && charArr[i] != charArr[size]){
						mixed = true;
						char temp = charArr[size+1];
						charArr[size+1] = charArr[i];
						charArr[i] = temp;
						break;
					}
				}
			}
				size++;
		}
		if(mixed){
			System.out.println(Arrays.toString(charArr));
		}
		

	}

	public static void main(String args[]) {
		No2AdjLetters adjLetters = new No2AdjLetters();
		adjLetters.transformString("aaabbbccc");
	}
}
