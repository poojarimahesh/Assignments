package com.mahesh.assignments.assignment1;



 class A {
    void display(){
        System.out.println("Display of Class of A");
    }
}

 class B extends A{
    void display(){
        System.out.println("Display of Class of B");
    }

}
 class C extends A{
    void display(){
        System.out.println("Display of Class of C");
    }

}
 
 //the below line will create error i.e diamond problem if the below line is replaced with
// public class DiamondProblem extends B,C{
public class DiamondProblem{
    public static void main(String args[]) {
     
//     D.display();
     
    }
}

