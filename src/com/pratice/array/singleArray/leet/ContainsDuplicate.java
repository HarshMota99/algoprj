package com.pratice.array.singleArray.leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

public class ContainsDuplicate {
	
//	public static boolean containsDuplicate(int[] nums) {
//        boolean result=false;
//        if(nums.length<2){
//            return result;
//        }
//        
//        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        
//        for(int i=0; i<=nums.length-1; i++){
//            if(hm.get(nums[i]) != null && hm.get(nums[i])==1){
//                result = true;
//                return result;
//            }else{
//                hm.put(nums[i],1);
//            }
//        }
//
//        return result;
//    }
	
	//Best way
	
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        if(nums.length<2){
            return result;
        }
        
       Set<Integer> set = new HashSet<Integer>();
       
        for(int i=0; i<=nums.length-1;i++){
            if(!set.add(nums[i])){
                result = true;
                return result;
            }
        }
        return result;
    }
	
	
	public static boolean containsDuplicate2(int[] nums) {
        boolean result=false;
        if(nums.length<2){
            return result;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<=nums.length-1; i++){
            if(set.contains(nums[i])){
                result = true;
                return result;
            }else{
                set.add(nums[i]);
            }
        }
        
        return result;
    }
	
	
	public static void main(String args[]) {
		System.out.println(ContainsDuplicate.containsDuplicate2(new int[] {1,2}));
	}
}
