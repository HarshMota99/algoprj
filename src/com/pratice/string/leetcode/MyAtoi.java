package com.pratice.string.leetcode;

/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, 
takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains 
only whitespace characters, no conversion is performed. If no valid conversion could be performed, a zero value is returned.

Note:
Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.

Example 1:
Input: "42"
Output: 42

Example 2:
Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.

Example 3:
Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.

Example 4:
Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.

Example 5:
Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
 */

public class MyAtoi {
	public static int myAtoi(String str) {
        double result = 0;
        int sign = 1; 							// this is used to have integer type
        int count = 0;
        char[] charArr = str.toCharArray();
        for(char c:charArr){
            count ++;							// Dont know the use of count here. Need to check
            if( c >='0' && c <='9' ){
                result *= 10;					// Converting one char at a time to integer
                result += ( c - '0');           // this is used to convert a char to integer
            }else if( c == '-' && count == 1){
                sign = -1;
            }else if( c == '+' && count == 1){
                sign =  1;
            }else if( c == ' ' && count == 1){
                count --;
            }else{
                break;
            }
            
        }
        if( result > Integer.MAX_VALUE ){    // to return if the result is greater than 32 bit
            if(sign == 1)
                return Integer.MAX_VALUE;    // sign will help to put a sing to it 
            else
                return Integer.MIN_VALUE;
        }else{
            return (int)(result * sign);    // sign will help to put a sing to it
        }
    }

public static void main(String args[]) {
	//System.out.println(MyAtoi.myAtoi("+45"));
	//System.out.println(MyAtoi.myAtoi("+4 5"));
	//System.out.println(MyAtoi.myAtoi("+4 5 abd"));
	//System.out.println(MyAtoi.myAtoi(" +4 5"));
	// System.out.println(MyAtoi.myAtoi("abs +4 5"));
	System.out.println(MyAtoi.myAtoi("  +4 5"));
}


}


