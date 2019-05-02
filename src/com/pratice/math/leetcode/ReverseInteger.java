package com.pratice.math.leetcode;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


 */

public class ReverseInteger {
	
	public int reverse(int x) {
		int result =0;
		
		while((x/10)!=0) {
			
			int temp = x % 10;
			result = result * 10 + temp; // We do *10, just to get rid of string conversion way. Here every time we come and *10. e.g: 3*10 = 30  + 2 = 32, next time 32 *10 = 320 + 1 321
			x = x/10;
			
			// Below is to satisfy the above 32-bit
			if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
	        if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
		}
		result = result * 10 + x; // last value left
		
		return result;
		
	}

}
