package com.pratice.string.CTCI;

import java.util.HashSet;
import java.util.Set;

import javax.swing.InputMap;

public class IsUnique {

	static boolean isUnique = true;
	static public boolean checkUniqueCharWithDS(String input){

		char[] charArr = input.toCharArray();
		
		Set<Character> uniqueSet = new HashSet<>();
		
		for(int i=0;i<=charArr.length-1;i++){
			if(uniqueSet.contains(charArr[i])){
				return false;
			}else{
				uniqueSet.add(charArr[i]);
			}
		}
		return true;
	}
	
	static public boolean checkUniqueCharWithOutDS(String input){
		
		//https://stackoverflow.com/questions/25847191/new-to-java-trying-to-understand-checker-1-val
		int checker = 0;
	     
        for (int i = 0; i < input.length(); ++i)
        {
            int val = (input.charAt(i)-'a');
     
            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return false;
     
            // set bit in checker
            checker |= (1 << val);
        }
		return isUnique;
	}
	
public static void main(String args[]){
	System.out.println(checkUniqueCharWithDS("HARSCGFTER"));
}
}
