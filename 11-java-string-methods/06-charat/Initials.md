###### STRING METHODS

### charAt()

The charAt() method returns the character located at a String‘s specified index.

For example:
```
String str = "qwer";
 
System.out.println(str.charAt(2));
```
It would output e because that’s what’s at index 2. (Once again, indices start with 0.)

Suppose we try to return the character located at index 4. It would produce an IndexOutOfBoundsException error because index 4 is out of str‘s range:
```
java.lang.StringIndexOutOfBoundsException: String index out of range: 4
```
#### Instructions

1. In Initials.java, add your first name and last name.

2. Print out the initials of the firstName and lastName.