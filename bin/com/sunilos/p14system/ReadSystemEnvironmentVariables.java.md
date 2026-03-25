
```java
package com.sunilos.p14system;

import java.util.Map;
import java.util.Set;

/**
 * This class uses the System class to read OS environment variables and print them.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadSystemEnvironmentVariables {
    public static void main(String[] args) {

        // Read a single environment variable
        String path = System.getenv("PATH"); // Retrieves the value of the PATH environment variable
        System.out.println("$PATH=" + path); // Prints the value of the PATH variable

        // Read all Environment Variables
        Map<String, String> envMap = System.getenv(); // Retrieves all environment variables as a Map
        Set<String> keySet = envMap.keySet(); // Gets the set of keys (variable names)

        // Iterate through the key set and print each environment variable and its value
        for (String key : keySet) {
            String val = envMap.get(key); // Get the value associated with the key
            System.out.println(key + "=" + val); // Print the key-value pair
        }
    }
}
```

### Explanation:
- **Reading a Single Environment Variable**: The program retrieves the value of the `PATH` environment variable using `System.getenv("PATH")` and prints it.
- **Reading All Environment Variables**: It collects all environment variables in a `Map` using `System.getenv()`.
- **Key Set Iteration**: The program obtains the keys (names of the environment variables) from the map and iterates over them.
- **Output**: For each environment variable, it retrieves and prints both the variable name (key) and its value.

This program demonstrates how to access and display the system's environment variables in Java, providing insight into the configuration of the operating system.
