package com.sunilos.p04controlstmt;

import java.util.ArrayList;

/**
 * Example class for FOR EACH loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForEachLoop {
	public static void main(String[] args) {
		// Create an array
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Print all elements of an array
		for (int n : numbers) {
			System.out.println(n);
		}

		// Create a collection and print all elements
		ArrayList<String> names = new ArrayList<String>();
		names.add("One");
		names.add("Two");

		// Print all elements of collection
		for (String n : names) {
			System.out.println(n);
		}
	}
}
