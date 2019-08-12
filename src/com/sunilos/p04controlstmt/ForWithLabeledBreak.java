package com.sunilos.p04controlstmt;

/**
 * labeled break statement to terminate an outer loop.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForWithLabeledBreak {

	public static void main(String[] args) {

		int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Define Label
		search:
		// Iterate rows
		for (int[] row : table) {
			for (int n : row) {
				// Check if number is even
				if (n % 2 == 0) {
					System.out.println(n);
					// Terminate loop from label
					break search;
				}
			}
		}

	}

}
