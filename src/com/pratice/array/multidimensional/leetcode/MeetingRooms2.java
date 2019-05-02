package com.pratice.array.multidimensional.leetcode;

import java.util.Arrays;

/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number
of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1


Hint: - Understanding the problem

- New meeting when starts we need to check if any old meeting is over. If its over we can use the same room or we need a new room.

- So first sort all the start time, as the least start time will start first

- Now when starting a new meeting check, if any meeting is ended. 

Approach 1:

1. Sort the intervals using comparator and add it to queue
2. traverse the queue and check the condition if for current start is greater then previous any of the end times and if yes same room 
   or else new room


Approach 2 is better:

1. Sort all start times and end times
2. Keep room counter and end of meeting counter. Traverse on below 


 */

class Intervals{
	
	int start;
	
	int end;
	
	public Intervals() {
		start = 0;
		end = 0;
	}
	
	public Intervals(int start, int end) {
		this.start = start;
		this.end = end;
	}
}


public class MeetingRooms2 {

	public static int meetinRoom(Intervals[] intervals) {
		
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		
		for(int i =0; i<=intervals.length-1; i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}

		Arrays.sort(starts);
		Arrays.sort(ends);
		
		int roomcount = 0;
		int endCount = 0;
		
		for(int i=0; i<=starts.length-1; i++) {
			
			if(starts[i] < ends[endCount]){
				roomcount ++;
			}else {
				endCount ++;
			}
		}
		return roomcount;
	}
	
	public static void main(String args[]) {
		
		Intervals i1 = new Intervals(0,30);
		Intervals i2 = new Intervals(5,10);
		Intervals i3 = new Intervals(15,20);
		
		Intervals i4 = new Intervals(7,10);
		Intervals i5 = new Intervals(2,4);
		
		System.out.println(MeetingRooms2.meetinRoom(new Intervals[] {i1,i2,i3}));
		
		System.out.println(MeetingRooms2.meetinRoom(new Intervals[] {i4,i5}));
	}
}
