###### LEARN JAVA: ARRAYS

### Get Element By Index

Now that we have an array declared and initialized, we want to be able to get values out of it.

We use square brackets, [ and ], to access data at a certain index:
```
double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices[1]);
```
This command would print:

>15.87

This happens because 15.87 is the item at the 1 index of the array. Remember, the index of an array starts at 0 and ends at an index of one less than the number of elements in the array.

If we try to access an element outside of its appropriate index range, we will receive an >ArrayIndexOutOfBoundsException error.

For example, if we were to run the command System.out.println(prices[5]), we’d get the following output:

>java.lang.ArrayIndexOutOfBoundsException: 5

#### Instructions

1. We have augmented the Newsfeed class to start with the topics array as an instance field.

    Fill in the getTopTopic() method to return the 0th index of the topics array.

2. But wait — we added more to the Newsfeed class. Now, each instance starts with an array of zeros called views as an instance field.

    Every time someone views a topic, we want to increment the value of the appropriate field in views.

    For example, if someone views an "Opinion" piece, we want to increase the value of the 0th index of views from 0 to 1. If they view it again, we want to increase the value to 2.

    We have written a method signature for viewTopic(), which takes in an int called topicIndex.

    Inside the method, set the value of the views array at the index topicIndex to the current value plus 1.