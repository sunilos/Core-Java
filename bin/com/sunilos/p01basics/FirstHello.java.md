```java
package com.sunilos.p01basics;

/**
 * The FirstHello class is a simple Java program that prints "Hello SunilOS" to the console.
 * 
 * This is a basic program that serves as an introduction to Java. It demonstrates how to 
 * print messages to the console, define and use variables, and utilize a while loop.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FirstHello {
    /**
     * The main method is the entry point of the application.
     * It prints "Hello SunilOS" to the console, uses a string variable to print a personalized message,
     * and prints "Hello SunilOS" five times using a while loop.
     *
     * @param args The runtime arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Print "Hello SunilOS" to the console
        System.out.println("Hello SunilOS");

        // Define a string variable and print a personalized message
        String name = "SunilOS";
        System.out.println("Hello " + name);

        // Print "Hello SunilOS" five times using a while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i + " Hello SunilOS");
            i++;
        }

    }
}
```

Explanation:
- The program prints "Hello SunilOS" to the console.
- It defines a string variable `name` to personalize the greeting.
- It uses a `while` loop to print "Hello SunilOS" five times, each time prefixed with the loop index.
