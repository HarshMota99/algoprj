package com.pratice.math.geeks;

/**
 * 
 * Decimal Binary
 * 
 * 0 0 1 1 2 10 3 11 4 100 5 101 6 110 7 111
 * 
 * 
 * Solution:
 * 
 * List the power of 2 from left 256, 128, 64, 32, 16, 8, 4, 2, 1
 * 
 * Now for the given binary for every 1, add its power.
 * 
 * Ex: 111 will be 4+2+1 = 7
 *
 * 
 */

public class Binary2Decimal {

	private int con2Dec(int input) {

		int result=0, power2=1;

		while (input > 0) {

			if (input % 10 == 1) {
				result = result + power2;
			}
			input = input / 10;
			power2 = power2 * 2;
		}

		return result;
	}
	
	public static void main(String args[]) {
		Binary2Decimal bin2Dec = new Binary2Decimal();
		System.out.println(bin2Dec.con2Dec(111));
	}

}
