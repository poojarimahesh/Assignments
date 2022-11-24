package com.mahesh.assignments.assignment1;

class Shape {
    void area(){
        
    }
}

class Rectangle extends Shape{
    
    //Complie Time Polymorphism
    //By using Constructor Overloading
//    Rectangle(int l, int b){
//        area(l,b);
//    }
//    Rectangle(int side){
//        area(side);
//    }
//    
    //Run Time Polymorphism
    //By using Method Overriding
    int area(int l , int b){
        System.out.println("Area Of Rectanle : "+ (l*b));
        return (l*b);
    }
    
    //Run Time Polymorphism
    //By using Method Overriding
    int area(int side){
        System.out.println("Area Of Square : "+ (side*side));
        return (side*side);
    }
}
class Circle extends Shape{
//    Circle(int side){
//        area(side);
//    }
    //Run Time Polymorphism
    //By using Method Overriding
    float area(int radius){
        System.out.println("Area Of Square : "+ (radius*radius*3.14));
        return (float) (radius*radius*3.14);
    }
}
public class PolymorphismExample{
    public static void main(String args[]) {
     new Rectangle().area(5,10);
     new Rectangle().area(10);
     new Circle().area(10);
    
     
    }
}

