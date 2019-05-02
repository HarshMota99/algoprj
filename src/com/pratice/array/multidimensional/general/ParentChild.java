package com.pratice.array.multidimensional.general;

/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
            
1   2   4
 \ /   / \
  3   5   8
   \ / \   \
    6   7   10

Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.

Sample output (pseudodata):

findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4],    // Individuals with zero parents
  [5, 7, 8, 10] // Individuals with exactly one parent
]


*/
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class ParentChild {
  
  public static Set<Integer> zeroPaents(int[][] inputArray){
    
     Set<Integer> result = new HashSet<Integer>();
    
    Set<Integer> childSet = new HashSet<Integer>();
    
    int rowLength = inputArray.length;
    
    for(int i=0; i<=rowLength-1; i++){
      
      int[] temp = inputArray[i];
      
      for(int j=1; j<=temp.length-1; j++){
       // System.out.println(temp[j]);
        childSet.add(temp[j]);
      }
      
    }
    
   // System.out.println(childSet);
    
    
    for(int i=0; i<=rowLength-1; i++){
      
      int[] temp = inputArray[i];
      
      for(int j=0; j<1; j++){
       // System.out.println(temp[j]);
        if(!childSet.contains(temp[j])){
         // System.out.println("childSet");
          
          result.add(temp[j]);
        }
      }
      
    }
    
    
    
   return  result;
  
  }
  
  
  public static Set<Integer> oneParent(int[][] inputArray){
    
    
    Set<Integer> result = new HashSet<Integer>();
    
    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    int rowLength = inputArray.length;
    
    for(int i=0; i<=rowLength-1; i++){
      
      int[] temp = inputArray[i];
      
      for(int j=1; j<=temp.length-1; j++){
       // System.out.println(temp[j]);
        
        if(hm.containsKey(temp[j])){
          hm.put(temp[j], hm.get(temp[j])+1);
        }else{
          hm.put(temp[j],1);
        }
        
      
      
    }
    
  }
    for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
        
        System.out.print("Key=>"+entry.getKey());
        System.out.println("Value=>"+entry.getValue());
        if(entry.getValue()<=1){
          result.add(entry.getKey());
        }
      }  
    return result;
  }

                 
  
  
  public static void main(String[] args) {     
    int[][] parentChildPairs = new int[][] {
        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
        {4, 5}, {4, 8}, {8, 10}
    };

    //Set<Integer> zeroParent = ParentChild.zeroPaents(parentChildPairs);
    
    //System.out.println(zeroParent);
    
    Set<Integer> oneParent = ParentChild.oneParent(parentChildPairs);
    
    System.out.println(oneParent);
  }
}




