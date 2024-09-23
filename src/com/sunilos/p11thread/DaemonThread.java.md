
```java
package com.sunilos.p11thread;

/**
 * Daemon Threads have an infinite loop that wakes up every 500 milliseconds
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class DaemonThread extends Thread {

    public void run() {
        // Print the start message and current thread information
        System.out.println("Daemon T started " + Thread.currentThread());

        // Infinite loop that wakes up every 500 milliseconds
        while (true) {
            try {
                Thread.sleep(500); // Pause the thread for 500 ms
                System.out.println("Daemon T: woke up again"); // Log wake-up message
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print stack trace if interrupted
            }
        }
    }

    /**
     * Creates a Daemon thread and tests its behavior
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Main Started");

        // Create a new DaemonThread, set it as a daemon, and start it
        DaemonThread t = new DaemonThread();
        t.setDaemon(true); // Mark the thread as a daemon
        t.start(); // Start the daemon thread

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Print stack trace if interrupted
        }

        // Message indicating the main method is finishing
        System.out.println("Leaving main method, now JVM will exit");
    }
}
```

### Explanation of Key Parts:

- **Daemon Thread**: The `DaemonThread` class extends `Thread` and overrides the `run` method. It functions as a daemon thread, which means it runs in the background and is typically used for tasks that do not require user interaction.

- **Infinite Loop**: The `run` method contains an infinite loop that makes the thread "wake up" every 500 milliseconds to perform its task (printing a message).

- **Setting Daemon**: In the `main` method, the thread is set to be a daemon with `t.setDaemon(true);`. This means that the JVM will not wait for this thread to finish when the main program terminates; it will exit when only daemon threads are left running.

- **Main Thread Sleep**: The main thread sleeps for 3 seconds, allowing the daemon thread to execute several times. After this duration, the main method completes, and the JVM exits, terminating the daemon thread.

- **Interruption Handling**: The `InterruptedException` is caught and printed, allowing for graceful handling of interruptions.

