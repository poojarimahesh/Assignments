package assignment1;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
     
     //Creation 
     ArrayList<Integer> arrayList = new ArrayList<Integer>();
     
     
     //Adding elements
        for(int i=1;i<=9;i++){
            arrayList.add(i*10);
        }
        
     //displaying the ArrayList
     System.out.println(arrayList);
     
     //deleting element 40 if it exits in arrayList by Traversing the ArrayList
     
     System.out.println("Deleting element 40 if it exists in ArrayList ");
     
     for(int i=0;i<arrayList.size();i++){
         if(arrayList.get(i)==40){
             arrayList.remove(i);
         }
         
     }
     //Displaying the ArrayList using getValue()
     System.out.println("ArrayList Elements : ");
     for(int i=0;i<arrayList.size();i++){
         System.out.print(arrayList.get(i)+" ");
    } 
    }
}

