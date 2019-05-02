package com.pratice.array.singleArray.leet;

import java.util.LinkedList;
import java.util.Queue;

/**

Simple Moving Average (SMA) problem - Here is the example to understand the problem statement 

example:

1,10,3,5,6

MovingAverage m = new MovingAverage(3);
m.next(1) = 1/3
m.next(10) = (1 + 10) / 3
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
m.next(5) = (3 + 5 + 6) / 3

 */

public class SimpleMovingAverageFromDataStream {

  Queue<Integer> inputStream = new LinkedList<>();
  double sum;
  int period;
  
  private SimpleMovingAverageFromDataStream(int period){
	  this.period = period;
  }
  
  private void calSum(int input){
	  sum += input;
	  inputStream.add(input);
	  
	  if(inputStream.size() > period){
		  sum-= inputStream.remove();
	  }
  }

  private double getMean(){
	  return sum / period;
  }
	
public static void main(String args[]){
	
	SimpleMovingAverageFromDataStream averageFromDataStream = new SimpleMovingAverageFromDataStream(3);
	
	int[] inputStream = new int[]{1,2,3,4,6};
	
	for(int i =0;i<=inputStream.length-1;i++){
		
		averageFromDataStream.calSum(inputStream[i]);
		
		System.out.println("New Number is"+inputStream[i]+" & SMA is:"+averageFromDataStream.getMean());
	}
	
	
}
	
	
	
} 

