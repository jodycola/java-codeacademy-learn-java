###### LEARN JAVA: ARRAYLISTS

### ArrayList Size

Let’s say we have an ArrayList that stores items in a user’s online shopping cart. As the user navigates through the site and adds items, their cart grows bigger and bigger.

If we wanted to display the number of items in the cart, we could find the size of it using the size() method:
```
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
System.out.println(shoppingCart.size());
// 1 is printed
shoppingCart.add("Tweed Houndstooth Hat");
System.out.println(shoppingCart.size());
// 2 is printed
shoppingCart.add("Magnifying Glass");
System.out.println(shoppingCart.size());
// 3 is printed
```

In dynamic objects like ArrayLists, it’s important to know how to access the amount of objects we have stored.

#### Instructions

1. Detectives do a lot to solve a case. But who has more to do?

    Print out the size of each detective’s to-do ArrayList:

- sherlocksToDos for Sherlock Holmes
- poirotsToDos for Hercule Poirot

2. So who has more to do? Print the name of the detective whose to-do list is longer. Was it Sherlock or Poirot?