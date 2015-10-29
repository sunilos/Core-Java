package com.sunrays.controlstatements;

/**
 * Example class for DO-WHILE loop
 * 
 * @author  SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
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
