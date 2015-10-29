package com.sunrays.controlstatements;

public class TestContinue {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Iterate array elements
		for (int n : numbers) {
			// Check if number is odd then skip rest statements 
			if (n % 2 > 0) {
				continue;
			}
			System.out.println(n);
		}
	}
}
