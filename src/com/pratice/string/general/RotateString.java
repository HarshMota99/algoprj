package com.pratice.string.CTCI;

/**
Assume you have a method i5Substring which checks ifone word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to isSubstring (e.g., waterbottle a rotation of erbottlewat ).

Hint:

s1 = waterbottle
s2 = erbottlewat

s1s1 = waterbottle + waterbottle

Now just check if s1s1 contains s2. 

 */

public class RotateString {

	public static boolean rotate(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		String twin = s1+s1;
		if(twin.contains(s2))
			return true;
		else
			return false;
	}

	public static void main(String args[]){
		System.out.println(rotate("waterbottle","erbottlewat"));
	}
}
