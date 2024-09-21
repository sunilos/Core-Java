
```java
package com.sunilos.p08collection;

/**
 * Test the Hashtable interface and its concrete class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.*;

public class TestHashtable {

    public static void main(String[] args) {

        // Create a new Hashtable instance to store key-value pairs
        Hashtable map = new Hashtable();

        // Add Elements
        // Uncommenting the next lines would throw NullPointerException 
        // as Hashtable does not allow null keys or values
        // map.put(null, "Zero"); // null key not allowed
        // map.put("0", null);    // null value not allowed
        map.put("1", "One");    // Adding key-value pairs
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        // Get the size of the Hashtable
        int size = map.size();
        System.out.println("Length : " + size);

        // Get an element by key
        String val = (String) map.get("2");
        System.out.println(val); // Prints the value associated with key "2"

        // Remove an element by key
        map.remove("1"); // Removes the entry with key "1"

        // Check if a specific key exists
        boolean flag = map.containsKey("1");
        System.out.println(flag); // Prints false since key "1" was removed

        // Check if a specific value exists
        flag = map.containsValue("Two");
        System.out.println(flag); // Prints true since value "Two" is present

        System.out.println("\nKey Set View");
        // Get and print the collection of keys
        Set keys = map.keySet();
        for (Object k : keys) {
            System.out.println(k); // Print each key in the Hashtable
        }

        System.out.println("\nValue Collection View");
        // Get and print the collection of values
        Collection values = map.values();
        for (Object v : values) {
            System.out.println(v); // Print each value in the Hashtable
        }

        System.out.println("\nKey-Value Pair View");
        // Get the key-value pairs and print them
        Set keyValue = map.entrySet();
        for (Object ele : keyValue) {
            Map.Entry pair = (Map.Entry) ele; // Cast to Map.Entry for key-value pairs
            System.out.println(pair.getKey() + " - " + pair.getValue()); // Print key-value pairs
        }

    }
}
```

### Explanation:

1. **Imports:** Necessary classes from `java.util` are imported, including `Hashtable`, `Collection`, `Set`, etc.

2. **Class Declaration:** `TestHashtable` demonstrates the use of the `Hashtable` class.

3. **Main Method:**
   - **Hashtable Creation:** A new `Hashtable` instance is created to hold key-value pairs.
   - **Adding Elements:** Several key-value pairs are added. It’s important to note that `Hashtable` does not allow null keys or values (commented-out lines illustrate this).
   - **Getting Size:** The number of entries in the `Hashtable` is printed using the `size()` method.
   - **Retrieving Values:** The value associated with a specific key ("2") is retrieved and printed.
   - **Removing Elements:** An entry is removed using the `remove()` method.
   - **Key Existence Check:** The existence of a specific key is checked with `containsKey()`, and the result is printed.
   - **Value Existence Check:** The existence of a specific value is checked with `containsValue()`, and the result is printed.
   - **Printing Keys and Values:** 
     - The keys are printed using `keySet()`.
     - The values are printed using `values()`.
   - **Printing Key-Value Pairs:** The key-value pairs are printed using `entrySet()`, demonstrating how to access both keys and their corresponding values.

This class showcases the core functionalities of the `Hashtable` class, including adding, retrieving, and manipulating key-value pairs.
