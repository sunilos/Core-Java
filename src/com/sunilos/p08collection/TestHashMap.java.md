
```java
package com.sunilos.p08collection;

/**
 * Test the HashMap interface and its concrete class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {

        // Create a new HashMap instance
        HashMap map = new HashMap();

        // Add Elements to the map
        map.put(null, "Zero"); // Adding a null key
        map.put("0", null); // Adding a key with a null value
        map.put("00", null); // Another key with a null value
        map.put("1", "One"); // Adding a key-value pair
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        // Get the size of the map
        int size = map.size();
        System.out.println("Length : " + size); // Print the size

        // Get an element by key
        String val = (String) map.get("2"); // Retrieve value for key "2"
        System.out.println(val); // Print the value

        // Remove an element by key
        map.remove("1"); // Remove the key "1" and its associated value

        // Check if a key exists in the map
        boolean flag = map.containsKey("1");
        System.out.println(flag); // Print true if key "1" exists, otherwise false

        // Check if a specific value exists in the map
        flag = map.containsValue("Two");
        System.out.println(flag); // Print true if value "Two" exists, otherwise false

        System.out.println("\nKey Set View");
        // Get a set view of the keys and print each key
        Set keys = map.keySet();
        for (Object k : keys) {
            System.out.println(k);
        }

        System.out.println("\nValue Collection View");
        // Get a collection view of the values and print each value
        Collection values = map.values();
        for (Object v : values) {
            System.out.println(v);
        }

        System.out.println("\nKey-Value Pair View");
        // Get the key-value pairs and print them
        Set keyValue = map.entrySet();
        for (Object ele : keyValue) {
            Map.Entry pair = (Map.Entry) ele; // Cast to Map.Entry
            System.out.println(pair.getKey() + " - " + pair.getValue()); // Print key-value pairs
        }
    }
}
```

### Explanation:

1. **Imports:** The necessary classes from the `java.util` package are imported.

2. **Class Declaration:** `TestHashMap` demonstrates the usage of the `HashMap` class.

3. **Main Method:**
   - **HashMap Creation:** A new `HashMap` instance is created.
   - **Adding Elements:** Various key-value pairs are added, including keys and values that are null.
   - **Size of Map:** The size of the map is retrieved using `size()` and printed.
   - **Getting Values:** The value associated with a specific key ("2") is retrieved using `get()`.
   - **Removing Elements:** A key-value pair is removed using `remove()`.
   - **Key Existence Check:** `containsKey()` checks if a specific key exists in the map.
   - **Value Existence Check:** `containsValue()` checks if a specific value exists in the map.
   - **Key Set View:** The keys of the map are retrieved using `keySet()` and printed.
   - **Value Collection View:** The values of the map are retrieved using `values()` and printed.
   - **Key-Value Pair View:** The key-value pairs are retrieved using `entrySet()` and printed. Each entry is cast to `Map.Entry` to access keys and values.

This class effectively demonstrates the core functionalities of the `HashMap` class, including adding, retrieving, and removing elements, as well as checking for the presence of keys and values.
