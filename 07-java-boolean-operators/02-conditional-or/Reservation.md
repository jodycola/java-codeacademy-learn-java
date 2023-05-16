###### CONDITIONAL OPERATORS

#### Conditional-Or: ||

The requirements of our enrollment program have changed again. Certain courses have prerequisites that are satisfied by multiple courses. As long as students have taken at least one prerequisite, they should be allowed to enroll.

Here’s one way we could write the code:
```
if (hasAlgebraPrerequisite) {
  // Enroll in course
}
 
if (hasGeometryPrerequisite) {
  // Enroll in course
}
```

We’re using two different if-then statements with the same code block. We can be more concise with the OR operator:
```
if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}
```
The OR operator, ||, is used between two boolean values and evaluates to a single boolean value. If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.

This code illustrates every combination:
```
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

##### Keep Reading: AP Computer Science A Students

On some occasions, the compiler can determine the truth value of a logical expression by only evaluating the first boolean operand; this is known as short-circuited evaluation. Short-circuited evaluation only works with expressions that use && or ||.

In an expression that uses ||, the resulting value will be true as long as one of the operands has a true value. If the first operand of an expression is true, we don’t need to see what the value of the other operand is to know that the final value will also be true.

For example, we can run the following code without error despite dividing a number by 0 in the second operand because the first operand had a true value:
```
if (1 > 0 || 2 / 0 == 7) {
  System.out.println("No errors here!");
}
```
An expression that uses && will only result in true if both operands are true. If the first operand in the expression is false, the entire value will be false.

#### Instructions

1. Let’s write a message inside the Reservation() constructor that warns against bad input.

    Our restaurants can’t seat parties of more than 8 people, and we don’t want reservations for 0 or less because that would be silly.

    Inside Reservation(), write a conditional that uses ||.

    If count is less than 1 OR greater than 8 we want to write the following message: Invalid reservation!.