```java
package com.sunilos.p06oop;

/**
 * Class BusinessMan extends Class Person
 * This class represents a businessman, which is a type of person.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Businessman extends Person {

	// Income of the businessman
	private double income = 0;

	/**
	 * Gets the income of the businessman.
	 * 
	 * @return The current income.
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * Sets the income of the businessman.
	 * 
	 * @param income The income to be set.
	 */
	public void setIncome(double income) {
		this.income = income;
	}
}
```

### Explanation:
- The `Businessman` class extends the `Person` class, indicating an inheritance relationship where a businessman is a specialized type of person.
- It has a private attribute `income` to store the income of the businessman.
- The class provides getter and setter methods for the `income` attribute, allowing access and modification of the income value.
