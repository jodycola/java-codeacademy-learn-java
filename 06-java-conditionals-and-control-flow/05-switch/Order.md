###### CONDITIONALS AND CONTROL FLOW

#### Switch Statement

An alternative to chaining if-then-else conditions together is to use the switch statement. This conditional will check a given value against any number of conditions and run the code block where there is a match.

Here’s an example of our course selection conditional as a switch statement instead:
```
String course = "History";
 
switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
```
This example enrolls the student in History class by checking the value contained in the parentheses, course, against each of the case labels. If the value after the case label matches the value within the parentheses, the switch block is run.

In the above example, course references the string "History", which matches case "History":.

When no value matches, the default block runs. Think of this as the else equivalent.

Switch blocks are different than other code blocks because they are not marked by curly braces and we use the break keyword to exit the switch statement.

Without break, code below the matching case label is run, including code under other case labels, which is rarely the desired behavior.
```
String course = "Biology";
 
switch (course) {
  case "Algebra": 
    // Enroll in Algebra
  case "Biology": 
    // Enroll in Biology
  case "History": 
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!
```

#### Instructions

1. We’ll rewrite the calculateShipping() method so it uses a switch statement instead.

    There’s an uninitialized variable shippingCost in calculateShipping(). Assign the correct value to shippingCost using a switch statement:

    We’ll check the value of the instance field shipping.

    When shipping matches "Regular", shippingCost should be 0.
    When shipping matches "Express", shippingCost should be 1.75.
    The default should assign .50 to shippingCost.
    Make sure the method returns shippingCost after the switch statement.