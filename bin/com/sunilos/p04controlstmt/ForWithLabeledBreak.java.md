```java
package com.sunilos.p04controlstmt;

/**
 * Example class demonstrating the use of a labeled break statement
 * to terminate an outer loop.
 * 
 * This program iterates through a 2D array and uses a labeled break
 * to exit both inner and outer loops when an even number is found.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForWithLabeledBreak {

    public static void main(String[] args) {

        // 2D array of integers
        int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        // Define a label for the outer loop
        search:
        // Iterate through each row of the 2D array
        for (int[] row : table) {
            // Iterate through each element in the current row
            for (int n : row) {
                // Check if the number is even
                if (n % 2 == 0) {
                    // Print the even number
                    System.out.println(n);
                    // Terminate both inner and outer loops using the labeled break
                    break search;
                }
            }
        }
    }
}
```

### Explanation:
- **Labeled break**: A statement used to exit from nested loops by specifying a label.
- **`search:`**: This label is associated with the outer loop, allowing a break statement to terminate both loops.
- **`for (int[] row : table)`**: A for-each loop that iterates through each row in the 2D array `table`.
- **`for (int n : row)`**: A nested for-each loop that iterates through each element in the current row.
- **`if (n % 2 == 0)`**: Checks if the current number `n` is even.
- **`break search`**: Exits both loops when an even number is found, thanks to the labeled break.
