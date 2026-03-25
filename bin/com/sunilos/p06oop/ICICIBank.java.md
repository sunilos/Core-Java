
```java
package com.sunilos.p06oop;

/**
 * The ICICIBank class represents ICICI Bank's specific attributes.
 * It is a child class of the Bank class, demonstrating method overriding 
 * and runtime (dynamic) polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ICICIBank extends Bank {

    /**
     * Overrides the interestRate method from the Bank class.
     * Provides ICICI Bank's specific interest rate.
     * 
     * @return the interest rate for ICICI Bank, which is 9.75.
     */
    @Override
    public double interestRate() {
        return 9.75;
    }

    /**
     * Overrides the getName method from the Bank class.
     * Returns the name of the bank as "ICICI Bank".
     * 
     * @return the name of the bank, which is "ICICI Bank".
     */
    @Override
    public String getName() {
        return "ICICI Bank";
    }
}
```

### Explanation:

- **Method Overriding:** The `ICICIBank` class overrides the `interestRate()` and `getName()` methods inherited from the `Bank` class, providing specific implementations for ICICI Bank.
- **Runtime Polymorphism:** These overridden methods will be called at runtime when objects of `ICICIBank` are used through `Bank` references, demonstrating dynamic method resolution.
