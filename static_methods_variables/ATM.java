package static_methods_variables;
/*
 * Static methods and variables are associated with the class as a whole, not objects of the class.
 * Static methods and variables are declared as static by using the static keyword upon declaration.
 * Static methods cannot interact with non-static instance variables. This is due to static methods not having a this reference.
 * Both static methods and non-static methods can interact with static variables.
*/



public class ATM{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // Instance variables
    public int money;
  
    public ATM(int inputMoney){
      this.money = inputMoney;
      numATMs += 1;
      totalMoney += inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
        totalMoney -= amountToWithdraw;
      }
    }
  
    // Write your averageMoney() method here
    public static void averageMoney(){
      System.out.println("Average amount of money in all ATMs: " + totalMoney/numATMs);
  
    }
  
    public static void main(String[] args){
  
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
      ATM firstATM = new ATM(1000);
      ATM secondATM = new ATM(500);
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
  
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
      firstATM.withdrawMoney(500);
      secondATM.withdrawMoney(200);
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    
  
      // Call averageMoney() here
      averageMoney();
  
  
    }
  
}