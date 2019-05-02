package com.pratice.math.geeks;

public class FibSer {
	
	int temp1=1 , temp2=0, previuos;
	
	public void prinFibSer(int target){
		while(temp1 <= target){
			previuos = temp1;
			temp1 = (temp2 + temp1);
			System.out.println(temp1);
			temp2 = previuos;
		}
	}
	public static void main(String args[]){
		FibSer fibSer = new FibSer();
		fibSer.prinFibSer(50);
	}
}
