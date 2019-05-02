package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DisElmArr {

	public void prinDisElm(int[] input) {
		
		// Old way
		int[] result = new int[input.length];
		for (int i = 0; i <= input.length-1; i++) {
			boolean temp = false;
			for (int j = 0; j <= result.length-1; j++) {
				if (input[i] == result[j]) {
					temp = true;
				}
			}
			if (temp == false) {
				result[i] = input[i];
			}
		}
		for (int i = 0; i <= result.length-1; i++) {
			System.out.println(result[i]);
		}
		
		// New way
		Set<Integer> testSet = new TreeSet<Integer>(Arrays.stream(input).boxed().collect(Collectors.toSet()));
		
		for(Integer i : testSet){
			System.out.println("--"+i.intValue());
		}
		
	}
	public static void main(String args[]){
		DisElmArr arr = new DisElmArr();
		arr.prinDisElm(new int[]{2,2,3,4,5});
	}

}
