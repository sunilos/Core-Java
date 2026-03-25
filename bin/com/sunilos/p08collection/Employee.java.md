
```java
package com.sunilos.p08collection;

/**
 * A Java bean that represents an Employee with attributes and methods for managing employee data.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee {

    private int employeeId; // Unique identifier for the employee
    private String firstName; // Employee's first name
    private String lastName; // Employee's last name

    /**
     * Default constructor that initializes an Employee object without any attributes set.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor for creating an Employee with specified attributes.
     * 
     * @param employeeId Unique ID for the employee
     * @param firstName Employee's first name
     * @param lastName Employee's last name
     */
    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId; // Set the employee ID
        this.firstName = firstName; // Set the first name
        this.lastName = lastName; // Set the last name
    }

    // Getter and setter methods for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns a string representation of the Employee object in the format:
     * employeeId,lastName,firstName
     */
    @Override
    public String toString() {
        return employeeId + "," + lastName + "," + firstName;
    }

    /**
     * Compares two Employee objects based on their employee IDs.
     * 
     * @param o The object to compare with this Employee
     * @return true if both Employee objects have the same employee ID, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) // Check if the object is null
            return false;
        if (!(o instanceof Employee)) // Check if the object is an instance of Employee
            return false;
        Employee other = (Employee) o; // Cast to Employee

        return this.employeeId == other.employeeId; // Compare employee IDs
    }

    /**
     * Returns a hash code value for the Employee object.
     * 
     * Employee ID is used as the hash code to uniquely identify the object in collections like HashMap.
     */
    @Override
    public int hashCode() {
        return employeeId; // Return the employee ID as the hash code
    }
}
```

### Explanation:

- **Class Purpose:** The `Employee` class serves as a Java bean that encapsulates employee-related data, providing methods for accessing and modifying the employee's attributes.

- **Attributes:**
  - `employeeId`: An integer representing the unique identifier for each employee.
  - `firstName`: A string representing the employee's first name.
  - `lastName`: A string representing the employee's last name.

- **Constructors:**
  - **Default Constructor:** Allows for the creation of an `Employee` object without any initial attributes.
  - **Parameterized Constructor:** Initializes an `Employee` object with specific values for `employeeId`, `firstName`, and `lastName`.

- **Getter and Setter Methods:** Provide access to the private attributes of the `Employee` class, allowing other classes to retrieve and modify the values while encapsulating the implementation.

- **toString Method:** Overrides the default `toString()` method to return a formatted string representation of the employee, making it easier to display or log employee information.

- **equals Method:** Overrides the `equals()` method to compare two `Employee` objects based on their `employeeId`. This is important for collection operations that rely on equality checks.

- **hashCode Method:** Overrides the `hashCode()` method to return the `employeeId`, which allows `Employee` objects to be used effectively in hash-based collections like `HashMap`.

Overall, this class provides a robust framework for managing employee data in a way that is consistent with Java best practices.
