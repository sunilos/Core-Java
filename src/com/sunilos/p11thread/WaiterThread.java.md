```java
package com.sunilos.p11thread;

import java.util.Date;

/**
 * WaiterThread represents a thread that waits for a notification on a Message object.
 * It calls the `wait()` method to release the lock on the Message object and 
 * waits until it is notified by the NotifierThread.
 * 
 * Once notified, it resumes execution and processes the message.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class WaiterThread extends Thread {

    private Message msg = null; // Shared Message object that this thread will wait on

    /**
     * Constructor to initialize the thread with a name and a shared Message object.
     * 
     * @param name The name of the thread (e.g., Ram or Shyam).
     * @param m    The shared Message object that this thread will wait on.
     */
    public WaiterThread(String name, Message m) {
        super(name); // Initialize thread with a name
        this.msg = m; // Set the shared Message object
    }

    /**
     * The `run()` method is executed when the thread starts. It waits for the
     * NotifierThread to notify it using the `msg.wait()` method.
     * 
     * Once notified, it resumes and processes the message.
     */
    @Override
    public void run() {

        String name = getName(); // Get the name of the thread
        System.out.println(name + " started ");

        synchronized (msg) { // Synchronize on the Message object
            try {
                // Print message indicating the thread is waiting and releases the lock
                System.out.println(name + " waiting since " + new Date());
                msg.wait(); // Wait and release the lock on the Message object
            } catch (InterruptedException e) {
                // Handle interruption, if necessary
            }

            // The thread has been notified and resumes execution
            System.out.println(name + " got notified at " + new Date());

            // Process the message after being notified
            System.out.println(name + " processed message: " + msg.getMsg());
        }
    }
}
```

### Explanation:
1. **`wait()`**:
   - When the `wait()` method is called on the shared `Message` object, the `WaiterThread` releases the lock on the `Message` and waits until it is notified by another thread.
   
2. **Thread Behavior**:
   - The thread starts, prints a message that it's waiting, and then calls `msg.wait()`.
   - The thread goes into a waiting state, releasing the lock on the `Message` object.
   
3. **Notification**:
   - Once a `NotifierThread` notifies the waiting threads (via `notify()` or `notifyAll()`), the waiting thread resumes execution and processes the message.

4. **Synchronized Block**:
   - The `wait()` call must be made within a synchronized block because `wait()`, `notify()`, and `notifyAll()` are called on an object that the threads synchronize on (`msg` in this case).
