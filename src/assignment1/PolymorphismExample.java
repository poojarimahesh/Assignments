package assignment1;


class Shape {
    void area(){
        
    }
}

class Rectangle extends Shape{
    
    //Complie Time Polymorphism
    //By using Constructor Overloading
    Rectangle(int l, int b){
        area(l,b);
    }
    Rectangle(int side){
        area(side);
    }
    
    //Run Time Polymorphism
    //By using Method Overriding
    void area(int l , int b){
        System.out.println("Area Of Rectanle : "+ (l*b));
    }
    
    //Run Time Polymorphism
    //By using Method Overriding
    void area(int side){
        System.out.println("Area Of Square : "+ (side*side));
    }
}
class Circle extends Shape{
    Circle(int side){
        area(side);
    }
    //Run Time Polymorphism
    //By using Method Overriding
    void area(int radius){
        System.out.println("Area Of Square : "+ (radius*radius*3.14));
    }
}
public class PolymorphismExample{
    public static void main(String args[]) {
     new Rectangle(5,10);
     new Rectangle(10);
     new Circle(10);
    
     
    }
}
