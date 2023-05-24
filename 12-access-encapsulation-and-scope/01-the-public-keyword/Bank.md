###### ACCESS, ENCAPSULATION, AND SCOPE

### The public Keyword

After running the code in the last exercise, you should be developing an intuition on what the public and private keywords are doing. These keywords are defining what parts of your code have access to other parts of your code.

We can define the access of many different parts of our code including instance variables, methods, constructors, and even a class itself. If we choose to declare these as public this means that any part of our code can interact with them - even if that code is in a different class!

The way we declare something to be public is to use the public keyword in the declaration statement. In the code block below, we have a public class, constructor, instance variables, and method. Notice the five different uses of public.
```
public class Dog{
  public String name;
  public int age;
 
  public Dog(String input_name, int input_age){
    name = input_name;
    age = input_age;
  }
 
  public void speak() {
    System.out.println("Arf Arf! My name is " + name + " and I am a good dog!");
  }
}
```
Since everything about a Dog is public, any other class can access anything about a Dog. For example, let’s say there was a DogSchool class. Any method of the DogSchool class could make a new Dog using the public Dog constructor, directly access that Dog’s instance variables, and directly use that Dog’s methods:
```
public class DogSchool{
  public void makeADog(){
    Dog cujo = new Dog("Cujo", 7);
    System.out.println(cujo.age);
    cujo.speak();
  }
}
```
Notice that the DogSchool class and the makeADog() method are also public. This means that if some other class created a DogSchool, they would have access to these methods as well! We have public methods calling public methods!

One final thing to note is that for the purposes of this lesson, we’ll almost always make our classes and constructors public. While you can set them to private, it’s fairly uncommon to do so. Instead, we’ll focus on why you might make your instance variables and methods private. We’ll start looking into the private keyword in the next exercise.

#### Instructions

1. Once again we’ve given you a Bank class and a CheckingAccount class. First, take a look at CheckingAccount.java to see what methods and variables have been set to private or public. Then, switch to Bank.java, look at the main method, and hit the “Run” button. You should get an error. Why?

2. In Bank.java‘s main() method, we’re trying to access three different private fields from the CheckingAccount class. Edit the checking account class to make those fields public. Make sure to edit only the fields you need in order to make Bank‘s main() method run — don’t change any of the other fields in CheckingAccount.

    After you’re done editing CheckingAccount.java, go back to Bank.java and run your code. A Bank should now have access to these fields from a CheckingAccount.