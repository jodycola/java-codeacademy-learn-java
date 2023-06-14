###### LEARN JAVA: MANIPULATING VARIABLES

#### Order of Operations

If we were to place multiple operators in a single expression, what operation would the compiler evaluate first?
```
int num = 5 * (10 - 4) + 4 / 2;
```
The order of operations dictates the order in which an expression (like the one above) is evaluated. Operators that share the same precedence are evaluated from Left-to-Right within the expression.

The order is as follows:

Parentheses
Exponents
Modulo/Multiplication/Division
Addition/Subtraction
With this new information in mind, let’s dissect the expression from above so that we can find the value of num:

>5 * (10 - 4) + 4 / 2

10 - 4 would be evaluated first because it is wrapped in parentheses. This value would become 6 making our expression look like this:

> 5 * 6 + 4 / 2 

Next, 5 * 6 will be evaluated because of the * operator. This value is 30. Our expression now looks like this:

> 30 + 4 / 2

Following the order of operations, 4 / 2 will be evaluated next because the division operator / has higher precedence than the addition operator +. Our expression now resembles the following:

> 30 + 2

30 + 2 is 32. This means that the value of num is 32.

#### Instructions

Take a look at the expressions in Operations.java.

Solve for the value of each of the expressions on your own.

To find out if your calculations are right, uncomment the print statements and run the code.