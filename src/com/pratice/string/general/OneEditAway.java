package com.pratice.string.CTCI;


/**

Check if edit distance between two strings is one

An edit between two strings is one of the following changes.

Add a character
Delete a character
Change a character
Given two string s1 and s2, find if s1 can be converted to s2 with exactly one edit. Expected time complexity is O(m+n) where m and n are lengths of two strings.

Examples:

Input:  s1 = "geeks", s2 = "geek"
Output: yes
Number of edits is 1

Input:  s1 = "geeks", s2 = "geeks"
Output: no
Number of edits is 0

Input:  s1 = "geaks", s2 = "geeks"
Output: yes
Number of edits is 1

Input:  s1 = "peaks", s2 = "geeks"
Output: no
Number of edits is 2



Hint:
1) If difference between m an n is more than 1, 
     return false.
2) Initialize count of edits as 0.
3) Start traversing both strings from first character.
    a) If current characters don't match, then
       (i)   Increment count of edits
       (ii)  If count becomes more than 1, return false
       (iii) If length of one string is more, then only
             possible  edit is to remove a character.
             Therefore, move ahead in larger string.
       (iv)  If length is same, then only possible edit
             is to  change a character. Therefore, move
             ahead in both strings. 
    b) Else, move ahead in both strings. 
 */

public class OneEditAway 
{
	public static boolean isOneEditDistance(String s, String t) {
		if(s==null || t == null)return false;
		
		int m = s.length();
		int n = t.length();
		
		if((m-n)>1 || (n-m) > 1){
			return false;
		}
		
		int i = 0,j = 0,count = 0;
		
		while(i<m && j<n){
			if(s.charAt(i) != t.charAt(j)){
				
				count ++;
				
				if(count >1){
					return false;
				}
				
				if(i>j){
					i++;
				}else if(j<i){
					j++;
				}else{
					i++;
					j++;
				}
				
			}else{
				i++;
				j++;
			}
		}
		
	    // If above while loop fails to enter, either one string still has not completed. Example: Harsh and Hars.
	    if(i<m||j<n){
	        count++;
	    }
	 
	    if(count==1)
	        return true;
	 
	    return false;
	}
 
// driver code
public static void main (String[] args)
{
    String s1 = "haz";
    String s2 = "har";
    System.out.println(isOneEditDistance(s1, s2));

}
}
 
