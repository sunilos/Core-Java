
```java
package com.sunilos.p10io;

import java.io.DataInputStream; // Import DataInputStream for reading primitive data types
import java.io.FileInputStream; // Import FileInputStream for reading file data

/**
 * Reads primitive data from a binary stream.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadPrimitiveData {

    public static void main(String[] args) throws Exception {

        // Create a FileInputStream to read the binary data file
        FileInputStream file = new FileInputStream("f:/binary.dat");

        // Wrap the FileInputStream with DataInputStream for reading primitive data types
        DataInputStream in = new DataInputStream(file);

        // Read and print various primitive data types from the binary stream
        System.out.println(in.readInt()); // Read and print an integer
        System.out.println(in.readBoolean()); // Read and print a boolean
        System.out.println(in.readChar()); // Read and print a character
        System.out.println(in.readDouble()); // Read and print a double

        // Close the DataInputStream
        in.close(); // Close the DataInputStream to free resources
    }
}
```

### Explanation of Key Parts:

- **FileInputStream**: Used to read raw bytes from the specified binary file, "f:/binary.dat".
- **DataInputStream**: This class allows reading Java primitive data types (like `int`, `boolean`, `char`, `double`) from an input stream in a machine-independent way.
- **Reading Data**: The program reads various primitive types sequentially from the binary stream and prints their values.
- **Resource Management**: Closing the `DataInputStream` is essential to free resources and ensure that all data is properly read from the file.

