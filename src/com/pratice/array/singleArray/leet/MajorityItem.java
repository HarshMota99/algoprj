package com.pratice.array.singleArray.leet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2
 */

public class MajorityItem {

	
	  public static int majorityElement(int[] nums) {
	        
	        Map<Integer, Integer> hm = new HashMap<>();
	        
	        for(int i=0;i<=nums.length-1;i++){
	            if(hm.containsKey(nums[i])){
	                hm.put(nums[i], hm.get(nums[i])+1);
	            }else{
	                hm.put(nums[i],1);
	            }
	        }
	     
	        Integer maxValue = Collections.max(hm.values());
	        
	        
	        
	        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
	            if(null != entry.getValue() && maxValue == entry.getValue()){
	                return entry.getKey();
	            }
	        }
	        
	        return 0;
	    }
	  
	  public static void main(String args[]) {
		  System.out.println(MajorityItem.majorityElement(new int[] {1,2,1,2,2}));
	  }
	  
}
