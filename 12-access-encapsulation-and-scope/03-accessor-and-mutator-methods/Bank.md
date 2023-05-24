###### ACCESS, ENCAPSULATION, AND SCOPE

### Accessor and Mutator Methods

When writing classes, we often make all of our instance variables private. However, we still might want some other classes to have access to them, we just don’t want those classes to know the exact variable name. To give other classes access to a private instance variable, we would write an accessor method (sometimes also known as a “getter” method).
```
public class Dog{
  private String name;
 
  //Other methods and constructors
 
  public String getName() {
    return name;
  }
}
```
Even though the instance variable name is private, other classes could call the public method getName() which returns the value of that instance variable. Accessor methods will always be public, and will have a return type that matches the type of the instance variable they’re accessing.

Similarly, private instance variables often have mutator methods (sometimes known as “setters”). These methods allow other classes to reset the value stored in private instance variables.

public class Dog{
  private String name;
 
  //Other methods and constructors
 
  public void setName(String newName) {
    name = newName;
  }
 
  public static void main(String[] args){
    Dog myDog = new Dog("Cujo");
    myDog.setName("Lassie");
  }
}
Mutator methods, or “setters”, often are void methods — they don’t return anything, they just reset the value of an existing variable. Similarly, they often have one parameter that is the same type as the variable they’re trying to change.

#### Instructions

1. Take a look at the main() method of Bank.java. Right now it’s trying to directly access and change the balance in a checking account. Unfortunately, that instance variable is private. Run your code with Bank.java open. You should expect an error.

2. Let’s go to CheckingAccount.java and write an accessor method for the balance instance field. Your method should be named getBalance(). This method should be public.

    When you’re done writing that method, go back to the main() method in Bank.java and change the code to use that new method.

3. Let’s do the same for a mutator method. In CheckingAccount.java, write a mutator method named setBalance() that has an int parameter named newBalance. The method should set the balance instance variable to the value passed into the method.

    After writing this method, go back to Bank.java and add a line of code to your main() method where you use setBalance() to set accountOne‘s balance to 5000.

    After setting the balance to 5000, use your .getBalance() method again to print out the new balance.