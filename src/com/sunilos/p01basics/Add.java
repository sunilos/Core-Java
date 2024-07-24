package com.sunilos.p01basics;

/* This example demonstrates taking runtime arguments,
 * then parsing them into integer type for addition.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Add {

    public static void main(String[] args) {

        // Check if the correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int sum = a + b;

            System.out.println("Sum is " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
