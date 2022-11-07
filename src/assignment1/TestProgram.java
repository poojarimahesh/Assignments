package assignment1;


import java.util.HashMap;
import java.util.*;
public class TestProgram {
    public static void main(String args[]) {
     
     //Creation 
     HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
     ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println("Collection elements before deleting duplicates elements : ");
        System.out.println(arrayList);
     
    //  adding the elements 1,2,1,3,4,2,1 to hashMap
        for(int i=0;i<arrayList.size();i++){
            int temp=arrayList.get(i);
            if(hashMap.containsKey(temp)){
                hashMap.put(temp,hashMap.get(temp)+1);
            }else
            hashMap.put(temp,1);
        }
     System.out.println("HashMap Data : ");
        System.out.println(hashMap);
      arrayList.clear();
      
      // Deleting elements having duplicates
      for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
          if(entry.getValue()==1){
              arrayList.add(entry.getKey());
          }
      }
      System.out.println("Collection elements After deleting duplicates elements : ");
    
      System.out.println(arrayList);
    }
}

