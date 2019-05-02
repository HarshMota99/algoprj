package com.pratice.string.leetcode;

/*
https://www.programcreek.com/2014/08/leetcode-shortest-word-distance-java/

Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].


Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.

Hint:
Make sure to check for both the words in every iteration
Instead of boolean, we can also use  -1 for not found and non -1 for found and additionally it also keeps the latest found value

 */

public class ShortestWordDistance {
	
	public int shortestDistance(String[] words, String word1, String word2) {
		
		int index1 = -1;
        int index2 = -1;
        int min = Integer.MAX_VALUE;
       
        for (int i = 0; i < words.length; i ++) {
            if (words[i].equals(word1)) {   // If the word is equal
                if (index2 != -1) { // Check if had found the other word
                    min = Math.min(i - index2, min); // If yes, we check the distance between them
                }
                index1 = i; // Makes it non -1, and additionally it keeps the latest found value
                continue;
            }
            if (words[i].equals(word2)) { // Same as above
                if (index1 != -1) {
                    min = Math.min(i - index1, min);
                }
                index2 = i;
                continue;
            }
        }
        return min;
    }
	public static void main(String args[]){
		ShortestWordDistance distance = new ShortestWordDistance();
		System.out.println(distance.shortestDistance(new String []{"perfect", "s", "makes", "s", "s","perfect","makes", "s", "s"}, "makes", "perfect"));
	}
}
