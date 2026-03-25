
```java
package com.sunilos.p13ref;

import java.lang.reflect.Method;
import java.util.Date;
import com.sunilos.p06oop.Person;

/**
 * Invokes methods to set and get values using the Reflection API.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class InvokeMethod {

    public static void main(String[] args) throws Exception {

        // Create an instance of the Person class
        Person person = new Person();
        Class<?> c = person.getClass();
        System.out.println("Class Name: " + c.getName());

        // Call setter methods using reflection API

        // Get the setName method that takes a String parameter
        Method setNameMethod = c.getMethod("setName", String.class);
        // Invoke the setName method on the person object
        setNameMethod.invoke(person, "Abhay");

        // Get the setAddress method that takes a String parameter
        Method setAddressMethod = c.getMethod("setAddress", String.class);
        // Invoke the setAddress method on the person object
        setAddressMethod.invoke(person, "Sadar Bazar");

        // Get the setDateOfBirth method that takes a Date parameter
        Method setDateOfBirthMethod = c.getMethod("setDateOfBirth", Date.class);
        // Invoke the setDateOfBirth method on the person object
        setDateOfBirthMethod.invoke(person, new Date());

        // Retrieve all declared methods of the Person class, excluding inherited methods
        Method[] methods = c.getDeclaredMethods();

        // Call all getter methods to retrieve values
        String methodName;
        for (Method m : methods) {
            methodName = m.getName();
            // Check if the method is a getter (starts with "get")
            if (methodName.startsWith("get")) {
                // Invoke the getter method and print the result
                Object value = m.invoke(person, null);
                System.out.println(methodName + " = " + value);
            }
        }
    }
}
```

### Explanation:
- **Reflection API**: This code utilizes the reflection API to dynamically invoke methods on the `Person` class for setting and getting values.
- **Creating an Instance**: An instance of the `Person` class is created, and its class type is retrieved.
- **Setting Values**: The `getMethod(...)` function retrieves the specified setter methods (e.g., `setName`, `setAddress`, `setDateOfBirth`). The `invoke(...)` function then calls these methods to set values for the `person` instance.
- **Getting Values**: After setting the properties, the code retrieves all declared methods of the `Person` class. It checks if the methods are getters by seeing if their names start with "get" and invokes them to print the property values.
- **Output**: The program prints the class name and the values set for the `name`, `address`, and `date of birth` by invoking the corresponding getter methods.

