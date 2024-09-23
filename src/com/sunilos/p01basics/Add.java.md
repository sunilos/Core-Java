```java
/**
 * The Add class demonstrates the usage of runtime arguments for
 * performing addition of two integers.
 * 
 * This program expects two command-line arguments, which are parsed 
 * as integers and then added. The sum is printed to the console.
 * 
 * If the user does not provide exactly two arguments, or if the inputs 
 * are not valid integers, appropriate error messages are displayed.
 * 
 * @author Sunil Sahu
 * @version 1.1
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Add {

    /**
     * The main method is the entry point of the application.
     * It takes command-line arguments, parses them into integers, 
     * and performs their addition.
     *
     * @param args The runtime arguments, expected to be two integers.
     */
    public static void main(String[] args) {

        // Check if the correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }

        try {
            // Parse the arguments into integers
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            // Calculate the sum of the two integers
            int sum = a + b;

            // Output the sum to the console
            System.out.println("Sum is " + sum);
        } catch (NumberFormatException e) {
            // Handle invalid input if the arguments are not integers
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
```

Explanation:
- This program demonstrates the addition of two integers provided as command-line arguments.
- The `main` method checks if exactly two arguments are provided, then parses them as integers.
- It handles the case where invalid (non-integer) inputs are given by catching the `NumberFormatException`.
- The sum of the integers is printed if valid inputs are given.
