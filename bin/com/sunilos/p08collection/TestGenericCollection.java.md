
```java
package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Tests various generic collections in Java, showcasing their functionalities.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestGenericCollection {

    public static void main(String[] args) {

        // Create an ArrayList to store names of type String
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ram"); // Add name
        names.add("Shyam"); // Add name
        names.add("Krishn"); // Add name
        // names.add(5); // Uncommenting this line will cause a compilation error due to type mismatch

        // Retrieve and print the value at index 1
        String val = names.get(1);
        System.out.println("Index#1 value is " + val); // Output the name at index 1

        // Demonstrate usage of other collections with generic types

        // Sets: Using HashSet to store unique string elements
        Set<String> s = new HashSet<String>();
        s.add("One");
        s.add("Two");
        s.add("Three");

        // Print elements of the HashSet
        System.out.println("\nSet elements");
        Iterator<String> it = s.iterator(); // Get an iterator for the set
        while (it.hasNext()) {
            String sVal = it.next(); // Get the next value
            System.out.println("Value is " + sVal); // Print the value
        }

        // TreeSet can also be used, but not demonstrated here
        TreeSet<String> ts = new TreeSet<String();

        // Lists: Using ArrayList to store string elements
        ArrayList<String> a = new ArrayList<String>();
        a.add("One");
        a.add("Two");
        a.add("Three");

        // Print elements of the ArrayList
        System.out.println("\nList elements");
        for (String sVal : a) {
            System.out.println("Value is " + sVal); // Print each value
        }

        // Vector: A legacy collection that can store elements
        Vector<String> v = new Vector<String>();
        Enumeration<String> e = v.elements(); // Create an enumeration to iterate over the vector

        // Queues: Using LinkedList as a queue
        Queue<String> q = new LinkedList<String>();

        // Maps: Using HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("AC#1", 1000); // Add key-value pair
        map.put("AC#2", 2000); // Add key-value pair
        map.put("AC#3", 3000); // Add key-value pair

        // Retrieve and print the balance of a specific account
        int balance = map.get("AC#2");
        System.out.println("Balance of AC#2 is " + balance); // Output the balance for AC#2

        // Hashtable: Another map implementation (not used in detail here)
        Hashtable<String, Integer> mapTable = new Hashtable<String, Integer>();
    }
}
```

### Explanation:

1. **Imports:** The class imports various collection classes from the `java.util` package to demonstrate their functionalities.

2. **Class Declaration:** `TestGenericCollection` is a public class designed to test various Java generic collections.

3. **Main Method:**
   - **ArrayList:** An `ArrayList` is created to hold `String` elements. Names are added, and an attempt to add a non-string type is commented out to illustrate type safety.
   - The value at a specific index is retrieved and printed, showing that no typecasting is necessary due to generics.
   - **HashSet:** A `HashSet` is used to store unique elements. The elements are printed using an iterator.
   - **TreeSet:** Mentioned as a possible collection for sorted elements but not explicitly demonstrated.
   - **ArrayList:** Another `ArrayList` is created, and its elements are printed using a for-each loop.
   - **Vector:** A `Vector` is created, and an `Enumeration` is prepared, though not utilized further in the code.
   - **Queue:** A `LinkedList` is initialized as a queue, ready for further operations.
   - **HashMap:** A `HashMap` is created to store key-value pairs, and the balance for a specific account is retrieved and printed.
   - **Hashtable:** A `Hashtable` is declared but not used in detail in this example.

