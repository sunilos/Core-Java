```java
package com.sunilos.p11thread;

/**
 * WaitNotifyTest demonstrates the usage of `wait()` and `notify()` methods in Java.
 * 
 * This test simulates a scenario where two WaiterThread instances wait for a message
 * object, and a NotifierThread wakes them up by calling `notify()`. The WaiterThread
 * releases the lock on the Message object using `wait()`, and the NotifierThread 
 * signals the waiting threads by calling `notify()` or `notifyAll()`.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WaitNotifyTest {

    /**
     * The main method initializes the Message object and starts two WaiterThread instances 
     * and one NotifierThread.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Create a shared Message object that both WaiterThread and NotifierThread will use
        Message msg = new Message("Process It");
        
        // Create and start two WaiterThread instances that will wait for a notification on the Message object
        WaiterThread w1 = new WaiterThread("Ram", msg); // First WaiterThread
        WaiterThread w2 = new WaiterThread("Shyam", msg); // Second WaiterThread
        w1.start();
        w2.start();

        // Create and start a NotifierThread that will notify one of the waiting threads
        NotifierThread notifier = new NotifierThread(msg);
        notifier.start();
        
        // Print message indicating that all threads have been started
        System.out.println("All threads are started");
    }

}
```

### Explanation:
1. **WaiterThread and NotifierThread**:
   - The `WaiterThread` instances (`w1` and `w2`) wait on the `Message` object using `wait()`, releasing their lock on the object.
   - The `NotifierThread` notifies one of the waiting threads (or all, depending on whether `notify()` or `notifyAll()` is used) using the shared `Message` object.

2. **Message**:
   - The `Message` class is a shared resource used by the threads to synchronize communication between the `wait()` and `notify()` calls.

3. **Execution**:
   - The main thread creates and starts the `WaiterThread` instances (`Ram` and `Shyam`) first, so they go into a waiting state.
   - The `NotifierThread` then notifies them to resume execution.

4. **Output**:
   - The program prints "All threads are started," while `WaiterThread` instances await the notification. After the notifier triggers the `wait()` threads, they continue processing.
