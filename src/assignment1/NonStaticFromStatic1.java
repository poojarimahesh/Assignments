package assignment1;

public class NonStaticFromStatic1 {
    static int count=1;
    static void getcount(){
        //Method 1 to call non-static method from static method
    	NonStaticFromStatic1 obj = new NonStaticFromStatic1();
        obj.nonStatic();
        System.out.println("Static method is called " + count);
    }
    void nonStatic(){
        System.out.println("Non- static method is called ");
    }
    public static void main(String args[]) {
    
        getcount();
        
    }
}


