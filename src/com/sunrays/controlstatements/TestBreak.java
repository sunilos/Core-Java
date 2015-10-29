package com.sunrays.controlstatements;

public class TestBreak {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Iterate array elements
		for (int n : numbers) {

			// Check if number is even
			if (n % 2 == 0) {
				System.out.println(n);
				break;// Terminate loop
			}
		}

	}

}
