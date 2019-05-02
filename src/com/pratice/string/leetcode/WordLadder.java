package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


/*

https://leetcode.com/problems/word-ladder/

Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
Only one letter can be changed at a time.
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
You may assume no duplicates in the word list.
You may assume beginWord and endWord are non-empty and are not the same.

Example 1:
Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.


Example 2:
Input:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.


Hint:
The first intuition for this problem is to build a graph whose nodes represent strings and edges connect strings that are only 1 character apart, and then we apply BFS from the startWord node. If we find the endWord, we return the level count of the bfs. This intuition is correct, but there are some places that we can save time.

When we build adjacency list graph, we don't use two loops to check every pair of string to see if they are 1 character apart. Instead, we make changes to current string to obtain all the strings we can reach from current node, and see if it is in the wordList. Thus, there are currentString.length() * 25 case we need to check for every node. This is faster when the wordList set is large, since the check-every-pair method need wordList.size() * currentString.length() for each node. Otherwise, your may exceed the running time limit.

For the strings we visited, we remove it from the wordList. This way we don't need to mark visited using another HashSet or something.

Actually, we don't even need to build the adjacency list graph explicitly using a HashMap<String, ArrayList>, since we keep all the nodes we can reach in the queue of each level of BFS. This can be seen as the keys of the HashMap are the strings that in the queue, and values are the strings that satisfy the 1 character apart in the wordList. Thus, we avoid the time cost of build map for those nodes we don't need to visit.

 */

public class WordLadder {

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
	    Set<String> wordSet = new HashSet<String>(wordList);    
	   
	        if(!wordSet.contains(endWord)) return 0; 							// right away return 0 if the endWord is not in wordList
	        Queue<String> queue = new  LinkedList<String>();					// Queue will always have one word which we entered
	        queue.add(beginWord);
	        int level = 0;
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            for(int i = 0; i < size; i++){
	                String cur = queue.remove();
	                if(cur.equals(endWord))
	                { return level + 1;
	                }
	                for(int j = 0; j < cur.length(); j++){
	                    char[] word = cur.toCharArray();
	                    for(char ch = 'a'; ch < 'z'; ch++){						// We replace every single char of that word with char from a -z to see if we can get the next word
	                        word[j] = ch;
	                        String check = new String(word);
	                        if(wordSet.contains(check) && !cur.equals(check)){  // The word could be any word in set and not the continous... however that is added to queue.. so we check continuty.. if there is .. than for sure it will get to next one
	                            queue.add(check);								// 
	                            wordSet.remove(check);							// We remove the word from the set so we dont repeat that word
	                        }
	                    }
	                }
	            }
	            level++; // We add the level when we find 
	        }
	    return 0;
	}
	
	public static void main(String args[]) {
		//System.out.println(WordLadder.ladderLength("hit", "cog", Arrays.asList(new String[] {"hot","cog"})));
		System.out.println(WordLadder.ladderLength("hit", "cog", Arrays.asList(new String[] {"hot","dot","dog","lot","log","cog"})));
	}
	
}
