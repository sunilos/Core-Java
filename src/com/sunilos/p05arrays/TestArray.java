package com.sunilos.p05arrays;

/**
 * Test array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArray {

	public static void main(String[] args) {

		// Declares an array of integers
		int[] table;

		// Allocates memory for 10 integers
		table = new int[10];

		// Access element and assign a value;
		table[0] = 2;
		table[1] = 4;
		table[2] = 6;
		table[3] = 8;
		table[4] = 10;
		table[5] = 12;
		table[6] = 14;
		table[7] = 16;
		table[8] = 18;
		table[9] = 20;

		int ele = table[4];// Access 5th element of table
		System.out.println("5th Element of Table " + ele);

		// Get the size of an array
		int size = table.length;
		System.out.println("Size of array is " + size);

		// Class Name of Array
		String name = table.getClass().getName();
		System.out.println("Class name of Array " + name);

		// Print all elements of an array
		for (int i = 0; i < size; i++) {
			System.out.println(i + " = " + table[i]);
		}
	}
}
