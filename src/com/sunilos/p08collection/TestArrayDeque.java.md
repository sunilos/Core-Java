
```java
package com.sunilos.p08collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Tests the ArrayDeque implementation of the Deque interface.
 * Demonstrates basic operations such as adding, removing, and iterating over elements.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestArrayDeque {

    public static void main(String[] args) {

        // Creating a Deque using ArrayDeque
        Deque<String> q = new ArrayDeque<>();

        // Add elements to the deque
        q.add("One");            // Adds "One" to the end of the deque
        q.addFirst("Two");      // Adds "Two" to the front of the deque
        q.addLast("Three");     // Adds "Three" to the end of the deque

        // Examine the top element without removing it
        String ele = q.element(); // Retrieves the head of the deque

        // Remove elements from the deque
        String firstElement = q.remove(); // Removes and returns the head (first) element
        System.out.println(firstElement); // Prints "One"

        firstElement = q.removeFirst(); // Removes and returns the first element
        System.out.println(firstElement); // Prints "Two"

        String lastElement = q.removeLast(); // Removes and returns the last element
        System.out.println(lastElement); // Prints "Three"

        // Print the head element which was accessed earlier
        System.out.println(ele); // Prints "One", as it was accessed before removal

        // Access elements via an Iterator
        Iterator<String> it = q.iterator(); // Creates an iterator for the deque
        while (it.hasNext()) {
            System.out.println(it.next()); // Prints each remaining element in the deque
        }
    }
}
```

### Explanation:

1. **Imports:** The class imports necessary classes for working with `ArrayDeque`, `Deque`, and `Iterator`.

2. **Class Declaration:** `TestArrayDeque` is a public class that tests the functionality of `ArrayDeque`.

3. **Main Method:**
   - A `Deque` is instantiated using `ArrayDeque`.
   - Various elements are added using `add()`, `addFirst()`, and `addLast()`, showcasing the flexibility of adding elements at both ends of the deque.
   - The `element()` method retrieves (but does not remove) the head of the deque.
   - Elements are removed using `remove()`, `removeFirst()`, and `removeLast()`, demonstrating how to access and manipulate the contents of the deque.
   - The `Iterator` allows for traversing the remaining elements, printing them out as long as there are elements to access.

This class effectively demonstrates the basic operations of a deque, which is a double-ended queue allowing insertion and removal of elements from both ends.
