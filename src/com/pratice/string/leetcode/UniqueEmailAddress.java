package com.pratice.string.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Every email consists of a local name and a domain name, separated by the @ sign.
For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
Besides lowercase letters, these emails may contain '.'s or '+'s.
If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
It is possible to use both of these rules at the same time.
Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 

Example 1:
Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 

 */
public class UniqueEmailAddress {

	 public int numUniqueEmails(String[] emails) {
	        if(emails==null | emails.length<1){
	            return 0;
	        }
	        
	        Set<String> masterEmail = new HashSet<String>(); // Adds only unique
	        
	        for(int i=0; i<=emails.length-1;i++){
	            String splitList[] = emails[i].split("@");
	            String temp1 = splitList[0].replaceAll("\\+", " +"); // Becuase string.split doesnt work for +
	            String domain = splitList[1];
	            String splitList2[] = temp1.split(" ");
	            String splitList3[] = splitList2[0].split("\\.");// Becuase string.split doesnt work for .
	            String finalEmail="";
	            for(int j=0;j<=splitList3.length-1;j++){
	                finalEmail = finalEmail+splitList3[j];
	            }
	            String emailAddress = finalEmail+"@"+domain;
	            masterEmail.add(emailAddress);
	            
	        }
	        return masterEmail.size();// Return the size
	    }
	 
	public static void main(String args[]) {
		UniqueEmailAddress address = new UniqueEmailAddress();
		System.out.println(address.numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
		
	}
}
