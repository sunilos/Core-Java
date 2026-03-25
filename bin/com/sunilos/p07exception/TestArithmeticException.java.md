
```java
package com.sunilos.p07exception;

/**
 * Tests Arithmetic Exception by attempting to divide a number by ZERO.
 * This will trigger an ArithmeticException when executed.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArithmeticException {

    public static void main(String[] args) {

        int k = 0; // Denominator set to zero
        int i = 15; // Numerator

        System.out.println("Before Exception: I will be executed");

        /**
         * Attempting to divide by ZERO will raise an ArithmeticException.
         * This occurs because division by zero is undefined in mathematics.
         */
        double div = i / k; // This line will throw an exception

        /**
         * The following statements will not be executed because the exception 
         * raised by the previous division operation is unhandled and 
         * handed over to the JVM.
         */
        System.out.println("After Exception: I will NOT be executed");
        System.out.println("Div is " + div); // This line will not execute

    }
}
```

### Explanation:

- **Purpose:** The `TestArithmeticException` class is designed to demonstrate the behavior of the program when an `ArithmeticException` occurs due to division by zero.

- **Variable Initialization:** 
  - `k` is initialized to `0`, which is the denominator in the division operation.
  - `i` is initialized to `15`, which is the numerator.

- **Execution Flow:**
  - The program prints a message indicating that it will execute normally.
  - The next line attempts to perform the division `i / k`. Since `k` is `0`, this operation triggers an `ArithmeticException`.
  
- **Exception Handling:**
  - When the exception occurs, control is transferred to the JVM, which will terminate the program unless the exception is caught and handled. Consequently, the lines following the division operation will not be executed.
  
- **Output:**
  - The first print statement executes successfully, but the subsequent lines are never reached due to the exception being thrown.
