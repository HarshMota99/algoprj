package com.pratice.map.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 Implement a MyCalendarTwo class to store your events. A new event can be added if adding the event will not cause a triple booking.

Your class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.

A triple booking happens when three events have some non-empty intersection (ie., there is some time that is common to all 3 events.)

For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully without causing a triple booking. Otherwise, return false and do not add the event to the calendar.

Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
Example 1:

MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(50, 60); // returns true
MyCalendar.book(10, 40); // returns true
MyCalendar.book(5, 15); // returns false
MyCalendar.book(5, 10); // returns true
MyCalendar.book(25, 55); // returns true
Explanation: 
The first two events can be booked.  The third event can be double booked.
The fourth event (5, 15) can't be booked, because it would result in a triple booking.
The fifth event (5, 10) can be booked, as it does not use time 10 which is already double booked.
The sixth event (25, 55) can be booked, as the time in [25, 40) will be double booked with the third event;
the time [40, 50) will be single booked, and the time [50, 55) will be double booked with the second event.
  
 */
public class MyCalendar2 {

	static Map<Integer, List<Integer>> calendar = new HashMap<>();
	List<Integer> valueList;
	public void bookCalendar(int start, int end){
		
		if(emptySlotCalendar(start,end)){
			valueList = calendar.get(start);
			if(valueList == null){
				valueList = new ArrayList<>();
			}else{
				valueList.add(end);	
			}
			calendar.put(start,valueList);
		}
		
	}

	private boolean emptySlotCalendar(int start, int end) {

		int active=0;
		for(Entry<Integer, List<Integer>> entry : calendar.entrySet()){
			if(checkStart(start,entry.getValue()) && end > entry.getKey()){
				active++;
			}
			if(active >= 3){
				return false;
			}
		}
		return true;
	}
	
	


	private boolean checkStart(int start, List<Integer> value) {

		for(Integer i : value){
			if(i == start){
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]){
		MyCalendar2 myCal = new MyCalendar2();
		myCal.bookCalendar(10, 20);
		myCal.bookCalendar(50, 60);
		myCal.bookCalendar(10, 40);
		myCal.bookCalendar(5, 15);
		myCal.bookCalendar(5, 10);
		myCal.bookCalendar(25, 55);
		
		for(Map.Entry<Integer, List<Integer>> entry : calendar.entrySet()){
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}
	
	
	
	
	
	
	
	
	
}
