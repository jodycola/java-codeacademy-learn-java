###### 2D ARRAYS: JAVA

### Traversing 2D Arrays: Introduction

In the last exercise, we reviewed how to use nested loops as well as how to iterate through regular arrays using loops. In this exercise, we will apply that knowledge in order to learn how to traverse 2D arrays.

Traversing 2D arrays using loops is important because it allows us to access many elements quickly, access elements in very large 2D arrays, and even access elements in 2D arrays of unknown sizes.

Let’s remember the structure of 2D arrays in Java:
```
char[][] letterBlock = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j', 'k', 'l'}};
```
In Java, 2D arrays are like normal arrays, but each element is another array. This is shown by the initialized 2D array above. The outer array consists of four elements, where each element consists of a three element subarray.

Let’s see what happens when we access elements of the outer array
```
System.out.println(Arrays.toString(letterBlock[0]) + "\n");
System.out.println(Arrays.toString(letterBlock[1]) + "\n");
System.out.println(Arrays.toString(letterBlock[2]) + "\n");
System.out.println(Arrays.toString(letterBlock[3]) + "\n");
```
Here is the output of the above code:
```
[a, b, c]
 
[d, e, f]
 
[g, h, i]
 
[j, k, l]
```
As you can see, we can retrieve the entire subarray from each of the outer array elements. If you look at how we are accessing these subarrays, we are just increasing the index. This means we can access each sub-array in the 2D array using a loop!

Let’s take a look at an example which produces the same output, but can handle any sized 2D array.
```
for(int index = 0; index < letterBlock.length; index++){
    System.out.println(Arrays.toString(letterBlock[index]) + "\n");
}
```
Here is the result:
```
[a, b, c]
 
[d, e, f]
 
[g, h, i]
 
[j, k, l]
```
Now let’s remember how to access a value from the subarray. Previously, we learned that we can use the double brackets [][], where the first set of brackets contains the index of the element of the outer array and the second set of brackets contains the index of the element in the subarray. If we wanted to retrieve the letter 'f' we would use:
```
char storedLetter = letterBlock[1][2];
```
Since we know we can use a loop to retrieve each of the subarrays stored in the outer array, we can then use a nested loop to access each of the elements from the sub-array.

You might be wondering how we can figure out the number of iterations needed in order to fully traverse the 2D array.

In order to find the number of elements in the outer array, we just need to get the length of the 2D array.
>int lengthOfOuterArray = letterBlock.length;

When thinking about the 2D array in matrix form, this is the height of the matrix (the number of rows)
In order to find the number of elements in the subarray, we can get the length of the subarray after it has been retrieved from the outer array.
Remember that we retrieved the sub array earlier using this format:
>char[] subArray = letterBlock[0];

Therefore, we can use this to get the length of the first subarray in the 2D array
>int lengthOfSubArray = letterBlock[0].length;

When thinking about the 2D array in matrix form, this is the width of the matrix (the number of columns)
In most cases, getting the length of the first subarray in the 2D array will apply to the rest of the subarrays (if it is rectangular in shape), but there are rare occasions where the length of the subarrays could be different. This occurs if the 2D array is a jagged array. We won’t be working with any jagged 2D arrays in this lesson, but it’s something to keep in mind.
Let’s look at an example!
```
for(int a = 0; a < letterBlock.length; a++) {
    for(int b = 0; b < letterBlock[a].length; b++) {
        System.out.print("Accessed: " + letterBlock[a][b] + "\t");
    }
    System.out.println();
}
```
You can think of the variable a as being the outer loop index, and the variable b as being the inner loop index.

Here is the output:

>Accessed: a    Accessed: b    Accessed: c    
Accessed: d    Accessed: e    Accessed: f    
Accessed: g    Accessed: h    Accessed: i    

Within the nested for loop, we can see that each of the subarray elements are being accessed by using the outer loop index for the outer array, and the inner loop index for the subarray.

Here is a diagram to help visualize how the 2D array is traversed using nested loops:

The outer loop controls what row we're in while the inner loop controls which element of that row we're looking at

We don’t have to only use regular for loops for traversing 2D arrays. We can use enhanced for loops if we do not need to keep track of the indices. Since enhanced for loops only use the element of the arrays, it is a bit more cumbersome to keep track of which index we are at. This same idea applies to while and do-while loops as well. This is why we usually use regular for loops except for when we want to do something simple like printing.

We have gone over how to think about 2D array traversal in terms of arrays of arrays, but there are two main ways of thinking about traversal in terms of rows and columns. These are called row-major order and column-major order.

#### Instructions

1. Store the number of subarrays of intMatrix into an int variable called numSubArrays.

    If you want to confirm your work, print that number after creating it. You should expect to see the number of rows in the 2D array.

2. Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength. This should be an int.

    Again, feel free to use System.out.println() to print this value after creating the variable. What value do you expect to see?

3. Store the number of columns in intMatrix into a variable called columns and the number of rows in intMatrix into a variable called rows.

4. Replace the outer and inner for loop headers to iterate through the entire 2D array. Use the iterators i for the outer loop and j for the inner loop. Also, add a line of code which calculates the sum of all of the elements in the 2D array.