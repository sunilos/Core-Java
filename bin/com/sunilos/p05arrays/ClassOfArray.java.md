```java
package com.sunilos.p05arrays;

/**
 * Prints the name of the array class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ClassOfArray {

    public static void main(String[] args) {
        // Initialize a character array with specific letters
        char[] myArray = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        
        // Get the class name of the array using reflection
        String name = myArray.getClass().getName();
        
        // Print the name of the char array class
        System.out.println("Name of char[] array is " + name);
    }
}
```

### Explanation:
- The program defines a character array and retrieves its class name using the `getClass()` method, which is then printed to the console. The output will show the type of the array, indicating it is a character array (`char[]`).
