package com.mahesh.assignments.assignment1;

import java.util.HashSet;
import java.util.*;
public class HashSetExample {
	
	//method for creating HashSet
	public static HashSet<Integer> getHashSet(){
		HashSet<Integer> hashSet = new HashSet<Integer>();
		//Adding elements
        for(int i=1;i<=9;i++){
        	hashSet.add(i*10);
//            System.out.println("Adding " + (i*10) +" : " +  hashSet.add(i*10));
        }
		
		return hashSet;
	}
    public static void main(String args[]) {
     
     //Creation 
     HashSet<Integer> hashSet = getHashSet();
     
     
     
        
     //displaying the ArrayList
     System.out.println(hashSet);
     
     //trying to add some already added elements and new elements
      System.out.println("Adding " + (30) +" : " + hashSet.add(30));
      System.out.println("Adding " + (22) +" : " + hashSet.add(22));
      System.out.println("Adding " + (76) +" : " + hashSet.add(76));
      System.out.println("Adding " + (80) +" : " + hashSet.add(80));
      
      //Deleting some elements
      System.out.println("Deleting " + (40) +" : " + hashSet.remove(40));
      System.out.println("Deleting " + (25) +" : " + hashSet.remove(25));
      System.out.println("Deleting " + (90) +" : " + hashSet.remove(90));
      
      
      System.out.println("Set elements after deletion ");
      //Traversing the Set
      Iterator<Integer> iterator =hashSet.iterator();
      while(iterator.hasNext()){
          System.out.print(iterator.next()+ " ");
      }      
    }
}

