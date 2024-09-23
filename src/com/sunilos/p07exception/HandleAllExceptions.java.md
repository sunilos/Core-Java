
```java
package com.sunilos.p07exception;

/**
 * The HandleAllExceptions class demonstrates handling exceptions 
 * in a universal manner using a single catch block.
 * It shows how to catch and handle any exception that may occur 
 * within the try block.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HandleAllExceptions {

    public static void main(String[] args) {

        String name = null; // Declare a string variable initialized to null
        // String name = "Vijay"; // Uncomment this line to test with a valid string

        try {
            // Attempt to get the length of the string
            System.out.println(name.length());
            // Attempt to get the 7th character of the string
            System.out.println(name.charAt(6));
        } catch (Exception e) {
            // Catch any Exception that occurs in the try block
            System.out.println("Universal Exception Handler: " + e.getMessage());
        }

    }

}
```

### Explanation:

- **Purpose:** The `HandleAllExceptions` class demonstrates how to handle exceptions universally by catching any exception that may arise within the `try` block. This approach simplifies error handling for situations where multiple types of exceptions might occur.

- **Method Overview:**
  - **`main` method:** This is the entry point of the program. It includes a `String` variable `name` initialized to `null`, which will cause a `NullPointerException` when its length is accessed.

- **Try-Catch Block:**
  - The `try` block contains code that may throw exceptions. The first line attempts to get the length of the `name` variable, and the second line attempts to access the character at index 6. Since `name` is `null`, both operations will result in exceptions.
  
  - The `catch` block catches any `Exception` that is thrown in the `try` block. It prints a universal message indicating that an exception occurred, along with the exception's message. This message provides insight into what went wrong.

- **Exception Handling:** Using a single catch block for all exceptions is convenient for handling unexpected errors without specifying each type of exception individually. However, this approach may obscure the specific type of error that occurred, so it should be used judiciously. In scenarios where more granular handling is required, specific exceptions should be caught and managed separately.
