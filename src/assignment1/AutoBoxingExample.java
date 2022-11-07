package assignment1;


import java.util.*;
public class AutoBoxingExample {
    public static int sumOfOddNumbers(List<Integer> list){
        int oddSum=0;
        //Unboxing
        for(int num : list){
            if(num % 2 ==1)
            oddSum+=num;
        }
        return oddSum;
    }
 
     public static void main(String[] args)
    {
 
        // Creating an empty Arraylist of integer type
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        // Adding the int primitives type values
        // using add() method
        	// Boxing explicit
        list.add(new Integer(1));
        list.add(new Integer(2));
	// Autoboxing is done
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
 
        // Printing the ArrayList elements
        System.out.println("ArrayList: " + list);
         System.out.println("OddSum in ArrayList: " + sumOfOddNumbers(list));
    }
}
