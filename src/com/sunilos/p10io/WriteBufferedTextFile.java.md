
```java
package com.sunilos.p10io;

import java.io.BufferedWriter; // Import BufferedWriter for efficient writing of text
import java.io.FileWriter; // Import FileWriter for writing character files

/**
 * Writes buffered character stream to a Text File. BufferedWriter and
 * PrintWriter class objects can be used for efficient writing.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteBufferedTextFile {

    public static void main(String[] args) throws Exception {
        System.out.println("Write to a Text file char by char"); // Indicate the operation being performed

        // Open a file using FileWriter
        FileWriter file = new FileWriter("f:/test11.txt");

        // Wrap the FileWriter with BufferedWriter for efficient writing
        BufferedWriter out = new BufferedWriter(file);

        // Create a character array to write
        char[] cArray = { 'H', 'i' };

        // Write the character array to the file
        out.write(cArray); // Write the contents of the char array

        // Write a single character to the file
        out.write(','); // Write a comma

        // Write a string to the file
        out.write("SUNRAYS"); // Write the string "SUNRAYS"

        // Close the BufferedWriter
        out.close(); // Close the BufferedWriter to flush and free resources

        // Close the FileWriter
        file.close(); // Close the FileWriter
    }
}
```

### Explanation of Key Parts:

- **BufferedWriter**: Used for writing text to a character output stream, buffering characters to provide efficient writing of text.
- **FileWriter**: Used to write characters to a file. It can be wrapped in a `BufferedWriter` to improve performance.
- **Character Array**: The code demonstrates writing both a character array and a string to a file, showcasing the flexibility of the `BufferedWriter`.
- **Resource Management**: Properly closing the `BufferedWriter` and `FileWriter` ensures that all data is flushed to the file and system resources are released.

