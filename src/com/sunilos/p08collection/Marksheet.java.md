
```java
package com.sunilos.p08collection;

import java.util.Comparator;

/**
 * Contains attributes and methods for a Marksheet. The Marksheet class implements
 * the Comparable interface to provide natural ordering based on the roll number.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Marksheet implements Comparable<Marksheet> {

    public String rollNo; // Roll number of the student
    public String name; // Name of the student
    public int marks; // Marks obtained by the student

    /**
     * Default constructor
     */
    public Marksheet() {
    }

    /**
     * Parameterized constructor to initialize a Marksheet with given values.
     * 
     * @param rollNo The roll number of the student
     * @param name The name of the student
     * @param marks The marks obtained by the student
     */
    public Marksheet(String rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Natural ordering is done by the roll number field.
     * 
     * @param m The Marksheet object to compare against
     * @return A negative integer, zero, or a positive integer as this Marksheet
     *         is less than, equal to, or greater than the specified Marksheet.
     */
    @Override
    public int compareTo(Marksheet m) {
        return rollNo.compareTo(m.rollNo);
    }

    /**
     * Returns the attributes of Marksheet as a string in CSV format.
     * 
     * @return A string representation of the Marksheet
     */
    @Override
    public String toString() {
        return rollNo + "," + name + "," + marks;
    }

    /**
     * Two Marksheet objects are considered equal if their roll numbers are the same.
     * This method is used by collections to search for elements in a collection.
     * 
     * @param o The object to compare with
     * @return true if both objects are Marksheet and have the same roll number
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Marksheet))
            return false;
        Marksheet other = (Marksheet) o;
        return this.rollNo.equals(other.rollNo);
    }

    /**
     * Returns the hash code for the Marksheet, which is based on the roll number.
     * This is used by hash-based collections when an object is used as a key.
     * 
     * @return The hash code for the Marksheet
     */
    @Override
    public int hashCode() {
        return rollNo.hashCode();
    }

}

/**
 * Comparator class to sort Marksheet elements by name in ascending order.
 */
class OrderByName implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        return m1.name.compareTo(m2.name);
    }
}

/**
 * Comparator class to sort Marksheet elements by name in descending order.
 */
class OrderByNameDesc implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        return m2.name.compareTo(m1.name);
    }
}

/**
 * Comparator class to sort Marksheet elements by marks in descending order.
 */
class OrderByMarksDesc implements Comparator<Marksheet> {
    public int compare(Marksheet m1, Marksheet m2) {
        if (m1.marks > m2.marks) {
            return -1; // m1 has higher marks than m2
        } else if (m1.marks == m2.marks) {
            return 0; // Both have equal marks
        } else {
            return 1; // m1 has lower marks than m2
        }
    }
}
```

### Explanation:

1. **Marksheet Class:**
   - **Attributes:** The class has three public attributes: `rollNo`, `name`, and `marks` to hold details of a student’s marks.
   - **Constructors:** Includes a default constructor and a parameterized constructor for initializing instances.
   - **compareTo Method:** This method defines the natural ordering of `Marksheet` objects by their roll numbers using `String.compareTo()`.
   - **toString Method:** Provides a string representation of the Marksheet in a comma-separated format.
   - **equals and hashCode Methods:** These methods ensure that two Marksheet objects are considered equal based on their roll numbers, and that their hash codes are consistent with this equality.

2. **Comparator Classes:**
   - **OrderByName:** This comparator sorts Marksheet objects in ascending order by name using the `compareTo` method.
   - **OrderByNameDesc:** This comparator sorts Marksheet objects in descending order by name, reversing the order of comparison.
   - **OrderByMarksDesc:** This comparator sorts Marksheet objects by marks in descending order, using a conditional approach to determine the order based on the marks.

Overall, these classes provide a comprehensive way to manage and sort student marksheets based on different criteria.
