```java
package com.sunilos.p06oop;

/**
 * Bank Account implements Cloneable interface to be part of deep cloning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class BankAccount implements Cloneable {

	// Balance of the bank account
	public double balance = 0;

	// Default constructor
	public BankAccount() {
	}

	// Parameterized constructor to initialize the balance
	public BankAccount(double b) {
		balance = b;
	}

	/**
	 * Overrides the clone method to support cloning of BankAccount objects.
	 * 
	 * @return A new object that is a copy of the current instance.
	 * @throws CloneNotSupportedException If the cloning is not supported.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Calls the Object class's clone method
	}

	public static void main(String[] args) throws Exception {
		// Create a new BankAccount object with an initial balance of 10
		BankAccount a1 = new BankAccount(10);

		// Clone the a1 object to create a2
		BankAccount a2 = (BankAccount) a1.clone();

		// Modify the balance of the cloned account
		a2.balance = 20;

		// Print the balances of both accounts
		System.out.println(a1.balance); // Output: 10
		System.out.println(a2.balance); // Output: 20
	}
}
```

### Explanation:
- This `BankAccount` class implements the `Cloneable` interface to enable deep cloning of its objects.
- It has a balance attribute that can be initialized through constructors.
- The `clone` method is overridden to allow cloning of `BankAccount` instances.
- In the `main` method, an instance of `BankAccount` is created and cloned. The balance of the cloned instance is modified, demonstrating that the original instance remains unchanged. This showcases the concept of deep cloning.
