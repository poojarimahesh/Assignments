package assignment1;

import java.util.*;
public class HashMapExample {
    public static void main(String args[]) {
        //creation of HashMap
      HashMap<String,Integer> map = new HashMap<String,Integer>();
      
      //Adding elements in HashMap
      map.put("Anil",20);
      map.put("Mahesh", 30);
      map.put("Gopal",40);
      map.put("Gauranga",50);
      System.out.println("Hashmap : " + map);
      
      //hashmap will override the value for key "Anil" i.e updation
      map.put("Anil", 10);
      System.out.println("After Updation " + "\n" + "Value of Anil : " + map.get("Anil"));
      
      //traversing the HashMap
      
      System.out.println("HashMap Elements : " );
      Iterator hashMapIterator= map.entrySet().iterator();
      while(hashMapIterator.hasNext()){
          Map.Entry mapElement = (Map.Entry)hashMapIterator.next();
          System.out.println("Key : " + mapElement.getKey());
          System.out.println("value : " + (int)mapElement.getValue());
      }
      
    }
}

