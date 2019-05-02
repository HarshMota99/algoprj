package com.pratice.math.geeks;

import java.util.HashMap;
import java.util.Map;

public class IntOccurenceCounter {
	
	Map<Integer, Integer> intCounter = new HashMap<Integer, Integer>();
	public void count(int[] input){
		for(int i = 0; i <=input.length-1;i++){
			if(intCounter.containsKey(input[i])){
				intCounter.put(input[i], (intCounter.get(input[i])+1));
			}else{
				intCounter.put(input[i], 1);
			}
		}
	
		for(Map.Entry<Integer, Integer> i: intCounter.entrySet()){
			System.out.println(i.getKey()+"=="+i.getValue());
		}
	}

public static void main(String args[]){
	IntOccurenceCounter counter = new IntOccurenceCounter();
	counter.count(new int[]{10,4,10,1,3,2,2,2,1,5,5,4,6,10,10,4});
	
}
}
