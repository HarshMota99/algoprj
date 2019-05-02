package com.pratice.array.singleArray.leet;

/**
 * https://leetcode.com/problems/container-with-most-water/
 * 
 *  Hint:
 *  https://www.youtube.com/watch?v=cdRaaEYk6tI
 *  
 *  For the max container we need max breadth * height 
 *  Breadth will distance between 2 corners & Height needs to be least of the corners 
 *  
 *  Algorithm 
 *  	Start with both the ends left & right, Calculate the area and assign to maxArea
 *  	Next iteration, which ever is smaller of the left / right will move one step inner (Means left increase by 1 or right decrease by 1) and calculate again
 *  	Continue till they meet (i.e left and right are same)
 *  
 */


public class WaterContainer {

	public int bestContainerRange(int[] inputArray){
		
		int maxArea =0, area=0;
		int left = 0;
		int right = inputArray.length-1;
		
		while(left != right){
			area = (right - left)*(inputArray[left]<inputArray[right] ? inputArray[left]:inputArray[right]);
			maxArea = area>maxArea ? area:maxArea;
			if(inputArray[left] < inputArray[right]){
				left++;
			}else{
				right--;
			}
		}
		return maxArea;
	}
	
	public static void main(String args[]){
		WaterContainer container = new WaterContainer();
		System.out.println(container.bestContainerRange(new int[]{1,8,6,2,5,4,8,3,7}));
	}
	
	
}
