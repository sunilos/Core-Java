
```java
package com.sunilos.p06oop;

/**
 * The HDFCBank class represents the attributes of HDFC Bank.
 * It is a child class of the Bank class, demonstrating method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HDFCBank extends Bank {

    /**
     * Overrides the interestRate method from the Bank class.
     * Provides a specific implementation for HDFC Bank's interest rate.
     * 
     * @return the interest rate for HDFC Bank, which is 10.10.
     */
    @Override
    public double interestRate() {
        return 10.10;
    }

    /**
     * Overrides the getName method from the Bank class.
     * Provides the name of the bank as "HDFC Bank".
     * 
     * @return the name of the bank, which is "HDFC Bank".
     */
    @Override
    public String getName() {
        return "HDFC Bank";
    }
}
```

### Explanation:

- **Inheritance and Overriding:** The `HDFCBank` class inherits from the `Bank` class, and it overrides two methods: `interestRate()` and `getName()`. This is an example of **method overriding** in object-oriented programming.
- **Polymorphism:** Since the `HDFCBank` class overrides the methods of the `Bank` class, this demonstrates **runtime polymorphism**, where the method to be executed is determined at runtime based on the object type.
