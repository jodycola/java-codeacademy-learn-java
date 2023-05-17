###### LEARN JAVA: ARRAYS

### Importing Arrays

When we printed out the array we created in the last exercise, we saw a memory address that did not help us understand what was contained in the array.

If we want to have a more descriptive printout of the array itself, we need a toString() method that is provided by the Arrays package in Java.
```
import java.util.Arrays;
```
We put this at the top of the file, before we even define the class!

When we import a package in Java, we are making all of the methods of that package available in our code.

The Arrays package has many useful methods, including Arrays.toString(). When we pass an array into Arrays.toString(), we can see the contents of the array printed out:
```
import java.util.Arrays;
 
public class Lottery(){
 
  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }
 
}
```
This code will print:
```
[4, 8, 15, 16, 23, 42]
```

#### Instructions

1. In order to make our printout of the topics array more helpful, we are going to want to use the toString() method from the Arrays package.

    To use it, we first must import the Arrays package from java.util. Import the package at the top of the Newsfeed.java file.

2. Now that you have the Arrays package, use its toString() method to print out the topics array in the main() method.