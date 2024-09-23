
```java
package com.sunilos.p10io;

import java.io.File; // Import the File class for file operations
import java.util.Date; // Import the Date class for handling date and time

/**
 * Gets the File information for file system and prints it.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FileInfo {

    public static void main(String[] args) {

        // Create a File object referring to "c:/a.txt"
        File f = new File("c:/a.txt");

        // Check if the file exists
        if (f.exists()) {
            // Print the name of the file
            System.out.println("Name: " + f.getName());
            // Print the absolute path of the file
            System.out.println("Path: " + f.getAbsolutePath());

            // Check and print access permissions
            System.out.println("Access permission");
            System.out.println("Writable: " + f.canWrite()); // Check if the file is writable
            System.out.println("Readable: " + f.canRead()); // Check if the file is readable

            // Check if the File object refers to a file or a directory
            System.out.println("Is File: " + f.isFile()); // True if it is a file
            System.out.println("Is Dir: " + f.isDirectory()); // True if it is a directory

            // Get and print the last modified date of the file
            Date d = new Date(f.lastModified()); // Create a Date object from the last modified timestamp
            System.out.println("Date Modified: " + d);

            // Get and print the length of the file in bytes
            long length = f.length(); // Length in bytes
            System.out.println("Length: " + length + " bytes");

        } else {
            // Print a message if the file does not exist
            System.out.println("File does not exist");
        }
    }
}
```

### Explanation of Key Parts:

- **File Class**: Used to represent the file or directory path, providing methods to query file attributes and perform file operations.
- **Checking File Existence**: The `exists()` method checks whether the file or directory represented by the `File` object exists in the file system.
- **File Information**: 
  - `getName()`: Returns the name of the file or directory.
  - `getAbsolutePath()`: Returns the absolute path of the file or directory.
  - `canWrite()` and `canRead()`: Check if the file is writable and readable, respectively.
- **File Type Check**: 
  - `isFile()`: Returns `true` if the `File` object is a file.
  - `isDirectory()`: Returns `true` if the `File` object is a directory.
- **Last Modified Date**: `lastModified()` returns the last modified time in milliseconds since the epoch, which is then converted to a `Date` object for readable format.
- **File Length**: `length()` returns the size of the file in bytes.

