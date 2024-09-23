
```java
package com.sunilos.p11thread;

/**
 * Example of the join() method. In this example, a thread joins the next thread and
 * waits until the next thread is finished.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class JoiningThread extends Thread {

    // Reference to the next thread to join
    private Thread nextThread;

    /**
     * Constructor to initialize the thread with a name
     * 
     * @param name The name of the thread
     */
    public JoiningThread(String name) {
        super(name);
    }

    /**
     * Constructor to initialize the thread with a name and a reference to the next thread
     * 
     * @param name The name of the thread
     * @param other The next thread to join
     */
    public JoiningThread(String name, Thread other) {
        super(name);
        this.nextThread = other; // Store the reference to the next thread
    }

    @Override
    public void run() {
        System.out.println(getName() + " Started");

        // If there is a next thread, wait for it to finish
        if (nextThread != null) {
            if (nextThread.isAlive()) { // Check if the next thread is still running
                try {
                    // Join the next thread and wait until it is finished
                    nextThread.join();
                } catch (InterruptedException e) {
                    // Handle interruption (if needed)
                }
            }
        }

        System.out.println(getName() + " Ended");
    }

    /**
     * Main method to test the JoiningThread class
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create instances of JoiningThread with dependencies
        Thread d = new JoiningThread("D");
        Thread c = new JoiningThread("C", d); // C waits for D
        Thread b = new JoiningThread("B", c); // B waits for C
        Thread a = new JoiningThread("A", b); // A waits for B

        // Start all threads
        a.start();
        b.start();
        c.start();
        d.start();

        try {
            // Main will wait until A is finished
            a.join();
        } catch (InterruptedException e) {
            // Handle interruption (if needed)
        }
        System.out.println("Main is finished");
    }
}

/**
 * Expected Output:
 * B Started
 * C Started
 * A Started
 * D Started
 * D Ended
 * C Ended
 * B Ended
 * A Ended
 * Main is finished
 */
```

### Explanation of Key Parts:

- **JoiningThread Class**: This class extends `Thread` and includes logic to wait for another thread to finish using the `join()` method.

- **Constructors**: Two constructors are provided:
  - One initializes the thread with a name.
  - The other initializes the thread with a name and a reference to the next thread that this thread should wait for.

- **run Method**: In the `run` method:
  - The thread prints its name when it starts.
  - If it has a next thread that is alive, it calls `join()` on that thread, causing it to wait until the next thread finishes.
  - Finally, it prints its name when it ends.

- **main Method**: The `main` method demonstrates how threads are created and started in a dependency chain:
  - Thread A waits for B, B waits for C, and C waits for D.
  - The threads are started in the order they were created.
  - The main thread waits for A to finish before printing "Main is finished".

