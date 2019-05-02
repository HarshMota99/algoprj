package com.pratice.list.arraylist.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 
 */

public class SortArrayList {
	  public static List<Integer> customSort(List<Integer> arr) {
		    // Write your code here

		    Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		    List<Integer> uniqArr = new ArrayList<Integer>();
		    List<Integer> dupArr = new ArrayList<Integer>();

		    for(Integer i : arr){
		        if(hm.get(i) != null){
		            int val = hm.get(i) + 1;
		            hm.put(i,val);
		        }else{
		            hm.put(i,1);
		        }
		    }

		    for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
		        if(entry.getValue() == 1){
		            uniqArr.add(entry.getKey());
		        }else{
		        	for(int i=0;i<entry.getValue();i++) {
		        		dupArr.add(entry.getKey());
		        	}
		            
		        }
		    }

		    Collections.sort(uniqArr);
		    Collections.sort(dupArr);
		    arr = new ArrayList<Integer>();
		    arr.addAll(uniqArr);
		    arr.addAll(dupArr);
		    return arr;
		    
		    }

		public static void main(String args[]) {
			List<Integer> input = new ArrayList<Integer>();
			input.add(5);
			input.add(3);
			input.add(1);
			input.add(2);
			input.add(2);
			input.add(4);
			List<Integer> arr = SortArrayList.customSort(input);
			for(int i=0;i<=arr.size()-1;i++) {
				System.out.println(arr.get(i));
			}
		}
}
