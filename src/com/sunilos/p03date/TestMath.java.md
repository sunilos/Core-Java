```java
package com.sunilos.p03date;

/**
 * Test the key methods of java.lang.Math class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMath {

	public static void main(String[] args) {

		// Find the maximum of two numbers
		int maxVal = Math.max(2, 5);

		// Find the minimum of two numbers
		int minVal = Math.min(2, 5);

		// Get the absolute value of a negative number
		double absoluteVal = Math.abs(-3.7);

		// Calculate the exponential of a number (e^10)
		double expVal = Math.exp(10);

		// Generate a random number between 0.0 and 1.0
		double randomNo = Math.random();

		// Calculate the square root of a number
		double sqrtVal = Math.sqrt(4);

		// Get the smallest integer value greater than or equal to 5.4
		double ceilVal = Math.ceil(5.4);

		// Display the results of the Math functions
		System.out.println("Math functions");
		System.out.println("Max 2,5: " + maxVal);
		System.out.println("Min 2,5: " + minVal);
		System.out.println("Absolute -3.7: " + absoluteVal);
		System.out.println("Exp 10: " + expVal);
		System.out.println("Random Number: " + randomNo);
		System.out.println("Square Root: " + sqrtVal);
		System.out.println("Smallest Integer greater than 5.4: " + ceilVal);
	}
}
```

### Explanation:
- **`Math.max()`**: Returns the larger of two values.
- **`Math.min()`**: Returns the smaller of two values.
- **`Math.abs()`**: Returns the absolute value of the argument, eliminating any negative sign.
- **`Math.exp()`**: Returns Euler's number `e` raised to the power of the argument.
- **`Math.random()`**: Generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
- **`Math.sqrt()`**: Returns the square root of the argument.
- **`Math.ceil()`**: Rounds the argument up to the nearest integer.
