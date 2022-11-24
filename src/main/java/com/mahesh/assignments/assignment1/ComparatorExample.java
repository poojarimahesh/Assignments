package com.mahesh.assignments.assignment1;


import java.util.*;

public class ComparatorExample{
	public static ArrayList<Laptop> sortArrayListUsingComparator(ArrayList<Laptop> list){
		Comparator<Laptop> comp= new Comparator<Laptop>(){
	         public int compare(Laptop l1 , Laptop l2){
	             if(l1.getPrice()> l2.getPrice()){
	                 return 1;
	             }else return -1;
	         }
	     };
	     Collections.sort(list,comp);
	     return list;
	}
	
	public static ArrayList<Laptop> getArrayList(){
		ArrayList<Laptop> list = new ArrayList<>();
	     
	     list.add(new Laptop("DELL",60000,16));
	     list.add(new Laptop("LENOVO",70000,16));
	     list.add(new Laptop("ACER",55000,16));
	     list.add(new Laptop("HP",40000,8));
	     return list;
	}
   public static void main(String args[]) {
     ArrayList<Laptop> list = getArrayList();
     System.out.println("Before Sorting List : ");
     for(Laptop l : list){
         System.out.println(l);
     }
     ArrayList<Laptop> ResultList = sortArrayListUsingComparator(list);
     System.out.println("After Sorting the List according to Price using Comparator Interface : ");
     for(Laptop l : ResultList){
         System.out.println(l);
     }
   }
}
