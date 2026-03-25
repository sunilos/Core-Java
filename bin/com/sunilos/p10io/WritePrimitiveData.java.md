
```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // Import DataOutputStream for writing primitive data types
import java.io.FileOutputStream; // Import FileOutputStream for writing to files

/**
 * Writes Primitive Data to a binary stream
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WritePrimitiveData {

    public static void main(String[] args) throws Exception {
        // Create a FileOutputStream to write binary data to a specified file
        FileOutputStream file = new FileOutputStream("f:/binary.dat");
        
        // Wrap FileOutputStream with DataOutputStream for writing primitive data types
        DataOutputStream out = new DataOutputStream(file);

        // Write an integer to the output stream
        out.writeInt(1); // Writes the integer value 1

        // Write a boolean to the output stream
        out.writeBoolean(true); // Writes the boolean value true

        // Write a character to the output stream
        out.writeChar('A'); // Writes the character 'A'

        // Write a double to the output stream
        out.writeDouble(1.2); // Writes the double value 1.2

        // Close the DataOutputStream
        out.close(); // Ensures all data is flushed to the file and resources are released

        // Confirmation message
        System.out.println("Primitive Data successfully written"); // Indicates successful operation
    }
}
```

### Explanation of Key Parts:

- **DataOutputStream**: This class allows for writing Java primitive data types (like `int`, `boolean`, `char`, `double`) to an output stream in a portable way. It helps maintain the binary format of the data.
- **Primitive Data Writing**: The code demonstrates how to write various primitive data types to a binary file. Each method corresponds to a specific data type:
  - `writeInt(int v)`: Writes an integer.
  - `writeBoolean(boolean v)`: Writes a boolean.
  - `writeChar(char v)`: Writes a character.
  - `writeDouble(double v)`: Writes a double.
- **Resource Management**: Closing the `DataOutputStream` is essential for ensuring that all data is properly written to the file and that system resources are freed.
- **Confirmation Message**: A simple print statement confirms that the data writing operation was successful.

