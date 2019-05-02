package com.test;

public class MS {
	public void mainMS(int[] arraySour, int[] tempArray, int leftStart, int rightEnd){
		if(leftStart>=rightEnd) return;
		int mid = (leftStart+rightEnd)/2;
		
		mainMS(arraySour,tempArray, leftStart,mid);
		//System.out.println("Mid="+mid+"leftStart="+leftStart+"rightEnd="+rightEnd);
		mainMS(arraySour, tempArray,mid+1,rightEnd);
		mS(arraySour,tempArray,leftStart,rightEnd);
		for(int i=0 ; i<=tempArray.length-1; i++){
			System.out.println("==>"+tempArray[i]);
		}
	}

	public void mS(int[] arraySour, int[] arrayRes, int leftStart, int rightEnd){
		
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = leftEnd+1;
		int index = leftStart;
	
		while(leftStart<=leftEnd && rightStart<=rightEnd){
			if(arraySour[leftStart]<arraySour[rightStart]){
				arrayRes[index]= arraySour[leftStart];
				leftStart++;
				index++;
			}else{
				arrayRes[index]= arraySour[rightStart];
				rightStart++;
				index++;
			}
			
		}
		
		while(leftStart<=leftEnd){
			arrayRes[index]= arraySour[leftStart];
			leftStart++;
			index++;
		}
		
		while(rightStart<=rightEnd){
			arrayRes[index]= arraySour[rightStart];
			rightStart++;	
			index++;
		}
	}
	
	public static void main(String args[]){
		MS ms = new MS();
		int[] test = new int[]{4,3,2,1,5,6,7,8};
		int[] tempArray = new int[test.length];
		ms.mainMS(test, tempArray,0, test.length-1);
		for(int i=0 ; i<=tempArray.length-1; i++){
			System.out.println("final==>"+tempArray[i]);
		}
	}
}
