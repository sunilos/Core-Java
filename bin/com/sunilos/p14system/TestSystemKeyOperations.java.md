
```java
package com.sunilos.p14system;

/**
 * Performs key operations to run Garbage Collector, load external libraries,
 * map the library name to OS specific String, run the finalize method for any
 * object waiting for finalization, and to terminate the JVM.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestSystemKeyOperations {

    public static void main(String[] args) {

        // Run the garbage collector
        System.gc(); 
        System.out.println("Garbage collector executed.");

        // Map library name for the current operating system
        String libName = System.mapLibraryName("os.name");
        System.out.println("os.name library: " + libName);

        // Run finalization on objects pending finalization
        System.runFinalization();

        // Terminates the currently running JVM with exit status 1
        System.exit(1);

        // This line will never print because the JVM is terminated
        System.out.println("JVM is terminated");
    }
}
```

### Explanation:
- **Garbage Collector**:
  - `System.gc()` suggests that the Java Virtual Machine (JVM) perform garbage collection, which is the process of reclaiming memory used by objects that are no longer reachable. It's important to note that calling `gc()` does not guarantee immediate execution of the garbage collector.

- **Mapping Library Names**:
  - `System.mapLibraryName("os.name")` returns the name of the library that corresponds to the specified library name, adjusted for the current operating system. In this case, it might return a system-specific name for a library related to the operating system.

- **Finalization**:
  - `System.runFinalization()` forces the finalization of objects that are pending finalization. This is usually done when an object’s `finalize()` method has not yet been called but is marked for garbage collection.

- **Terminating the JVM**:
  - `System.exit(1)` terminates the JVM. The argument `1` typically indicates abnormal termination (you might use `0` for normal termination). Once this method is called, the JVM stops, and any code after this line will not execute, which is why the subsequent print statement will not appear.

This program showcases essential system operations available through the `System` class in Java, especially in resource management and JVM control.
