
```java
package com.sunilos.p06oop;

/**
 * The Student class represents a student and extends the Person class.
 * It includes additional attributes and methods specific to a student.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Student extends Person {

    // The roll number of the student.
    private String rollNo = null;

    // The marks obtained by the student.
    private int marks = 0;

    /**
     * Static method to get the average age of students.
     * This method does not require an instance of Student to be called.
     * 
     * @return the average age of students, which is set to 10.
     */
    public static int getAge() {
        return 10;  // Returns a fixed average age
    }

    /**
     * Getter method for the roll number of the student.
     * 
     * @return the roll number.
     */
    public String getRollNo() {
        return rollNo;
    }

    /**
     * Setter method for the roll number of the student.
     * 
     * @param rollNo the roll number to set.
     */
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * Getter method for the marks of the student.
     * 
     * @return the marks obtained.
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Setter method for the marks of the student.
     * 
     * @param marks the marks to set.
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
```

### Explanation:

- **Inheritance:** The `Student` class extends the `Person` class, inheriting its attributes and methods. This allows `Student` to reuse and extend the functionality provided by `Person`.

- **Attributes:** 
  - `rollNo`: Represents the unique roll number assigned to the student.
  - `marks`: Represents the marks obtained by the student.

- **Static Method `getAge()`:** This method returns a fixed average age of students (10). Being static, it can be called without creating an instance of `Student`.

- **Getter and Setter Methods:** These methods provide controlled access to the `rollNo` and `marks` attributes, allowing values to be retrieved and modified.
