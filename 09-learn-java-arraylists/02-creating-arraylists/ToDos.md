###### LEARN JAVA: ARRAYLISTS

### Creating ArrayLists

To create an ArrayList, we need to declare the type of objects it will hold, just as we do with arrays:

ArrayList<String> babyNames;
We use angle brackets < and > to declare the type of the ArrayList. These symbols are used for generics. Generics are a Java construct that allows us to define classes and objects as parameters of an ArrayList. For this reason, we can’t use primitive types in an ArrayList:
```
// This code won't compile:
ArrayList<int> ages;
 
// This code will compile:
ArrayList<Integer> ages;
```
The <Integer> generic has to be used in an ArrayList instead. You can also use <Double> and <Character> for types you would normally declare as doubles or chars.

We can initialize to an empty ArrayList using the new keyword:
```
// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();
 
// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();
```
####Instructions

1. Import the ArrayList package from java.util.

2. Create a new ArrayList that will contain String elements and call it toDoList.