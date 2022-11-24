package com.mahesh.assignments.assignment1;

import java.util.ArrayList;

public class ArrayListExample {
	//method for deleting element if present in array
	public static ArrayList<Integer> deleteElementIfPresentInList(ArrayList<Integer> arrayList , int elementToDelete) {
		for(int i=0;i<arrayList.size();i++) {
			if(arrayList.get(i)==elementToDelete) {
				arrayList.remove(i);
			}
		}
		
		return arrayList;
	}
	
	// method for creating ArrayList
	public static ArrayList<Integer> getArrayList() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=1;i<=9;i++){
            arrayList.add(i*10);
        }
        
		
		return arrayList;
	}
	
    public static void main(String args[]) {
     
     //Creation 
     ArrayList<Integer> arrayList = getArrayList();
     
     
     //Adding elements
        
     //displaying the ArrayList
     System.out.println(arrayList);
     
     //deleting element 40 if it exits in arrayList by Traversing the ArrayList
     arrayList = deleteElementIfPresentInList(arrayList , 40);
     System.out.println("Deleting element 40 if it exists in ArrayList ");
     
     
     //Displaying the ArrayList using getValue()
     System.out.println("ArrayList Elements : ");
     for(int i=0;i<arrayList.size();i++){
         System.out.print(arrayList.get(i)+" ");
    } 
    }
}

