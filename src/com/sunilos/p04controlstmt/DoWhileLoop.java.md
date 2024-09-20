```java
package com.sunilos.p04controlstmt;

/**
 * Example class for DO-WHILE loop
 * 
 * This program demonstrates the use of a do-while loop, which ensures that the loop body
 * is executed at least once, even if the condition is false initially.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DoWhileLoop {

    public static void main(String[] args) {

        // Declare local variable i and initialize it to 0
        int i = 0;

        // Execute the loop until i is less than 5
        do {
            // Print the current value of i followed by the message
            System.out.println(i + " Hello Do While");
            // Increment i by 1
            i++;
        } while (i < 5); // The loop continues as long as i is less than 5
    }
}
```

### Explanation:
- **`do` block**: The code inside this block will execute at least once before checking the condition.
- **`while (i < 5)`**: This condition is checked after each iteration. If true, the loop continues; if false, the loop ends.
- **Output**: The program prints the values of `i` from 0 to 4, each followed by the message "Hello Do While".
