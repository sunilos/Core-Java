```java
package com.sunilos.p04controlstmt;

/**
 * Example class for FOR loop
 * 
 * This program demonstrates the use of a for loop to execute a block of code
 * multiple times, specifically printing a message a set number of times.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForLoop {

    public static void main(String[] args) {
        // Loop to print "Hello For Loop" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Hello For Loop"); // Print the current iteration number and message
        }
    }
}
```

### Explanation:
- **For loop**: A control flow statement that allows code to be executed repeatedly based on a condition.
- **`int i = 0`**: Initializes a loop counter `i` starting at 0.
- **`i < 5`**: The loop continues as long as `i` is less than 5.
- **`i++`**: Increments the value of `i` by 1 after each iteration.
- **Output**: The program prints "Hello For Loop" along with the current iteration index (0 to 4).
