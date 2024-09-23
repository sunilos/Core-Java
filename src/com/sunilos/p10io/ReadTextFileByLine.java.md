
```java
package com.sunilos.p10io;

import java.io.BufferedReader; // Import BufferedReader for efficient reading of text
import java.io.FileReader; // Import FileReader for reading character files
import java.util.Scanner; // Import Scanner for reading input

/**
 * Reads data line by line from a text file using BufferedReader and Scanner class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadTextFileByLine {

    public static void main(String[] args) throws Exception {
        readByBufferedReader(); // Call method to read file using BufferedReader
        System.out.println(); // Print a newline for separation
        readByScanner(); // Call method to read file using Scanner
    }

    /**
     * Reads file line by line with help of BufferedReader object
     * 
     * @throws Exception
     */
    public static void readByBufferedReader() throws Exception {
        System.out.println("Read file by Buffered Reader"); // Indicate the method being executed

        // Open a file using FileReader
        FileReader r = new FileReader("c:/test.txt");

        // Wrap the FileReader with BufferedReader for efficient line reading
        BufferedReader br = new BufferedReader(r);

        // Read the first line from the file
        String line = br.readLine();

        // Process loop until the end of the file
        while (line != null) {
            System.out.println(line); // Print the current line
            line = br.readLine(); // Read the next line
        }

        // Close the BufferedReader
        br.close(); // Close the BufferedReader to free resources

        // Close the FileReader
        r.close(); // Close the FileReader
    }

    /**
     * Reads file line by line with help of Scanner object
     * 
     * @throws Exception
     */
    public static void readByScanner() throws Exception {
        System.out.println("Read file by Scanner"); // Indicate the method being executed

        // Open a file using FileReader
        FileReader r = new FileReader("c:/test.txt");

        // Wrap the FileReader with Scanner for line reading
        Scanner sc = new Scanner(r);

        String line = null; // Variable to hold the current line

        // Process loop as long as there are lines to read
        while (sc.hasNext()) {
            line = sc.nextLine(); // Read the next line
            System.out.println(line); // Print the current line
        }

        // Close the Scanner
        sc.close(); // Close the Scanner to free resources

        // Close the FileReader
        r.close(); // Close the FileReader
    }
}
```

### Explanation of Key Parts:

- **BufferedReader**: Used to read text from a character input stream, buffering characters for efficient reading of lines.
- **readByBufferedReader() Method**: Reads the file line by line using `BufferedReader`. It continues until there are no more lines (when `readLine()` returns `null`).
- **Scanner**: A simple text scanner that can parse primitive types and strings using regular expressions.
- **readByScanner() Method**: Reads lines from the file using `Scanner`. It continues as long as there are more lines available (`hasNext()`).
- **Resource Management**: Both methods ensure that the readers are closed after use to free system resources and prevent memory leaks.

