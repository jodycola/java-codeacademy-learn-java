###### LEARN JAVA: METHODS

#### Calling Methods

When we add a non-static method to a class, it becomes available to use on an object of that class. In order to have our methods get executed, we must call the method on the object we created.

Let’s add a non-static startEngine() method to our Car class from the previous lesson. Inside the main() method, we’ll call startEngine() on the myFastCar object:
```
class Car {
 
  String color;
 
  public Car(String carColor) {
    color = carColor;
  }
 
  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }
 
  public static void main(String[] args){
    Car myFastCar = new Car("red");
    // Call a method on an object 
    myFastCar.startEngine();
    System.out.println("That was one fast car!");
  }
}
```
Let’s take a closer look at the method call:

```
myFastCar.startEngine();
```
First, we reference our object myFastCar. Then, we use the dot operator (.) to call the method startEngine(). Note that we must include parentheses () after our method name in order to call it.

If we run the above program, we will get the following output.

>Starting the car!
Vroom!
That was one fast car!

Code generally runs in a top-down order where code execution starts at the top of a program and ends at the bottom of a program; however, methods are ignored by the compiler unless they are being called.

When a method is called, the compiler executes every statement contained within the method. Once all method instructions are executed, the top-down order of execution continues. This is why Starting the car! and Vroom! are outputted before That was one fast car!.

#### Instructions

1. Last exercise, we defined a new method, advertise(), but we didn’t actually see it run.

    We now have a Store class with advertise() defined.

    Call the advertise() method on the lemonadeStand object in the main() method and see what the output is!

2. Now, call the advertise() method on the lemonadeStand object two more times. It should be called in the main() method three times total.