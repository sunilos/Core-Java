
```java
package com.sunilos.p06oop;

/**
 * The HomeLoan class calculates the interest rates of home loans 
 * and demonstrates runtime (dynamic) polymorphism using the Bank class 
 * and its child classes (AxisBank, HDFCBank, ICICIBank).
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HomeLoan {

    public static void main(String[] args) {
        // Creating an array of Bank references to hold different Bank objects.
        Bank[] banks = new Bank[3];
        banks[0] = new AxisBank();   // AxisBank object assigned to Bank reference
        banks[1] = new HDFCBank();   // HDFCBank object assigned to Bank reference
        banks[2] = new ICICIBank();  // ICICIBank object assigned to Bank reference
        
        // Call to loanEnquiry method passing the array of Bank objects
        loanEnquiry(banks);
    }

    public static void loanEnquiry(Bank[] banks) {
        // Iterating through the array of Bank references
        for (Bank b : banks) {
            // At runtime, the appropriate getName and interestRate methods 
            // of the specific bank object (AxisBank, HDFCBank, ICICIBank) will be called.
            String name = b.getName();    // Gets the name of the specific bank
            double rate = b.interestRate(); // Gets the interest rate of the specific bank
            System.out.print(name + " = " + rate); // Displays the bank name and interest rate
        }
    }
}
```

### Explanation:

- **Runtime Polymorphism:** The array `banks` contains different objects (`AxisBank`, `HDFCBank`, `ICICIBank`), but each object is accessed through the common parent type `Bank`. The method calls to `getName()` and `interestRate()` are resolved at runtime, depending on the actual object type (demonstrating dynamic polymorphism).
- **Array of Bank references:** This allows different child classes of `Bank` to be stored in the same array, enabling polymorphic behavior.
