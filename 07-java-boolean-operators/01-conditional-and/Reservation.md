###### CONDITIONAL OPERATORS

#### Conditional-And: &&

Let’s return to our student enrollment program. We’ve added an additional requirement: not only must students have the prerequisite, but their tuition must be paid up as well. We have two conditions that must be true before we enroll the student.

Here’s one way we could write the code:
```
if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}
```
We’ve nested two if-then statements. This does the job but we can be more concise with the AND operator:
```
if (tuitionPaid && hasPrerequisite) {
  // enroll student
}
```
The AND operator, &&, is used between two boolean values and evaluates to a single boolean value. If the values on both sides are true, then the resulting value is true, otherwise the resulting value is false.

This code illustrates every combination:
```
true && true
// true
false && true
// false
true && false
// false
false && false
// false
```

#### Instructions

1. Our Reservation class has the method confirmReservation() which validates if a restaurant can accomodate a given reservation.

    We need to build the conditional logic into confirmReservation() using three instance variables:

- restaurantCapacity
- guestCount
- isRestaurantOpen

    Use an if-then-else statement:

    If restaurantCapacity is greater than or equal to guestCount and the restaurant is open, print "Reservation confirmed" and set isConfirmed to true.

    else print "Reservation denied" and set isConfirmed to false.