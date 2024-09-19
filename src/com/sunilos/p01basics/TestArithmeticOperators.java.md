```java
package com.sunilos.p01basics;

/**
 * The TestArithmeticOperators class demonstrates the use of various arithmetic and unary operators.
 * 
 * This program performs and prints the results of basic arithmetic operations (addition, subtraction, 
 * multiplication, division, and modulo) and unary operations (increment and decrement).
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArithmeticOperators {

    /**
     * The main method is the entry point of the application.
     * It performs arithmetic operations between two integers and displays the results.
     * It also demonstrates the use of unary operators for incrementing and decrementing values.
     *
     * @param args The runtime arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 17;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int val = a + b; // Addition
        System.out.println("a + b =" + val);

        val = a - b; // Subtraction
        System.out.println("a - b =" + val);

        val = a * b; // Multiplication
        System.out.println("a * b =" + val);

        val = a / b; // Division
        System.out.println("a / b =" + val);

        val = a % b; // Modulo
        System.out.println("a % b =" + val);

        // Unary Operators

        val = ++a; // Increment by 1
        System.out.println("++a =" + val);

        val = b--; // Decrement by 1
        System.out.println("b-- =" + val);

    }

}
```

### Explanation:
- The program demonstrates basic arithmetic operations including addition, subtraction, multiplication, division, and modulo.
- It also shows the use of unary operators for incrementing and decrementing values.
- The results of these operations are printed to the console.
