package com.pratice.string.leetcode;

/*
 
 The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

 

Example 1:
Input: 1
Output: "1"

Example 2:
Input: 4
Output: "1211"

https://www.youtube.com/watch?v=TruT9EsGids
 */

public class CountAndSay {

    public String countAndSay(int n) {
        
        String finalResult = "1";
        String subResult = "";
        int counter = 0;
        int currentElement = 1;
        for(int i=1; i<n;i++){
            char[] charArr = finalResult.toCharArray();
            for(int j=0;j<=charArr.length-1;j++){
                if(currentElement == Integer.parseInt(Character.toString(charArr[j]))){
                    counter++;
                }else{
                    subResult = subResult + String.valueOf(counter)+String.valueOf(currentElement);
                    currentElement = Integer.parseInt(Character.toString(charArr[j])); // Make next element to current
                    counter = 1; // Make counter one as element added to currentElement
                }
            }
            subResult = subResult +String.valueOf(counter)+String.valueOf(currentElement);
            finalResult = subResult;
            subResult = "";
            counter = 0;
            currentElement = Integer.parseInt(Character.toString(finalResult.charAt(0))); // Make the new final string first element to currentElement
        }
        return finalResult;
    }
    
    public static void main(String args[]) {
    	
    	CountAndSay andSay = new CountAndSay();
    	System.out.println(andSay.countAndSay(5));
    	
    }
}
