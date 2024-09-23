```java
package com.sunilos.p05arrays;

/**
 * Copy array elements using java.lang.System
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class CopyAnArray {

    public static void main(String[] args) {
        // Initialize the source array with specific characters
        char[] copyFrom = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        
        // Create a target array to hold copied elements
        char[] copyTo = new char[4];

        /**
         * Parameters of System.arraycopy() method are:
         * Source Array: The array to copy elements from (copyFrom)
         * Start Index of Source Array: The index in the source array to start copying from (3)
         * Target Array: The array to copy elements to (copyTo)
         * Start Index of Target Array: The index in the target array to start copying to (0)
         * Number of Elements to be Copied: The number of elements to copy (4)
         */

        // Copy 4 elements from index 3 of copyFrom to copyTo starting from index 0
        System.arraycopy(copyFrom, 3, copyTo, 0, 4);

        // Print the copied elements as a string
        System.out.println(new String(copyTo));
    }
}
```

### Explanation:
- The program initializes a source character array and a target character array. It uses `System.arraycopy()` to copy a specific range of elements from the source array to the target array, and then prints the copied elements as a string. The copied elements in this case will be "RAYS".
