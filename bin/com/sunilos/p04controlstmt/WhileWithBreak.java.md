```java
package com.sunilos.p04controlstmt;

/**
 * Break statement is used to terminate a WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WhileWithBreak {

    public static void main(String[] args) {

        // Declare local variable i and initialize it to 0
        int i = 0;
        // Declare a boolean flag initialized to true
        boolean flag = true;

        // Execute the while loop as long as flag is true
        while (flag) {
            // Break the loop if i is equal to 5
            if (i == 5) {
                break; // Exit the loop
            }
            // Print the current value of i followed by a message
            System.out.println(i + " Hello While loop");
            // Increment i by 1
            i++;
        }
    }
}
```

### Explanation:
- **`int i = 0;`**: Initializes the variable `i` to 0, which will be used as a loop counter.
- **`boolean flag = true;`**: Declares a boolean variable `flag` that controls the execution of the loop.
- **`while (flag)`**: Begins a while loop that continues as long as `flag` is true.
- **`if (i == 5) { break; }`**: Checks if `i` equals 5; if true, the loop is terminated using `break`.
- **`System.out.println(i + " Hello While loop");`**: Prints the current value of `i` along with a message to the console.
- **`i++;`**: Increments the value of `i` by 1 after each iteration, allowing the loop to eventually reach the break condition.
