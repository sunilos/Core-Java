```java
package com.sunilos.p05arrays;

/**
 * Test multi-dimension array basic operations
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestMultdimensionArray {

    public static void main(String[] args) {
        // Declare a 2D array of integers with 10 rows and 2 columns
        int[][] tables = new int[10][2];

        // Initialize the first column (Column #1) of the array
        tables[0][0] = 2;
        tables[1][0] = 4;
        tables[2][0] = 6;
        tables[3][0] = 8;
        tables[4][0] = 10;
        tables[5][0] = 12;
        tables[6][0] = 14;
        tables[7][0] = 16;
        tables[8][0] = 18;
        tables[9][0] = 20;

        // Initialize the second column (Column #2) of the array
        tables[0][1] = 3;
        tables[1][1] = 6;
        tables[2][1] = 9;
        tables[3][1] = 12;
        tables[4][1] = 15;
        tables[5][1] = 18;
        tables[6][1] = 21;
        tables[7][1] = 24;
        tables[8][1] = 27;
        tables[9][1] = 30;

        // Print the header for the table
        System.out.println("Tables ");
        System.out.println("#2\t#3");

        // Iterate through the rows of the 2D array
        for (int row = 0; row < tables.length; row++) {
            // Iterate through the columns of the current row
            for (int col = 0; col < tables[0].length; col++) {
                System.out.print(tables[row][col] + "\t"); // Print the current element
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Declare a 3D array of integers
        int[][][] threeD = new int[10][3][2];
        threeD[0][1][1] = 100; // Assign a value to a specific element in the 3D array

        // Declare a 4D array of integers
        int[][][][] fourD = new int[10][3][2][3];
        fourD[0][1][1][0] = 100; // Assign a value to a specific element in the 4D array
    }
}
```

### Explanation:
- The program demonstrates basic operations on multi-dimensional arrays in Java, including declaration, initialization, and element access.
- It initializes a 2D array with specific values, prints its contents in a tabular format, and shows how to declare and access elements in 3D and 4D arrays.
