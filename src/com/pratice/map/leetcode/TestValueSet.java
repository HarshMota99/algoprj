package com.pratice.map.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestValueSet {

	public void test(){

		 Map<Character,Character> regex = new HashMap<>();
	     regex.put("(".charAt(0), ")".charAt(0));
	      regex.put("{".charAt(0), "}".charAt(0));
	      regex.put("[".charAt(0), "]".charAt(0));
	      regex.put("<".charAt(0), ">".charAt(0));
		
	      System.out.println(regex.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), ")".charAt(0))).iterator().hasNext());
	      
	      if(regex.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), ")".charAt(0))).iterator().hasNext()){
	    	  
	      }
		
	}
	
	public static void main(String args[]){
		TestValueSet set = new TestValueSet();
		set.test();
	}
	
}
