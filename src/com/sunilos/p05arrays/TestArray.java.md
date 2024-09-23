```java
package com.sunilos.p05arrays;

/**
 * Test array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArray {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] table;

        // Allocate memory for 10 integers
        table = new int[10];

        // Assign values to the elements of the array
        table[0] = 2;
        table[1] = 4;
        table[2] = 6;
        table[3] = 8;
        table[4] = 10;
        table[5] = 12;
        table[6] = 14;
        table[7] = 16;
        table[8] = 18;
        table[9] = 20;

        // Access the 5th element of the array (index 4)
        int ele = table[4];
        System.out.println("5th Element of Table " + ele);

        // Get the size of the array
        int size = table.length;
        System.out.println("Size of array is " + size);

        // Get and print the class name of the array
        String name = table.getClass().getName();
        System.out.println("Class name of Array " + name);

        // Print all elements of the array
        for (int i = 0; i < size; i++) {
            System.out.println(i + " = " + table[i]);
        }
    }
}
```

### Explanation:
- The program demonstrates basic operations on an integer array, including declaration, memory allocation, value assignment, element access, size retrieval, class name retrieval, and printing all elements in the array. It specifically shows how to access and print the 5th element, the size of the array, and the class name of the array type.
