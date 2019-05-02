package com.pratice.array.singleArray.general;

public class ComplexSumBasedOnLogic1 {
    
    public void sumOfNumber(int[] input){
        
        int current = 0;
        int total = 0;
        
        for(int i =0; i<=input.length-1;i++){
        		current = input[i];
        		int temp =0;
	        	for(int j = i+1; j <= input.length-1; j++){
		        	if(input[j]<current && input[j]>temp){
		        		temp = input[j];
		        	}
	        	}
	        	if(temp==0){
	        		temp = current;
	        	}
	        	System.out.println(temp);
	        	total = total + temp;
        	}
        System.out.println(total);
    }
    
    public static void main(String args[]) {
        
        ComplexSumBasedOnLogic1 mc = new ComplexSumBasedOnLogic1();
        mc.sumOfNumber(new int[]{10, 29, 5, 25, 18});
        
    }
}