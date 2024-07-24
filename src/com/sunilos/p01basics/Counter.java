package com.sunilos.p01basics;

/**
 * This is a classic example of a static method and static variable. 
 * The static method {@code nextNumber()} uses the static variable {@code count} 
 * to return the next number in the sequence.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Counter {

    /**
     * The static variable {@code count} is allocated memory once during the life of the program.
     */
    public static int count = 0;

    /**
     * Increases the static variable {@code count} by one and returns the next number.
     * 
     * @return the next number in the sequence
     */
    public static int nextNumber() {
        return ++count;
    }

    /**
     * Prints 5 numbers from the sequence.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("No # " + Counter.nextNumber());
        }
    }

    /**
     * Expected output: 
     * No # 1 
     * No # 2 
     * No # 3 
     * No # 4 
     * No # 5
     */
}
