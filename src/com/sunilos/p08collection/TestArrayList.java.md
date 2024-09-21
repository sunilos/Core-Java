
```java
package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Tests the ArrayList class and demonstrates its various functionalities.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArrayList {

    public static void main(String[] args) {

        // Create an ArrayList to store elements
        ArrayList<String> l = new ArrayList<>();
        l.add("Zero"); // Index# 0
        l.add("One");  // Index# 1
        l.add("Two");  // Index# 2
        l.add("Three"); // Index# 3
        l.add("Five");  // Index# 4

        // Get the size of the ArrayList
        int size = l.size();
        System.out.println("Length of ArrayList : " + size); // Output the size

        // Insert "Four" at Index # 4, shifting "Five" to Index # 5
        l.add(4, "Four");

        // Replace "Two" with "Twoooo"
        l.set(2, "Twoooo");

        // Remove the element "Zero" at Index # 0
        l.remove(0);

        // Retrieve and print the 2nd element of the ArrayList (originally at Index # 1)
        System.out.println("\n2nd Element of ArrayList ");
        String val = l.get(1); // Index # 1 after previous removals
        System.out.println(val);

        // Print all elements of the ArrayList using a for-each loop
        System.out.println("\nElements printed by for loop");
        for (String ele : l) {
            System.out.println(ele); // Print each element
        }

        // Print all elements using an Iterator
        System.out.println("\nElements printed by Iterator");
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String str = it.next(); // Retrieve next element
            System.out.println(str); // Print the element
        }

        // Sort the list elements in natural order (alphabetical)
        Collections.sort(l);
        System.out.println("\nSorted List Elements");
        for (String ele : l) {
            System.out.println(ele); // Print sorted elements
        }

        // Convert the ArrayList to an array and print the elements
        System.out.println("\nElements of converted array[]");
        Object[] nums = l.toArray(); // Convert to array
        for (Object n : nums) {
            System.out.println(n); // Print each element of the array
        }

        // Get a sublist containing elements from index #1 to #2 (exclusive)
        System.out.println("\nElements of sublist");
        ArrayList<String> subList = new ArrayList<>(l.subList(1, 3)); // Create a sublist
        System.out.println(subList); // Print the sublist
    }
}
```

### Explanation:

1. **Imports:** The class imports necessary classes for working with `ArrayList`, `Collections`, and `Iterator`.

2. **Class Declaration:** `TestArrayList` is a public class that tests various functionalities of the `ArrayList` class.

3. **Main Method:**
   - An `ArrayList` of type `String` is created and initialized with several string elements.
   - The size of the `ArrayList` is determined and printed.
   - Elements are added, replaced, and removed to demonstrate dynamic manipulation of the list.
   - The 2nd element is retrieved and printed after some modifications.
   - All elements are printed using a for-each loop and an `Iterator`, showing different ways to traverse the list.
   - The `Collections.sort()` method sorts the elements alphabetically, demonstrating how to order the list.
   - The `toArray()` method is used to convert the `ArrayList` to an array, which is then printed.
   - A sublist is created using the `subList()` method, extracting specific elements from the original list, and the sublist is printed.

This class effectively demonstrates the versatility and ease of use of the `ArrayList` class in Java.
