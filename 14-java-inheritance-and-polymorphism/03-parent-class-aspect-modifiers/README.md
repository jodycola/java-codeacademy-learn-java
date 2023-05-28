###### INHERITANCE AND POLYMORPHISM

### Parent Class Aspect Modifiers

You may recall that Java class members use private and public access modifiers to determine whether they can be accessed from outside the class. So does a child class inherit its parent’s private members?

Well, no. But there is another access modifier we can use to keep a parent class member accessible to its child classes and to files in the package it’s contained in — and otherwise private: protected.public is visible everywhere; protected is visible in the class, the package, and child classes; a member with no modifier is visible in the class and package; private is visible only in the class itselfHere’s what protected looks like in use:
```
class Shape {
 
  protected double perimeter;
 
}
 
// any child class of Shape can access perimeter
```
In addition to access modifiers, there’s another way to establish how child classes can interact with inherited parent class members: using the final keyword. If we add final after a parent class method’s access modifier, we disallow any child classes from changing that method. This is helpful in limiting bugs that might occur from modifying a particular method.

Though it is not required, there is an established order when two or more field modifiers are used (eg. public final). To learn more about this read the documentation.

#### Instructions

1. Currently, Noodle has an ingredients attribute that its child class Ramen cannot access because it has a private access modifier.

    Change the access modifier for ingredients so that Ramen (not just any Java file in any package) can access it.

2. Noodle has an isTasty() method that returns true because noodles are tasty. But if you check in the Ramen class, you’ll see someone overrode isTasty() to return false! That person clearly doesn’t know food; all noodles are definitely tasty.

    Remove the method from Ramen and add a final keyword to isTasty() in Noodle so that nobody changes this method in any other Noodle child class again.