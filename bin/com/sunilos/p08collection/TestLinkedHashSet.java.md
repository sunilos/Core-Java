
```java
package com.sunilos.p08collection;

/**
 * Test the LinkedHashSet class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        // Create a LinkedHashSet to store elements
        LinkedHashSet s = new LinkedHashSet();
        
        // Add elements to the LinkedHashSet
        s.add("Zero");  // Adds "Zero" to the set
        s.add("One");   // Adds "One" to the set
        s.add("Two");   // Adds "Two" to the set
        s.add("Three"); // Adds "Three" to the set
        s.add("Five");  // Adds "Five" to the set

        // Print all elements using Iterator
        System.out.println("\nElements printed by Iterator:");
        Iterator it = s.iterator(); // Get an iterator for the set
        while (it.hasNext()) {
            String str = (String) it.next(); // Retrieve the next element
            System.out.println(str); // Print the element
        }

    }
}
```

### Explanation:

1. **Imports:** Necessary classes are imported, including `Iterator` and `LinkedHashSet`.

2. **Class Declaration:** `TestLinkedHashSet` demonstrates the usage of the `LinkedHashSet`, which maintains the insertion order of elements while also ensuring that each element is unique.

3. **Main Method:**
   - **LinkedHashSet Creation:** A `LinkedHashSet` is instantiated to hold string elements.
   - **Adding Elements:** Several strings are added to the set using the `add()` method. Duplicate values will be ignored.
   - **Iterating Through Elements:** An `Iterator` is created for the `LinkedHashSet` to allow traversal through its elements.
     - The loop checks if there are more elements with `hasNext()`, retrieves each element with `next()`, and prints them.
   - **Order of Elements:** The elements are printed in the order they were added, demonstrating the insertion-order preservation feature of `LinkedHashSet`.

This class effectively showcases how to create and manipulate a `LinkedHashSet`, highlighting its key characteristics: maintaining insertion order and allowing unique elements.
