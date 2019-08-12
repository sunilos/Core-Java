package com.sunilos.p04controlstmt;

/**
 * Example class for DO-WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DoWhileLoop {

	public static void main(String[] args) {

		// Declare local variable i
		int i = 0;

		// Execute loop till i is less than 5
		do {
			System.out.println(i + " Hello Do While");
			i++;
		} while (i < 5);
	}
}
