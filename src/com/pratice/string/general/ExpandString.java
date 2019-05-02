package com.pratice.string.general;

public class ExpandString {

	String finalStr = "";

	public String expand(String input) {

		int tempF, tempE = 0;

		String[] comSptStr = input.split(",");

		for (String CSS : comSptStr) {

			if (CSS.length() > 1) {
				tempF = Integer.parseInt(Character.toString(CSS.charAt(0)));
				tempE = Integer.parseInt(Character.toString(CSS.charAt(2)));
				while (tempF != tempE) {
					finalStr = finalStr + String.valueOf(tempF);
					tempF++;
				}
			} else {
				finalStr = finalStr + CSS;
			}
		}
		return finalStr;
	}
	public static void main(String args[]){
		
		ExpandString expandString = new ExpandString();
		System.out.println(expandString.expand("1-5,6,7-15"));
		
	}
}
