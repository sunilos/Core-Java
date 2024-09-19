```java
package com.sunilos.p01basics;

/**
 * The TestConditionalOperators class demonstrates the use of conditional operators.
 * 
 * This program evaluates conditions using logical AND and OR operators. It checks if multiple conditions 
 * are true using the AND operator and if at least one of multiple conditions is true using the OR operator.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestConditionalOperators {

    /**
     * The main method is the entry point of the application.
     * It evaluates conditional expressions using AND and OR operators and prints the results.
     *
     * @param args The runtime arguments (not used in this program).
     */
    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        if (value1 == 1 && value2 == 2) // AND Operator
        {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        if (value1 == 1 || value2 == 1) // OR Operator
        {
            System.out.println("value1 is 1 OR value2 is 1");
        }

    }
}
```

### Explanation:
- The program demonstrates the use of conditional operators such as AND (`&&`) and OR (`||`).
- It checks if both conditions are true using the AND operator and if at least one of the conditions is true using the OR operator.
- The results of these checks are printed to the console.
