```java
package com.sunilos.p01basics;

/**
 * The HelloAll class is a Java program that prints a list of runtime arguments.
 * 
 * This program demonstrates how to access and print command-line arguments passed 
 * to the program. It iterates through each argument and prints it along with its 
 * index in the format "index = Hello argument".
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloAll {

    /**
     * The main method is the entry point of the application.
     * It iterates through the command-line arguments provided to the program,
     * and prints each argument with its index in the format "index = Hello argument".
     *
     * @param args The runtime arguments passed to the program.
     */
    public static void main(String[] args) {

        // Iterate through the arguments and print each with its index
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " = Hello " + args[i]);
        }

    }
}
```

Explanation:
- The program prints each command-line argument along with its index.
- It uses a `for` loop to iterate through the `args` array and prints each argument in the format "index = Hello argument".
