```java
package com.sunilos.p11thread;

/**
 * Message object is shared between WaiterThread and NotifierThread.
 * 
 * The WaiterThread acquires a lock (monitor) on the Message object and releases
 * the lock by calling the wait() method. When the thread calls wait(), it
 * pauses execution and releases the lock, waiting for a notification to resume.
 * 
 * The NotifierThread, on the other hand, will send a notification to wake up 
 * the waiting WaiterThread. This is done by calling either the notify() method 
 * (to wake up one waiting thread) or notifyAll() method (to wake up all waiting threads). 
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class Message {

    // This is the message string that the WaiterThread and NotifierThread work with
    private String msg;

    // Constructor to initialize the message object with a specific string
    public Message(String str) {
        this.msg = str;
    }

    // Getter method to return the current message string
    public String getMsg() {
        return msg;
    }

    // Setter method to update the message string
    public void setMsg(String str) {
        this.msg = str;
    }

}
```

### Explanation:
1. **`msg`**: This is a private member that holds the message string. The `WaiterThread` and `NotifierThread` interact with this message.
2. **`wait()`**: When a thread calls this method on the Message object, it releases the lock it holds on the object and waits for another thread to notify it to continue.
3. **`notify()`/`notifyAll()`**: The NotifierThread uses these methods to wake up waiting threads. `notify()` wakes one thread, while `notifyAll()` wakes all waiting threads.
