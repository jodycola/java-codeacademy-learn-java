###### ACCESS, ENCAPSULATION, AND SCOPE

### Other Private Methods

Now that we’ve seen how methods can call other methods using this., let’s look at a situation where you might want to use private methods. Oftentimes, private methods are helper methods — that is to say that they’re methods that other, bigger methods use.

For example, for our CheckingAccount example, we might want a public method like getAccountInformation() that prints information like the name of the account owner, the amount of money in the account, and the amount of interest the account will make in a month. That way, another class, like a Bank, could call that public method to get all of that information quickly.

Well, in order to get that information, we might want to break that larger method into several helper methods. For example, inside getAccountInformation(), we might want to call a function called calculateNextMonthInterest(). That helper method should probably be private. There’s no need for a Bank to call these smaller helper methods — instead, a Bank can call the one public method, and rely on that method to do all of the complicated work by calling smaller private methods.

#### Instructions

1. Let’s implement what we described in the narrative. We’ve written our getAccountInformation() method in the CheckingAccount.java class. But we haven’t yet implemented the calculateNextMonthInterest() method. This should be a private method and return a double — the balance of the account multiplied by the interestRate. Write that function.

    Then flip back to Bank.java and take a look at the main() method. We’re calling bankOfGods.accountOne.getAccountInformation();. Will a Bank be able to do this? Run your code to find out.

2. Nice work! We were able to get all of the account information, including the next month’s interest, even though calculateNextMonthInterest() is private.

    Let’s prove to ourselves that we can’t call this private method from a Bank. In Bank.java‘s main() method, try calling bankOfGods.accountOne.calculateNextMonthInterest();.

    You should see an error since you’re trying to use a Bank to call a private method from a CheckingAccount.