package com.pratice.math.geeks;

public class RevNum {

	String result="";
	public String revInp(int input){
		
		if(input <= 0){
			return result;
		}
		
		result = result + String.valueOf(input % 10);
		revInp(input /10);
		return result;
	}
	
	public static void main(String args[]) {
		RevNum num = new RevNum();
		System.out.println(num.revInp(454512333));
	}
}
