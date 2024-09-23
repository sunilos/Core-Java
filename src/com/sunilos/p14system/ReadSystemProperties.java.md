
```java
package com.sunilos.p14system;

import java.util.Properties;
import java.util.Set;

/**
 * This class uses the System class to read System properties and print them.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadSystemProperties {

    public static void main(String[] args) {

        // Get all system-defined properties
        Properties prop = System.getProperties(); // Retrieves system properties as a Properties object
        Set<Object> keySet = prop.keySet(); // Gets the set of keys (property names)

        // Iterate through the key set and print each system property and its value
        for (Object o : keySet) {
            String key = (String) o; // Cast the key to String
            String val = prop.getProperty(key); // Get the value associated with the key
            System.out.println(key + "=" + val); // Print the key-value pair
        }

        // Get a specific property
        String country = System.getProperty("user.country"); // Retrieves the value of the "user.country" property
        System.out.println("User Country: " + country); // Print the value

        // Clear the property example
        System.clearProperty("user.country"); // Clears the "user.country" property
        System.out.println("User Country after clear: " + System.getProperty("user.country")); // Should print null

        // Set a system property
        System.setProperty("user.country", "IN"); // Sets the "user.country" property to "IN"
        country = System.getProperty("user.country"); // Retrieve the newly set value
        System.out.println("User Country after set: " + country); // Should print "IN"
    }
}
```

### Explanation:
- **Reading All System Properties**: The program retrieves all system properties into a `Properties` object and iterates through them, printing each key-value pair.
- **Accessing a Specific Property**: It retrieves and prints the value of the specific property `"user.country"`.
- **Clearing a Property**: The program demonstrates how to clear a system property using `System.clearProperty()`, then verifies that it has been cleared.
- **Setting a Property**: Finally, it shows how to set a new value for a system property using `System.setProperty()` and prints the updated value.

This program provides a practical demonstration of how to manage system properties in Java, which can be useful for configuring application settings.
