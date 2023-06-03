###### 2D ARRAYS: JAVA

### 2D Array Review

Let’s review the concepts we have learned throughout this lesson.

Arrays are objects in Java, we can have arrays of objects, therefore we can also have arrays of arrays. This is the way 2D arrays are structured in Java.

We can declare and initialize 2D arrays in a few different ways depending on the situation:
```
// Declaring without initializing
int[][] intTwoD;
 
// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];
 
// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];
 
// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
 
// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
```
We retrieve elements in a 2D array by providing a row and column index char c = letters[0][1];

We can also think of them as the index of the outer array and the index of the subarray
We can modify elements the same way letters[1][2] = 'z';
We traverse 2D arrays using nested loops.

We can use loops of any type, but we typically use nested for loops to keep track of the indices
Row-major order traverses through each row moving horizontally to the right through each row
Column-major order traverses through each column moving vertically down through each column
Row-major order and column-major order start and end on the same elements, but the paths are different.
In order to convert row-major to column-major, we need to make the outer loop terminating condition depend on the number of columns, make the inner loop terminating condition depend on the number of rows, and flip the variables in our accessor within the inner loop to ensure that we don’t try to access outside of the 2D array since we flipped the direction of traversal.
Here are examples of row-major and column-major order:
```
// Row-major order
for(int o = 0; o < letters.length; o++) {
    for(int i = 0; i < letters[o].length; i++) {
        char c = letters[o][i];
    }
}
 
// Column-major order
for(int o = 0; o < letters[0].length; o++) {
    for(int i = 0; i < letters.length; i++) {
        char c = letters[i][o];
    }
}
```
Conditional logic in our 2D array traversal allows us to use the data in a meaningful way. We can control which rows and columns we look at, ensure that the data we are looking at is what we want, perform calculations on specific elements, avoid throwing exceptions, and more.

Here is an example of traversal with conditional logic.

Given this 2D array of Strings:
```
String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};
```
We are going to flip the capitalization of the words:
```
System.out.println("Before...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
 
for(int i=0; i<words.length; i++) {
    for(int j = 0; j<words[i].length; j++) {
        if(words[i][j]!=null) {
 
            // Check the capitalization
            boolean allCaps = true;
            for(char c : words[i][j].toCharArray()) 
                if(!Character.isUpperCase(c)) 
                    allCaps = false;
 
            // Flip the capitalization
            if(allCaps)
                words[i][j] = words[i][j].toLowerCase();
            else
                words[i][j] = words[i][j].toUpperCase();
        }
    }
}
 
System.out.println("After...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
```
Here is the output of the above code:

>Before...
[[championship, QUANTITY, month],
 [EMPLOYEE, queen, understanding],
 [method, writer, MOVIE]]
 
>After...
[[CHAMPIONSHIP, quantity, MONTH],
 [employee, QUEEN, UNDERSTANDING],
 [METHOD, WRITER, movie]]
Time to work some review problems!

After learning about 2D arrays, you have decided to become a CS professor and you are now teaching your class about 2D arrays. You are making an application which will keep track of their exam grades and show you statistics about their performance. You will be using 2D arrays to keep track of their exam grades

#### Instructions

1. First, declare and initialize a 4x3 2D array of doubles called scores which will contain the exam data for four students. The rows will represent the student and the columns will represent the exam number. You already know the first exam scores (80.4, 96.2, 100.0, 78.9). Use initializer lists to store the first exam scores in the first column and -1 for the remaining exams. Use the provided print statement to print the result in the console.

2. The next set of exams have occurred. Using 4 lines of code, manually enter the scores (89.7, 90.5, 93.6, 88.1) for the second exam (column 1). Use the provided print statement to print the updated 2D array as well.

3. You have realized that you will only be keeping track of 2 exam grades instead of 3. Declare and initialize an empty 4x2 2D array of double values called newScores.

4. Using loops, copy all of the scores for exam 1 and 2 into the new 2D array. (Do not include the -1 values)

5. You have allowed the students to complete an extra credit activity to contribute towards their scores. For all exam grades less than 90, add 2 additional points to the grade in newScores.