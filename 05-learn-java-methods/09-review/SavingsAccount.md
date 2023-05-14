##### LEARN JAVA: METHODS

#### Review

Great work! Methods are a powerful way to abstract tasks away and make them repeatable. They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to. Let’s review everything we have learned about methods so far.

Defining a method : Method declarations will declare a method’s return type, name, and parameters
Calling a method : Methods are invoked with a . and ()
Parameters : Inputs to the method and their types are declared in parentheses in the method signature
Changing Instance Fields : Methods can be used to change the value of an instance field
Scope : Variables only exist within the domain that they are created in
Return : The type of the variables that will be output are declared in the method declaration
As you move through more Java material, it will be helpful to frame the tasks you create in terms of methods. This will help you think about what inputs you might need and what output you expect.

#### Instructions

1. Now that we’ve learned about behavior, we can apply behavior to our SavingsAccount class using methods!

    We’ve added the functionality for each method inside main() now, but you will be rebuilding each above main(). Note that your methods can directly access the balance field.

    First, write a method called checkBalance() that prints:

>Hello!
Your balance is 
with the balance of the account displayed.

It should take in no parameters and return nothing.

2. Now, write a method called deposit() that takes in an int parameter amountToDeposit and adds it to the balance. It should return nothing.

    If you want, you can also have the method print:

>You just deposited amountToDeposit
with the value of amountToDeposit displayed.

3. Now, write a method called withdraw() that takes in an int parameter amountToWithdraw and subtracts it from the balance. It should return the amountToWithdraw.

    If you want, you can also have the method print:

>You just withdrew amountToWithdraw
with the value of amountToWithdraw displayed.

4. Test out your methods by trying to replace some of the code in the main() method with the equivalent methods!

    Make sure to use checkBalance(), deposit(), and withdraw() at least once each.

5. Congratulations! You’ve made a basic SavingsAccount.

    If you want, you can add more functionality to this! What other instance fields might you want to keep track of? What might a toString() look like for this class?