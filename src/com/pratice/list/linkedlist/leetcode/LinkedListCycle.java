package com.pratice.list.linkedlist.leetcode;

import com.pratice.list.linkedlist.CTCI.Node;

/*
https://leetcode.com/problems/linked-list-cycle/
https://www.youtube.com/watch?v=zbozWoMgKW0
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

 */
public class LinkedListCycle {

    public boolean hasCycle(Node head) {
        
        boolean isLoop=false;
        
        Node runner1=head;
        Node runner2=head;
        
        while(runner1!=null || runner2!=null){
            
            if(runner1.nextNode!=null && runner2.nextNode!=null && runner2.nextNode.nextNode!=null){
                runner1 = runner1.nextNode;    
                runner2 = runner2.nextNode.nextNode;
            }else{
                return false;
            }
            
            if(runner1.data==runner2.data){
                return true;
            }
            
        }
        return isLoop;
    }
}
