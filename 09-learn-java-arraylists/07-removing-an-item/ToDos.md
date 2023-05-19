###### LEARN JAVA: ARRAYLISTS

###Removing an Item

What if we wanted to get rid of an entry altogether? For arrays, we would have to make a completely new array without the value.

Luckily, ArrayLists allow us to remove an item by specifying the index to remove:
```
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]
```
We can also remove an item by specifying the value to remove:
```
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
shoppingCart.remove("Trench Coat");
// shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]
Note: This command removes the FIRST instance of the value "Trench Coat".
```

#### Instructions

1. Sherlock Holmes and Hercule Poirot have each already visited their respective crime scenes.

    Remove "visit the crime scene" from sherlocksToDos and poirotsToDos using remove().

    Moreover, Sherlock Holmes has also gotten some violin playing done.

    So you can remove "play violin" from sherlocksToDos as well.