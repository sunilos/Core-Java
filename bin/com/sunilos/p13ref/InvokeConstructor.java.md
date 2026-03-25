
```java
package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import java.util.Date;
import com.sunilos.p06oop.Person;

/**
 * Creates an instance using the constructor. Constructor is invoked by the
 * Reflection API.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class InvokeConstructor {

    public static void main(String[] args) throws Exception {

        // Load the Person class dynamically using its fully qualified name
        Class<?> c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

        // Get the constructor that takes specific parameters (String, String, Date)
        Constructor<?> oneConstructor = c.getConstructor(String.class, String.class, Date.class);

        // Create an instance of Person using the retrieved constructor
        Person p = (Person) oneConstructor.newInstance("Abhay", "Sadar Bazar", new Date());

        // Print the class name
        System.out.println("Class Name: " + c.getName());
        System.out.println();

        // Print the person information
        System.out.println("Person Information");
        System.out.println("Name: " + p.getName());
        System.out.println("Address: " + p.getAddress());
        System.out.println("Date of Birth: " + p.getDateOfBirth());
    }
}
```

### Explanation:
- **Reflection API**: This code demonstrates how to create an instance of the `Person` class using its constructor via reflection.
- **Class Loading**: `Class.forName(...)` loads the class dynamically, allowing the program to create instances without needing to hard-code the class reference.
- **Constructor Retrieval**: The `getConstructor(...)` method retrieves a specific constructor from the `Person` class that matches the provided parameter types (two `String` and one `Date`).
- **Instance Creation**: `newInstance(...)` invokes the constructor to create a new `Person` object, passing the required arguments.
- **Output**: The program prints the class name and the information of the created `Person` instance, including the name, address, and date of birth.

