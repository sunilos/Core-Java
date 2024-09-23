
```java
package com.sunilos.p08collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Test the TreeMap class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestTreeMap {

    public static void main(String[] args) {

        // Create a TreeMap instance
        TreeMap map = new TreeMap();

        // Add key-value pairs to the map
        map.put(1, "One");   // Key 1 maps to "One"
        map.put(3, "Three"); // Key 3 maps to "Three"
        map.put(2, "Two");   // Key 2 maps to "Two"
        map.put(4, "Four");  // Key 4 maps to "Four"
        map.put(5, "Five");  // Key 5 maps to "Five"

        // Retrieve a value by key and print it
        String val = (String) map.get(1); // Gets the value for key 1
        System.out.println(val); // Prints "One"

        // Remove an entry with key 4
        map.remove(4); // Removes the entry for key 4

        // Collection Views

        // Get a Set of keys and print them
        Set keys = map.keySet(); // Retrieve the set of keys
        for (Object k : keys) {
            System.out.println(k); // Print each key
        }

        // Using an Iterator to print keys
        System.out.println("Iterator");
        Iterator it = keys.iterator(); // Create an iterator for the keys
        while (it.hasNext()) {
            System.out.println(it.next()); // Print each key using the iterator
        }

        // Get a Collection of values and print them (note: should be map.values())
        Collection vals = map.values(); // Retrieve the collection of values
        for (Object v : vals) {
            System.out.println(v); // Print each value
        }

        // Print all key-value pairs in the map
        for (Object k : map.keySet()) {
            System.out.println(k + " = " + map.get(k)); // Print key and corresponding value
        }

        // Create a synchronized version of the TreeMap for thread-safe operations
        SortedMap m = Collections.synchronizedSortedMap(map);
    }
}
```

### Explanation:

1. **Imports:** The necessary classes are imported to use `TreeMap`, collections, and utilities from the `java.util` package.

2. **Class Declaration:** The `TestTreeMap` class is created to demonstrate the functionality of the `TreeMap` class.

3. **Main Method:**
   - **TreeMap Initialization:** A `TreeMap` instance named `map` is created to store key-value pairs. `TreeMap` sorts the entries based on the natural ordering of the keys.
   - **Adding Elements:** 
     - Several key-value pairs are added to the map using the `put()` method. The keys are integers, and the values are strings.
   - **Retrieving a Value:**
     - The `get()` method retrieves the value associated with the key `1`, which is then printed.
   - **Removing an Element:**
     - The `remove()` method is called with key `4`, which deletes the corresponding entry from the map.
   - **Collection Views:**
     - The `keySet()` method retrieves a set of keys, which is printed using a for-each loop and an iterator.
     - The `values()` method retrieves a collection of values, which is printed in a similar manner.
   - **Printing Key-Value Pairs:**
     - A loop iterates through the keys, retrieving and printing each key along with its corresponding value using `get()`.
   - **Synchronized SortedMap:**
     - The `Collections.synchronizedSortedMap()` method creates a synchronized version of the `TreeMap`, allowing for safe concurrent access.

### Key Points:
- **Sorted Order:** `TreeMap` maintains the keys in sorted order based on their natural ordering.
- **Key-Value Operations:** The operations performed demonstrate how to add, retrieve, remove, and iterate over elements in a `TreeMap`.
- **Synchronization:** The synchronized map ensures that multiple threads can access it safely. 

This class effectively showcases the basic features and operations of the `TreeMap` class in Java.
