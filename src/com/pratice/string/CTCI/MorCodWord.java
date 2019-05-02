package com.pratice.string.general;

import java.util.HashSet;
import java.util.Set;

public class MorCodWord {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet<String>();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray()){
                code.append(MORSE[c - 'a']);
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
    
    public static void main(String args[]){
    	
    	MorCodWord codWord = new MorCodWord();
    	System.out.println(codWord.uniqueMorseRepresentations(new String[]{"geeksforgeeks","aaa"}));
    }
}