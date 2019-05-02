package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 
You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, 
you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.
Write a function to compute all possible states of the string after one valid move.

For example, given s = "++++", after one valid move, it may become one of the following states. So return all the below vaild states:
[
  "--++",
  "+--+",
  "++--"
]
If there is no valid move, return an empty list [].
 
 */


public class FlipGame {

	public List<String> play(String input) {
		
		List<String> result = new ArrayList<>();
		char[] charArr = input.toCharArray();

		for(int i=0; i<=charArr.length-2;i++) {
			if(charArr[i] == '+' && charArr[i+1] == '+'){
					charArr[i] = '-'; // Flip
					charArr[i+1] = '-'; // Flip
					result.add(new String(charArr)); // Make the result string and add to result array
					charArr[i] = '+'; // Flip back to original for reuse
					charArr[i+1] = '+'; // Flip back to original for reuse
			}
		}
		return result;
	}
	public static void main(String args[]) {
		FlipGame flipGame = new FlipGame();
		List<String> result = flipGame.play("++++");
		for(int i =0; i<=result.size()-1;i++) {
			System.out.println(result.get(i));
		}
	}
}
