
```java
package com.sunilos.p10io;

import java.io.Externalizable; // Import Externalizable interface for custom serialization
import java.io.IOException; // Import IOException for handling input/output exceptions
import java.io.ObjectInput; // Import ObjectInput for reading serialized objects
import java.io.ObjectOutput; // Import ObjectOutput for writing serialized objects

/**
 * An example of Externalizable interface that serializes a transient variable.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MarksheetBeanExt implements Externalizable {

    // Instance variables for storing student's marks and name
    String name = null; // Name of the student
    int maths = 0; // Marks in Mathematics
    int physics = 0; // Marks in Physics
    int chemistry = 0; // Marks in Chemistry

    // Transient variables that will be serialized in this implementation
    /**
     * total is a calculated transient field,
     */
    transient int total = 0; // Total marks (not serialized by default)

    /**
     * Percentage is a calculated transient field
     */
    transient double percentage = 0; // Percentage (not serialized by default)

    /**
     * Transient temporary variable
     */
    transient int temp = 0; // Temporary variable (not serialized by default)

    // Getter and setter methods for instance variables
    public String getName() {
        return name; // Return the name of the student
    }

    public void setName(String name) {
        this.name = name; // Set the name of the student
    }

    public int getMaths() {
        return maths; // Return marks in Mathematics
    }

    public void setMaths(int maths) {
        this.maths = maths; // Set marks in Mathematics
    }

    public int getPhysics() {
        return physics; // Return marks in Physics
    }

    public void setPhysics(int physics) {
        this.physics = physics; // Set marks in Physics
    }

    public int getChemistry() {
        return chemistry; // Return marks in Chemistry
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry; // Set marks in Chemistry
    }

    public int getTemp() {
        return temp; // Return the temporary variable
    }

    public void setTemp(int temp) {
        this.temp = temp; // Set the temporary variable
    }

    /**
     * Calculates total marks.
     * 
     * @return total marks
     */
    public int getTotal() {
        total = maths + physics + chemistry; // Calculate total marks
        return total; // Return total marks
    }

    /**
     * Calculates percentage of marks.
     * 
     * @return percentage
     */
    public double getPercentage() {
        percentage = total / 3.0; // Calculate percentage (using 3.0 to ensure double division)
        return percentage; // Return percentage
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Deserialize non-transient fields from the input stream
        name = (String) in.readObject(); // Read the name
        physics = in.readInt(); // Read Physics marks
        chemistry = in.readInt(); // Read Chemistry marks
        maths = in.readInt(); // Read Mathematics marks
        // Deserialize transient variable
        temp = in.readInt(); // Read the transient variable
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Serialize non-transient fields to the output stream
        out.writeObject(name); // Write the name
        out.writeInt(physics); // Write Physics marks
        out.writeInt(chemistry); // Write Chemistry marks
        out.writeInt(maths); // Write Mathematics marks
        // Serialize transient variable
        out.writeInt(temp); // Write the transient variable
    }
}
```

### Explanation of Key Parts:

- **Externalizable Interface**: Unlike `Serializable`, the `Externalizable` interface requires the class to explicitly implement methods for serialization and deserialization, giving more control over the process.
- **Instance Variables**: The class contains fields for the student's name and marks. The transient fields are defined but will only be serialized when explicitly handled.
- **Getters and Setters**: Methods for accessing and modifying private fields, following the principles of encapsulation.
- **readExternal Method**: This method is called during deserialization. It reads the object's state from an `ObjectInput` stream, including non-transient fields and the transient `temp` variable.
- **writeExternal Method**: This method is called during serialization. It writes the object's state to an `ObjectOutput` stream, including the transient `temp` variable, allowing it to be serialized.

