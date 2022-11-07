package assignment1;


// Program to demonstrate the use of 
public class Student {
    //static variables
    static int noOfStudents;
    static String clgName="XIE";
    String name;
    int rollNo;
    int age;
    public Student(){
        noOfStudents++;
    }
    
    //static block
    static{
        noOfStudents=0;
        System.out.println("Static block is Executed");
    }
    
    //static method
    static void displayCount(){
        System.out.println("No. of Students are : "+ noOfStudents + " From College "+ clgName);
        
    }
    void setName(String name){
        this.name=name;
        
    }
    void setAge(int age){
        this.age=age;
        
    }
    int getAge(){
        return this.age;
    }
    void setRoll(int rollNo){
        this.rollNo=rollNo;
        
    }
    int getRoll(){
        return this.rollNo;
    }
    String getName(){
        return this.name;
    }
    
    
    //Static Class
    static class StaticInnerClass{
        void displayFromStaticInnerClass(){
             System.out.println("Displaying from method of Inner Static class ");
            System.out.println("No. of Students are : "+ noOfStudents + " From College "+ clgName);
        }
    }
    
    public static void main(String args[]) {
      Student mahesh= new Student();
      mahesh.setName("Mahesh");
      mahesh.setAge(22);
      mahesh.setRoll(01);
      System.out.println("Details of Student : ");
      System.out.println("Name : "+ mahesh.getName());
      System.out.println("Age : "+ mahesh.getAge());
      System.out.println("Roll NO : "+ mahesh.getRoll());
      Student.displayCount();
      Student.StaticInnerClass innerClass = new Student.StaticInnerClass();
      
      innerClass.displayFromStaticInnerClass();
   
    }
    
}



