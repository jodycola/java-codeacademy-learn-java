###### LEARN JAVA: MANIPULATING VARIABLES

#### Greater/Less Than or Equal To

How could we make sure we got paid at least the amount we expected in our paycheck? We could use greater than or equal to, >=, or less than or equal to, <=!
```
double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;
System.out.println(paycheckAmount >= calculatedPaycheck);
//this will print true, since paycheckAmount equals calculatedPaycheck
```

#### Instructions

1. You have been trying to complete a 30 day challenge to drink enough water per day.

    Create a double variable called totalRecommendedAmount and set it to the product of the recommended water intake (recommendedWaterIntake) and the amount of days in the challenge (daysInChallenge).

2. Create a boolean variable called isChallengeComplete and set it to the result of checking if your intake, yourWaterIntake, is at least as much as the totalRecommendedAmount.

    Then, print the isChallengeComplete variable.