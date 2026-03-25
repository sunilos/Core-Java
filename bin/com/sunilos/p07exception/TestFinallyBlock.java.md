
```java
package com.sunilos.p07exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Tests the use of the finally block to ensure resources are cleaned up after use.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestFinallyBlock {

    public static void main(String[] args) throws IOException {
        InputStream input = null; // Initialize InputStream to null

        try {
            // Attempt to open the file for reading
            input = new FileInputStream("file.txt");
            int data = input.read(); // Read the first byte of data
            while (data != -1) { // Continue until the end of the file
                // Print the character representation of the byte read
                System.out.print((char) data);
                data = input.read(); // Read the next byte
            }
        } finally {
            // Cleanup the file resource
            if (input != null) {
                // Close the InputStream if it was opened
                input.close();
            }
        }
    }
}
```

### Explanation:

- **Purpose:** The `TestFinallyBlock` class demonstrates how to use the `finally` block to ensure that resources, such as file streams, are properly closed after their use, even if an exception occurs.

- **InputStream Initialization:**
  - The `InputStream input` is initialized to `null` to allow for null checks when closing it later.

- **Try Block:**
  - The `try` block contains code that attempts to open a file named `file.txt` for reading.
  - It reads the file one byte at a time and prints the corresponding character until the end of the file (indicated by `-1`).

- **While Loop:**
  - The loop continues reading and printing characters until all bytes in the file have been processed.

- **Finally Block:**
  - The `finally` block executes after the `try` block, regardless of whether an exception was thrown.
  - It checks if the `input` stream is not `null` and calls `input.close()` to release the file resource, preventing potential memory leaks.

- **Exception Handling:**
  - Any `IOException` that occurs during file operations will propagate up the call stack due to the `throws IOException` declaration in the `main` method.

- **Output:**
  - When executed successfully, the program will print the contents of `file.txt` to the console. If the file does not exist or cannot be read, an exception will occur, but the `finally` block will still attempt to close the stream if it was opened.
