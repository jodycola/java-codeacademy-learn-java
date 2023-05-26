###### STATIC VARIABLES AND METHODS

### Writing Your Own Static Methods

Nice work! Now that we’ve seen how static variables work, let’s look into how to write our own static methods.

Let’s get the syntax out of the way first — just like with variables, to create a static method, use the static keyword in the method’s definition. Just like with variables, this keyword usually comes after public or private.
```
public static void myFirstStaticMethod(){
  // Some code here
}
```
Often times, you’ll see static methods that are accessors or mutators for static variables.
```
public static int getMyStaticVariable(){
  return myStaticVariable;
}
 
public static void setMyStaticVariable(int newValue){
  myStaticVariable = newValue;
}
```
One important rule to note is that static methods can’t interact with non-static instance variables.

To wrap your mind around this, consider why we use this when working with non-static instance variables. Let’s say we have a Dog class with a non-static instance variable named age. If we have a line of code like this.age = 5;, that means we’re setting the age of a specific Dog equal to 5. However, if age were static, that would mean that the variable belongs to the entire class, not a specific object.

The this keyword can’t be used by a static method since static methods are associated with an entire class, not a specific object of that class. If you try to mix this with a static method, you’ll see the error message non-static variable this cannot be referenced from a static context.

#### Instructions

1. Let’s write a static method that prints the average amount of money in all vending machines in the system.

    The method name should be averageMoney and it should be void since it doesn’t return anything. The method should print totalMoney divided by numATMs. Note that both of those variables are static.

    After writing the method, call the method at the end of the main() method. Recall that since this is a static method, you’ll use the name of the class to call the method, not an object of the class.

2. Let’s try to have averageMoney() interact with a non-static instance variable. In averageMoney(), try to print this.money. You should expect to see an error message — a static method can’t interact with a non-static instance variable.