/*
Concepts covered:

- Defining a method : Method declarations will declare a method’s return type, name, and parameters
- Calling a method : Methods are invoked with a . and ()
- Parameters : Inputs to the method and their types are declared in parentheses in the method signature
- Changing Instance Fields : Methods can be used to change the value of an instance field
- Scope : Variables only exist within the domain that they are created in
- Return : The type of the variables that will be output are declared in the method declaration
*/


//  A savings account class
public class SavingsAccount {

    // instance fields
    int balance;
    
    // constructor method
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    //Check balance method
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }
  
    public void deposit(int amountToDeposit){
    
        int afterDeposit =  balance + amountToDeposit;
        balance = afterDeposit;
        System.out.println("You just deposited "+amountToDeposit);
    }
  
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        return amountToWithdraw;
    }
  
  
    // toString method
    public String toString(){
        return "Your savings account balance is " + balance;
    }
  
       
  
    
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
  
        savings.checkBalance();
        savings.withdraw(1000);
  
        savings.checkBalance();
        savings.deposit(1000);
  
        System.out.println(savings);

      
    }       
}
  