package com.pratice.map.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses2 {
	
	static String[] braces(String[] values) {
        if(values.length<1){
            return null;
        }
        String[] output = new String[values.length];
        outerloop:
        for(int k=0;k<=values.length-1;k++){
            String s = values[k];
            char[] charArr = s.toCharArray();

            Stack<Character> mainStack = new Stack<>();

            Map<Character, Character> regex = new HashMap<>();

            regex.put("(".charAt(0), ")".charAt(0));
            regex.put("{".charAt(0), "}".charAt(0));
            regex.put("[".charAt(0), "]".charAt(0));
            regex.put("<".charAt(0), ">".charAt(0));
            innerloop:
            for (int i = 0; i <= charArr.length - 1; i++) {
             char t = charArr[i];
                if (mainStack.isEmpty()) { // If the stack is empty the first value can be an opening bracket
                    if (!regex.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), t)).iterator()
                            .hasNext()) {
                        mainStack.push(charArr[i]);
                    } else {
                        output[k] = "NO";
                        break ;
                    }
                }
                else if (regex.get(mainStack.peek()) != null && charArr[i] == regex.get(mainStack.peek())) {
                    mainStack.pop();
                } else {
                    mainStack.push(charArr[i]);
                }
            }
            if (mainStack.empty())
            {
                output[k] = "YES";
            } else {
                output[k] = "NO";
            }
        }
        return output;
    }
	
	public static void main(String args[]) {
		String[] result =  ValidParentheses2.braces(new String [] {"}][}}(}][))]","[](){()}]","()","({}([][]))[]()","{)[](}]}]}))}(())(","([[)"});
		for(String r : result){
			System.out.println(r);
		}
	}

}
