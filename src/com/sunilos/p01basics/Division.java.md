```java
/**
 * The Division class demonstrates taking runtime arguments
 * and parsing them into integers for performing division.
 * 
 * This program expects two command-line arguments, which are parsed 
 * as integers. The first argument is divided by the second, and 
 * the result is printed to the console.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Division {

    /**
     * The main method is the entry point of the application.
     * It takes two command-line arguments, parses them into integers, 
     * performs division, and prints the result.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void main(String[] args) {

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
- The program takes two command-line arguments, converts them into integers, and performs division.
- The first integer is divided by the second, and the result is printed to the console.
