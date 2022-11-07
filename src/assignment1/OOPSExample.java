package assignment1;

//Abstraction
abstract class Account{
   //Encapsulation
  protected int accountNumber;
  protected String accountHolderName;
  private int balance;
  
  public Account(String accountHolderName,int accountNumber,int balance ){
      this.accountHolderName=accountHolderName;
      this.accountNumber=accountNumber;
      this.balance=balance;
  }
  public void depositAtBranch(int money){
      System.out.println("Dear "+ accountHolderName);
      balance+=money;
      System.out.println("INR Rs " + money + " is successfully added to Your "+ getAccountType()+ " " +"account " + "Your new Balance is : " + this.balance);
  }
  public int getBalance(){
      return balance;
  }
  public void setBalance(int bal){
      balance=bal;
  }
  abstract public void withdrawAtBranch(int money);
  abstract String getAccountType();
}

//Inheritance
class Saving extends Account{
   //Encapsulation
  protected String accountType="Saving";
  protected int minBal=5000;
  
  
  //Polymorphism : More Precisely Compile Time Polymorphism using Constructor overloading
  public Saving(String accountHolderName,int accountNumber,int balance){
      super( accountHolderName,accountNumber ,balance);
      // this.balance=balance;
  }
  
  public Saving(String accountHolderName,int accountNumber){
      super( accountHolderName,accountNumber ,5000);
      // this.balance=balance;
  }
  
  
  //Polymorphism : More Precisely Run Time Polymorphism using method overriding
  @Override
   public void withdrawAtBranch(int money){
       System.out.println("Dear "+ accountHolderName);
      if((getBalance()-money) < minBal ){
          System.out.println("Your Saving Account balance is insufficient i.e. "+ getBalance()+ "to withdraw "+money);
          return;
      }
      setBalance(getBalance()-money);
      
      System.out.println("INR Rs " + money + " is successfully withdrawn from your Saving Account " + "new Saving Account balance : " + getBalance());
  }
  String getAccountType(){
      return "Saving";
  }
  
}


//Inheritance
class Current extends Account{
   //Encapsulation
  protected String accountType="Current";
  protected int minBal=20000;
  
  
  //Polymorphism : More Precisely Compile Time Polymorphism using Constuctor overloading
  public Current(String accountHolderName,int accountNumber,int balance){
      super( accountHolderName,accountNumber ,balance);
     
  }
  
  public Current(String accountHolderName,int accountNumber){
      super( accountHolderName,accountNumber ,20000);
    
  }
  //Polymorphism : More Precisely Run Time Polymorphism using method overriding
  @Override
  public void withdrawAtBranch(int money){
      System.out.println("Dear "+ accountHolderName);
      if((getBalance()-money) < minBal ){
          System.out.println("Your Current Account balance is insufficient i.e. "+ getBalance()+ "to withdraw "+money);
          return;
      }
      setBalance(getBalance()-money);
      
      System.out.println("INR Rs " + money + " is successfully withdrawn from your Current Account " + "new Current Account balance : " + getBalance());
  }
  
  String getAccountType(){
      return "Current";
  }
  
  
}
public class OOPSExample {
  public static void main(String args[]) {
    Current Mahesh = new Current("Mahesh",123456,80000);
    Current Anil = new Current("Anil",234567);
    Mahesh.withdrawAtBranch(2000);
    Mahesh.depositAtBranch(1500);
    
  System.out.println();
    System.out.println();
    Anil.withdrawAtBranch(2000);
    Anil.depositAtBranch(1500);
    System.out.println();
    System.out.println();
    System.out.println();
    
    Saving Gopal = new Saving("Gopal",123456,8000);
    Saving Aryan = new Saving("Aryan",234567);
    Gopal.withdrawAtBranch(2000);
    Gopal.depositAtBranch(1500);
    System.out.println();
    System.out.println();
    
    Aryan.withdrawAtBranch(2000);
    Aryan.depositAtBranch(1500);
  }
}
