package com.pratice.list.arraylist.general;

public class CoinDispence {

	static int[] coinDemnom = new int[]{25,10,5,1}; 
	int count;
	public void dispenseChange(int input){
		
		if(input==0){
			return;
		}
		
		for(int i=0; i<=coinDemnom.length-1;i++){
			
			if(input/coinDemnom[i]>=1){
				count = input/coinDemnom[i];
				input = input%coinDemnom[i];
				System.out.println("Coins of denom="+coinDemnom[i]+"Count="+count);
				break;
			}
		}
		dispenseChange(input);
	}
	public static void main(String args[]){
		CoinDispence coinDispence = new CoinDispence();
		coinDispence.dispenseChange(29);
		
	}
}
