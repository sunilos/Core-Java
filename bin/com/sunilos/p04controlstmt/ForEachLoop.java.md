```java
package com.sunilos.p04controlstmt;

import java.util.ArrayList;

/**
 * Example class for FOR EACH loop
 * 
 * This program demonstrates the use of the for-each loop, which simplifies iteration
 * over arrays and collections.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ForEachLoop {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Use a for-each loop to print all elements of the array
        for (int n : numbers) {
            System.out.println(n); // Print the current number
        }

        // Create an ArrayList to hold String elements
        ArrayList<String> names = new ArrayList<String>();
        names.add("One"); // Add "One" to the list
        names.add("Two"); // Add "Two" to the list

        // Use a for-each loop to print all elements of the ArrayList
        for (String n : names) {
            System.out.println(n); // Print the current name
        }
    }
}
```

### Explanation:
- **For-each loop**: A concise way to iterate through each element in an array or collection without needing an index.
- **`int[] numbers`**: An array containing integers from 1 to 10.
- **`ArrayList<String> names`**: A dynamic array that holds string elements. Elements can be added without specifying a fixed size.
- **Output**: The program prints all integers in the `numbers` array followed by the names in the `names` list.
