package com.pratice.bst.leetcode;

/*

https://leetcode.com/problems/first-bad-version/

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example:
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 
 */

public class FirstBadVersion {
    public int firstBadVersion(int n, int target) {
    	if(target >n) {
    		return -1;
    	}
        
        int x = 0; // Note, x has to be always 0. If you put x=1, than it will give wrong results for target =2.
      int y = n;
      while (x<y) {
          int mid = x + (y - x) / 2;
          
          if(mid == target) {
        	  return mid;
          }else if(target > mid) {
        	  x = mid+1;
          }else if(target < mid) {
        	  y = mid-1;
          }
          
          
//          if (mid >= target) { // replaced the isBadVersion function with target
//              y = mid;
//          } else {
//              x = mid + 1;
//          }
      }
      return -1;
      
      }
	
    public static void main(String args[]) {
    	
    	FirstBadVersion badVersion = new FirstBadVersion();
    	System.out.println(badVersion.firstBadVersion(5, 4));
    }

}
