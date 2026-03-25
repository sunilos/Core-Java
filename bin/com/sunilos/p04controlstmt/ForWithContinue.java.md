```java
package com.sunilos.p04controlstmt;

/**
 * Example class demonstrating the use of continue statement in a for loop.
 * 
 * This program iterates through an array of numbers and uses the continue statement
 * to skip odd numbers, printing only the even numbers.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForWithContinue {

    public static void main(String[] args) {

        // Array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Iterate through each element in the array
        for (int n : numbers) {
            // Check if the number is odd
            // If true, skip the rest of the loop's statements
            if (n % 2 > 0) {
                continue; // Skip to the next iteration
            }
            // Print the even number
            System.out.println(n);
        }
    }
}
```

### Explanation:
- **Continue statement**: Used to skip the current iteration of the loop and move to the next one.
- **`for (int n : numbers)`**: A for-each loop that iterates through each element in the `numbers` array.
- **`if (n % 2 > 0)`**: Checks if the current number `n` is odd.
- **`continue`**: If `n` is odd, this statement skips the remaining code in the loop and continues to the next number.
- **`System.out.println(n)`**: Prints the even number if the current number is not odd.
