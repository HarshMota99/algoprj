package com.pratice.general;

public class RoundingInteger {
	
	public Integer rounding(Integer input){
		
		if(input % 10 <= 5){
			return input - (input % 10);
		}else{
			return input + (10 - input % 10);
		}
	}

	public static void main(String args[]){
		RoundingInteger rt = new RoundingInteger();
		System.out.println(rt.rounding(1239));
		
	}
}
