
```java
package com.sunilos.p07exception;

/**
 * Demonstrates handling multiple exception types in a single catch block, 
 * a feature supported in Java 7 and later.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MultiExceptionHandling {

    public static void main(String[] args) {

        String name = "Vijay"; // Sample string for demonstration

        try {
            // Get the length of the string
            System.out.println(name.length());
            // Attempt to get the 7th character of the string
            System.out.println(name.charAt(6));
        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            // This block handles both NullPointerException and StringIndexOutOfBoundsException
            System.out.println(ex.getMessage());
        }

    }
}
```

### Explanation:

- **Purpose:** The `MultiExceptionHandling` class showcases how to catch multiple exception types within a single `catch` block, a feature introduced in Java 7 to simplify error handling.

- **Try Block:** The code within the `try` block performs two operations on the `name` string: retrieving its length and accessing its seventh character. If these operations fail, an exception may be thrown.

- **Catch Block:** 
  - The `catch` block is capable of handling both `NullPointerException` and `StringIndexOutOfBoundsException`. If either of these exceptions is thrown, control passes to this block.
  - The exception object `ex` is used to call `getMessage()`, which retrieves a descriptive message associated with the caught exception. This message provides insight into what went wrong.

- **Error Handling:** This approach streamlines exception handling by allowing multiple exceptions to be processed in a unified manner, reducing redundancy in code and enhancing readability. The user receives feedback based on the specific exception encountered, making the program more user-friendly and robust.
