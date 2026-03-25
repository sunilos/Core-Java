```java
package com.sunilos.p01basics;

/**
 * The HelloName class is a simple Java program that prints a runtime argument with a greeting.
 * 
 * This program demonstrates how to access and print a command-line argument. It prints "Hello" 
 * followed by the first argument passed to the program.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloName {
    
    /**
     * The main method is the entry point of the application.
     * It prints "Hello" followed by the first runtime argument.
     *
     * @param args The runtime arguments passed to the program. The first argument is used for the greeting.
     */
    public static void main(String[] args) {

        System.out.println("Hello " + args[0]);
    }
}
```

Explanation:
- The program prints "Hello" followed by the first command-line argument.
- It demonstrates accessing and using runtime arguments in a Java program.
