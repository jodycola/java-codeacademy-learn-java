###### INHERITANCE AND POLYMORPHISM

### Child Classes in Method Parameters

When we call a method that contains parameters, the arguments we place in our method call must match the parameter type. Similar to the previous exercise, polymorphism gives us a little more flexibility with the arguments we can use.

If we use a superclass reference as a method parameter, we can call the method using subclass reference arguments!

For example, imagine the class ScaryStory, whose constructor takes in a reference to the Monster class:
```
class ScaryStory {
  Monster monster;
  String setting;
 
  public ScaryStory(Monster antagonist, String place) {
    monster = antagonist;
    setting = place;
  }
 
  public void tellStory(){
    System.out.println("Once upon a time, " + monster.name + " was at " + setting + " looking to scare some mortals.");
  }
 
  public static void main(String[] args) {
    Monster dracula;
    dracula = new Vampire("Dracula");
    ScaryStory countDracula = new ScaryStory(dracula, "Dracula Castle");
    countDracula.tellStory();
  }
}
```
In the main() method, we used a reference of the class Vampire as our argument even though the constructor requested an object of class Monster. This is allowed because Vampire is a subclass of the Monster class.

#### Instructions

1. Take a look at the code in the new file, NoodleRestaurant.java. Specifically, look at the order() method to see what its parameter’s data type is.

    Inside the main() method, call the order() method on customer1 with pho as an argument.

2. Underneath the previous line of code, call the order() method on customer2 with ramen as an argument.