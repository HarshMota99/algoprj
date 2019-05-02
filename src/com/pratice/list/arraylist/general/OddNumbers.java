package com.pratice.list.arraylist.general;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

	public List<Integer> test(int l, int r){
		
		List<Integer> result = new ArrayList<Integer>();
		
		int counter = 0;
		while(l<=r) {
			System.out.println("-->"+l/2 );
			if(l%2 != 0) {
				result.add(l);
				counter++;
			}
			
			l++;
			
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		OddNumbers numbers = new OddNumbers();
		List<Integer> result = numbers.test(2,5);
		for(int i=0;i<=result.size()-1;i++) {
			System.out.println(result.get(i));
		}
	}
	
}
