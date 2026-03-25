
```java
package com.sunilos.p15streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Read data from a text file; the text file contains comma-separated values. 
 * Read lines are converted into Marksheet objects, and then Marksheet data is printed.
 * 
 * Text file marksheets.txt contains the following comma-separated data:
 * ---File Data ----
 * Ram,80,70,60
 * Shyam,80,80,79
 * Ajay,90,80,60
 * Vijay,70,80,60
 * Jay,85,75
 * Pappu,45,30,67
 * 
 * @author SunilOS
 */
public class TestMarksheet {

    public static void main(String[] args) throws Exception {

        // 1. Read marksheets.txt file
        // 2. Split comma-separated values
        // 3. Filter invalid input
        // 4. Create Marksheet object
        // 5. Print data

        try (Stream<String> stream = Files.lines(Paths.get("marksheets.txt"))) {
            stream.map(e -> e.split(",")) // Split each line by commas
                  .filter(e -> e.length == 4) // Filter out lines that don't have exactly 4 values
                  .map(x -> new Marksheet(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2]), Integer.parseInt(x[3]))) // Create Marksheet objects
                  .forEach(e -> { // Print the details of each Marksheet
                      System.out.print("Name: " + e.name);
                      System.out.print(" Physics: " + e.physics);
                      System.out.print(" Chemistry: " + e.chemistry);
                      System.out.println(" Maths: " + e.maths);
                  });
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace for any IO exceptions
        }
    }

}

/**
 * Contains marksheet data
 */
class Marksheet {

    public String name = null;
    public int physics = 0;
    public int chemistry = 0;
    public int maths = 0;
    public int sum = 0;
    public int percentage = 0;

    public Marksheet(String n, int p, int c, int m) {
        name = n;
        physics = p;
        chemistry = c;
        maths = m;
    }
}
```

### Explanation:
- **Marksheet Class**: This class encapsulates the details of a student's marks, including the name and scores in three subjects (Physics, Chemistry, and Maths). It has a constructor to initialize these fields.

- **Main Class (`TestMarksheet`)**:
  - **File Reading**: The program uses `Files.lines()` to read all lines from the `marksheets.txt` file as a stream of strings.
  
  - **Stream Processing**:
    - `map(e -> e.split(","))`: Each line is split into an array of strings based on commas.
    - `filter(e -> e.length == 4)`: This filters out any lines that do not contain exactly four elements (name + three scores).
    - `map(x -> new Marksheet(...))`: For each valid array of strings, a new `Marksheet` object is created, parsing the scores to integers.
    - `forEach(...)`: Finally, the details of each `Marksheet` object are printed to the console.

- **Exception Handling**: The program includes a try-with-resources statement to ensure the stream is properly closed, and any `IOException` is caught and printed.

This code demonstrates how to read data from a text file, process it using Java Streams, and create objects based on that data. It's a good example of combining file I/O with functional programming techniques in Java.
