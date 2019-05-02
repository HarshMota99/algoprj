package com.pratice.general;

public class Sunumber {
		
	int result = 0;
	public int sunum(int input){
		
		if(input <=0){
			return input;
		}
		result = result + (input % 10);
				
		sunum(input / 10);
		return result;
	}
	public static void main (String args[]){
		Sunumber sunumber = new Sunumber();
		System.out.println(sunumber.sunum(2345));
	}

}
