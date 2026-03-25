
```java
package com.sunilos.p10io;

import java.io.BufferedReader; // Import BufferedReader for reading text from input streams
import java.io.FileWriter; // Import FileWriter for writing characters to a file
import java.io.InputStreamReader; // Import InputStreamReader for reading bytes and decoding them into characters
import java.io.PrintWriter; // Import PrintWriter for printing formatted representations of objects to a text-output stream

/**
 * Reads text from keyboard and stores it into a text file.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class KeyboardToFileCopy {

    public static void main(String[] args) throws Exception {

        // Open file for writing text
        FileWriter file = new FileWriter("f:/temp.txt");
        // Create PrintWriter to write formatted text to the file
        PrintWriter out = new PrintWriter(file);

        // Open keyboard input
        InputStreamReader kb = new InputStreamReader(System.in);

        // Create BufferedReader to read text line by line from the input stream
        BufferedReader in = new BufferedReader(kb);

        // Read the first line from the keyboard
        String line = in.readLine();

        // Loop until the user types "quit"
        while (!line.equals("quit")) {
            out.println(line); // Write the current line to the file
            line = in.readLine(); // Read the next line from the keyboard
        }

        // Close the file writer to release resources
        out.close(); // Close PrintWriter, which also closes the underlying FileWriter
        file.close(); // Close FileWriter explicitly
        kb.close(); // Close InputStreamReader to free system resources
    }
}
```

### Explanation of Key Parts:

- **FileWriter**: This class is used to write characters to a file. It creates a new file if it does not exist or overwrites the existing file.
- **PrintWriter**: This is a wrapper for the `FileWriter` that provides methods to write formatted text. It allows for convenient writing of lines and flushing of buffers.
- **InputStreamReader**: This class converts byte streams (like keyboard input) into character streams, making it easier to read text data.
- **BufferedReader**: This class reads text from a character-input stream efficiently, allowing you to read lines of text easily.
- **Reading and Writing Loop**: The program continuously reads lines from the keyboard and writes them to the file until the user types "quit".
- **Closing Streams**: It is important to close streams (like `FileWriter` and `BufferedReader`) to free system resources and ensure that all data is flushed to the file.

