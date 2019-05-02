package com.test;

public class primetotal {

	public int sumOfPrime(int target) {
		int result = 0;
		for (int i = 2; i <= target; i++) {
			boolean temp = true;
			if (checkprime(i, temp)) {
				result = result + i;
			}
		}
		return result;
	}
	private boolean checkprime(int i, boolean temp) {
		for (int j = 2; j <= i/2; j++) {
			if (i % j == 0) {
				temp = false;
			}
		}
		return temp;
	}
	public static void main(String args[]){
		primetotal primetotal = new primetotal();
		System.out.println(primetotal.sumOfPrime(4));
	}

}
