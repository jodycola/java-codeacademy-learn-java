###### JAVA: INTRODUCTION TO CLASSES

#### Classes: Syntax

The fundamental concept of object-oriented programming is the class.

A class is the set of instructions that describe how an instance can behave and what information it contains.

Java has pre-defined classes such as System, which we’ve used in logging text to our screen, but we also need to write our own classes for the custom needs of a program.

Here’s a definition of a Java class:
```
public class Car {
// scope of Car class starts after curly brace
  public static void main(String[] args) {
    // scope of main() starts after curly brace
    // program tasks
  }
  // scope of main() ends after curly brace
}
// scope of Car class ends after curly brace
```

This example defines a class named Car. public is an access level modifier that allows other classes to interact with this class. For now, all classes will be public.

This class has a main() method, which lists the tasks performed by the program. main() runs when we execute the compiled Car.class file.

#### Instructions

1. In the code editor, create a public Store class.

2. Your program will not compile without a main() method.

Define one within Store.