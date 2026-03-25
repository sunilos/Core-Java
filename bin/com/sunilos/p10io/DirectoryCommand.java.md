
```java
package com.sunilos.p10io;

import java.io.File; // Import the File class for file and directory operations

/**
 * Lists files & subdirectories of a folder
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DirectoryCommand {

    public static void main(String[] args) {

        // Create a File object referencing the "g:/temp" folder
        File directory = new File("g:/temp");
        // Get the list of files and subdirectories in the specified directory
        String[] files = directory.list();

        // Loop through the list of files and print their names
        for (String f : files) {
            System.out.println(f); // Print each file or subdirectory name
        }

        // Create a subdirectory named "test" inside the specified directory
        File subDir = new File(directory, "test");
        subDir.mkdir(); // Create the subdirectory

        // Rename the created subdirectory to "Nest"
        subDir.renameTo(new File(directory, "Nest"));

        // Remove the renamed subdirectory (now "Nest")
        subDir.delete(); // Deletes the directory if it's empty

        // Schedule the deletion of a file or directory when the program exits
        // This will not delete the subDir variable, but rather a new instance
        subDir.deleteOnExit(); // Ensure it will be deleted when the JVM exits

    }

}
```

### Explanation of Key Parts:

- **File Class**: The `File` class represents file and directory pathnames in an abstract manner and provides methods for creating, deleting, and querying files and directories.
- **Listing Files**: The `list()` method returns an array of strings naming the files and directories in the directory represented by the `File` object. If the directory is empty, it returns `null`.
- **Creating a Directory**: The `mkdir()` method creates a new directory. If the directory already exists or if the parent directory doesn't exist, it will fail.
- **Renaming**: The `renameTo()` method renames the file or directory to the new name specified in the `File` object.
- **Deleting Directories**: The `delete()` method removes a file or an empty directory. If the directory is not empty, the deletion will fail.
- **deleteOnExit()**: This method schedules the file or directory for deletion when the JVM terminates, ensuring that it will be removed even if the program doesn't delete it explicitly.

