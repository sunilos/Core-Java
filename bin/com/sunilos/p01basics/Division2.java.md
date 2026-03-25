```java
package com.sunilos.p01basics;

/**
 * The Division2 class demonstrates runtime argument passing 
 * and performs division using a separate method called doDivision.
 * 
 * This program expects two command-line arguments. If less than
 * two arguments are provided, it prints a usage message. The 
 * division operation is handled by the doDivision method, where
 * the first argument is divided by the second, and the result 
 * is printed to the console.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Division2 {

    /**
     * The main method is the entry point of the application.
     * It checks if two arguments are provided, then passes 
     * them to the doDivision method for division. If less 
     * than two arguments are provided, a usage message is displayed.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void main(String[] args) {

        // Check if the number of arguments is less than 2
        if (args.length < 2) {
            System.out
                    .println("USAGE : java -cp <bin path> com.basic.Division1 <n1> <n2>");
            return;
        }
        doDivision(args);
    }

    /**
     * The doDivision method performs the division operation.
     * It parses the provided arguments into integers, divides 
     * the first by the second, and prints the result.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void doDivision(String[] args) {
        
        // Parse the arguments into integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Perform division
        double div = a / b;

        // Output the result of the division to the console
        System.out.println("Division is " + div);
        
    }
}
```

Explanation:
- The program checks for two command-line arguments and then passes them to the `doDivision` method for division.
- The `doDivision` method performs the division and prints the result. If two arguments are not provided, a usage message is shown.
