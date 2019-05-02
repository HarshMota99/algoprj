package com.pratice.general;

public class Solution {
    
    
    public boolean checkHalvesSum(int[] input){
        
        if(input==null || input.length<0){
            return false;
        }
        
        int median = input.length / 2;
        
        int sum1 = 0;
        int sum2 = 0;
        
        if(median % 2 != 0){
            return false;
        }
        
        for(int i =0; i<=median-1 ; i++){
            
            sum1 = sum1 + input[i];
        }
        
        for(int i =median; i<=input.length-1 ; i++){
            
            sum2 = sum2 + input[i];
        }
        
        if(sum1 == sum2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.checkHalvesSum(new int[]{2,4,5,1,3}));
    }


}