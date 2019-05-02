package com.pratice.list.linkedlist.leetcode;


/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

Hint:
https://www.youtube.com/watch?v=zGQq3HGBTXg

1. Find the first lesser number from the right to left
2. Find the first number that is great than the found in #1
3. Swap them
4. Inverse the sub array from the point where we swapped


 */


public class NextPermutation {
	
	public int[] nextPermutation(int[] nums) {
	      if(nums.length<=1){
	          return nums;
	      }
	      
	      int i= nums.length-1;
	      
	      for(;i>=1;i--){
	         
	         if(nums[i]>nums[i-1]){ //find first number which is smaller than it's after number
	             break;
	         }
	      }
	      
	      if(i!=0){
	          swap(nums,i-1); //if the number exist,which means that the nums not like{5,4,3,2,1}
	      }
	      
	      reverse(nums,i); 
	      return nums;
	    }
	    
	    private void swap(int[] a,int i){
	        for(int j = a.length-1;j>i;j--){
	            if(a[j]>a[i]){
	                int t = a[j];
	                a[j] = a[i];
	                a[i] = t;
	                break;
	            }
	        }
	    }
	    
	    private void reverse(int[] a,int i){//reverse the number after the number we have found
	        int first = i;
	        int last = a.length-1;
	        while(first<last){
	            int t = a[first];
	            a[first] = a[last];
	            a[last] = t;
	            first ++;
	            last --;
	        }
	    }
	    
	    public static void main(String args[]) {
	    	NextPermutation nextPermutation = new NextPermutation();
	    	int[] result = nextPermutation.nextPermutation(new int[] {1,2,3});
	    	for(int i=0; i<=result.length-1; i++) {
	    		System.out.println(result[i]);
	    	}
	    }

}
