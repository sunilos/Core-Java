```java
package com.sunilos.p04controlstmt;

/**
 * Example class demonstrating the use of a labeled continue statement
 * to continue the outer loop.
 * 
 * This program iterates through a 2D array and uses a labeled continue
 * to skip rows that contain any odd numbers, printing only rows with
 * all even numbers.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForWithLabeledContinue {

    public static void main(String[] args) {

        // 2D array of integers
        int[][] table = { { 1, 2 }, { 4, 6 }, { 3, 5 } };

        // Iterate through each row in the 2D array
        outerFor: for (int[] row : table) {
            // Iterate through each element in the current row
            for (int n : row) {
                // Check if the number is odd
                // If odd, skip the rest of the current row and continue to the next row
                if (n % 2 == 1) {
                    continue outerFor;
                }
            }
            // Print the row if all numbers are even
            System.out.println(row[0] + "," + row[1]);
        }
    }
}
```

### Explanation:
- **Labeled continue**: A statement used to skip the remaining statements in the current iteration of a loop and continue with the next iteration of the outer loop.
- **`outerFor:`**: This label is associated with the outer loop, allowing a continue statement to skip to the next iteration of this loop.
- **`for (int[] row : table)`**: A for-each loop that iterates through each row in the 2D array `table`.
- **`for (int n : row)`**: A nested for-each loop that iterates through each element in the current row.
- **`if (n % 2 == 1)`**: Checks if the current number `n` is odd.
- **`continue outerFor`**: Skips the rest of the current row and continues with the next iteration of the outer loop if any odd number is found.
- **`System.out.println(row[0] + "," + row[1])`**: Prints the elements of the row if all numbers are even.
