
```java
package com.sunilos.p10io;

import java.io.FileReader; // Import FileReader for reading character files

/**
 * Reads a Text File character by character and by char array.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadTextFile {

    public static void main(String[] args) throws Exception {
        readByChar(); // Call method to read file character by character
        System.out.println(); // Print a newline for separation
        readByArray(); // Call method to read file by character array
    }

    private static void readByChar() throws Exception {
        System.out.println("Read file char by char"); // Indicate the method being executed

        // Open a file using FileReader
        FileReader r = new FileReader("c:/test.txt");

        // Reads a single character
        int ch = r.read(); // Read the first character
        char chr; // Variable to hold the character

        // ch is -1 if no more characters are left in the file
        while (ch != -1) {
            chr = (char) ch; // Cast the integer to a char
            System.out.print(chr); // Print the character
            ch = r.read(); // Read the next character
        }
        r.close(); // Close the FileReader to free resources
    }

    private static void readByArray() throws Exception {
        System.out.println("Read file by char Array"); // Indicate the method being executed

        // Open a file using FileReader
        FileReader r = new FileReader("c:/test.txt");

        // Create a character array for buffering
        char[] buffer = new char[10]; // Buffer size of 10 characters

        // Reads a character array from the file
        int count = r.read(buffer); // Read characters into the buffer

        // count is 0 if no more characters are left in the file
        while (count > 0) {
            // Create a string from the character array
            String str = new String(buffer);

            // Trim empty characters from the string
            str = str.substring(0, count); // Only use the number of characters read

            System.out.print(str); // Print the string
            // Read more characters into the buffer
            count = r.read(buffer);
        }
        // Close the FileReader
        r.close(); // Close the FileReader to free resources
    }
}
```

### Explanation of Key Parts:

- **FileReader**: This class is used to read character files. It handles character encoding automatically.
- **readByChar() Method**: Reads the file one character at a time. It continues until there are no more characters left to read (`read()` returns -1).
- **readByArray() Method**: Reads multiple characters at once into a character array, allowing for more efficient reading.
- **Buffer Management**: A character array (`buffer`) is used to read a block of characters, improving performance compared to reading one character at a time.
- **String Creation and Trimming**: A string is created from the character array, and `substring()` is used to ensure only the valid characters are printed.
- **Resource Management**: Closing the `FileReader` is essential for freeing up system resources after file operations.

