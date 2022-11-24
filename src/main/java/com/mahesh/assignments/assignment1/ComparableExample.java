package com.mahesh.assignments.assignment1;

import java.util.*;
class Laptop implements Comparable<Laptop>{
   private int price;
   private String brand;
   private int ram;
   
   Laptop(String brand , int price , int ram){
       this.brand=brand;
       this.price=price;
       this.ram=ram;
   }
   void setPrice(int price){
       this.price =price;
       
   }
   void setBrand(String brand){
       this.brand =brand;
       
   }
   void setRam(int ram){
       this.ram =ram;
       
   }
   int getRam(){
       return ram;
   }
   String getBrand(){
       return brand;
   }
   int getPrice(){
       return price;
   }
   public String toString(){
       return "Brand "+ this.getBrand()+ " Price "+ getPrice() + " with Ram "+ getRam();
   }
   
    @Override
public int compareTo(Laptop l1){
        if(this.price > l1.price) return 1;
       else return -1;
    }
}

public class ComparableExample {
	
	public static ArrayList<Laptop> sortArrayListUsingComparable(ArrayList<Laptop> list){
		Collections.sort(list);
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
     
     ArrayList<Laptop> resultList = sortArrayListUsingComparable(list);
     System.out.println("After Sorting List : ");
     for(Laptop l : resultList){
         System.out.println(l);
     }
  
   }
}
		
