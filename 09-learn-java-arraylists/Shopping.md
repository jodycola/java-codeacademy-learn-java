###### LEARN JAVA: ARRAYLISTS

#### Introduction

When we work with arrays in Java, we’ve been limited by the fact that once an array is created, it has a fixed size. We can’t add or remove elements.

But what if we needed to add to the book lists, newsfeeds, and other structures we were using arrays to represent?

To create mutable and dynamic lists, we can use Java’s ArrayList class. ArrayList allows us to:

- Store object references as elements
- Store elements of the same type (just like arrays)
- Access elements by index (just like arrays)
- Add elements
- Remove elements

Remember how we had to import java.util.Arrays in order to use additional array methods? To use an ArrayList at all, we need to import them from Java’s util package as well:
```
import java.util.ArrayList;
```
Let’s learn how to make use of this powerful object…

#### Instructions

1. In Shopping.java we’ve defined two arrays:
groceryItems, a String array
prices, a double array
We’ve tried to add a new item to the end of each. Run the code — does it work?