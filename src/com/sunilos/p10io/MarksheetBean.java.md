
```java
package com.sunilos.p10io;

import java.io.Serializable; // Import Serializable interface for object serialization

/**
 * A serialized class containing Marksheet data of a student.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MarksheetBean implements Serializable {

    // Instance variables to store student's name and marks
    String name = null; // Name of the student
    int maths = 0; // Marks in Mathematics
    int physics = 0; // Marks in Physics
    int chemistry = 0; // Marks in Chemistry

    // transient variables will not be serialized

    /**
     * total is a calculated transient field,
     */
    transient int total = 0; // Total marks (not serialized)

    /**
     * Percentage is a calculated transient field
     */
    transient double percentage = 0; // Percentage (not serialized)

    /**
     * Transient temporary variable
     */
    transient int temp = 0; // Temporary variable (not serialized)

    // Getter and setter methods for each instance variable

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
}
```

### Explanation of Key Parts:

- **Serializable Interface**: The `Serializable` interface enables serialization, allowing objects of this class to be converted into a byte stream for storage or transmission.
- **Instance Variables**: 
  - `name`: Stores the student's name.
  - `maths`, `physics`, `chemistry`: Store the marks obtained in respective subjects.
- **Transient Variables**: 
  - Variables marked as `transient` (like `total`, `percentage`, and `temp`) are not serialized, meaning their values are not saved when the object is serialized. This is useful for calculated fields that can be derived from other data.
- **Getters and Setters**: Methods to access and modify the private instance variables. This encapsulation is a key principle of object-oriented programming.
- **Calculating Total and Percentage**:
  - `getTotal()`: Calculates and returns the total marks based on the marks in each subject.
  - `getPercentage()`: Calculates the percentage based on the total marks. It divides by `3.0` to ensure the result is a double.

