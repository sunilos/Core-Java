
```java
package com.sunilos.p13ref;

import java.lang.reflect.Constructor;
import com.sunilos.p06oop.Person;

/**
 * Gets the constructor details of a class using the Reflection API.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetConstructorInfo {

    public static void main(String[] args) throws Exception {

        // Create an instance of the Person class
        Person person = new Person();
        Class<?> c = person.getClass(); // Obtain the Class object for Person
        System.out.println("Class Name: " + c.getName());

        // Get all constructors of the Person class
        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("Constructor Information:");

        // Iterate over all constructors and print their names and parameter types
        for (Constructor<?> ctr : constructors) {
            System.out.println("\tName: " + ctr.getName());
            Class<?>[] params = ctr.getParameterTypes(); // Get parameter types of the constructor
            if (params.length > 0) {
                System.out.println("\tConstructor Parameter Types:");
                for (Class<?> p : params) {
                    System.out.println("\t\t" + p.getName());
                }
            }
            System.out.println();
        }
    }
}
```

### Explanation:
- **Reflection API**: This code utilizes Java's Reflection API to obtain and print details about the constructors of the `Person` class.
- **Class Object**: It retrieves the `Class` object for the `Person` instance using `getClass()`, which allows access to class metadata.
- **Constructor Information**: The constructors of the `Person` class are fetched using `getConstructors()`.
- **Iterating Constructors**: The program iterates through each constructor, printing its name and any parameter types it requires. If a constructor has parameters, their types are printed as well.

This code provides a clear view of the constructors available in the `Person` class, useful for understanding how to instantiate objects of that class and what parameters are required.
