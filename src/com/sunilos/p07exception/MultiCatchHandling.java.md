
```java
package com.sunilos.p07exception;

/**
 * Demonstrates the use of one try block with multiple catch blocks 
 * to handle different types of exceptions.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MultiCatchHandling {

    public static void main(String[] args) {

        String name = "Vijay"; // Sample string for demonstration

        try {
            // Get the length of the string
            System.out.println(name.length());
            // Attempt to get the 7th character of the string
            System.out.println(name.charAt(6));
        } catch (NullPointerException e) {
            // This block executes if 'name' is null
            System.out.println("Name cannot be null");
        } catch (StringIndexOutOfBoundsException e) {
            // This block executes if the string has less than 7 characters
            System.out.println("String is small");
        }

    }
}
```

### Explanation:

- **Purpose:** The `MultiCatchHandling` class illustrates how to use a single `try` block to handle multiple potential exceptions that may arise from the code within it.

- **Try Block:** The code inside the `try` block attempts to perform two operations on the `name` string: retrieving its length and accessing its seventh character. If these operations encounter any issues, they may throw exceptions.

- **Catch Blocks:**
  - **NullPointerException:** This catch block handles cases where the `name` variable is `null`, preventing a `NullPointerException` from being thrown when trying to access its properties or methods. It outputs a message indicating that the name cannot be null.
  
  - **StringIndexOutOfBoundsException:** This catch block addresses situations where the string has fewer than 7 characters, resulting in an attempt to access an index that does not exist. It outputs a message indicating that the string is too short.

- **Error Handling:** By using multiple catch blocks, the program can provide specific feedback for different error scenarios, making it clearer to the user what went wrong. This approach enhances robustness and user experience by handling exceptions gracefully.
