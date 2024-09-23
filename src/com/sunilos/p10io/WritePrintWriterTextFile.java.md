
```java
package com.sunilos.p10io;

import java.io.BufferedWriter; // Import BufferedWriter for buffered character output
import java.io.FileWriter; // Import FileWriter for writing to files
import java.io.PrintWriter; // Import PrintWriter for printing formatted representations of objects to a text-output stream

/**
 * Writes text using PrintWriter class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WritePrintWriterTextFile {

    public static void main(String[] args) throws Exception {
        // Confirmation message indicating the start of writing process
        System.out.println("Write to a Text file using PrintWriter");
        
        // Open a file for writing
        FileWriter file = new FileWriter("f:/test11.txt");
        
        // Wrap FileWriter with PrintWriter for easy text output
        // The second parameter 'true' enables auto-flushing
        PrintWriter out = new PrintWriter(file, true);
        
        // Write lines of text to the file
        out.println("Line 1"); // Write first line
        out.println("Line 2"); // Write second line
        out.println("Line 3"); // Write third line
        
        // Close the PrintWriter
        out.close(); // Ensures all buffered data is written to the file
        
        // Close the FileWriter
        file.close(); // Releases resources associated with the file
    }
}
```

### Explanation of Key Parts:

- **PrintWriter**: This class provides convenient methods for writing formatted text to a file. It can handle both plain text and more complex formatted output.
- **Auto-flushing**: The `true` parameter in the `PrintWriter` constructor enables auto-flushing. This means that the output buffer is automatically flushed whenever a newline character is written, ensuring that data is promptly saved to the file.
- **Writing Lines**: The `println()` method is used to write each line of text. Each call to `println()` writes the specified text followed by a newline character.
- **Resource Management**: It's important to close both the `PrintWriter` and `FileWriter` to ensure that all data is flushed to the file and system resources are released properly.

