###### LEARN JAVA: METHODS

#### Returns
Remember, variables can only exist in the scope that they were declared in. We can use a value outside of the method it was created in if we return it from the method.

We return a value by using the keyword return:

```
public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}
```
This method, called numberOfTires(), returns 4. Once the return statement is executed, the compiler exits the function. Any code that exists after the return statement in a function is ignored.

In past exercises, when creating new methods, we used the keyword void. Here, we are replacing void with int, to signify that the return type is an int.

The void keyword (which means “completely empty”) indicates that no value is returned after calling that method.

A non-void method, like numberOfTires() returns a value when it is called. We can use datatype keywords (such as int, char, etc.) to specify the type of value the method should return. The return value’s type must match the return type of the method. If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.

Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so:

```
public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}
```
Within main(), we called the numberOfTires() method on myCar. Since the method returns an int value of 4, we store the value in an integer variable called numTires. If we printed numTires, we would see 4.

#### Keep Reading: AP Computer Science A Students

We learned how to return primitive values from a method, but what if we wanted our method to return an object? Returning an object works a little differently than returning a primitive value. When we return a primitive value, a copy of the value is returned; however, when we return an object, we return a reference to the object instead of a copy of it.

Let’s create a second class, carLot, that takes in a Car as a parameter and contains a method which returns a Car object.
```
class CarLot {
    Car carInLot;
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }
 
    public Car returnACar() {
        // return Car object
        return carInLot;
    }
 
    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar); 
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}
```
This code outputs the same memory address because myCar and carInLot have the same reference value:

Car@2f333739
Car@2f333739

#### Instructions

1. We want to have a method that returns the price plus tax.

    Define a method called getPriceWithTax() that is intended to return the price plus the tax. It should take in no parameters and return a double.

    You can leave the body of the method empty for now. Note: the code will have an error until we return the correct type from the method, which we will do in the next step.

2. Inside the getPriceWithTax() method, create a double variable totalPrice that is equal to price + price * 0.08. 0.08 is the tax applied to the price.

    Then, return totalPrice.

3. Inside of main(), set a double variable lemonadePrice to the value returned by lemonadeStand.getPriceWithTax().

4. Now, print out lemonadePrice.