
```java
package com.sunilos.p08collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Tests collection creation, adding elements, and iterating over all elements.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCollection {

    public static void main(String[] args) {

        // Creates a collection of ArrayList type
        Collection c = new ArrayList(); // Using a Collection reference for flexibility

        // Add elements into the Collection
        c.add("Bura mat Dekho"); // Adds a string element at index #0
        c.add("Bura mat Suno");  // Adds a string element at index #1
        c.add("Bura mat Kaho");  // Adds a string element at index #2

        // Output the number of elements in the collection
        System.out.println("Length Of Collection: " + c.size());

        // Print all elements of the Collection using foreach statement
        System.out.println("\nElements of Collection ");
        for (Object ele : c) {
            System.out.println(ele); // Print each element in the collection
        }

        // Convert the collection into an array
        Object[] oArray = c.toArray(); // Converts the collection to an Object array

        System.out.println("\nElements of Converted Array");

        // Print all elements of the array using foreach statement
        for (Object ele : oArray) {
            String s = (String) ele; // Cast the Object to String for printing
            System.out.println(s); // Print each string element from the array
        }
    }
}
```

### Explanation:

1. **Imports:** The class imports `ArrayList` and `Collection` from the `java.util` package for working with collections.

2. **Class Declaration:** `TestCollection` is a public class designed to demonstrate basic operations with collections in Java.

3. **Main Method:**
   - **Collection Initialization:** An `ArrayList` is created and referenced by a `Collection` type variable (`c`), allowing for flexibility in the implementation used.
   - **Adding Elements:** Three string elements are added to the collection. The order of addition corresponds to their respective indices.
   - **Size Output:** The size of the collection is retrieved and printed, indicating how many elements it contains.
   - **Iteration and Printing:** A foreach loop is used to iterate over the collection, printing each element.
   - **Array Conversion:** The `toArray` method is called to convert the collection into an array (`oArray`).
   - **Array Printing:** Another foreach loop iterates over the newly created array, casting each element to a `String` before printing.

This class effectively demonstrates how to create a collection, add elements, and iterate through them, as well as converting the collection to an array.
