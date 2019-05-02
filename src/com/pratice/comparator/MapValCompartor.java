package com.pratice.comparator;

/**
 * 
Comparable and Comparator

The object which needs to be compared can be made to implement comparable and in turn become comparable. 
It has method compareto.
It can have only one way to compare because the method is written inside the object itself.

If we want many ways to compare, is when comparator comes into picture and it is written outside the class itself. 

 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapValCompartor implements Comparator<Map.Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
	
	public static void main(String args[]){
		
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("A", 1);
		testMap.put("Z", 26);
		testMap.put("C", 3);
		testMap.put("Y", 25);
		testMap.put("E", 5);
		
		List<Entry<String, Integer>> testList = new ArrayList<Entry<String, Integer>>(testMap.entrySet());
		MapValCompartor mapValCompartor = new MapValCompartor();
		Collections.sort(testList,mapValCompartor);
		
		for(Entry<String, Integer> entry : testList){
			System.out.println(entry.getKey());
		}
		
	}
}
