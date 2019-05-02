package com.pratice.array.singleArray.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

A sequence X_1, X_2, ..., X_n is fibonacci-like if:
n >= 3
X_i + X_{i+1} = X_{i+2} for all i + 2 <= n
Given a strictly increasing array A of positive integers forming a sequence, find the length of the longest fibonacci-like subsequence of A.  If one does not exist, return 0.
(Recall that a subsequence is derived from another sequence A by deleting any number of elements (including none) from A, without changing the order of the remaining elements.  
For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].)

 

Example 1:
Input: [1,2,3,4,5,6,7,8]
Output: 5
Explanation:
The longest subsequence that is fibonacci-like: [1,2,3,5,8].

Example 2:
Input: [1,3,7,11,12,14,18]
Output: 3
Explanation:
The longest subsequence that is fibonacci-like:
[1,11,12], [3,11,14] or [7,11,18].


 */


public class LengthofLongestFibonacciSubsequence {
	
	// Second one is better
	
    public static int lenLongestFibSubseq(int[] A) {
        List<Integer> tempList = new ArrayList<Integer>();
        
        int prev = 0;
        int cur = 0;
        int maxLength = Integer.MIN_VALUE;
        
        for(int i=0; i<=A.length-1; i++) {
        
        	for(int j=i+1 ; j<=A.length-1; j++){
	        	prev = A[i];
	            cur = A[j];
	            tempList.add(prev);
	            tempList.add(cur);
	            for(int k=j+1; k<=A.length-1; k++){
	                if(prev + cur == A[k]){
	                    tempList.add(A[k]);
	                    prev = cur;
	                    cur = A[k];
	                }
	            }
            
            maxLength = Math.max(maxLength,tempList.size());
            tempList.clear();
        }
        
        } 	
        if(maxLength>=3){
            return maxLength;    
        } else{
            return 0;
        }       
        
    }

    
    // Better Solution
    
    public static int lenLongestFibSubseq2(int[] A) {
    	int N = A.length;
    	int n = 0;
    	Set<Integer> set = new HashSet<Integer>();
    	for (int x : A) {
    		set.add(x);
    	}
    	for (int i = 0; i < N - 2; ++i) {
    		for (int j = i + 1; j < N - 1; ++j) {
    			int len = 2;
    			int prev = A[i];
    			int cur = A[j];
    			int z = prev + cur;
    			while (set.contains(z)) {
    				prev = cur;
    				cur = z;
    				z = prev + cur;
    				++len;
    			}
    			n = Math.max(n, len);
    		}
    	}
    	return n >= 3 ? n : 0;
    }
    
    
    
	 public static void main (String args[]) {
		 
		 System.out.println(LengthofLongestFibonacciSubsequence.lenLongestFibSubseq2(new int[] {2,4,7,8,9,10,14,15,18,23,32,50}));
		 
	 }
}
