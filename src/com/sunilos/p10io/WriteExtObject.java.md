
```java
package com.sunilos.p10io;

import java.io.DataOutputStream; // Import DataOutputStream (not used in this example)
import java.io.FileOutputStream; // Import FileOutputStream for writing binary data to files
import java.io.ObjectOutputStream; // Import ObjectOutputStream for serializing objects

/**
 * Serialize an Externalized object and write to a file
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WriteExtObject {

    public static void main(String[] args) throws Exception {
        // Create a FileOutputStream to write to a file
        FileOutputStream file = new FileOutputStream("f:/object.ser");

        // Wrap the FileOutputStream with ObjectOutputStream for serialization
        ObjectOutputStream out = new ObjectOutputStream(file);

        // Create an instance of MarksheetBeanExt
        MarksheetBeanExt m = new MarksheetBeanExt();
        
        // Set values for the object's fields
        m.setName("Raju"); // Set the student's name
        m.setMaths(90); // Set the maths score
        m.setPhysics(80); // Set the physics score
        m.setChemistry(89); // Set the chemistry score
        m.setTemp(99); // Set the temporary value

        // Calculate and display total marks and percentage
        System.out.println("Total Marks : " + m.getTotal()); // Print total marks
        System.out.println("Percentage : " + m.getPercentage()); // Print percentage

        // Serialize the MarksheetBeanExt object
        out.writeObject(m); // Write the object to the output stream

        // Close the ObjectOutputStream
        out.close(); // Close the stream to ensure data is written to the file

        System.out.println("Object is serialized and persisted."); // Confirm serialization
    }
}
```

### Explanation of Key Parts:

- **ObjectOutputStream**: Used to serialize objects to a stream. It can handle writing complex objects that implement the `Serializable` or `Externalizable` interface.
- **MarksheetBeanExt**: This is the class being serialized. It should implement the `Externalizable` interface to control its serialization.
- **Setting Object Values**: The example shows how to create an object and set its properties before serialization, allowing the object to hold meaningful data.
- **Serialization Process**: The object is written to a file using `writeObject()`, making it possible to later deserialize and retrieve the object's state.
- **Resource Management**: Properly closing the `ObjectOutputStream` ensures all data is flushed and resources are released, which is important for file handling.

