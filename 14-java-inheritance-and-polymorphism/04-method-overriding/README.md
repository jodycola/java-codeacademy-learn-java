###### INHERITANCE AND POLYMORPHISM

### Method Overriding

One common use of polymorphism with Java classes is something we mentioned earlier — overriding parent class methods in a child class. Like the + operator, we can give a single method slightly different meanings for different classes. This is useful when we want our child class method to have the same name as a parent class method but behave a bit differently in some way.

Let’s say we have a BankAccount class that allows us to print the current balance. We want to build a CheckingAccount class that inherits the functionality of a BankAccount but with a modified printBalance() method. We can do the following:
```
class BankAccount {
  protected double balance;
 
  public BankAccount(double balanceIn){
    balance = balanceIn;
  }
 
  public void printBalance() {
    System.out.println("Your account balance is $" + balance);
  }
}
 
class CheckingAccount extends BankAccount {
 
  public CheckingAccount(double balance) {
    super(balance);
  }
 
  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }
}
```
Notice that in order to properly override printBalance(), in CheckingAccount the method has the following in common with the corresponding method in BankAccount:

- Method name
- Return type
- Number and type of parameters

You may have also noticed the @Override keyword above printBalance() in CheckingAccount. This annotation informs the compiler that we want to override a method in the parent class. If the method doesn’t exist in the parent class, we’ll get a helpful error when we compile the program.

##### Keep Reading: AP Computer Science A Students

In a previous exercise, we learned that the super keyword can be used to call the constructor of a superclass. That’s not the only use of super; we can also use this keyword to call the methods of a parent class. While we now have the ability to override methods from a superclass, we may find ourselves in a unique situation where we want to use the superclass method instead of the subclass’ overridden method.

If that’s the case, we can call the parent class method by prepending super followed by the dot operator (.) to the method call. Note that this only works if we pass in the proper method parameters. Let’s see this in action by adding a checkBalances() method to CheckingAccount that calls both versions of printBalance():
```
class CheckingAccount extends BankAccount {
  public CheckingAccount(double balance) {
    super(balance);
  }
 
  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }
 
  public void checkBalances() {
    // calls method from CheckingAccount
    printBalance();
    // calls method from BankAccount
    super.printBalance();
  }
 
  public static void main(String[] args) {
    CheckingAccount myCheckings = new CheckingAccount(5000);
    myCheckings.checkBalances();
  }
}
```
This program will output:
```
Your checking account balance is $5000
Your account balance is $5000
```
#### Instructions

1. Noodle has a cook() method that involves boiling the noodle and changing the texture to "cooked".

    The German noodle spätzle involves a slightly unconventional cooking procedure: grinding or scraping the dough into the pot of boiling water.

    In Spaetzle.java, override the inherited cook() method. Copy the original method body, but before "Boiling" gets printed, add a new line to print "Grinding or scraping dough.".

    Don’t forget to add @Override above the method to help with debugging.