package com.pratice.string.general;

public class ReplaceString {
	
	public String replace(String input){
		 //return input!=null ? (input.replace(input.substring(1, input.length()), "*")) : "N/A";
		
		//return input!=null ? (input.substring(0)+(input.substring(1, input.length()).replaceAll(".", "*"))) : "N/A";
		
		return input!=null ? input.substring(0,3)+(input.substring(4, input.indexOf("@")).replaceAll(".", "*"))+input.substring(input.indexOf("@"), input.length()) : "N/A";
		
	}
	
	public static void main(String args[]){
		ReplaceString replaceString = new ReplaceString();
		//System.out.println(replaceString.replace("harsh"));
		//System.out.println(replaceString.replace("mota"));
		System.out.println(replaceString.replace("harsh.motha@gmail.com"));
	}

}
