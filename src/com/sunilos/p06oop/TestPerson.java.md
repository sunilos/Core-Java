
```java
package com.sunilos.p06oop;

/**
 * The TestPerson class serves as a test program for the Person class.
 * It demonstrates the creation of a Person object, setting its attributes,
 * and retrieving those attributes for display.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestPerson {

    /**
     * The main method is the entry point for the program.
     * It creates an instance of the Person class, sets values for its attributes,
     * and prints those values to the console.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare a variable of type Person but do not instantiate it yet.
        Person p = null; 
        
        // Instantiate the Person object.
        p = new Person(); 

        // Call setter methods to set the name and address of the person.
        p.setName("Karan");             // Set the name to "Karan".
        p.setAddress("MG Road");        // Set the address to "MG Road".

        // Call getter methods to retrieve the name and address, and print them.
        System.out.println("Name : " + p.getName());       // Output the name.
        System.out.println("Address : " + p.getAddress());  // Output the address.
    }
}
```

### Explanation:

- **Purpose:** The `TestPerson` class is designed to test the functionality of the `Person` class by creating an instance, setting its attributes, and printing them.

- **Creating an Instance:** A `Person` object is declared (`p`) and then instantiated. This allows access to the methods defined in the `Person` class.

- **Setting Values:** The `setName` and `setAddress` methods are called to assign values to the `name` and `address` attributes of the `Person` object.

- **Retrieving and Printing Values:** The `getName` and `getAddress` methods are called to retrieve the values, which are then printed to the console. This demonstrates how to interact with an object's properties using getters and setters.
