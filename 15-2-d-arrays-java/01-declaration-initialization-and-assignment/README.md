###### 2D ARRAYS: JAVA

### Declaration, Initialization, and Assignment

When declaring 2D arrays, the format is similar to normal, one-dimensional arrays, except that you include an extra set of brackets after the data type. In this example, int represents the data type, the first set of brackets [] represent an array, and the second set of brackets [] represent that we are declaring an array of arrays.

>int[][] intTwoDArray;

You can think of this as creating an array ([]) of int arrays (int[]). So we end up with int[][].

Now that we’ve declared a 2D array, let’s look at how to initialize it with starting values. When initializing arrays, we define their size. Initializing a 2D array is different because, instead of only including the number of elements in the array, you also indicate how many elements are going to be in the sub-arrays. This can also be thought of as the number of rows and columns in the 2D matrix.

>int[][] intArray1;
>intArray1 = new int[row][column];

Here is an example of initializing an empty 2D array with 3 rows and 5 columns.

>int[][] intArray2;
>intArray2 = new int[3][5];

This results in a matrix which looks like this:

A 3 by 5 array of zeroes

If you already know what values are going to be in the 2D array, you can initialize it and write all of the values into it at once. We can accomplish this through initializer lists

In Java, initializer lists are a way of initializing arrays and assigning values to them at the same time
We can use this for 2D arrays as well by creating an initializer list of initializer lists
An example of an initializer list for a regular array would be:

>char[] charArray = {'a', 'b', 'c', 'd'};
Similar to how a regular initializer list defines the size and values of the array, nested initializer lists will define the number of rows, columns, and the values for a 2D array.

There are three situations in which we can use initializer lists for 2D arrays:

In the case where the variable has not yet been declared, we can provide an abbreviated form since Java will infer the data type of the values in the initializer lists:

>double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

If the variable has already been declared, you can initialize it by creating a new 2D array object with the initializer list values:

>String[][] stringValues;
>stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};

The previous method also applies to assigning a new 2D array to an existing 2D array stored in a variable.
In the next exercise, we’ll look at how to assign values of individual elements.

#### Instructions

1. Declare a 2D array of float values called floatTwoD.

2. Initialize the 2D array from the last step to an empty 2D array consisting of 4 arrays with 10 elements each. Do this on a new line under the declaration.

3. On a single line, declare and initialize an empty 2D array of ints consisting of 15 rows and 8 columns called dataChart.

4. Create a 2D char array called ticTacToe representing this tic-tac-toe board. Use the characters 'X', 'O', and ' '.

    First Row: X, O, O. Second row: O, X, Space. Third Row: X, Space, X.

    (Note that you should use a capitalized O, not the number 0.)

5. When no one is looking, you want to modify the game so 'O' wins. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists. Do not declare ticTacToe again.