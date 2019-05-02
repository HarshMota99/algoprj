package com.pratice.array.singleArray.leet;

/*
 Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


Hint:

Buy it only if you find its Smaller than previous
Sell it only if 
	- If you bought it
	- The next of the current is smaller than the current
	- Also if you have bought and its last last element sell it

 */

public class BestTimeToBuyAndSellStock2 {

	public int maxProfit(int[] prices) {

		  boolean hasBought = false;
	        Integer buyPrice = null;
	        int sum = 0;
	        
	        for (int i = 0;i < prices.length;i++) {
	        	
	            if (hasBought) { 
	                if (i == prices.length - 1 || prices[i] > prices[i + 1]) { // If bought and (if its last element or if the current value is bigger than next, sell it. 
	                    sum += prices[i] - buyPrice; // sell it
	                    buyPrice = null;
	                    hasBought = false;
	                }
	            }else if (i < prices.length - 1 && prices[i] < prices[i + 1]) { // Dont buy if its last element. So check if not last element & price is lesser than buy price
	                hasBought = true;
	                buyPrice = prices[i]; // Buy previuos
	            } 
	            
	        }
	        return sum;
	}

	public static void main(String args[]) {
		BestTimeToBuyAndSellStock2 andSellStock2 = new BestTimeToBuyAndSellStock2();
		
		System.out.println(andSellStock2.maxProfit(new int[] {7,1,5,3,6,4}));

	}

}
