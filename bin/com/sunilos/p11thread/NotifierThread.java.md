```java
package com.sunilos.p11thread;

import java.util.Date;

/**
 * NotifierThread is responsible for notifying thread(s) that are waiting to
 * acquire the lock (monitor) on the Message object.
 * 
 * When a thread is waiting (by calling wait()), NotifierThread signals the waiting thread(s)
 * to resume execution by calling notify() or notifyAll().
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class NotifierThread extends Thread {

    // Message object shared between NotifierThread and WaiterThread
    private Message msg;

    /**
     * Constructor to initialize the Message object and set the thread name.
     * 
     * @param msg The Message object being used for communication between threads.
     */
    public NotifierThread(Message msg) {
        super("Notifier"); // Sets the name of this thread to "Notifier"
        this.msg = msg;
    }

    /**
     * The run() method contains the code that is executed when the NotifierThread starts.
     * It will notify one or more waiting threads to wake up and proceed.
     */
    @Override
    public void run() {

        String name = getName(); // Get the name of the thread
        System.out.println(name + " started"); // Print message indicating the thread has started

        try {
            // The thread sleeps for 1 second before sending the notification
            Thread.sleep(1000);

            // Synchronized block to obtain the lock on the Message object (msg)
            synchronized (msg) {
                // Set a new message, including the notifier's name and the current timestamp
                msg.setMsg(name + " notified at " + new Date());

                // Notify one thread that is waiting for the Message object's lock
                msg.notify();

                // Optionally, you can uncomment the next line to notify all waiting threads
                // msg.notifyAll(); 
            }
        } catch (InterruptedException e) {
            // Catch block in case the thread is interrupted during sleep
        }

    }

}
```

### Explanation:
1. **`NotifierThread`**: This thread is designed to send notifications to threads that are waiting on the `Message` object.
2. **`synchronized (msg)`**: This block ensures that only one thread can modify or access the `Message` object at a time.
3. **`msg.notify()`**: It notifies one thread that is waiting for the `msg` object's lock to wake up and continue. Optionally, `notifyAll()` can be used to wake all waiting threads.
4. **`Thread.sleep(1000)`**: The NotifierThread pauses for one second before sending a notification, simulating some delay in notification.
