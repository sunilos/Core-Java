```java
package com.sunilos.p11thread;

/**
 * PriorityThread class demonstrates how threads can be assigned different priorities
 * and how these priorities influence the thread scheduler's behavior.
 * 
 * Each thread will print its name along with its priority, allowing us to observe
 * the effect of different priorities during execution.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class PriorityThread extends Thread {

    /**
     * Constructor that assigns a name to the thread.
     * 
     * @param name The name of the thread.
     */
    public PriorityThread(String name) {
        super(name); // Calls the parent Thread class constructor to set the thread's name
    }

    /**
     * The run() method contains the code that each thread executes.
     * It prints the thread's name along with its priority for 500 iterations.
     */
    public void run() {
        for (int x = 1; x <= 500; x++) { // Loop to simulate some repetitive work
            System.out.println(getName() + " P = " + getPriority()); // Print the thread's name and priority
        }
    }

    /**
     * The main() method creates and starts three threads with different priorities.
     * The thread scheduler decides which thread gets more CPU time based on these priorities.
     */
    public static void main(String[] args) {

        // Create three threads with different names
        PriorityThread t1 = new PriorityThread("T # A");
        PriorityThread t2 = new PriorityThread("T # B");
        PriorityThread t3 = new PriorityThread("T # C");

        // Set the priority of each thread
        t1.setPriority(3);  // Assigns priority 3 to t1
        t2.setPriority(1);  // Assigns the lowest priority (1) to t2
        // t3 has the default priority of 5, which is set automatically by the JVM

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
```

### Explanation:
1. **`PriorityThread`**: This class extends `Thread` and demonstrates thread priority in action.
2. **`getPriority()`**: Each thread's priority is printed along with its name during the loop execution.
3. **`setPriority()`**: Allows setting a priority for each thread (1 is the lowest, 10 is the highest, and 5 is the default).
   - `t1` is given a priority of 3 (medium-low).
   - `t2` is given the lowest priority (1).
   - `t3` retains the default priority (5).
4. **Thread scheduling**: Threads with higher priority may get more CPU time, but the actual scheduling behavior is platform-dependent and not guaranteed strictly by priority alone.
