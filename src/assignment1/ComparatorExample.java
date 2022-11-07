package assignment1;


import java.util.*;

public class ComparatorExample{
   public static void main(String args[]) {
     ArrayList<Laptop> list = new ArrayList<>();
     
     list.add(new Laptop("DELL",60000,16));
     list.add(new Laptop("LENOVO",70000,16));
     list.add(new Laptop("ACER",55000,16));
     list.add(new Laptop("HP",40000,8));
     System.out.println("Before Sorting List : ");
     for(Laptop l : list){
         System.out.println(l);
     }
     Comparator<Laptop> comp= new Comparator<Laptop>(){
         public int compare(Laptop l1 , Laptop l2){
             if(l1.getPrice()> l2.getPrice()){
                 return 1;
             }else return -1;
         }
     };
     Collections.sort(list,comp);
     System.out.println("After Sorting List using Comparator Interface : ");
     for(Laptop l : list){
         System.out.println(l);
     }
   }
}
