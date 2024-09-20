```java
package com.sunilos.p04controlstmt;

/**
 * Example class demonstrating the use of break statement in a for loop.
 * 
 * This program iterates through an array of numbers and uses the break statement
 * to terminate the loop upon finding the first even number.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForWithBreak {
    public static void main(String[] args) {

        // Array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Iterate through each element in the array
        for (int n : numbers) {
            // Check if the number is even
            if (n % 2 == 0) {
                System.out.println(n); // Print the even number
                break; // Terminate the loop after finding the first even number
            }
        }
    }
}
```

### Explanation:
- **Break statement**: Used to exit the nearest enclosing loop.
- **`for (int n : numbers)`**: A for-each loop that iterates through each element in the `numbers` array.
- **`if (n % 2 == 0)`**: Checks if the current number `n` is even.
- **`System.out.println(n)`**: Prints the first even number found in the array.
- **`break`**: Exits the loop immediately after printing the even number, preventing further iterations.
