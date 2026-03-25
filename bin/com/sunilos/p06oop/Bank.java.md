```java
package com.sunilos.p06oop;

/**
 * Contains Bank attributes. It is inherited by AxisBank, ICICIBank, and HDFCBank
 * child classes. It is an example of method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Bank {

	/**
	 * Returns the default bank interest rate.
	 * This method can be overridden by child classes to provide specific interest rates.
	 */
	public double interestRate() {
		return 11.0; // Default interest rate for the bank
	}

	/**
	 * Returns the name of the bank.
	 * This method can also be overridden by child classes to provide the specific bank name.
	 * 
	 * @return The name of the bank as a string.
	 */
	public String getName() {
		return "RBI"; // Default bank name
	}

}
```

### Explanation:
- This `Bank` class provides default implementations for methods related to the bank's interest rate and name.
- It can be extended by other bank classes (e.g., `AxisBank`, `ICICIBank`, `HDFCBank`), allowing those classes to override these methods to provide their specific behaviors.
- The class illustrates the concepts of inheritance and polymorphism in object-oriented programming.
