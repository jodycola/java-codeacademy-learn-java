###### JAVA: INTRODUCTION TO CLASSES

#### Classes: Instance Fields

Our last exercise ended with printing an instance of Store, which looked something like Store@6bc7c054. The first part, Store, refers to the class, and the second part @6bc7c054 refers to the instance’s location in the computer’s memory.

We don’t care about memory location, but our instances have no other characteristics! When an object is created, the constructor sets the initial state of the object. The state is made up of associated data that represents the characteristics of an object.

We’ll add data to an object by introducing instance variables, or instance fields.

We want Car instances of different colors, so we declare a String color instance field. Often times, instance variables are described as a “has-a” relationship with the object. For example, a Car “has-a” color. Another way to think of this is that instance variables are the nouns and adjectives associated with an object. What qualities other than color might a car have?

```
public class Car {
  /*
  declare fields inside the class
  by specifying the type and name
  */
  String color;
 
  public Car() {
    /* 
    instance fields available in
    scope of constructor method
    */
  }
 
  public static void main(String[] args) {
    // body of main method
  }
}
```

The declaration is within the class and the instance variable will be available for assignment inside the constructor.

Fields are a type of state each instance will possess. One instance may have "red" as its color, another "blue", etc. It’s the job of the constructor to give these instance fields initial value. We’ll learn how to do this in the next exercise.

#### Instructions

1. Add some state to our Store class.

Declare a String instance field for productType.