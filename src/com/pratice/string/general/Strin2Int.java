package com.pratice.string.general;

public class Strin2Int {
	
	public void prinInt(String input){
		
		int result = 0; 
		for(int i=0 ; i<=input.length()-1;i++){
			result = result + input.charAt(i);
		}
		System.out.println(result);
	}
	public static void main(String args[]){
		
		Strin2Int int1 = new Strin2Int();
		int1.prinInt("harsh");
	}

}
