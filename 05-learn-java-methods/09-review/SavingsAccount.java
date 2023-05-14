public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
  
    //Check balance:
    public void checkBalance(){
      System.out.println("Hello!");
      System.out.println("Your balance is "+balance);
    }
  
    //Deposit:
    public void deposit(int amountToDeposit){
      balance+= amountToDeposit;
      System.out.println("You just deposited "+amountToDeposit);
    }
  
    //Withdraw:
    public int withdraw(int amountToWithdraw){
      balance-= amountToWithdraw;
      System.out.println("You just withdrew "+amountToWithdraw);
      return amountToWithdraw;
    }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      savings.checkBalance();
      
      //Withdrawing:
      savings.withdraw(300);
      
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
      
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
  
      //Check balance:
      savings.checkBalance();
      
    }       
  }
  