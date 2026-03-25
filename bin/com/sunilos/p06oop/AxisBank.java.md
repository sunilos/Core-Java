```java
package com.sunilos.p06oop;

/**
 * Contains AxisBank attributes. It is a child class of Bank. It is an example of
 * method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class AxisBank extends Bank {

	/**
	 * Returns Axis Bank interest rate.
	 * This method overrides the interestRate method in the parent class (Bank).
	 */
	@Override
	public double interestRate() {
		return 11.25; // Returns the interest rate for Axis Bank
	}

	/**
	 * Returns the name of the Bank.
	 * This method overrides the getName method in the parent class (Bank).
	 * 
	 * @return The name of the bank as a string.
	 */
	@Override
	public String getName() {
		return "Axis Bank"; // Returns the name of the bank
	}
}
```

### Explanation:
- This class, `AxisBank`, extends the `Bank` class, demonstrating inheritance.
- It overrides the `interestRate` method to provide the specific interest rate for Axis Bank.
- It also overrides the `getName` method to return the name of the bank.
- This implementation showcases method overriding and runtime polymorphism, allowing different behaviors based on the object type.
