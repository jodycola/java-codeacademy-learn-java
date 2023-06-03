###### 2D ARRAYS: JAVA

### Modifying Elements in a 2D Array

Now let’s review how to modify elements in a normal array.

For a one dimensional array, you provide the index of the element which you want to modify within a set of brackets next to the variable name and set it equal to an acceptable value:

>storedArray[5] = 10;

For 2D arrays, the format is similar, but we will provide the outer array index in the first set of brackets and the subarray index in the second set of brackets. We can also think of it as providing the row in the first set of brackets and the column index in the second set of brackets if we were to visualize the 2D array as a rectangular matrix:

>twoDArray[1][3] = 150;

To assign a new value to a certain element, make sure that the new value you are using is either of the same type or is castable to the type already in the 2D array.

Let’s say we wanted to replace four values from a new 2D array called intTwoD. Look at this example code to see how to pick individual elements and assign new values to them.
```
int[][] intTwoD = new int[4][3];
 
intTwoD[3][2] = 16;
intTwoD[0][0] = 4;
intTwoD[2][1] = 12;
intTwoD[1][1] = 8;
```
Here is a before and after image showing when the 2D array was first initialized compared to when the four elements were accessed and modified.

The array now looks like {{4,0,0},{0,8,0},{0,12,0},{0,0,16}}

#### Instructions

1. Replace the number 4 in intMatrix with the number 0.

    Again, feel free to print the matrix to confirm you changed the correct number. To print a 2D array, use

> System.out.println(Arrays.deepToString(intMatrix));

2. Declare and initialize a new empty 2x2 int 2D array called subMatrix.

3. Using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created. Notice how we have to write a similar line of code 4 times. Afterwards, uncomment the provided print statement to see the result. In the next exercise, we’ll start looking into how to use loops to make this process quicker.