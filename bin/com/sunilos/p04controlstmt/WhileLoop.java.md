```java
package com.sunilos.p04controlstmt;

/**
 * Example class for WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WhileLoop {

    public static void main(String[] args) {

        // Declare local variable i and initialize it to 0
        int i = 0;

        // Execute the loop while i is less than 5
        while (i < 5) {
            // Print the current value of i followed by a message
            System.out.println(i + " Hello While loop");
            // Increment i by 1 to avoid an infinite loop
            i++;
        }
    }
}
```

### Explanation:
- **`int i = 0;`**: Initializes the variable `i` to 0, which will be used as a loop counter.
- **`while (i < 5)`**: Begins a while loop that will continue as long as `i` is less than 5.
- **`System.out.println(i + " Hello While loop");`**: Prints the current value of `i` along with a message to the console.
- **`i++;`**: Increments the value of `i` by 1 after each iteration, ensuring that the loop eventually terminates when `i` reaches 5.
