
```java
package com.sunilos.p11thread;

/**
 * An example thread class created using the Runnable interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloRunnable implements Runnable {

    /**
     * Name of the thread
     */
    private String name = null;

    /**
     * Parameterized constructor to initialize the thread's name
     * 
     * @param n The name of the thread
     */
    public HelloRunnable(String n) {
        this.name = n; // Set the name field to the provided parameter
    }

    /**
     * Execute thread operations
     * This method contains the code that will run in the new thread
     */
    public void run() {
        // Loop to print numbers from 0 to 4999 with the thread's name
        for (int i = 0; i < 5000; i++) {
            System.out.println(i + "#" + name); // Print the current index and thread name
        }
    }

    /**
     * Test concurrent thread execution
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String args[]) {
        // Create two Thread objects with HelloRunnable instances
        Thread t1 = new Thread(new HelloRunnable("Ram")); // Thread for "Ram"
        Thread t2 = new Thread(new HelloRunnable("Shyam")); // Thread for "Shyam"
        
        // Start both threads
        t1.start();
        t2.start();
    }
}
```

### Explanation of Key Parts:

- **Runnable Interface**: The `HelloRunnable` class implements the `Runnable` interface, allowing instances of it to be executed by a thread.

- **Thread Name**: The `name` field stores the name of the thread, which helps identify which thread is currently executing.

- **Constructor**: The parameterized constructor initializes the `name` variable, allowing different thread instances to have unique names.

- **run Method**: The `run` method contains the code that defines what the thread does. In this case, it prints numbers from 0 to 4999, each prefixed by the thread's name. This simulates work done by the thread.

- **Creating and Starting Threads**: In the `main` method, two `Thread` objects are created, each wrapping an instance of `HelloRunnable`. The `start` method is called on each thread, which invokes the `run` method concurrently.

