
```java
package com.sunilos.p10io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Program to copy a binary file from one location to another.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class CopyBinaryFile {

    public static void main(String[] args) throws Exception {
        // Specify the source and target file paths
        String source = "f:/baby.jpg"; // Path of the source file
        String target = "f:/girl.jpg"; // Path of the target file

        // Create FileInputStream to read from the source file
        FileInputStream in = new FileInputStream(source);
        // Create FileOutputStream to write to the target file
        FileOutputStream out = new FileOutputStream(target);

        // Read the first byte from the source file
        int ch = in.read(); // Read a byte

        // Continue reading until the end of the file is reached
        while (ch != -1) { // -1 indicates end of file (EOF)
            out.write(ch); // Write the read byte to the target file
            ch = in.read(); // Read the next byte
        }

        // Close the output and input streams
        out.close(); // Ensure all data is flushed and resources are released
        in.close(); // Release resources associated with the input stream
        
        // Print a confirmation message indicating the copy is complete
        System.out.println(source + " is copied to " + target);
    }
}
```

### Explanation:

1. **Imports:** The class imports `FileInputStream` and `FileOutputStream` from the `java.io` package to handle file input and output operations.

2. **Class Declaration:** The `CopyBinaryFile` class contains a `main` method that performs the file copying operation.

3. **File Paths:**
   - **`source`:** This variable holds the path of the source file (the file to be copied).
   - **`target`:** This variable holds the path where the copied file will be saved.

4. **File Streams:**
   - **`FileInputStream in`:** This stream is used to read bytes from the source file.
   - **`FileOutputStream out`:** This stream is used to write bytes to the target file.

5. **Reading and Writing:**
   - The first byte is read from the source file using `in.read()`, which returns the byte value or `-1` if the end of the file is reached.
   - A `while` loop is employed to continue reading and writing bytes until the end of the file is encountered (`ch != -1`).
   - Each read byte is immediately written to the target file using `out.write(ch)`.

6. **Closing Streams:** After the copying process, both input and output streams are closed to release system resources and ensure that all data is properly flushed to the target file.

7. **Confirmation Message:** Finally, a message is printed to the console to confirm that the source file has been successfully copied to the target file.

### Key Points:
- **Binary File Handling:** This example demonstrates how to copy binary files, such as images, using byte streams.
- **Error Handling:** The method signature includes `throws Exception`, which means any `IOException` or other exceptions will be propagated. In a production setting, it would be wise to include proper error handling.
- **Resource Management:** Closing file streams is crucial for resource management to prevent memory leaks and ensure that all data is written correctly.
