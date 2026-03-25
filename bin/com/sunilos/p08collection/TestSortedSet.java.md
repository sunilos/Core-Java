
```java
package com.sunilos.p08collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Test the SortedSet interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestSortedSet {

    public static void main(String[] args) {

        // Create a TreeSet, which is a concrete implementation of the SortedSet interface
        SortedSet s = new TreeSet();
        // Add elements to the TreeSet
        s.add("One");
        s.add("Two");
        s.add("Three");

        // Elements are automatically sorted in ascending order when added
        for (Object ele : s) {
            System.out.print(ele); // Print each element in the sorted set
        }

        System.out.println(); // Print a new line for better output formatting

        // Get and print the first element in the sorted set (expected: "One")
        System.out.println(s.first());

        // Get and print the last element in the sorted set (expected: "Three")
        System.out.println(s.last());

        /**
         * Output
         * 
         * OneTwoThree
         * One
         * Three
         */
    }
}
```

### Explanation:

1. **Imports:** The necessary classes `SortedSet` and `TreeSet` are imported. `TreeSet` is a specific implementation of the `SortedSet` interface.

2. **Class Declaration:** The `TestSortedSet` class demonstrates the usage of the `SortedSet` interface.

3. **Main Method:**
   - **SortedSet Initialization:** A `TreeSet` instance is created, which automatically sorts its elements in natural (ascending) order.
   - **Adding Elements:** The strings "One," "Two," and "Three" are added to the `TreeSet`. The `TreeSet` ensures that the elements are stored in a sorted manner.
   - **Printing Elements:** A for-each loop iterates through the `SortedSet`, printing each element. Due to the natural ordering, the elements are printed as "OneTwoThree."
   - **Retrieving First Element:** The `first()` method retrieves the lowest element in the set, which will be "One."
   - **Retrieving Last Element:** The `last()` method retrieves the highest element in the set, which will be "Three."

4. **Output Comment:** A comment outlines the expected output of the program, indicating that elements are printed in sorted order. 

This class effectively illustrates the basic functionality of the `SortedSet` interface, highlighting how elements are maintained in a sorted order and how to access the first and last elements in the set.
