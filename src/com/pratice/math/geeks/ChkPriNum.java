package com.pratice.math.geeks;


/**
 * 
 * Start from 2 till less than that number. 
 * If any number mod (reminder) is 0, than its divisible by that number, hence its false.
 *
 */

public class ChkPriNum {
	public boolean chkpro(int input) {
		boolean isPri = true;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				isPri = false;
				return isPri;
			}
		}
		return isPri;
	}
	public static void main(String args[]){
		ChkPriNum chkPriNum = new ChkPriNum();
		System.out.println(chkPriNum.chkpro(3));
	}

}
