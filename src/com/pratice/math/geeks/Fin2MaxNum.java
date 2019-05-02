package com.pratice.math;

public class Fin2MaxNum {

	int m1, m2;
	public void finmax(int[] inputarr){
	
		m1 = inputarr[0];
		for(int i = 1; i<=inputarr.length-1;i++){
			if(inputarr[i] > m1){
				m2 = m1;
				m1 = inputarr[i];
			}
		}
		System.err.println(m1+"--"+m2);
	}

	public static void main(String args[]){
		Fin2MaxNum fin2MaxNum = new Fin2MaxNum();
		fin2MaxNum.finmax(new int[]{16,4,3,12,1,2,32,11,17,34,19,0});
	}
}
