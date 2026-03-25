
```java
package com.sunilos.p09generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that demonstrates the use of wildcards in generics with examples.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WildcardsTest {

    /**
     * Displays elements of a list that extends the Number class.
     * 
     * @param list a List of elements that are subclasses of Number
     */
    public static void display(List<? extends Number> list) {
        // Iterate through each element in the list and print it
        for (Number e : list) {
            System.out.println(e);
        }
    }

    /**
     * Sums the values of a list that extends the Number class.
     * 
     * @param list a List of elements that are subclasses of Number
     * @return the total sum of the values in the list
     */
    public static double sum(List<? extends Number> list) {
        double total = 0; // Initialize total to zero
        // Iterate through each element in the list, summing their double values
        for (Number e : list) {
            total += e.doubleValue();
        }
        return total; // Return the computed total
    }

    public static void main(String[] args) {
        // Create a list of Integer values
        List<Integer> l = new ArrayList<Integer>();
        l.add(10); // Add an Integer value to the list
        l.add(20); // Add another Integer value to the list
        
        // Call display method to print elements in the list
        display(l);
        
        // Call sum method to compute and print the total of the list
        System.out.println(sum(l)); // Output: 30.0
    }
}
```

### Explanation:

1. **Imports:** The class imports `ArrayList` and `List` from the `java.util` package to use these collection classes.

2. **Class Declaration:** The `WildcardsTest` class contains examples demonstrating the use of wildcards in generics, specifically focusing on upper bounds.

3. **Methods:**
   - **`display(List<? extends Number> list)`**: This method takes a list of any type that extends `Number`. It iterates through the list and prints each element. The wildcard `? extends Number` allows the method to accept lists of different numeric types (e.g., `Integer`, `Double`).
   - **`sum(List<? extends Number> list)`**: Similar to `display`, this method also takes a list of numeric types. It initializes a `total` variable to zero and sums up the double values of the elements in the list using the `doubleValue()` method, returning the total.

4. **Main Method:**
   - A `List<Integer>` is created and populated with integer values (10 and 20).
   - The `display` method is called to print the elements of the list.
   - The `sum` method is called to calculate and print the total of the list elements, resulting in `30.0`.

### Key Points:
- **Wildcards in Generics:** The use of `? extends Number` allows for greater flexibility by enabling methods to accept any subclass of `Number`, making the code reusable for different numeric types.
- **Type Safety:** Wildcards ensure that only compatible types (subclasses of `Number`) can be passed to the methods, enhancing type safety at compile time.
- **Polymorphism with Generics:** This example showcases polymorphic behavior in generics, where the same method can operate on different data types, as long as they conform to the defined constraints.
