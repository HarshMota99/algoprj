package com.pratice.array.singleArray.general;

public class ReverseRotation {
	
	public void revRotate(int[] input, int rotateBy){
		
		for(int i=0;i<rotateBy;i++){
			
			int temp1 = input[input.length-1];
			int temp2;
			
			for(int j = input.length-2;j>-1;j--){
				temp2 = input[j];
				input[j] = temp1;
				temp1 = temp2;
			}
			input[input.length-1] = temp1;
		}
		
		// temp2 = 0 1,2,3   temp1 = 3 
		// temp2 = 2 1,3,3   temp1 = 2 
		// temp2 = 1 2,3,3   temp1 = 1
		
		for(int k =0; k<=input.length-1; k++){
			System.out.println(input[k]);
		}
		
	}
	public static void main(String args[]){
		ReverseRotation array = new ReverseRotation();
		array.revRotate(new int[]{1,2,3},1);
	}
}
