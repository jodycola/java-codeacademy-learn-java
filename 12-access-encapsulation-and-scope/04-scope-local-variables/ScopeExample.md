###### ACCESS, ENCAPSULATION, AND SCOPE

### Scope: Local Variables

In addition to access modifiers like public and private, the scope of the variable also determines what parts of your code can access that variable.

The scope of a variable is determined by where the variable is declared. For example, because instance variables are declared inside a class but outside any methods or constructors, all methods and constructors are within the scope of that variable. For example, in the code block below, constructors and methods of the Dog class are using the Dog instance variables like name and age:
```
class Dog{
  public String name;
  public int age;
  public int weight;
 
  public Dog(){
    name = "Winston";
    age = 8;
    weight = 30;
  }
 
  public void speak(){
    System.out.println("My name is " + name);
  }
}
```
However, if we have a variable declared inside a method, that variable can only be used inside that method. The same is true for parameters. The scope of those parameters is only the method they’re associated with. If you try to use a parameter outside the function it’s defined in, you’ll get an error. These variables are often called local variables. Note that we don’t use public or private when declaring local variables.

This idea of scope extends to conditionals and loops as well. If you declare a variable inside the body of a conditional or in a loop, that variable can only be used inside that structure. This also includes the variable you’re using as your looping variable. For example, consider the following block of code:
```
for(int i = 0; i < 10; i++){
  // You can use i here
}
// i is out of scope here
```
You can only use i between the curly braces of the for loop. In general, whenever you see curly braces, be aware of scope. If a variable is defined inside curly braces, and you try to use that variable outside of those curly braces, you will likely see an error!

#### Instructions

1. Take a look at the main() method which tries to sum the values from a list. Right now, we’re looping through the values and trying to store the sum in a variable called sum. However, that variable is declared inside the for loop.

    There are two problems with this. The first is a logical error. Since we’re setting int sum = 0; at the start of the loop, every time the loop runs, sum gets reset back to 0.

    However, there is also a syntactical error. Right now we try to print sum after the loop. But that’s outside of sum‘s scope since the variable was declared inside the loop.

    Run your code as-is. You should expect to get an error related to the scope of sum.

2. Move the line of code int sum = 0; to be above the for loop. Now the for loop has access to sum and we’re able to return sum after the loop finishes.

    After moving the line of code, run your code to test the main() method.