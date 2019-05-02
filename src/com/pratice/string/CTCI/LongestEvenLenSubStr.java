package com.pratice.string.CTCI;

// Longest Even Length Substring such that Sum of First and Second Half is same

public class LongestEvenLenSubStr {

	int LS, LE, RS, RE;
	int LeftResult, RightResult = 0;

	public void processReq(String input) {

		char[] charInput = input.toCharArray();

		performCheck(charInput);

		if (LeftResult > RightResult) {
			for (int i = LS; i <= LE; i++) {
				System.out.println(charInput[i]);
			}
		} else if (LeftResult < RightResult) {
			for (int i = RS; i == RE; i++) {
				System.out.println(charInput[i]);
			}
		}
	}

	private void performCheck(char[] charInput) {

		int temp1 = charInput.length;
		int temp2 = 2;
		int sum1 = 0;
		int sum2 = 0;

		while (temp1 != 0) {

			if (temp1 % 2 == 0) {
				sum1 = calSum(charInput, 0, temp1 / 2 - 1);
				sum2 = calSum(charInput, temp1 / 2, temp1 - 1);
				LS = 0;
				LE = temp1 - 1;
			} else if (temp1 % 2 == 1) {
				sum1 = calSum(charInput, 1, temp1 / 2 - 1);
				sum2 = calSum(charInput, temp1 / 2, temp1 - 1);
				LS = 1;
				LE = temp1 - 1;
			}

			if (sum1 == sum2) {
				LeftResult = LE - LS;
				if(LeftResult==charInput.length-1){
					return;
				}
				break;
			}
			temp1--;
		}

		while (temp2 != charInput.length-1) {

			if((charInput.length-temp2/2)%2==0){
				sum1 = calSum(charInput,temp2,charInput.length-temp2/2);
				sum2 = calSum(charInput,temp2,charInput.length-1);
				
				
			}else if((charInput.length-temp2/2)%2==1){
				
			}
		
		}

	}

	public int calSum(char[] input, int s, int e) {

		int res = 0;
		for (int i = s; i <= e; i++) {
			res = res + input[i];
		}
		return res;
	}
	
	public static void main(String args[]){
		
		String input = "153086";
		
		LongestEvenLenSubStr evenLenSubStr = new LongestEvenLenSubStr();
		
		evenLenSubStr.processReq(input);
	}

}
