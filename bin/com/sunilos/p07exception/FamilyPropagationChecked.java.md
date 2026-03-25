
```java
package com.sunilos.p07exception;

/**
 * The FamilyPropagationChecked class demonstrates the propagation of
 * a checked exception (MistakeException) through a family of method calls.
 * It shows how checked exceptions must be declared and handled appropriately.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FamilyPropagationChecked {

    public static void main(String[] args) {
        // Start the exception propagation process by calling dad().
        dad();
    }

    /**
     * The dad() method attempts to call mom() and handles any 
     * MistakeExceptions that are raised during the call.
     */
    public static void dad() {
        try {
            // Call the mom() method which may throw a MistakeException.
            mom();
        } catch (MistakeException e) {
            // Catch and handle the MistakeException raised by son().
            System.out.println(e.getMessage());
        }
    }

    /**
     * The mom() method calls the son() method, which can throw 
     * a MistakeException. This method declares that it can throw 
     * MistakeException.
     * 
     * @throws MistakeException
     */
    public static void mom() throws MistakeException {
        // Invoke son() which propagates a MistakeException.
        son();
    }

    /**
     * The son() method creates and throws a MistakeException.
     * This method declares that it can throw MistakeException.
     * 
     * @throws MistakeException
     */
    public static void son() throws MistakeException {
        // Create a new MistakeException.
        MistakeException e = new MistakeException();
        // Throw the MistakeException to propagate it up the call stack.
        throw e;
    }
}
```

### Explanation:

- **Purpose:** The `FamilyPropagationChecked` class illustrates how checked exceptions (in this case, `MistakeException`) propagate through method calls. It demonstrates the requirement for checked exceptions to be declared and handled appropriately.

- **Method Overview:**
  - **`main` method:** This is the entry point of the program. It starts the exception propagation process by calling the `dad()` method.
  
  - **`dad` method:** This method calls the `mom()` method within a `try` block. If a `MistakeException` occurs, it catches the exception and prints its message.

  - **`mom` method:** This method declares that it can throw a `MistakeException`. It calls the `son()` method, which is responsible for throwing the exception.

  - **`son` method:** This method creates a new `MistakeException` and throws it. It declares that it can throw `MistakeException`, allowing the caller to handle it appropriately.

- **Exception Handling:** The program demonstrates how checked exceptions require explicit handling. The `dad()` method handles the `MistakeException` thrown by `son()`, ensuring that the exception is managed properly within the flow of the program. This structure promotes robust error handling and enforces good programming practices when dealing with checked exceptions.
