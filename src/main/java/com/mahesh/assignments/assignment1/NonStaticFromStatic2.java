package com.mahesh.assignments.assignment1;

public class NonStaticFromStatic2 {
    static int count=2;
    static void getcount(NonStaticFromStatic2 obj){
        //Method 2 to call non-static method from static method
        obj.nonStatic();
        System.out.println("Static method is called " + count);
    }
    void nonStatic(){
        System.out.println("Non- static method is called ");
    }
    public static void main(String args[]) {
    	NonStaticFromStatic2 obj = new NonStaticFromStatic2();
        
        getcount(obj);
        
    }
}

