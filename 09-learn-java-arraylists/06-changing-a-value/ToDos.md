###### LEARN JAVA: ARRAYLISTS

### Changing a Value

When we were using arrays, we could rewrite entries by using bracket notation to reassign values:
```
String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};
 
shoppingCart[0] = "Tweed Cape";
 
// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```
ArrayList has a slightly different way of doing this, using the set() method:
```
ArrayList<String> shoppingCart = new ArrayList<String>();
 
shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");
 
shoppingCart.set(0, "Tweed Cape");
 
// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```

#### Instructions

1. Modify sherlocksToDos so that the value at "play violin" becomes "listen to Dr. Watson for amusement".

2. Modify poirotsToDos so that the value at "trim mustache" becomes "listen to Captain Hastings for amusement".