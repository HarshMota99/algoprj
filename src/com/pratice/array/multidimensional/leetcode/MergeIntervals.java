package com.pratice.array.multidimensional.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


 */




// This is just interval class
 class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
 }


class MergeIntervals {
    
	
	// The main reason for comparator is to sort. For inputs like [[1,2][5,5][2,3][2,4]]
	
	// If we dont sort than the result will be  [[1,4]] instead of [[1,4], [5,5]]
	
	
	  private static class IntervalComparator implements Comparator<Interval> {
	        @Override
	        public int compare(Interval a, Interval b) {
	            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
	        }
	    }
	    
	    public static List<Interval> merge(List<Interval> intervals) {
	        Collections.sort(intervals, new IntervalComparator());
	        int rowLength = intervals.size();
	        List<Interval> resultIntervals = new ArrayList<Interval>(); // result list
	        
	        for(int i=0; i<= rowLength-1; i++){
	            Interval prev = new Interval();       // New interval to add to result
	            prev.start = intervals.get(i).start;  // start
	            prev.end = intervals.get(i).end;     // end
	            int counter=0;  					// counter helps to skips all the onces which have overlapped and start the i at next
	            for(int j=i+1; j<=rowLength-1; j++){ // start checking from the next
	                
	            	Interval cur = intervals.get(j); 
	            	
	                if(prev.end >= cur.start && cur.end !=0){   // 0 check is to avoid to include it here.. that should be printed sepreate
	                    prev.end = Math.max(cur.end,prev.end); // 
	                    prev.start = Math.min(prev.start,cur.start);
	                    
	                    if(j <= rowLength-1){
	                        counter = j;
	                    }
	                }
	            }
	            if(counter !=0){
	             i = counter;   
	            }
	            
	            resultIntervals.add(prev);
	        }
	        return resultIntervals;
	    }
    
    
    public static void main(String args[]) {
    	
    	List<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(new Interval(1,3));
    	intervals.add(new Interval(2,6));
    	intervals.add(new Interval(8,10));
    	intervals.add(new Interval(15,18));
    	
    	List<Interval> res = MergeIntervals.merge(intervals);
    	
    	res.stream().forEach(s->System.out.println(s.start +","+ s.end));
    	
    }
    
}