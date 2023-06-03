###### 2D ARRAYS: JAVA

### Traversing 2D Arrays: Practice with Loops

We have seen how to traverse 2D arrays using standard for loops, but in this exercise, we will practice traversing them using some other loop types. For example, you may want to only retrieve elements without keeping track of the indices using enhanced for loops, or you could continuously update the 2D array until a condition is met using while loops.

In enhanced for loops, each element is iterated through until the end of the array. When we think about the structure of 2D arrays in Java (arrays of array objects) then we know that the outer enhanced for loop elements are going to be arrays.

Let’s take a look at an example:

Given this 2D array of character data:
```
char[][] charData = {{'a', 'b', 'c', 'd', 'e', 'f'},{'g', 'h', 'i', 'j', 'k', 'l'}};
```
Print out every character using enhanced for loops:
```
for(char[] charRow : charData) {
    for(char c : charRow) {
        System.out.print(c + " ");
    }
    System.out.println();
}
```
Remember that the syntax for enhanced for loops looks like so: for( datatype elementName : arrayName){. Since 2D arrays in Java are arrays of arrays, each element in the outer enhanced for loop is an entire row of the 2D array. The nested enhanced for loop is then used to iterate through each element in the extracted row. Here is the output of the above code:

a b c d e f 
g h i j k l

Here is an example which accomplishes the same thing, but using while loops:
```
int i = 0, j=0;
while(i<charData.length) {
    j = 0;
    while(j<charData[i].length) {
        System.out.print(charData[i][j] + " ");
        j++;
    }
    System.out.println();
    i++;
}
```
Here is the output of the above code:

a b c d e f 
g h i j k l

Notice how we can use different loop types for traversal, but still receive the same result.

Let’s work some example problems using different loop types!

#### Instructions

1. Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)

2. Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The print statement has been provided (you will need to modify it if you use iterators other than i and j).