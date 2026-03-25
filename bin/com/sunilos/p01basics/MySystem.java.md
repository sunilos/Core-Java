```java
package com.sunilos.p01basics;

/**
 * The MySystem class is a Java program that launches the native application notepad.exe.
 * 
 * This program demonstrates how to execute an external application using Java's `Runtime` class.
 * It launches the Notepad application on Windows systems.
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MySystem {
    
    /**
     * The main method is the entry point of the application.
     * It launches the Notepad application using the `Runtime.getRuntime().exec` method.
     *
     * @param args The runtime arguments (not used in this program).
     * @throws Exception If an error occurs while executing the command.
     */
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("notepad.exe");
    }

}
```

Explanation:
- The program launches the Notepad application on a Windows system.
- It uses Java's `Runtime.getRuntime().exec` method to execute the command for opening Notepad.
