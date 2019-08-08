package com.sunilos.p01basics;

/**
 * This is a classic example of static method and static variable. Static method
 * nextNumber() will use count static variable and return next number from the
 * sequence.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Counter {

	/**
	 * count is static, and will be allocated memory once in the life
	 */
	public static int count = 0;

	/**
	 * Increases static variable count value by one and returns the next number.
	 * 
	 * @return
	 */
	public static int nextNumber() {
		return ++count;
	}

	/**
	 * Print 5 numbers from sequence
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("No # " + Counter.nextNumber());
		}
	}

	/**
	 * Output : 
	 * No # 1 
	 * No # 2 
	 * No # 3 
	 * No # 4 
	 * No # 5
	 */

}
