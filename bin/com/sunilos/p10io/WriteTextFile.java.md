
```java
package com.sunilos.p10io;

import java.io.FileWriter; // Import FileWriter for writing character streams to files

/**
 * Writes to a Text File. You can write character, char array and string
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteTextFile {

    public static void main(String[] args) throws Exception {
        // Confirmation message indicating the start of writing process
        System.out.println("Write to a Text file char by char");

        // Open a file for writing. This will create the file if it doesn't exist.
        FileWriter file = new FileWriter("f:/test1.txt");

        // Create a character array to write
        char[] cArray = { 'H', 'i' };

        // Write the character array to the file
        file.write(cArray); // Writes "Hi" to the file
        
        // Write a single character to the file
        file.write(','); // Writes a comma to the file
        
        // Write a string to the file
        file.write("SUNRAYS"); // Writes "SUNRAYS" to the file

        // Close the FileWriter to release resources and ensure all data is written
        file.close();
    }
}
```

### Explanation of Key Parts:

- **FileWriter**: This class is used for writing character files. It allows writing data in character format to a specified file.
- **Writing Data**:
  - The `write(char[])` method writes the contents of the character array to the file.
  - The `write(char)` method writes a single character to the file.
  - The `write(String)` method writes a string to the file.
- **File Creation**: If the specified file (`test1.txt`) does not exist, `FileWriter` will create it. If it does exist, the existing file will be overwritten.
- **Closing the Writer**: It’s important to call `close()` on the `FileWriter` to free up system resources and ensure all data is properly written to the file.

