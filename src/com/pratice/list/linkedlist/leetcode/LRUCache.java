package com.pratice.list.linkedlist.leetcode;

import java.util.HashMap;
import java.util.Map;

/*

Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, 
it should invalidate the least recently used item before inserting a new item.

Follow up:
Could you do both operations in O(1) time complexity?
Example:

LRUCache cache = new LRUCache( 2  );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4


Hint:
Look at the video : https://www.youtube.com/watch?v=S6IfqDXWa10

Most important operations 
1. put 
2. get
3. remove / evict

Data Structures we will use

1. HashTable : 
	This will help with get operations as the lookup with hashtable is very fast
	
2. DoublyLinkedList : 
	This will help with put and remove as doublelinked put and get are fast
	
	
Simple	 
 
 1. Put: When we put, we put at the beginning of the doublyLinkedList. And we put in the HashTable.
 
 2. Get: When we get, we get it from HashTable. Also we remove the node in linkedlist and add it to the first. As its recently used.
 
 3. Evict: When we remove / evicted based on the limit reached. We evict at the end of the linked list.
 
 
 Code: https://github.com/bephrem1/backtobackswe/blob/master/Linked%20Lists/LRUCache.java

 */


public class LRUCache {

	private class DNode {
		int key;
		int value;
		DNode prev;
		DNode next;
	}

	private Map<Integer, DNode> hashtable = new HashMap<Integer, DNode>();
	private DNode head, tail;
	private int totalItemsInCache;
	private int maxCapacity;

	public LRUCache(int maxCapacity) {

		// Cache starts empty and capacity is set by client
		totalItemsInCache = 0;
		this.maxCapacity = maxCapacity;

		// Initialize the dummy head of the cache
		head = new DNode();
		head.prev = null;

		// Init the dummy tail of the cache
		tail = new DNode();
		tail.next = null;

		// Wire the head and tail together
		head.next = tail;
		tail.prev = head;
	}

	/*
	 * Retrieve an item from the cache
	 */
	public int get(int key) {

		DNode node = hashtable.get(key);
		boolean itemFoundInCache = (node != null);

		// Empty state check. Should raise exception here.
		if (!itemFoundInCache) {
			return -1;
		}

		// Item has been accessed. Move to the front of the list.
		moveToHead(node);

		return node.value;
	}

	/*
	 * Move a node to the head of the doubly linked lsit
	 */
	private void moveToHead(DNode node) {
		removeNode(node);
		addNode(node);
	}

	/*
	 * Remove the given node from the doubly linked list
	 */
	private void removeNode(DNode node) {

		// Grab reference to the prev and next of the node
		DNode savedPrev = node.prev;
		DNode savedNext = node.next;

		// Cut out going forwards
		savedPrev.next = savedNext;

		// Cut out going backards
		savedNext.prev = savedPrev;
	}

	/*
	 * Insertions to the doubly linked list will always be right after the dummy
	 * head
	 */
	private void addNode(DNode node) {

		// Wire the node being inserted
		node.prev = head;
		node.next = head.next;

		// Re-wire the head's old next
		head.next.prev = node;

		// Re-wire the head to point to the inserted node
		head.next = node;
	}
	
	
	/*
	 * Add an item to the cache if it is not already there, if it is already there
	 * update the value and move it to the front of the cache
	 */
	public void put(int key, int value) {

		DNode node = hashtable.get(key);
		boolean itemFoundInCache = (node != null);

		if (!itemFoundInCache) {

			// Create a new node
			DNode newNode = new DNode();
			newNode.key = key;
			newNode.value = value;

			// Add to the hashtable and the doubly linked list
			hashtable.put(key, newNode);
			addNode(newNode);

			// We just added an item to the cache
			totalItemsInCache++;

			// If over capacity evict an item with LRU cache eviction policy
			if (totalItemsInCache > maxCapacity) {
				removeLRUEntryFromStructure();
			}

		} else {
			// If item is in cache just update and move it to the head
			node.value = value;
			moveToHead(node);
		}
	}

	

	/*
	 * Remove the least used entry from the doubly linked list as well as the
	 * hashtable. Hence it is evicted from the whole LRUCache structure
	 */
	private void removeLRUEntryFromStructure() {
		DNode tail = popTail();
		hashtable.remove(tail.key);
		--totalItemsInCache;
	}

	/*
	 * Pop the last item from the structure
	 */
	private DNode popTail() {
		DNode itemBeingRemoved = tail.prev;
		removeNode(itemBeingRemoved);
		return itemBeingRemoved;
	}

	public static void main(String args[]) {
		
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));       // returns 1
		cache.put(3, 3);    // evicts key 2
		System.out.println(cache.get(2));       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		System.out.println(cache.get(1));       // returns -1 (not found)
		System.out.println(cache.get(3));       // returns 3
		System.out.println(cache.get(4));       // returns 4
		
		
	}
	
	
}
