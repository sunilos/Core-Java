
```java
package com.sunilos.p06oop;

/**
 * The Employee class extends (inherits from) the Person class.
 * This means the Employee class inherits all properties and behaviors of the Person class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee extends Person {

    // The 'salary' field is a unique property of the Employee class, initialized to 0 by default.
    private float salary = 0;

    // Default constructor for the Employee class.
    // It initializes the Employee object without setting any attributes.
    public Employee() {
    }

    // Parameterized constructor for the Employee class.
    // This constructor accepts the name, address, and salary of the employee.
    // The 'super' keyword is used to call the constructor of the Person class,
    // setting the 'name' and 'address' attributes in the parent class.
    public Employee(String name, String add, float sal) {
        super(name, add); // Call to parent class constructor (Person)
        salary = sal;     // Set the salary specific to the Employee class
    }

    // Getter method for the 'salary' field.
    // This method returns the salary of the employee.
    public float getSalary() {
        return salary;
    }

    // Setter method for the 'salary' field.
    // This method allows updating the salary of the employee.
    public void setSalary(float salary) {
        this.salary = salary;
    }

}
```

### Explanation:

- The `Employee` class inherits from the `Person` class.
- The `salary` attribute is unique to the `Employee` class, while `name` and `address` are inherited from `Person`.
- The class has a default constructor and a parameterized constructor to initialize employee details.
- Getter and setter methods control access to the `salary` field.
