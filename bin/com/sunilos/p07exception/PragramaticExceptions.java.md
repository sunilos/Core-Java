
```java
package com.sunilos.p07exception;

/**
 * Demonstrates throwing a programmatic exception.
 * This example raises a RuntimeException when a user is deemed invalid.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class PragramaticExceptions {

    /**
     * Simulates user validation.
     * Always returns false to test exception handling.
     * 
     * @return false, indicating the user is not valid
     */
    public static boolean isValidUser() {
        return false; // Always return false to test exception
    }

    public static void main(String[] args) {

        // Check if user is valid
        boolean userFound = isValidUser();

        if (userFound) {
            // If the user is valid, print a confirmation message
            System.out.println("Valid User");
        } else {
            // If the user is invalid, instantiate and raise an exception
            RuntimeException e = new RuntimeException("Invalid User");
            throw e; // Throws the exception to be caught by an external handler
        }
    }
}
```

### Explanation:

- **Purpose:** The `PragramaticExceptions` class demonstrates how to programmatically throw an exception based on a condition—in this case, user validation.

- **isValidUser Method:** 
  - This method simulates the validation of a user. It always returns `false`, indicating that the user is invalid. This setup is specifically designed to trigger an exception.

- **Main Method:**
  - The main method first calls `isValidUser()` to check if the user is valid.
  - If `userFound` is `true`, it prints "Valid User". However, since the method always returns `false`, this block will not execute.
  - If `userFound` is `false`, the program creates a new `RuntimeException` with the message "Invalid User" and throws it. This action signals that an invalid user has been encountered.

- **Exception Handling:** 
  - This class demonstrates the concept of throwing exceptions programmatically, which can be caught and handled by a higher-level exception handler, enabling structured error management in a larger application.
