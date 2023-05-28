###### INHERITANCE AND POLYMORPHISM

### Inheriting the Constructor

Hang on, you might be thinking, if the child class inherits its parent’s fields and methods, does it also inherit the constructor? Let’s take a look at how the super() constructor works!

Let’s say Shape has a numSides field that is set by passing an integer into the constructor. If we’re instantiating a Triangle, we would want that number to always be 3, so we’d want to modify the constructor to automatically assign numSides with a value of 3.

Can we do that?

As it happens, Java has a trick up its sleeve for just this occasion: using the super() method which acts like the parent constructor inside the child class constructor:
```
class Triangle extends Shape {
 
  Triangle() {
    super(3);
  }
 
  // additional Triangle class members
 
}
```

By passing 3 to super(), we are making it possible to instantiate a Triangle without passing in a value for numSides.

Meanwhile, super(3) (behaving as Shape(3)) will shoulder the responsibility of setting numSides to 3 for our Triangle object. It’s like we called Shape(3).

It is also possible to write a constructor without making a call to any super() constructor:
```
class Triangle extends Shape {
 
  Triangle() {
    this.numSides = 3;
  }
 
  // additional Triangle class methods
 
}
```
In this situation, Java secretly calls the parent class’ no-argument constructor (super()). So in this specific example, the Triangle() constructor first calls the Shape() constructor. That Shape() takes care of whatever business it needs to take care of. And then after that is complete, we go in and set this.numSides to 3.

If you’re writing a constructor of a child class, and don’t explicitly make a call to a constructor from a parent class using super, it’s important to remember that Java will automatically (and secretly) call super() as the first line of your child class constructor.

#### Instructions

1. Tab over to Pho.java and build a constructor for Pho.

    Leave the constructor’s parameters blank. Inside the constructor, pass the following arguments in the following order to super() — the constructor for Noodle:

- A lengthInCentimeters of 30.0
- A widthInCentimeters of 0.64
- A shape of "flat"
- ingredients of "rice flour"

2. Tab back over to Noodle.java. Inside main(), instantiate a new Pho instance called phoChay.

    Now print out phoChay‘s shape.