package com.sunrays.controlstatements;

/**
 * Class find a row in a table that contains all even numbers
 */

public class TestContinueLabel {

	public static void main(String[] args) {

		int[][] table = { { 1, 2 }, { 4, 6 }, { 3, 5 }};

		// Define Label
		search:
		// Iterate rows
		outerFor: for (int[] row : table) {
			// Iterate row values
			for (int n : row) {
				// Check if number is odd 
				// then go to next row
				if (n % 2 == 1) {
					continue outerFor;
				}
			}
			// Print row that has all even number
			System.out.println(row[0] + "," + row[1]);

		}

	}
}
