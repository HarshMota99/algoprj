package com.pratice.list.arraylist.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialNetwork {
	
	 public static void socialGraphs(List<Integer> counts) {
		    // Write your code here

		     Map<Integer,Integer> hm = new HashMap<>();
		    
		    for(int i=1;i<=counts.size()-1;i++){
		        hm.put(i,counts.get(i));
		    }

		    for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
		        int val = entry.getValue();
		        for(Map.Entry<Integer,Integer> entry2 :hm.entrySet()){
		            if(entry2.getValue() == val){
		                System.out.print(entry2.getKey());
		            }
		        }
		         System.out.println();
		    }

		    }

		public static void main(String args[]) {
			List<Integer> arr = new ArrayList<Integer>();
			arr.add(5);
			arr.add(2);
			arr.add(1);
			arr.add(1);
			arr.add(2);
			arr.add(1);
			
			SocialNetwork.socialGraphs(arr);
		}

}
