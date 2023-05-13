###### LEARN JAVA: METHODS

#### Reassigning Instance Fields

Earlier, we thought about a Savings Account as a type of object we could represent in Java.

Two of the methods we need are depositing and withdrawing:
```
public class SavingsAccount{
  double balance;
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }
 
  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }
 
  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }
 
  public static void main(String[] args){
 
  }
}
```

These methods would change the value of the variable balance. We can reassign balance to be a new value by using our assignment operator, =, again.

```
public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}
```
Now, when we call deposit(), it should change the value of the instance field balance:
```
public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}
```
This code first prints 2000, the initial value of myAccount.balance, and then prints 2100, which is the value of myAccount.balance after the deposit() method has run.

Changing instance fields is how we change the state of an object and make our objects more flexible and realistic.

#### Instructions

1. We have added a price instance field to the Store class.

    However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty increasePrice() method to the Store class. It takes a double parameter priceToAdd.

    Inside of the increasePrice() method, create a variable called newPrice. Declare it to be a double, and set it equal to the price plus the priceToAdd.

2. Inside of increasePrice(), set the instance field price to be newPrice!

3. In the main() method, increase the price at the lemonade stand by 1.5. Then, print the lemonadeStand.price to see how it has changed!