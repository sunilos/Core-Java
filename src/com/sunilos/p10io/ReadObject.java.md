
```java
package com.sunilos.p10io;

import java.io.FileInputStream; // Import FileInputStream for reading file data
import java.io.ObjectInputStream; // Import ObjectInputStream for reading serialized objects

/**
 * Deserialize an object from a File.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadObject {

    public static void main(String[] args) throws Exception {

        // Create a FileInputStream to read the serialized object file
        FileInputStream file = new FileInputStream("f:/object.ser");

        // Wrap the FileInputStream with ObjectInputStream to read objects
        ObjectInputStream in = new ObjectInputStream(file);

        // Read the serialized object and cast it to MarksheetBean
        MarksheetBean m = (MarksheetBean) in.readObject();

        // Print the object's data
        System.out.println("Name : " + m.getName()); // Print the name of the student
        System.out.println("Physics : " + m.getPhysics()); // Print marks in Physics
        System.out.println("Chemistry : " + m.getChemistry()); // Print marks in Chemistry
        System.out.println("Maths :" + m.getMaths()); // Print marks in Mathematics
        System.out.println("Percentage : " + m.getPercentage()); // Print calculated percentage
        System.out.println("Temp Value: " + m.getTemp()); // Print the temporary variable value

        // Close the ObjectInputStream and FileInputStream
        in.close(); // Close the ObjectInputStream
        file.close(); // Close the FileInputStream
    }
}
```

### Explanation of Key Parts:

- **FileInputStream**: Used to read bytes from the specified file, in this case, the serialized object stored in "f:/object.ser".
- **ObjectInputStream**: This class allows reading of objects that were serialized previously, enabling reconstruction of the `MarksheetBean` object.
- **Deserialization**: The `readObject()` method retrieves the serialized object from the input stream, which is then cast to `MarksheetBean`.
- **Data Output**: The fields of the retrieved object are printed, displaying the student's name, subject marks, percentage, and the temporary variable.
- **Resource Management**: Closing the streams is essential for freeing resources and ensuring all data is read from the file properly.

