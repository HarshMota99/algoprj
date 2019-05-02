package com.pratice.array.singleArray.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
	
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 
		 Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 for(int i=0;i<=nums2.length-1;i++) {
			 hm.put(nums2[i],i);
		 }
	        
	        int[] result = new int[nums1.length];
	        boolean found = false;
	        
	        for(int i=0;i<=nums1.length-1;i++){
	            found = false;
	            for(int j=hm.get(nums1[i]); j<=nums2.length-1;j++){
	                if(nums2[j] > nums1[i]){
	                    result[i]= nums2[j];
	                    found = true;
	                    break;
	                }
	            }
	            if(!found){
	                result[i] = -1;
	                found = false;
	            }
	            
	        }
	        return result;
	    }
	 
	 public static void main(String args[]) {
		 
		 NextGreaterElement element = new NextGreaterElement();
		 int[] result = element.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
		 System.out.println(result.length);
	 }

}
