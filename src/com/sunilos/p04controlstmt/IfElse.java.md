```java
package com.sunilos.p04controlstmt;

/**
 * A simple example in JAVA that will print a message based on the price.
 * This program demonstrates the use of an if-else statement.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class IfElse {

    public static void main(String[] args) {
        // Initialize the price variable
        int price = 100;

        // Check if the price is greater than 100
        if (price > 100) {
            // If true, print this message
            System.out.println("Wow !! I can buy Pizza");
        } else {
            // If false, print this message
            System.out.println("Oh !! I can not buy Pizza");
        }
    }
}
```

### Explanation:
- **`int price = 100;`**: Declares and initializes a variable `price` with a value of 100.
- **`if (price > 100)`**: An if statement that checks if the value of `price` is greater than 100.
- **`System.out.println("Wow !! I can buy Pizza");`**: Executes if the condition in the if statement is true, printing a message indicating the ability to buy pizza.
- **`else`**: Defines an alternative action if the condition in the if statement is false.
- **`System.out.println("Oh !! I can not buy Pizza");`**: Executes if the condition in the if statement is false, printing a message indicating the inability to buy pizza.
