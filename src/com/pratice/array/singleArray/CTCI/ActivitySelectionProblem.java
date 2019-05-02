package com.pratice.array.singleArray.CTCI;

import java.util.ArrayList;
import java.util.List;

/**
 * Greedy Algorithm
 * 
 * You are given n activities with their start and finish times.
 *  Select the maximum number of activities that can be performed by a single person, 
 *  assuming that a person can only work on a single activity at a time.
 * Consider the following 3 activities sorted by
	by finish time.
     start[]  =  {10, 12, 20};
     finish[] =  {20, 25, 30};
     
     Answer is 2 activities. One start at 10 and complete at 20. And than start at 20 and complete at 30.
     
     Solution: 
    1) Sort the activities according to their finishing time
	2) Select the first activity from the sorted array and print it.
	3) Do following for remaining activities in the sorted array.
	…….a) If the start time of this activity is greater than or equal to the finish time of previously 
		selected activity then select this activity and print it.
		
		IN the below, we are assuming the activities are already sorted according to their finish time.
		
 */

public class ActivitySelectionProblem {

	static List<Integer> result = new ArrayList<>();

	public static List<Integer> maxActivites(int[] s, int[] f) {
 int[] t = new int[9];
		int k = 0;
		result.add(k);

		for (int j=1; j<=s.length-1;j++) {
			if (s[j] >= f[k]) {
				k=j;
				result.add(j);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int[] start = new int[] { 3, 2, 6, 7 };
		int[] finish = new int[] { 5, 7, 8, 10 };
		maxActivites(start, finish);
		for(Integer x : result){
			System.out.println(x);
		}
	}
}
