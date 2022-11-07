package assignment1;


import java.util.*;
class Laptop {
   private int price;
   private String brand;
   private int ram;
   
   Laptop(String brand , int price , int ram){
       this.brand=brand;
       this.price=price;
       this.ram=ram;
   }
   public void setPrice(int price){
       this.price =price;
       
   }
   public void setBrand(String brand){
       this.brand =brand;
       
   }
   public void setRam(int ram){
       this.ram =ram;
       
   }
   public int getRam(){
       return ram;
   }
   public String getBrand(){
       return brand;
   }
   public int getPrice(){
       return price;
   }
   public String toString(){
       return "Brand "+ this.getBrand()+ " Price "+ getPrice() + " with Ram "+ getRam();
   }
   
   
   
}
public class ComparatorExample {
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
