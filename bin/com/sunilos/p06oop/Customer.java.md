
```java
package com.sunilos.p06oop;

/**
 * This program demonstrates deep cloning in Java.
 * A Customer object contains a BankAccount object.
 * When a Customer is cloned, its BankAccount is also cloned.
 * Deep cloning ensures that all contained objects are also cloned,
 * rather than just referencing the original.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Customer implements Cloneable {

    // Name of the customer
    public String name = null;

    /**
     * Customer's bank account, which will be deep cloned.
     * This ensures that each Customer has its own instance of BankAccount.
     */
    public BankAccount account = null;

    /**
     * Customer's address. This will be shallow cloned,
     * meaning the reference to the original object will be copied,
     * not a new instance.
     */
    public CustomerAddress address = null;

    /**
     * Constructor to create a new Customer with a specified name.
     * It initializes the account with a default balance and creates a new address.
     *
     * @param n The name of the customer.
     */
    public Customer(String n) {
        name = n; // Set the customer's name
        account = new BankAccount(10); // Initialize account with a balance of 10
        address = new CustomerAddress(); // Create a new CustomerAddress object
    }

    /**
     * Method to perform deep cloning of the Customer object.
     * This method overrides the clone method from Object class.
     *
     * @return A new Customer object that is a clone of the original.
     * @throws CloneNotSupportedException If the object's class does not support cloning.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        // First, clone the Customer object itself
        Customer c = (Customer) super.clone();
        // Then, deep clone the associated BankAccount
        c.account = (BankAccount) account.clone(); // Clone the BankAccount to ensure a separate instance
        // Note: CustomerAddress is shallow cloned and retains the same reference
        return c; // Return the cloned Customer
    }

}
```

### Key Points Explained:
- **Deep Cloning**: This technique ensures that all referenced objects are also cloned, which is useful when you want to prevent changes to the cloned object affecting the original.
- **Shallow Cloning**: In this example, the `CustomerAddress` is shallow cloned, meaning the clone will refer to the same instance of `CustomerAddress` as the original. Any changes made to this address will reflect in both the original and cloned Customer.
- **Cloneable Interface**: The `Customer` class implements the `Cloneable` interface, which indicates that objects of this class can be cloned.
- **Override of `clone` Method**: The `clone()` method is overridden to handle the deep cloning of the `BankAccount`, while the `CustomerAddress` is shallow copied by default.

