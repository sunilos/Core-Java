
```java
package com.sunilos.p07exception;

/**
 * Demonstrates handling exceptions using a parent exception class.
 * This example showcases how a parent exception class can handle
 * exceptions thrown by its child classes.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ParentHandleChildExceptions {

    public static void main(String[] args) {

        String name = null; // Sample string initialized to null
        // String name = "Vijay"; // Uncomment to test with a valid string

        try {
            // Attempt to get the length of the string
            System.out.println(name.length());
            // Attempt to get the 7th character of the string
            System.out.println(name.charAt(6));
        } catch (RuntimeException e) {
            // This block handles any RuntimeException, including NullPointerException
            System.out.println("Parent Handles Exception : " + e.getMessage());
        }

    }
}
```

### Explanation:

- **Purpose:** The `ParentHandleChildExceptions` class demonstrates how a parent exception class (in this case, `RuntimeException`) can catch and handle exceptions thrown by its child classes, such as `NullPointerException` and `StringIndexOutOfBoundsException`.

- **Try Block:** 
  - The code inside the `try` block attempts to perform operations on the `name` string. If `name` is null, accessing its properties will lead to a `NullPointerException`.

- **Catch Block:** 
  - The `catch` block is designed to catch any `RuntimeException`. Since `NullPointerException` is a subclass of `RuntimeException`, it will be caught here.
  - When an exception occurs, the catch block executes, and the message associated with the exception is printed, providing insight into what went wrong.

- **Error Handling:** This example illustrates a simple way to handle exceptions by leveraging polymorphism in exception handling. By catching the parent exception type, the code can effectively handle any derived exceptions, simplifying error management and enhancing code maintainability.
