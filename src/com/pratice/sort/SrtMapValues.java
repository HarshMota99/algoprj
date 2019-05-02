package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.swing.InputMap;

public class SrtMapValues {
	
	public void srtVal(Map<String, Integer> inputMap){
		
//		for(Map.Entry<String, Integer> entry : inputMap.entrySet()){
//		}
		
		TreeSet<Integer> testTree = new TreeSet<>(inputMap.values());
		List<Integer> testList = new ArrayList<>(testTree);
		Collections.sort(testList);
	}

}
