###### ACCESS, ENCAPSULATION, AND SCOPE

### Scope: The this Keyword

Often times when creating classes, programmers will create local variables with the same name as instance variables. For example, consider the code block below:
```
public class Dog{
  public String name;
 
  public Dog(String inputName){
    name = inputName;
  }
 
  public void speakNewName(String name){
    System.out.println("Hello, my new name is" + name);
  }
 
  public static void main(String[] args){
    Dog myDog = new Dog("Winston");
    myDog.speakNewName("Darla"); // Prints "Darla" - "Winston" ignored
 
  }
}
```
We have an instance variable named name, but the method speakNewName has a parameter named name. So when the method tries to print name, which variable will be printed? By default, Java refers to the local variable name. So in this case, the value passed to the parameter will be printed and not the instance variable.

If we wanted to access the instance variable and not the local variable, we could use the this keyword.
```
public class Dog{
  public String name;
 
  public Dog(String inputName){
    name = inputName;
  }
 
  public void speakNewName(String name){
    System.out.println("Hello, my new name is" + this.name);
  }
 
  public static void main(String[] args){
    Dog a = new Dog("Fido");
    Dog b = new Dog("Odie");
 
    a.speakNewName("Winston");
    // "Fido", the instance variable of Dog a is printed. "Winston" is ignored
 
    b.speakNewName("Darla");
    // "Odie", the instance variable of Dog b is printed. "Darla" is ignored.
  }
}
```
The this keyword is a reference to the current object. We used this.name in our speakNewName() method. This caused the method to print out the value stored in the instance variable name of whatever Dog Object called speakNewName(). (Note that in this somewhat contrived example, the local variable name used as a parameter gets completely ignored).

Oftentimes, you’ll see constructors have parameters with the same name as the instance variable. For example, you might see something like:
```
public Dog(String name){
  this.name = name;
}
```
You can read this as “set this Dog‘s instance variable name equal to the variable passed into the constructor”. While this naming is a common convention, it can also be confusing. There’s nothing wrong with naming your parameters something else to be more clear. Sometimes you will see something like:
```
public Dog(String inputName){
  this.name = inputName;
}
```
This is now a little clearer — we’re setting the Dog‘s instance variable name equal to the name we give the constructor.

Finally, mutator methods also usually follow this pattern:
```
public void setName(String name){
  this.name = name;
}
```
We reset the instance variable to the value passed into the parameter.

Throughout the rest of this lesson, we’ll use this. when referring to an instance variable. This isn’t always explicitly necessary — if there’s no local variable with the same name, Java will know to use the instance variable with that name. That being said, it is a good habit to use this. when working with your instance variables to avoid potential confusion.

#### Instructions

1. Take a look at the instance variables for our SavingsAccount class. There are three of them. owner, balanceDollar, balanceEuro. Next, take a look at the constructor we’ve started for you. The job of the constructor is to initialize these instance variables.

    Complete the constructor to give value to all three instance variables. The instance variable owner should be set to the local variable owner. The instance variable balanceDollar should be set equal to the local variable balanceDollar. Finally, the instance variable balanceEuro should be set equal to the local variable balanceDollar multiplied by 0.85. (Right now, every dollar is worth 0.85 euros.)

2. Next, look at the addMoney() method. This method should add the value stored in the parameter balanceDollar to the instance variable balanceDollar. Before adding the money to the account, print out the statement "Adding ____ dollars to the account.". After adding the money, print the statement "The new balance is _____ dollars.". Be careful of spacing, capitalization, and punctuation with your print statements.

    Call the addMoney() method once in the main() method to test your code. Add 2000 dollars to Zeus’s account.

    (Note that this function should probably be updating balanceEuro as well based on the parameter. We won’t test your code for that, but you can try implementing it yourself. Also, note that balanceDollar is a pretty bad name for the parameter of this function. Something like moneyToAdd would make more sense. But for the sake of practicing local variables vs instance variables, keep the parameter named balanceDollar.)