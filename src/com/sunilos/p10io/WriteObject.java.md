
```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // Import DataOutputStream (not used in this example)
import java.io.FileOutputStream; // Import FileOutputStream for writing binary data to files
import java.io.ObjectOutputStream; // Import ObjectOutputStream for serializing objects

/**
 * Serialize an object and write to a file
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteObject {

    public static void main(String[] args) throws Exception {
        // Create a FileOutputStream to write to a file
        FileOutputStream file = new FileOutputStream("f:/object.ser");

        // Wrap the FileOutputStream with ObjectOutputStream for serialization
        ObjectOutputStream out = new ObjectOutputStream(file);

        // Create an instance of MarksheetBean
        MarksheetBean m = new MarksheetBean();
        
        // Set values for the object's fields
        m.setName("Raju"); // Set the student's name
        m.setMaths(90); // Set the maths score
        m.setPhysics(80); // Set the physics score
        m.setChemistry(89); // Set the chemistry score
        m.setTemp(99); // Set the temporary value

        // Calculate and display total marks and percentage
        System.out.println("Total Marks : " + m.getTotal()); // Print total marks
        System.out.println("Percentage : " + m.getPercentage()); // Print percentage

        // Serialize the MarksheetBean object
        out.writeObject(m); // Write the object to the output stream

        // Close the ObjectOutputStream
        out.close(); // Close the stream to ensure data is written to the file

        System.out.println("Object is serialized and persisted."); // Confirm serialization
    }
}
```

### Explanation of Key Parts:

- **ObjectOutputStream**: Used to serialize objects into a stream. This class handles converting objects into a byte stream, which can then be saved to a file.
- **MarksheetBean**: This is the object being serialized. It should implement the `Serializable` interface, allowing it to be converted to a stream of bytes.
- **Setting Object Values**: The code demonstrates how to create an object and set its properties, allowing for meaningful data to be serialized.
- **Serialization Process**: The object is written to a file using the `writeObject()` method. This step converts the object's state into a byte stream that can be saved to a file.
- **Resource Management**: Properly closing the `ObjectOutputStream` is essential to ensure that all data is flushed to the file and that system resources are released appropriately.

