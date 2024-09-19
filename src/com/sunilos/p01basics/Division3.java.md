```java
package com.sunilos.p01basics;

/**
 * The Division3 class demonstrates runtime argument passing
 * and performs division using a separate method called getDivision.
 * 
 * This program expects two command-line arguments. It parses these
 * arguments into integers and passes them to the getDivision method.
 * The getDivision method performs the division and returns the result, 
 * which is then printed to the console.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Division3 {

    /**
     * The main method is the entry point of the application.
     * It parses two command-line arguments into integers, calls 
     * the getDivision method to perform the division, and prints
     * the result.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void main(String[] args) {

        // Parse the arguments into integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Call the getDivision method to perform division
        double div = getDivision(a, b);

        // Output the result of the division to the console
        System.out.println("Division is " + div);

    }

    /**
     * The getDivision method performs the division operation.
     * It takes two integers, divides the first by the second, 
     * and returns the result.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of the division.
     */
    public static double getDivision(int a, int b) {

        // Perform division
        double div = a / b;

        // Return the result of the division
        return div;

    }
}
```

Explanation:
- The program takes two command-line arguments, converts them to integers, and passes them to the `getDivision` method.
- The `getDivision` method performs the division and returns the result. This result is then printed to the console.
