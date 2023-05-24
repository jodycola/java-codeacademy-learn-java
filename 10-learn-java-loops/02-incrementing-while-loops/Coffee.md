###### LEARN JAVA: LOOPS

### Incrementing While Loops

When looping through code, it’s common to use a counter variable. A counter (also known as an iterator) is a variable used in the conditional logic of the loop and (usually) incremented in value during each iteration through the code. For example:
```
// counter is initialized
int wishes = 0;
 
// conditional logic uses counter
while (wishes < 3) {
 
  System.out.println("Wish granted.");
  // counter is incremented
  wishes++;
 
}
```
In the above example, the counter wishes gets initialized before the loop with a value of 0, then the program will keep printing "Wish granted." and adding 1 to wishes as long as wishes has a value of less than 3. Once wishes reaches a value of 3 or more, the program will exit the loop.

So the output would look like:
```
Wish granted.
Wish granted.
Wish granted.
```
We can also decrement counters like this:
```
int pushupsToDo = 10;
 
while (pushupsToDo > 0) {
 
  doPushup();
  pushupsToDo--;
 
}
```
In the code above, the counter, pushupsToDo, starts at 10, and increments down one at a time. When it hits 0, the loop exits.

#### Instructions

1. In Coffee.java, initialize an int variable called cupsOfCoffee with a value of 1.

2. Create a while loop that runs as long as cupsOfCoffee is less than or equal to 100.

    Important: Inside the while loop, increment cupsOfCoffee by 1 to prevent an infinite loop.

3. Inside the while loop above where you incremented cupsOfCoffee print the following:
```
Fry drinks cup of coffee #1
```
The 1 in this statement should correspond with the current value of cupsOfCoffee. When cupsOfCoffee is 100, this should be printed:
```
Fry drinks cup of coffee #100
```