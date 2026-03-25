
```java
package com.sunilos.p07exception;

/**
 * The FamilyPropagation class demonstrates the propagation of 
 * an unchecked exception (RuntimeException) through a family 
 * of method calls. It shows how exceptions can be caught and 
 * handled at different levels in the call stack.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FamilyPropagation {

    public static void main(String[] args) {
        // Start the exception propagation process by calling dad().
        dad();
    }

    /**
     * The dad() method attempts to call mom() and handles any 
     * RuntimeExceptions that are raised during the call.
     */
    public static void dad() {
        try {
            // Call the mom() method which may throw an exception.
            mom();
        } catch (RuntimeException e) {
            // Catch and handle the RuntimeException raised by son().
            System.out.println("Caught by Dad, raised by son");
        }
    }

    /**
     * The mom() method calls the son() method, which can throw 
     * a RuntimeException.
     */
    public static void mom() {
        // Invoke son() which propagates a RuntimeException.
        son();
    }

    /**
     * The son() method creates and throws a RuntimeException 
     * indicating a mistake was made.
     */
    public static void son() {
        // Create a new RuntimeException with a message.
        RuntimeException e = new RuntimeException("I made a mistake");
        // Throw the RuntimeException to propagate it up the call stack.
        throw e;
    }
}
```

### Explanation:

- **Purpose:** The `FamilyPropagation` class illustrates how unchecked exceptions (specifically `RuntimeException`) can propagate through method calls and be caught at a higher level in the call stack.

- **Method Overview:**
  - **`main` method:** This is the entry point of the program. It starts the exception propagation process by calling the `dad()` method.
  
  - **`dad` method:** This method attempts to call the `mom()` method within a `try` block. If a `RuntimeException` occurs, it catches the exception and prints a message indicating that it was caught by "Dad," and that it was raised by "son."
  
  - **`mom` method:** This method calls the `son()` method, which is responsible for throwing the exception. It does not handle any exceptions itself, allowing them to propagate up to the `dad()` method.

  - **`son` method:** This method creates a new `RuntimeException` with a descriptive message and throws it. This action triggers the exception propagation to the `mom()` method, and subsequently to the `dad()` method.

- **Exception Handling:** The program demonstrates how exceptions can be handled at different levels. In this case, the `dad()` method handles the exception thrown by `son()`, showing how one part of the code can manage errors arising from another part, promoting better error handling and separation of concerns in programming.
