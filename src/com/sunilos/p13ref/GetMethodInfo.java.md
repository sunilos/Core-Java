
```java
package com.sunilos.p13ref;

import java.lang.reflect.Method;
import com.sunilos.p06oop.Person;

/**
 * Create an instance of a class using the Reflection API and print the class
 * information.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetMethodInfo {

    public static void main(String[] args) throws Exception {

        // Create an instance of the Person class
        Person person = new Person();
        Class<?> c = person.getClass(); // Obtain the Class object for Person

        // Get all methods information from the Person class
        Method[] methods = c.getMethods();

        System.out.println("Class: " + c.getName());
        System.out.println("Method Information:");

        // Iterate through all methods and print their names and return types
        for (Method m : methods) {
            System.out.println("\tName: " + m.getName());
            System.out.println("\tReturn Type: " + m.getReturnType());
            Class<?>[] params = m.getParameterTypes(); // Get parameter types of the method
            if (params.length > 0) {
                System.out.println("\tMethod Parameter Types:");
                for (Class<?> p : params) {
                    System.out.println("\t\t" + p.getName());
                }
            }
            System.out.println();
        }

        System.out.println("Exclude Parent Methods:");

        // Get only declared methods of the Person class (excluding inherited methods)
        methods = c.getDeclaredMethods();

        // Iterate through declared methods and print their details
        for (Method m : methods) {
            System.out.println("\tName: " + m.getName());
            System.out.println("\tReturn Type: " + m.getReturnType());
            Class<?>[] params = m.getParameterTypes(); // Get parameter types
            if (params.length > 0) {
                System.out.println("\tMethod Parameter Types:");
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
- **Reflection API**: This code uses Java's Reflection API to obtain and print details about the methods in the `Person` class.
- **Class Object**: It retrieves the `Class` object for the `Person` instance, which allows access to class metadata.
- **Method Information**: 
  - `getMethods()`: This method retrieves all public methods of the `Person` class, including those inherited from parent classes. The program iterates through these methods, printing their names, return types, and any parameter types.
  - `getDeclaredMethods()`: This retrieves only the methods declared in the `Person` class, excluding inherited methods. The program prints the same details for these methods as well.
  
