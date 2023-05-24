###### LEARN JAVA: LOOPS

### Iterating Over Arrays and ArrayLists

One common pattern we’ll encounter as a programmer is traversing, or looping, through a list of data and doing something with each item. In Java, that list would be an array or ArrayList and the loop could be a for loop. But wait, how does this work?

In order to traverse an array or ArrayList using a loop, we must find a way to access each element via its index. We may recall that for loops are created with a counter variable. We can use that counter to track the index of the current element as we iterate over the list of data.

Because the first index in an array or ArrayList is 0, the counter would begin with a value of 0 and increment until the end of the list. So we can increment through the array or ArrayList using its indices.

For example, if we wanted to add 1 to every int item in an array secretCode, we could do this:
```
for (int i = 0; i < secretCode.length; i++) {
  // Increase value of element value by 1
  secretCode[i] += 1;
}
```
Notice that our condition in this example is i < secretCode.length. Because array indices start at 0, the length of secretCode is 1 larger than its final index. A loop should stop its traversal before its counter variable is equal to the length of the list.

To give a concrete example, if the length of an array is 5, the last index we want to access is 4. If we were to try to access index 5, we would get an ArrayIndexOutOfBoundsException error! This is a very common mistake when first starting to traverse arrays.

Traversing an ArrayList looks very similar:
```
for (int i = 0; i < secretCode.size(); i++) {
  // Increase value of element value by 1
  int num = secretCode.get(i);
  secretCode.set(i, num + 1);
}
```
We can also use while loops to traverse through arrays and ArrayLists. If we use a while loop, we need to create our own counter variable to access individual elements. We’ll also set our condition to continue looping until our counter variable equals the list length.

For example, let’s use a while loop to traverse through an array:
```
int i = 0; // initialize counter
 
while (i < secretCode.length) {
  secretCode[i] += 1;
  i++; // increment the while loop
}
```
Traversing through an ArrayList with a while loop would look like this:
```
int i = 0; // initialize counter
 
while (i < secretCode.size()) {
  int num = secretCode.get(i);
  secretCode.set(i, num + 1);
  i++; // increment the while loop
}
```

#### Instructions

1. Let’s use a for loop to iterate over expenses and sum up the total of all items.

    Start with the skeleton of a for loop:

    Initialize a counter i with a value of 0.
    The loop should run while i is less than the size() of expenses.
    Increment i.
    You can leave the body empty for now.

2. Inside the for loop, add the item’s value to total.