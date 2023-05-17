###### LEARN JAVA: ARRAYS

### Creating an Array Explicitly

Imagine that we’re using a program to keep track of the prices of different clothing items we want to buy. We would want a list of the prices and a list of the items they correspond to. To create an array, we provide a name and declare the type of data it holds:

```
double[] prices;
```
Just like with variables, we can declare and initialize in the same line. This allows us to explicitly initialize the array to contain the data we want to store :
```
double[] prices = {13.15, 15.87, 14.22, 16.66};
```
We can use arrays to hold Strings and other objects as well as primitives:
```
String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};
``` 

#### Instructions

1. We have an empty Newsfeed class that does not store anything yet.

    First, make a method called getTopics(), which:

- is public
- returns a String array
- does not take any parameters

For now, leave the method empty.

2. Inside the getTopics() method, create a String array called topics and set it equal to an array containing these elements, in order:

>Opinion
Tech
Science
Health

Then, return topics from the method!

3. Uncomment the lines in the main method to see how the getTopics() method works on a Newsfeed instance.